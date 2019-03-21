package com.springboot.gradu.Enum;



import com.springboot.gradu.util.StringUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * ��Ժ��Enum
 * @author byron
 *
 */
public enum FYEnum {
	
	TJGY("����и߼�����Ժ","�и߼���Ժ","120000 200","��","51","51"),
	TJYZY("����е�һ�м�����Ժ","��һ�м���Ժ","120100 210","��01","52","52"),
	TJHP("����к�ƽ������Ժ","��ƽ����Ժ","120101 211","��0101","53","53"),
	TJNK("������Ͽ�������Ժ","�Ͽ�����Ժ","120104 212","��0104","54","54"),
	TJHB("����кӱ�������Ժ","�ӱ�����Ժ","120105 213","��0105","55","55"),
	TJHQ("����к���������Ժ","��������Ժ","120106 214","��0106","56","56"),
	TJXQ("���������������Ժ","��������Ժ","120107 215","��0111","57","57"),
	TJBC("����б���������Ժ","��������Ժ","120108 216","��0113","58","58"),
	TJWQ("���������������Ժ","��������Ժ","120222 217","��0114","59","59"),
	TJJH("����о���������Ժ","��������Ժ","120223 218","��0118","60","60"),
	TJBD("����б���������Ժ","��������Ժ","120224 219","��0115","61","61"),
	TJJX("����м�������Ժ","���ط�Ժ","120225 21A","��0225","73","73"),
	TJTL("�����·���䷨Ժ","��·��Ժ","920103 132","��8601","24","24"),
	TJEZY("����еڶ��м�����Ժ","�ڶ��м���Ժ","120200 220","��02","62","62"),
	TJHD("����кӶ�������Ժ","�Ӷ�����Ժ","120202 221","��0102","63","63"),
	TJHX("����к���������Ժ","��������Ժ","120203 222","��0103","64","64"),
	TJDL("����ж���������Ժ","��������Ժ","120207 226","��0110","68","68"),
	TJJN("����н���������Ժ","��������Ժ","120208 227","��0112","69","69"),
	TJNH("�������������Ժ","��������Ժ","120221 228","��0117","70","70"),
	TJBH("��������Ժ","����������Ժ","120242 22A","��0116","74","74"),
	TJHS("����·�Ժ","���·�Ժ","960200 230","��72","72","72"),
	TJTG("���������������Ժ","����������","120204 223","��0116","65","74"),
	TJHG("����к���������Ժ","����������","120205 224","��0116","66","74"),
	TJDG("����д��������Ժ","���������","120206 225","��0116","67","74"),
	TJKFQ("����о��ü�������������Ժ","������������","120241 229","��0116","71","74");


	//HJ("���ȫ�з�Ժ�ϼ�","�ϼ�","1200");

	String name;
	String jc;
	String fydm;
	String dz;
    String  fybh;
    /**
     * ���ͷ�Ժ���
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

    //����������Ժ�ϲ�Ϊ1�ҷ�Ժ��5�ҷ�ԺͳһΪ����������Ժ
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
    //�����˾ɵ����еķ�Ժ��ţ�û�кϲ�ǰ�ı��
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
