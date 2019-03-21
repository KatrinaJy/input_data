package com.springboot.gradu.service.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TjbhxqfyBmMap {
	private static Map<String, List<BmModel>> bmMap=new HashMap<String, List<BmModel>>();
	
	public static Map<String, List<BmModel>> getBmMap() {
		return bmMap;
	}
	
	public static void setBmMap(Map<String, List<BmModel>> bmMap) {
		TjbhxqfyBmMap.bmMap = bmMap;
	}
}
