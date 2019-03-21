package com.springboot.gradu.service.model;

public class Dzjzwj {

	private String wjid;// �ļ�id
	private String wjmc;// �ļ�����
	private String wjlj;// �ļ�·��
	private String wjssml;// �ļ�����Ŀ¼
	private int wjsx;// �ļ�˳��
	
	

	@Override
	public String toString() {
		String string="\n�ļ�id��"+wjid+"\t�ļ����ƣ�"+wjmc+"\t�ļ�·����"+wjlj+"\n�ļ�����Ŀ¼��"+wjssml+"\t�ļ�˳��"+wjsx;
		return string;
	}

	public String getWjid() {
		return wjid;
	}

	public void setWjid(String wjid) {
		this.wjid = wjid;
	}

	public String getWjmc() {
		return wjmc;
	}

	public void setWjmc(String wjmc) {
		this.wjmc = wjmc;
	}

	public String getWjlj() {
		return wjlj;
	}

	public void setWjlj(String wjlj) {
		this.wjlj = wjlj;
	}

	public String getWjssml() {
		return wjssml;
	}

	public void setWjssml(String wjssml) {
		this.wjssml = wjssml;
	}

	public int getWjsx() {
		return wjsx;
	}

	public void setWjsx(int wjsx) {
		this.wjsx = wjsx;
	}

}
