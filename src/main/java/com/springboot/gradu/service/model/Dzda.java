package com.springboot.gradu.service.model;

import org.springframework.beans.BeanUtils;

import java.util.*;

public class Dzda {
	private String ajid;
	private String ah;
	private int subjyid;
	private String errorMessage;
	// �ֱ��Ӧ��������֤�ݾ�������������������Ԥ����������;�����վ
	private List<DzdaWjj> zjWjjList;
	private List<DzdaWjj> zjjWjjList;
	private List<DzdaWjj> fjWjjList;
	private List<DzdaWjj> gajWjjList;
	private List<DzdaWjj> jcjWjjList;
	private List<DzdaWjj> ysjWjjList;
	private List<DzdaWjj> hszList;

	public Dzda() {
		zjWjjList = new ArrayList<DzdaWjj>();
		zjjWjjList = new ArrayList<DzdaWjj>();
		fjWjjList = new ArrayList<DzdaWjj>();
		gajWjjList = new ArrayList<DzdaWjj>();
		jcjWjjList = new ArrayList<DzdaWjj>();
		ysjWjjList = new ArrayList<DzdaWjj>();
		hszList = new ArrayList<DzdaWjj>();
	}

	public String getAjid() {
		return ajid;
	}

	public void setAjid(String ajid) {
		this.ajid = ajid;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	public int getSubjyid() {
		return subjyid;
	}

	public void setSubjyid(int subjyid) {
		this.subjyid = subjyid;
	}

	public List<DzdaWjj> getZjWjjList() {
		return zjWjjList;
	}

	public void setZjWjjList(List<DzdaWjj> zjWjjList) {
		this.zjWjjList = zjWjjList;
	}

	public List<DzdaWjj> getZjjWjjList() {
		return zjjWjjList;
	}

	public void setZjjWjjList(List<DzdaWjj> zjjWjjList) {
		this.zjjWjjList = zjjWjjList;
	}

	public List<DzdaWjj> getFjWjjList() {
		return fjWjjList;
	}

	public void setFjWjjList(List<DzdaWjj> fjWjjList) {
		this.fjWjjList = fjWjjList;
	}

	public List<DzdaWjj> getGajWjjList() {
		return gajWjjList;
	}

	public void setGajWjjList(List<DzdaWjj> gajWjjList) {
		this.gajWjjList = gajWjjList;
	}

	public List<DzdaWjj> getJcjWjjList() {
		return jcjWjjList;
	}

	public void setJcjWjjList(List<DzdaWjj> jcjWjjList) {
		this.jcjWjjList = jcjWjjList;
	}
	
	public List<DzdaWjj> getYsjWjjList() {
		return ysjWjjList;
	}
	
	public void setYsjWjjList(List<DzdaWjj> ysjWjjList) {
		this.ysjWjjList = ysjWjjList;
	}
	
	public List<DzdaWjj> getHszList() {
		return hszList;
	}
	
	public void setHszList(List<DzdaWjj> hszList) {
		this.hszList = hszList;
	}

	public void addDzdaWjj(DzdaWjj wjj) {
		int wjjType = wjj.getSfzj();
		switch (wjjType) {
		case 0:
			fjWjjList.add(wjj);
			return;
		case 1:
			zjWjjList.add(wjj);
			return;
		case 2:
			hszList.add(wjj);
			return;
		case 3:
			gajWjjList.add(wjj);
			return;
		case 4:
			jcjWjjList.add(wjj);
			return;
		case 5:
			zjjWjjList.add(wjj);
			return;
		case 6:
			ysjWjjList.add(wjj);
			return;
		}
	}

	public void addDzdaWjjList(List<DzdaWjj> wjjList) {
		if (wjjList != null && !wjjList.isEmpty()) {
			int wjjType = wjjList.get(0).getSfzj();
			switch (wjjType) {
			case 0:
				fjWjjList.addAll(wjjList);
				break;
			case 1:
				zjWjjList.addAll(wjjList);
				break;
			case 2:
				hszList.addAll(wjjList);
				break;
			case 3:
				gajWjjList.addAll(wjjList);
				break;
			case 4:
				jcjWjjList.addAll(wjjList);
				break;
			case 5:
				zjjWjjList.addAll(wjjList);
				break;
			case 6:
				ysjWjjList.addAll(wjjList);
				break;
			}
		}
	}

	public void sortWjjList() {
		if (zjWjjList != null && !zjWjjList.isEmpty())
			Collections.sort(zjWjjList, new MyComparator());
		if (fjWjjList != null && !fjWjjList.isEmpty())
			Collections.sort(fjWjjList, new MyComparator());
		if (gajWjjList != null && !gajWjjList.isEmpty())
			Collections.sort(gajWjjList, new MyComparator());
		if (jcjWjjList != null && !jcjWjjList.isEmpty())
			Collections.sort(jcjWjjList, new MyComparator());
		if (zjjWjjList != null && !zjjWjjList.isEmpty())
			Collections.sort(zjjWjjList, new MyComparator());
		if (ysjWjjList != null && !ysjWjjList.isEmpty())
			Collections.sort(ysjWjjList, new MyComparator());
		if (hszList != null && !hszList.isEmpty())
			Collections.sort(hszList, new MyComparator());
	}
	
	/**
	 * ���µ��ӵ����ļ��к��ļ��ı�ź����ƣ��ѱ�����ó���˳�򣬰��������ó���˳��Ӻ�׺
	 */
	public void updateWjjPage(){
		int currentPage=1;
		currentPage=setWjjPage(1, currentPage);//����
		currentPage=setWjjPage(2, currentPage);//����
		currentPage=setWjjPage(3, currentPage);//������
		currentPage=setWjjPage(4, currentPage);//����
		currentPage=setWjjPage(5, currentPage);//���;�
	}
	
	public void filterDzdaByDak(Map<String, List<String>> map){
		if(map.isEmpty())
			return;
		filterWjj(1, map);//����
		filterWjj(2, map);//����
		filterWjj(3, map);//������
		filterWjj(4, map);//����
		filterWjj(5, map);//���;�
	}
	
	private int setWjjPage(int type,int currentPage){
		//type: 1:����2������3��������4������5�����;�
		List<DzdaWjj> wjjList=new ArrayList<DzdaWjj>();
		switch(type){
		case 1:
			wjjList=zjWjjList;
			break;
		case 2:
			wjjList=fjWjjList;
			break;
		case 3:
			wjjList=gajWjjList;
			break;
		case 4:
			wjjList=jcjWjjList;
			break;
		case 5:
			wjjList=ysjWjjList;
			break;
		}
		if(wjjList!=null && !wjjList.isEmpty()){
			int count=1;
			for(DzdaWjj wjj:wjjList){
				List<DzdaWj> wjList=wjj.getWjList();
				if(wjList==null || wjList.isEmpty())
					continue;
				wjj.setWjjbh(count);
				count++;
				for(DzdaWj wj:wjList){
					String wjmc=wj.getWjmc();
					int index=wjmc.lastIndexOf(".");
					wjmc=""+currentPage+wjmc.substring(index);
					wj.setWjmc(wjmc);
					wj.setWjbh(currentPage);
					currentPage++;
				}
			}
		}
		return currentPage;
	}
	
	private void filterWjj(int type,Map<String,List<String>> map){
		List<DzdaWjj> result=new ArrayList<DzdaWjj>();
		//type: 1:����2������3��������4������5�����;�
		List<DzdaWjj> wjjList=new ArrayList<DzdaWjj>();
		switch(type){
		case 1:
			wjjList=zjWjjList;
			break;
		case 2:
			wjjList=fjWjjList;
			break;
		case 3:
			wjjList=gajWjjList;
			break;
		case 4:
			wjjList=jcjWjjList;
			break;
		case 5:
			wjjList=ysjWjjList;
			break;
		}
		for(DzdaWjj wjj:wjjList){
			if("all".equals(isInIndex(map, wjj.getWjjid(), null))){
				result.add(wjj);
			}else{
				DzdaWjj newWjj=new DzdaWjj();
				BeanUtils.copyProperties(wjj, newWjj, new String[]{"wjList"});
				List<DzdaWj> wjList=new ArrayList<DzdaWj>();
				for(DzdaWj wj:wjj.getWjList()){
					if("yes".equals(isInIndex(map, wjj.getWjjid(), wj.getWjid())))
						wjList.add(wj);
				}
				if(!wjList.isEmpty()){
					newWjj.setWjList(wjList);
					result.add(newWjj);
				}
			}
		}
		switch(type){
		case 1:
			zjWjjList=new ArrayList<DzdaWjj>();
			zjWjjList=result;
			break;
		case 2:
			fjWjjList=new ArrayList<DzdaWjj>();
			fjWjjList=result;
			break;
		case 3:
			gajWjjList=new ArrayList<DzdaWjj>();
			gajWjjList=result;
			break;
		case 4:
			jcjWjjList=new ArrayList<DzdaWjj>();
			jcjWjjList=result;
			break;
		case 5:
			ysjWjjList=new ArrayList<DzdaWjj>();
			ysjWjjList=result;
			break;
		}
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	private String isInIndex(Map<String,List<String>> map,String wjjid,String wjid){
		List<String> wjList=map.get(wjjid);
		if(wjList==null || wjList.isEmpty())
			return "no";
		for(String wj:wjList){
			if("*".equals(wj))
				return "all";
			else{
				if(wj.equals(wjid))
					return "yes";
			}
		}
		return "no";
	}

	private class MyComparator implements Comparator<DzdaWjj> {

		@Override
		public int compare(DzdaWjj o1, DzdaWjj o2) {
			int ret = o1.getWjjbh() - o2.getWjjbh();

			if (ret > 0)
				return 1;
			else if (ret == 0)
				return 0;
			else
				return -1;
		}

	}

}
