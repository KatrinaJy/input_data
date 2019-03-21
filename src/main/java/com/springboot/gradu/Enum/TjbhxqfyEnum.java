package com.springboot.gradu.Enum;


import com.springboot.gradu.util.StringUtil;

public enum TjbhxqfyEnum {
	TJBHXQFY("120242 22A", "������������Ժ", 0, "74"), TJTGFY("120204 223", "���������Ժ",
			1, "65"), TJHGFY("120205 224", "��򺺹���Ժ", 2, "66"), TJDGFY(
			"120206 225", "����۷�Ժ", 3, "67"), TJKFQFY("120241 229", "��򿪷�����Ժ",
			4, "71");

	String fydm;
	String fymc;
	int bh;
	String dm;

	private TjbhxqfyEnum(String fydm, String fymc, int bh, String dm) {
		this.fydm = fydm;
		this.fymc = fymc;
		this.bh = bh;
		this.dm = dm;
	}
	
	public String getFydm() {
		return fydm;
	}

	public String getFymc() {
		return fymc;
	}

	public int getBh() {
		return bh;
	}

	public String getDm() {
		return dm;
	}

	/**
	 * ͨ��fydm�鿴�Ƿ���������������Ժ
	 * 
	 * @param fydm
	 * @return
	 */
	public static boolean isBhxqfy(String fydm) {
		if (StringUtil.isBlank(fydm))
			return false;
		for (TjbhxqfyEnum fy : TjbhxqfyEnum.values()) {
			if (fy.getFydm().equals(fydm.trim()))
				return true;
		}
		return false;
	}

	/**
	 * ͨ�����Ժdm�鿴�Ƿ���������������Ժ
	 * 
	 * @return
	 */
	public static boolean isBhxqfyByDm(String dm) {
		if (StringUtil.isBlank(dm))
			return false;
		for (TjbhxqfyEnum fy : TjbhxqfyEnum.values()) {
			if (fy.getDm().equals(dm.trim()))
				return true;
		}
		return false;
	}

	public static String getDefaultFydm(String fydm) {
		if (isBhxqfy(fydm))
			return TjbhxqfyEnum.TJBHXQFY.getFydm();
		// return TjbhxqfyEnum.TJHGFY.getFydm();
		else
			return null;
	}

	public static int getBhByFydm(String fydm) {
		if (isBhxqfy(fydm)) {
			for (TjbhxqfyEnum fy : TjbhxqfyEnum.values()) {
				if (fy.getFydm().equals(fydm.trim()))
					return fy.getBh();
			}
			return 0;
		} else
			return 0;

	}

	public static int getBhByDm(String dm) {
		if (isBhxqfyByDm(dm)) {
			for (TjbhxqfyEnum fy : TjbhxqfyEnum.values()) {
				if (fy.getDm().equals(dm.trim()))
					return fy.getBh();
			}
			return 0;
		} else
			return 0;

	}

	public static String getDmByFydm(String fydm) {
		if (isBhxqfy(fydm)) {
			for (TjbhxqfyEnum fy : TjbhxqfyEnum.values()) {
				if (fy.getFydm().equals(fydm.trim()))
					return fy.dm;

			}
			return null;
		} else
			return null;
	}
	public  static  String  getFydmByBh(int bh){

		for (TjbhxqfyEnum fy : TjbhxqfyEnum.values()) {
			if (fy.getBh()==bh)
				return fy.getFydm();
		}
		return   null;
	}

}
