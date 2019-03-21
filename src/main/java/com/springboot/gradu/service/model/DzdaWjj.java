package com.springboot.gradu.service.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DzdaWjj {

	private String wjjmc;
	private String wjjid;
	private int wjjbh;
	private int sfzj;
	private int startPage;
	private List<DzdaWj> wjList;

	public DzdaWjj() {
	}

	public String getWjjmc() {
		return wjjmc;
	}

	public void setWjjmc(String wjjmc) {
		this.wjjmc = wjjmc;
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

	public List<DzdaWj> getWjList() {
		return wjList;
	}

	public void setWjList(List<DzdaWj> wjList) {
		this.wjList = wjList;
	}

	public String getWjjid() {
		return wjjid;
	}

	public void setWjjid(String wjjid) {
		this.wjjid = wjjid;
	}

	public void sortWjList() {
		if (wjList == null || wjList.size() == 0)
			return;
		Collections.sort(wjList, new MyComparator());
	}

	private class MyComparator implements Comparator<DzdaWj> {

		@Override
		public int compare(DzdaWj o1, DzdaWj o2) {
			int ret = o1.getWjbh() - o2.getWjbh();

			if (ret > 0)
				return 1;
			else if (ret == 0)
				return 0;
			else
				return -1;
		}

	}

	public int getWjjbh() {
		return wjjbh;
	}

	public void setWjjbh(int wjjbh) {
		this.wjjbh = wjjbh;
	}

}
