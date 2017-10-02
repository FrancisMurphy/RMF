package com.frank.RMF.tool;

import net.sf.json.JSONObject;

public class RMFTool {
	
	public static String obj2JSON(Object object) {
		return JSONObject.fromObject(object).toString();
	}

}
