package sutil;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class Encrypt {

	static final short EN0 = 0;
	static final short DE1 = 1;

	static long KnL[] = new long[32];

	static long ek[] = new long[32];
	static long dk[] = new long[32];

	static short bytebit[] = { 0200, 0100, 040, 020, 010, 04, 02, 01 };

	static long bigbyte[] = { 0x800000L, 0x400000L, 0x200000L, 0x100000L, 0x80000L, 0x40000L, 0x20000L, 0x10000L,
			0x8000L, 0x4000L, 0x2000L, 0x1000L, 0x800L, 0x400L, 0x200L, 0x100L, 0x80L, 0x40L, 0x20L, 0x10L, 0x8L, 0x4L,
			0x2L, 0x1L };

	static char pc1[] = { 56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2,
			59, 51, 43, 35, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12,
			4, 27, 19, 11, 3 };

	static char pc2[] = { 13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40,
			51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31 };

	static char totrot[] = { 1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28 };

	static long SP1[] = { 0x01010400L, 0x00000000L, 0x00010000L, 0x01010404L, 0x01010004L, 0x00010404L, 0x00000004L,
			0x00010000L, 0x00000400L, 0x01010400L, 0x01010404L, 0x00000400L, 0x01000404L, 0x01010004L, 0x01000000L,
			0x00000004L, 0x00000404L, 0x01000400L, 0x01000400L, 0x00010400L, 0x00010400L, 0x01010000L, 0x01010000L,
			0x01000404L, 0x00010004L, 0x01000004L, 0x01000004L, 0x00010004L, 0x00000000L, 0x00000404L, 0x00010404L,
			0x01000000L, 0x00010000L, 0x01010404L, 0x00000004L, 0x01010000L, 0x01010400L, 0x01000000L, 0x01000000L,
			0x00000400L, 0x01010004L, 0x00010000L, 0x00010400L, 0x01000004L, 0x00000400L, 0x00000004L, 0x01000404L,
			0x00010404L, 0x01010404L, 0x00010004L, 0x01010000L, 0x01000404L, 0x01000004L, 0x00000404L, 0x00010404L,
			0x01010400L, 0x00000404L, 0x01000400L, 0x01000400L, 0x00000000L, 0x00010004L, 0x00010400L, 0x00000000L,
			0x01010004L };

	static long SP2[] = { 0x80108020L, 0x80008000L, 0x00008000L, 0x00108020L, 0x00100000L, 0x00000020L, 0x80100020L,
			0x80008020L, 0x80000020L, 0x80108020L, 0x80108000L, 0x80000000L, 0x80008000L, 0x00100000L, 0x00000020L,
			0x80100020L, 0x00108000L, 0x00100020L, 0x80008020L, 0x00000000L, 0x80000000L, 0x00008000L, 0x00108020L,
			0x80100000L, 0x00100020L, 0x80000020L, 0x00000000L, 0x00108000L, 0x00008020L, 0x80108000L, 0x80100000L,
			0x00008020L, 0x00000000L, 0x00108020L, 0x80100020L, 0x00100000L, 0x80008020L, 0x80100000L, 0x80108000L,
			0x00008000L, 0x80100000L, 0x80008000L, 0x00000020L, 0x80108020L, 0x00108020L, 0x00000020L, 0x00008000L,
			0x80000000L, 0x00008020L, 0x80108000L, 0x00100000L, 0x80000020L, 0x00100020L, 0x80008020L, 0x80000020L,
			0x00100020L, 0x00108000L, 0x00000000L, 0x80008000L, 0x00008020L, 0x80000000L, 0x80100020L, 0x80108020L,
			0x00108000L };

	static long SP3[] = { 0x00000208L, 0x08020200L, 0x00000000L, 0x08020008L, 0x08000200L, 0x00000000L, 0x00020208L,
			0x08000200L, 0x00020008L, 0x08000008L, 0x08000008L, 0x00020000L, 0x08020208L, 0x00020008L, 0x08020000L,
			0x00000208L, 0x08000000L, 0x00000008L, 0x08020200L, 0x00000200L, 0x00020200L, 0x08020000L, 0x08020008L,
			0x00020208L, 0x08000208L, 0x00020200L, 0x00020000L, 0x08000208L, 0x00000008L, 0x08020208L, 0x00000200L,
			0x08000000L, 0x08020200L, 0x08000000L, 0x00020008L, 0x00000208L, 0x00020000L, 0x08020200L, 0x08000200L,
			0x00000000L, 0x00000200L, 0x00020008L, 0x08020208L, 0x08000200L, 0x08000008L, 0x00000200L, 0x00000000L,
			0x08020008L, 0x08000208L, 0x00020000L, 0x08000000L, 0x08020208L, 0x00000008L, 0x00020208L, 0x00020200L,
			0x08000008L, 0x08020000L, 0x08000208L, 0x00000208L, 0x08020000L, 0x00020208L, 0x00000008L, 0x08020008L,
			0x00020200L };

	static long SP4[] = { 0x00802001L, 0x00002081L, 0x00002081L, 0x00000080L, 0x00802080L, 0x00800081L, 0x00800001L,
			0x00002001L, 0x00000000L, 0x00802000L, 0x00802000L, 0x00802081L, 0x00000081L, 0x00000000L, 0x00800080L,
			0x00800001L, 0x00000001L, 0x00002000L, 0x00800000L, 0x00802001L, 0x00000080L, 0x00800000L, 0x00002001L,
			0x00002080L, 0x00800081L, 0x00000001L, 0x00002080L, 0x00800080L, 0x00002000L, 0x00802080L, 0x00802081L,
			0x00000081L, 0x00800080L, 0x00800001L, 0x00802000L, 0x00802081L, 0x00000081L, 0x00000000L, 0x00000000L,
			0x00802000L, 0x00002080L, 0x00800080L, 0x00800081L, 0x00000001L, 0x00802001L, 0x00002081L, 0x00002081L,
			0x00000080L, 0x00802081L, 0x00000081L, 0x00000001L, 0x00002000L, 0x00800001L, 0x00002001L, 0x00802080L,
			0x00800081L, 0x00002001L, 0x00002080L, 0x00800000L, 0x00802001L, 0x00000080L, 0x00800000L, 0x00002000L,
			0x00802080L };

	static long SP5[] = { 0x00000100L, 0x02080100L, 0x02080000L, 0x42000100L, 0x00080000L, 0x00000100L, 0x40000000L,
			0x02080000L, 0x40080100L, 0x00080000L, 0x02000100L, 0x40080100L, 0x42000100L, 0x42080000L, 0x00080100L,
			0x40000000L, 0x02000000L, 0x40080000L, 0x40080000L, 0x00000000L, 0x40000100L, 0x42080100L, 0x42080100L,
			0x02000100L, 0x42080000L, 0x40000100L, 0x00000000L, 0x42000000L, 0x02080100L, 0x02000000L, 0x42000000L,
			0x00080100L, 0x00080000L, 0x42000100L, 0x00000100L, 0x02000000L, 0x40000000L, 0x02080000L, 0x42000100L,
			0x40080100L, 0x02000100L, 0x40000000L, 0x42080000L, 0x02080100L, 0x40080100L, 0x00000100L, 0x02000000L,
			0x42080000L, 0x42080100L, 0x00080100L, 0x42000000L, 0x42080100L, 0x02080000L, 0x00000000L, 0x40080000L,
			0x42000000L, 0x00080100L, 0x02000100L, 0x40000100L, 0x00080000L, 0x00000000L, 0x40080000L, 0x02080100L,
			0x40000100L };

	static long SP6[] = { 0x20000010L, 0x20400000L, 0x00004000L, 0x20404010L, 0x20400000L, 0x00000010L, 0x20404010L,
			0x00400000L, 0x20004000L, 0x00404010L, 0x00400000L, 0x20000010L, 0x00400010L, 0x20004000L, 0x20000000L,
			0x00004010L, 0x00000000L, 0x00400010L, 0x20004010L, 0x00004000L, 0x00404000L, 0x20004010L, 0x00000010L,
			0x20400010L, 0x20400010L, 0x00000000L, 0x00404010L, 0x20404000L, 0x00004010L, 0x00404000L, 0x20404000L,
			0x20000000L, 0x20004000L, 0x00000010L, 0x20400010L, 0x00404000L, 0x20404010L, 0x00400000L, 0x00004010L,
			0x20000010L, 0x00400000L, 0x20004000L, 0x20000000L, 0x00004010L, 0x20000010L, 0x20404010L, 0x00404000L,
			0x20400000L, 0x00404010L, 0x20404000L, 0x00000000L, 0x20400010L, 0x00000010L, 0x00004000L, 0x20400000L,
			0x00404010L, 0x00004000L, 0x00400010L, 0x20004010L, 0x00000000L, 0x20404000L, 0x20000000L, 0x00400010L,
			0x20004010L };

	static long SP7[] = { 0x00200000L, 0x04200002L, 0x04000802L, 0x00000000L, 0x00000800L, 0x04000802L, 0x00200802L,
			0x04200800L, 0x04200802L, 0x00200000L, 0x00000000L, 0x04000002L, 0x00000002L, 0x04000000L, 0x04200002L,
			0x00000802L, 0x04000800L, 0x00200802L, 0x00200002L, 0x04000800L, 0x04000002L, 0x04200000L, 0x04200800L,
			0x00200002L, 0x04200000L, 0x00000800L, 0x00000802L, 0x04200802L, 0x00200800L, 0x00000002L, 0x04000000L,
			0x00200800L, 0x04000000L, 0x00200800L, 0x00200000L, 0x04000802L, 0x04000802L, 0x04200002L, 0x04200002L,
			0x00000002L, 0x00200002L, 0x04000000L, 0x04000800L, 0x00200000L, 0x04200800L, 0x00000802L, 0x00200802L,
			0x04200800L, 0x00000802L, 0x04000002L, 0x04200802L, 0x04200000L, 0x00200800L, 0x00000000L, 0x00000002L,
			0x04200802L, 0x00000000L, 0x00200802L, 0x04200000L, 0x00000800L, 0x04000002L, 0x04000800L, 0x00000800L,
			0x00200002L };

	static long SP8[] = { 0x10001040L, 0x00001000L, 0x00040000L, 0x10041040L, 0x10000000L, 0x10001040L, 0x00000040L,
			0x10000000L, 0x00040040L, 0x10040000L, 0x10041040L, 0x00041000L, 0x10041000L, 0x00041040L, 0x00001000L,
			0x00000040L, 0x10040000L, 0x10000040L, 0x10001000L, 0x00001040L, 0x00041000L, 0x00040040L, 0x10040040L,
			0x10041000L, 0x00001040L, 0x00000000L, 0x00000000L, 0x10040040L, 0x10000040L, 0x10001000L, 0x00041040L,
			0x00040000L, 0x00041040L, 0x00040000L, 0x10041000L, 0x00001000L, 0x00000040L, 0x10040040L, 0x00001000L,
			0x00041040L, 0x10001000L, 0x00000040L, 0x10000040L, 0x10040000L, 0x10040040L, 0x10000000L, 0x00040000L,
			0x10001040L, 0x00000000L, 0x10041040L, 0x00040040L, 0x10000040L, 0x10040000L, 0x10001000L, 0x10001040L,
			0x00000000L, 0x10041040L, 0x00041000L, 0x00041000L, 0x00001040L, 0x00001040L, 0x00040040L, 0x10000000L,
			0x10041000L };

	static void des_key(long ek[], String myKey) {

		deskey(myKey, EN0);
		cpkey(ek);
		deskey(myKey, DE1);
		cpkey(dk);
	}

	static void DES_SetKey(String keyVal) {
		des_key(ek, keyVal);
	}

	static void deskey(String KeyStr, short edf) {
		int i, l, m, n;

		char pclm[] = new char[56];
		char pcr[] = new char[56];
		long kn[] = new long[32];

		char mKey[] = KeyStr.toCharArray();

		for (int j = 0; j < 56; j++) {
			l = pc1[j];
			m = l & 07;
			int mk = mKey[l >> 3];

			int ik = mk & bytebit[m];

			if (ik == 0)
				pclm[j] = 0;
			else
				pclm[j] = 1;

			int bj = pclm[j];

		}

		for (i = 0; i < 16; i++) {
			if (edf == DE1) {
				m = (15 - i) << 1;
			} else {
				m = i << 1;
			}

			n = m + 1;
			kn[m] = kn[n] = 0L;

			for (int j = 0; j < 28; j++) {
				l = j + totrot[i];
				if (l < 28) {
					pcr[j] = pclm[l];
				} else {
					pcr[j] = pclm[l - 28];
				}

			}

			for (int j = 28; j < 56; j++) {
				l = j + totrot[i];
				if (l < 56) {
					pcr[j] = pclm[l];
				} else {
					pcr[j] = pclm[l - 28];
				}
			}

			for (int j = 0; j < 24; j++) {
				int p2 = pcr[pc2[j]];
				if (p2 != 0) {
					kn[m] |= bigbyte[j];
				}

				p2 = pcr[pc2[j + 24]];

				if (p2 != 0) {
					kn[n] |= bigbyte[j];
				}
			}

		}

		cookey(kn);

	} // end of deskey

	static void cookey(long raw1[]) {
		long cook[], raw0[];
		long dough[] = new long[32];
		int i, j, k;

		cook = dough;

		raw0 = raw1;

		for (i = 0, j = 0, k = 0; i < 16; i++, j++) {
			raw0[i] = raw1[j++];

			cook[k] = (raw0[i] & 0x00fc0000L) << 6;
			cook[k] |= (raw0[i] & 0x00000fc0L) << 10;
			cook[k] |= (raw1[j] & 0x00fc0000L) >> 10;
			cook[k++] |= (raw1[j] & 0x00000fc0L) >> 6;
			cook[k] = (raw0[i] & 0x0003f000L) << 12;
			cook[k] |= (raw0[i] & 0x0000003fL) << 16;
			cook[k] |= (raw1[j] & 0x0003f000L) >> 4;
			cook[k++] |= (raw1[j] & 0x0000003fL);

		}

		usekey(dough);

	} // cookey

	static void usekey(long from[]) {
		long to[], endp[];
		to = KnL;

		for (int i = 0; i < 32; i++) {

			to[i] = from[i];

		}

	} // usekey

	static void cpkey(long into[]) {
		long from[], endp[];

		from = KnL;

		for (int i = 0; i < 32; i++) {
			into[i] = from[i];

		}

	} // cpkey

	static void desfunc(long[] block, long[] keys) // work, ek or dk
	{
		long fval, work, right, leftt;
		int round = 0;

		leftt = block[0];
		right = block[1];

		work = ((leftt >> 4) ^ right) & 0x0f0f0f0fL;

		right ^= work;
		leftt ^= (work << 4);

		work = ((leftt >> 16) ^ right) & 0x0000ffffL;
		right ^= work;
		leftt ^= (work << 16);

		work = ((right >> 2) ^ leftt) & 0x33333333L;
		leftt ^= work;
		right ^= (work << 2);

		work = ((right >> 8) ^ leftt) & 0x00ff00ffL;
		leftt ^= work;
		right ^= (work << 8);
		right = ((right << 1) | ((right >> 31) & 1L)) & 0xffffffffL;

		work = (leftt ^ right) & 0xaaaaaaaaL;
		leftt ^= work;
		right ^= work;
		leftt = ((leftt << 1) | ((leftt >> 31) & 1L)) & 0xffffffffL;

		int i = 0;
		for (round = 0; round < 8; round++) {
			work = (right << 28) | (right >> 4);

			work ^= keys[i++];
			fval = SP7[(int) (work & 0x3fL)];

			fval |= SP5[(int) ((work >> 8) & 0x3fL)];
			fval |= SP3[(int) ((work >> 16) & 0x3fL)];
			fval |= SP1[(int) ((work >> 24) & 0x3fL)];

			work = right ^ keys[i++];
			fval |= SP8[(int) (work & 0x3fL)];
			fval |= SP6[(int) ((work >> 8) & 0x3fL)];
			fval |= SP4[(int) ((work >> 16) & 0x3fL)];
			fval |= SP2[(int) ((work >> 24) & 0x3fL)];
			leftt ^= fval;

			work = (leftt << 28) | (leftt >> 4);
			work ^= keys[i++];
			fval = SP7[(int) (work & 0x3fL)];
			fval |= SP5[(int) ((work >> 8) & 0x3fL)];
			fval |= SP3[(int) ((work >> 16) & 0x3fL)];
			fval |= SP1[(int) ((work >> 24) & 0x3fL)];

			work = leftt ^ keys[i++];
			fval |= SP8[(int) (work & 0x3fL)];
			fval |= SP6[(int) ((work >> 8) & 0x3fL)];
			fval |= SP4[(int) ((work >> 16) & 0x3fL)];
			fval |= SP2[(int) ((work >> 24) & 0x3fL)];
			right ^= fval;

		}

		right = (right << 31) | (right >> 1);

		work = (leftt ^ right) & 0xaaaaaaaaL;
		leftt ^= work;
		right ^= work;

		leftt = (leftt << 31) | (leftt >> 1);
		work = ((leftt >> 8) ^ right) & 0x00ff00ffL;
		right ^= work;
		leftt ^= (work << 8);

		work = ((leftt >> 2) ^ right) & 0x33333333L;
		right ^= work;
		leftt ^= (work << 2);

		work = ((right >> 16) ^ leftt) & 0x0000ffffL;
		leftt ^= work;
		right ^= (work << 16);

		work = ((right >> 4) ^ leftt) & 0x0f0f0f0fL;
		leftt ^= work;
		right ^= (work << 4);

		block[0] = right;
		block[1] = leftt;

	}

	static void scrunch(char outof[], long into[]) // cp, work
	{

		if (outof.length > 0) {

			int i = 0;

			if (outof.length > i)
				into[0] = (outof[i++] & 0xffL) << 24;

			if (outof.length > i)
				into[0] |= (outof[i++] & 0xffL) << 16;

			if (outof.length > i)
				into[0] |= (outof[i++] & 0xffL) << 8;

			if (outof.length > i)
				into[0] |= (outof[i++] & 0xffL);

			if (outof.length > i)
				into[1] = (outof[i++] & 0xffL) << 24;

			if (outof.length > i)
				into[1] |= (outof[i++] & 0xffL) << 16;

			if (outof.length > i)
				into[1] |= (outof[i++] & 0xffL) << 8;

			if (outof.length > i)
				into[1] |= (outof[i] & 0xffL);

		} else {

			into[0] = 0L;
			into[1] = 0L;
			return;
		}

	}

	static String unscrun(long[] outof, String into) {
		into = "";
		into += (char) ((outof[0] >> 24) & 0xffL);
		into += (char) ((outof[0] >> 16) & 0xffL);
		into += (char) ((outof[0] >> 8) & 0xffL);
		into += (char) (outof[0] & 0xffL);

		into += (char) ((outof[1] >> 24) & 0xffL);
		into += (char) ((outof[1] >> 16) & 0xffL);
		into += (char) ((outof[1] >> 8) & 0xffL);
		into += (char) (outof[1] & 0xffL);

		return (into);

	}

	static String des_dec(String dat, int blocks) {
		long work[] = new long[2];
		int i, size;
		int share = 0;
		char cp[];
		int subArg = 0;
		String myStr = new String();
		String resStr = "";

		cp = dat.toCharArray();

		size = cp.length;
		share = size / 8;

		for (i = 0; i < blocks; i++) {

			scrunch(cp, work);
			desfunc(work, dk);
			myStr = unscrun(work, String.valueOf(cp));

			if (share > 0) {

				dat = dat.substring(8);
				int nSize = dat.length();
				char nCp[] = dat.toCharArray();
				cp = nCp;

			} else {

				dat = "";
				cp = dat.toCharArray();
			}

			share--;

			resStr += myStr;

		}

		return resStr;

	}

	static String des_enc(String dat, int blocks) {
		long work[] = new long[2];
		int i, size;
		int share = 0;
		char cp[];
		int subArg = 0;
		String myStr = new String();
		String resStr = "";

		cp = dat.toCharArray();

		size = cp.length;
		share = size / 8;

		for (i = 0; i < blocks; i++) {

			scrunch(cp, work);
			desfunc(work, ek);
			myStr = unscrun(work, String.valueOf(cp));

			if (share > 0) {

				dat = dat.substring(8);
				int nSize = dat.length();
				char nCp[] = dat.toCharArray();
				cp = nCp;

			} else {

				dat = "";
				cp = dat.toCharArray();
			}

			share--;

			resStr += myStr;

		}

		return resStr;

	}

	static String DES_Encrypt(String pchDataBuf, int nNumOfBlocks) {

		return (des_enc(pchDataBuf, nNumOfBlocks));

	}

	static String StrToHexBlk(String pSrc, int SrcLen) {

		char ch = ' ';
		String hstr = "";
		String pHexHead = "";
		StringBuffer pHex = new StringBuffer();

		hstr = "0123456789abcdef";

		for (int i = 0; i < pSrc.length(); i++) {
			ch = pSrc.charAt(i);
			pHex.append(hstr.charAt((int) ((ch & 0xF0) >> 4)));
			pHex.append(hstr.charAt((int) (ch & 0x0F)));
		}

		pHexHead = pHex.toString();

		return (pHexHead);
	}

	/**
	 * 문자열을 암호화된 코드로 리턴한다
	 * 
	 * @param pPlainText 변환 대상 문자열
	 * @return 암호화된 코드
	 */
	public static String com_EncodeJtoJ(String pPlainText) {

		String pEncKey = "";
		String pCT = "";
		String pCTHex = "";

		int iCTLen = 0;
		int iBlkSize = 0;

		// string cat '|'
		pPlainText += "|";

		// korean -> english
		pPlainText = Ko2En(pPlainText);

		pEncKey = "SINGLE_v_4.0_OFFICE_v_4.0";

		iCTLen = pPlainText.length() + 8;

		iBlkSize = ((iCTLen - 1) / 8) + 1;
		iCTLen = (iBlkSize * 8) + 1;

		pCT = pPlainText;

		DES_SetKey(pEncKey);
		pCT = DES_Encrypt(pCT, iBlkSize);

		pCTHex = StrToHexBlk(pCT, iBlkSize * 8);

		// 이곳에서 pCTHex의 길이를 64로 해야한다. 빈 내용은 "0"으로 해서
		int pCTHexNo = pCTHex.length();
		for (int i = 0; i < iBlkSize * 2 - pCTHexNo; i++)
			pCTHex += "0";

		return (pCTHex);

	}

	/**
	 * 문자열을 암호화된 코드로 리턴한다
	 * 
	 * @param pPlainText 변환 대상 문자열
	 * @return 암호화된 코드
	 */
	public static String com_Encode(String pPlainText) {

		String pEncKey = "";
		String pCT = "";
		String pCTHex = "";

		int iCTLen = 0;
		int iBlkSize = 0;

		// korean -> english
		pPlainText = Ko2En(pPlainText);

		pEncKey = "SINGLE_v_4.0_OFFICE_v_4.0";

		iCTLen = pPlainText.length() + 8;

		iBlkSize = ((iCTLen - 1) / 8) + 1;
		iCTLen = (iBlkSize * 8) + 1;

		pCT = pPlainText;

		DES_SetKey(pEncKey);
		pCT = DES_Encrypt(pCT, iBlkSize);

		pCTHex = StrToHexBlk(pCT, iBlkSize * 8);

		// 이곳에서 pCTHex의 길이를 64로 해야한다. 빈 내용은 "0"으로 해서
		int pCTHexNo = pCTHex.length();
		for (int i = 0; i < iBlkSize * 2 - pCTHexNo; i++)
			pCTHex += "0";

		return (pCTHex);

	}

	static String HexToStrBlk(String pHex) {
		int i = 0, SrcLen = 0, hv = 0;
		String pStrHead = "";
		String pStr = "";

		SrcLen = pHex.length();

		for (i = 0; i < SrcLen; i++) {
			if (pHex.charAt(i) >= '0' && pHex.charAt(i) <= '9')
				hv = pHex.charAt(i) - '0';
			else
				hv = pHex.charAt(i) - 'a' + 10;

			hv = hv * 16;
			i++;

			if (pHex.charAt(i) >= '0' && pHex.charAt(i) <= '9')
				hv += pHex.charAt(i) - '0';
			else
				hv += pHex.charAt(i) - 'a' + 10;

			pStr += (char) hv;
		}

		return (pStr);

	}

	/**
	 * 암호화된 코드를 복호화된 문자열로 리턴한다
	 * 
	 * @param pCryptHex 변환 대상 코드
	 * @return 복호화된 분자열
	 */
	public static String com_DecodeJtoJ(String pCryptHex) {
		String pCT = "";
		String pEncKey = "";
		int iCTLen = 0;
		int iBlkSize = 0;

		pEncKey = "SINGLE_v_4.0_OFFICE_v_4.0";

		iCTLen = pCryptHex.length();
		iBlkSize = (((iCTLen / 2) - 1) / 8) + 1;
		iCTLen = (iBlkSize * 8) + 1;

		pCT = HexToStrBlk(pCryptHex);

		DES_SetKey(pEncKey);

		pCT = DES_Decrypt(pCT, iBlkSize);

		pCT = En2Ko(pCT);

		// tokening
		StringTokenizer token = new StringTokenizer(pCT.trim(), "|");

		pCT = token.nextToken();

		return (pCT);

	} // com_Decode Java to Java

	/**
	 * 암호화된 코드를 복호화된 문자열로 리턴한다.
	 * 
	 * @param pCryptHex 변환 대상 코드
	 * @return 복호화된 분자열
	 */
	public static String com_Decode(String pCryptHex) {
		String pCT = "";
		String pEncKey = "";
		int iCTLen = 0;
		int iBlkSize = 0;

		pEncKey = "SINGLE_v_4.0_OFFICE_v_4.0";

		iCTLen = pCryptHex.length();
		iBlkSize = (((iCTLen / 2) - 1) / 8) + 1;
		iCTLen = (iBlkSize * 8) + 1;

		pCT = HexToStrBlk(pCryptHex);

		DES_SetKey(pEncKey);

		pCT = DES_Decrypt(pCT, iBlkSize);

		pCT = En2Ko(pCT);

		return (pCT);

	} // com_Decode OM to Java

	static String DES_Decrypt(String pchDataBuf, int nNumOfBlocks) {
		return (des_dec(pchDataBuf, nNumOfBlocks));
	}

	/*
	 * // main method public static void main(String args[]) { String code;
	 * if(args.length < 1) { System.out.println("Usage : java EncryptTest e/d
	 * string to encrypt/decrypt"); return; } EncryptTest myTest = new
	 * EncryptTest(); if(args[0].equals("e")){ code =
	 * myTest.com_Encode(args[1]); System.out.println("Encrypted code " + code); }
	 * else if(args[0].equals("d")){ code = myTest.com_Decode(args[1]);
	 * System.out.println("Decrypted code " + code); } }
	 */

	/**
	 * 8859_1 --> KSC5601 으로 형식을 변환한다
	 * 
	 * @param english 8859_1 형식의 문자열
	 * @return KSC5601 형식의 문자열
	 */
	public static synchronized String En2Ko(String english) {
		String korean = null;

		if (english == null)
			return null;
		// if (english == null ) return "";

		try {
			korean = new String(new String(english.getBytes("8859_1"), "KSC5601"));
		} catch (UnsupportedEncodingException e) {
			korean = new String(english);
		}
		return korean;

	}

	/**
	 * KSC5601 --> 8859_1 으로 형식을 변환한다
	 * 
	 * @param korean KSC5601 형식의 문자열
	 * @return 8859_1 형식의 문자열
	 */
	public static synchronized String Ko2En(String korean) {
		String english = null;

		if (korean == null)
			return null;
		// if (korean == null ) return "";

		english = new String(korean);
		try {
			english = new String(new String(korean.getBytes("KSC5601"), "8859_1"));
		} catch (UnsupportedEncodingException e) {
			english = new String(korean);
		}

		return english;

	}

}