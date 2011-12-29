package com.sds.acube.cn.organizationlinkage;

import com.sds.acube.cn.common.vo.ConnectionParam;

public class StartService {
	public void startLinker(ConnectionParam connParam, String strConfigPath) {
		SyncAgent syncAgent = new SyncAgent();
		if (syncAgent.StartSync(connParam, strConfigPath))
			System.out.println("Success.");
		else
			System.out.println("Failed");
	}
}