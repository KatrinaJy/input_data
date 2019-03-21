package com.springboot.gradu.Enum;



import com.springboot.gradu.util.StringUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * 法院的Enum
 * @author byron
 *
 */
public enum FYEnum {
	
	TJGY("天津市高级人民法院","市高级法院","120000 200","津","51","51"),
	TJYZY("天津市第一中级人民法院","第一中级法院","120100 210","津01","52","52"),
	TJHP("天津市和平区人民法院","和平区法院","120101 211","津0101","53","53"),
	TJNK("天津市南开区人民法院","南开区法院","120104 212","津0104","54","54"),
	TJHB("天津市河北区人民法院","河北区法院","120105 213","津0105","55","55"),
	TJHQ("天津市红桥区人民法院","红桥区法院","120106 214","津0106","56","56"),
	TJXQ("天津市西青区人民法院","西青区法院","120107 215","津0111","57","57"),
	TJBC("天津市北辰区人民法院","北辰区法院","120108 216","津0113","58","58"),
	TJWQ("天津市武清区人民法院","武清区法院","120222 217","津0114","59","59"),
	TJJH("天津市静海区人民法院","静海区法院","120223 218","津0118","60","60"),
	TJBD("天津市宝坻区人民法院","宝坻区法院","120224 219","津0115","61","61"),
	TJJX("天津市蓟县人民法院","蓟县法院","120225 21A","津0225","73","73"),
	TJTL("天津铁路运输法院","铁路法院","920103 132","津8601","24","24"),
	TJEZY("天津市第二中级人民法院","第二中级法院","120200 220","津02","62","62"),
	TJHD("天津市河东区人民法院","河东区法院","120202 221","津0102","63","63"),
	TJHX("天津市河西区人民法院","河西区法院","120203 222","津0103","64","64"),
	TJDL("天津市东丽区人民法院","东丽区法院","120207 226","津0110","68","68"),
	TJJN("天津市津南区人民法院","津南区法院","120208 227","津0112","69","69"),
	TJNH("天津宁河区人民法院","宁河区法院","120221 228","津0117","70","70"),
	TJBH("天津滨海法院","滨海新区法院","120242 22A","津0116","74","74"),
	TJHS("天津海事法院","海事法院","960200 230","津72","72","72"),
	TJTG("天津市塘沽区人民法院","塘沽审判区","120204 223","津0116","65","74"),
	TJHG("天津市汉沽区人民法院","汉沽审判区","120205 224","津0116","66","74"),
	TJDG("天津市大港区人民法院","大港审判区","120206 225","津0116","67","74"),
	TJKFQ("天津市经济技术开发区人民法院","功能区审判区","120241 229","津0116","71","74");


	//HJ("天津全市法院合计","合计","1200");

	String name;
	String jc;
	String fydm;
	String dz;
    String  fybh;
    /**
     * 报送法院编号
     */
    String bsbh;



	private FYEnum(String name, String jc, String fydm, String dz, String  fybh) {

		this.name = name;
		this.jc = jc;
		this.fydm = fydm;
	    this.dz=dz;
	    this.fybh=fybh;

	}
	
	private FYEnum(String name, String jc, String fydm, String dz, String fybh,
                   String bsbh) {
		this.name = name;
		this.jc = jc;
		this.fydm = fydm;
		this.dz = dz;
		this.fybh = fybh;
		this.bsbh = bsbh;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJc() {
		return jc;
	}

	public void setJc(String jc) {
		this.jc = jc;
	}

	public String getFydm() {
		return fydm;
	}

	public void setFydm(String fydm) {
		this.fydm = fydm;
	}
	
	public String getBsbh() {
		return bsbh;
	}
	
	public void setBsbh(String bsbh) {
		this.bsbh = bsbh;
	}
	
	public static FYEnum getEnumByfydm(String fydm){
		for(FYEnum fy:FYEnum.values()){
			if(StringUtil.equals(fy.getFydm(), fydm)){
				return fy;
			}
		}
		return null;
	}
	
	public static Map<String, String> getFyMap() {
		Map<String, String> map = new HashMap<String, String>();
		for(FYEnum fy:FYEnum.values()){
			map.put(fy.getFydm(), fy.getJc());
		}
		return map;
	}

    //滨海新区法院合并为1家法院，5家法院统一为滨海新区法院
    public  static String   getFybhByFydm(String fydm){
		if(!StringUtil.isBlank(fydm)) {
			if (TjbhxqfyEnum.isBhxqfy(fydm))
				   return  TJBH.getFybh();
			for (FYEnum fyEnum : FYEnum.values()) {
				if (fydm.equals(fyEnum.getFydm())){
					return   fyEnum.getFybh();
				}
			}
		}
		return  null;
	}
    //包含了旧的所有的法院编号，没有合并前的编号
	public  static String   getFybhByFydmOld(String fydm){
		if(!StringUtil.isBlank(fydm)) {
			for (FYEnum fyEnum : FYEnum.values()) {
				if (fydm.equals(fyEnum.getFydm())){
					return   fyEnum.getFybh();
				}
			}
		}
		return  null;
	}
	public  static String   getFydmByFybh(String fybh){
		if(!StringUtil.isBlank(fybh)) {
			for (FYEnum fyEnum : FYEnum.values()) {
				if (fybh.equals(fyEnum.getFybh())){
					return   fyEnum.getFydm();
				}
			}
		}
		return  null;
	}



	public String getFybh() {
		return fybh;
	}

	public void setFybh(String fybh) {
		this.fybh = fybh;
	}
	/*	public static List<FyModel> getFyList() {
		List<FyModel> fyModels = new ArrayList<FyModel>();
		for(FYEnum fy:FYEnum.values()){
			fyModels.add(new FyModel(fy.getFydm(), fy.getJc(), fy.name()));
		}
		return fyModels;
	}*/

	public static String  getJcByFydm(String  fydm){
		for(FYEnum  fyEnum:FYEnum.values()){
			  if(fyEnum.getFydm().equals(fydm)){
			  	return  fyEnum.getJc();
			  }
		}
		return   null;
	}
}
