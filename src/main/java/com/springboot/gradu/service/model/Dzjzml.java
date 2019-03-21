package com.springboot.gradu.service.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dzjzml {

	private String mlmc;// Ŀ¼����
	private String mlid;// Ŀ¼id����ţ�
	private int mlsx;// Ŀ¼˳��
	private int sfzj;// �Ƿ�����
	private int startPage;// ��ʼҳ
	private List<Dzjzwj> wjList;// �ļ��б�
	
	/**
	 * �����ļ�����
	 * @return
	 */
	public int getPageNum(){
		return getWjList().size();
	}
	
	@Override
	public String toString() {
		String result="";
		result+="\nĿ¼���ƣ�"+mlmc+"\nĿ¼��ţ�"+mlid+"\nĿ¼˳��"+mlsx+"\n�Ƿ�����"+sfzj+"\n��ʼҳ��"+startPage;
		if(wjList==null||wjList.size()==0){
			return result;
		}
		for(Dzjzwj wj:wjList){
			result+=wj.toString();
		}
		return result;
	}
	
	/**
	 * ���ļ����������ļ��б�
	 * @param wjs
	 */
	public void setWjListAndSort(List<Dzjzwj> wjs) {
		if(wjs==null){
			return;
		}
		this.wjList=wjs;
		Collections.sort(this.wjList, new JzWjComparator());
	}
	
	private class JzWjComparator implements Comparator<Dzjzwj>{

		@Override
		public int compare(Dzjzwj o1, Dzjzwj o2) {
			int ret=o1.getWjsx()-o2.getWjsx();
			if(ret<0){
				return -1;
			}else if(ret==0){
				return 0;
			}else{
				return 1;
			}
		}
		
	};

	public String getMlmc() {
		return mlmc;
	}

	public void setMlmc(String mlmc) {
		this.mlmc = mlmc;
	}

	public String getMlid() {
		return mlid;
	}

	public void setMlid(String mlid) {
		this.mlid = mlid;
	}

	public int getMlsx() {
		return mlsx;
	}

	public void setMlsx(int mlsx) {
		this.mlsx = mlsx;
	}

	public int getSfzj() {
		return sfzj;
	}

	public void setSfzj(int sfzj) {
		this.sfzj = sfzj;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public List<Dzjzwj> getWjList() {
		return wjList==null?new ArrayList<Dzjzwj>():wjList;
	}

	public void setWjList(List<Dzjzwj> wjList) {
		this.wjList = wjList;
	}

}
