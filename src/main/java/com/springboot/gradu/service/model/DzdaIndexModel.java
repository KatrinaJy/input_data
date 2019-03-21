package com.springboot.gradu.service.model;

import java.io.Serializable;

public class DzdaIndexModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1138857254140576619L;
	/**
	 * id
	 */
	private int id;
	/**
	 * ��Ŀ¼id
	 */
	private int pId;
	/**
	 * ����
	 */
	private String name;
	/**
	 * �Ƿ��Ǹ��ļ���
	 */
	private boolean isParent;
	/**
	 * �Ƿ����ק
	 */
	private boolean drag;
	/**
	 * ·��
	 */
	private String path;
	/**
	 * �ļ�id
	 */
	private String wjid;
	/**
	 * ����
	 */
	private String lx;
	/**
	 * �Ƿ��ʼ��ʱ��
	 */
	private boolean open;
	/**
	 *
	 */
	private boolean dropInner;
	/**
	 * �Ƿ���Գ�Ϊ���ڵ�
	 */
	private boolean dropRoot;
	private boolean nocheck;
	private int leafIndex;
	//�ļ��ϴ����ڵĽ׶�   1:���� 2��������
	private String wjscjd;
	public DzdaIndexModel() {
		this.nocheck=true;
	}
	
	public DzdaIndexModel(int id, int pId, String name, boolean drag,
			boolean open, boolean dropInner, boolean dropRoot) {
		super();
		this.id = id;
		this.pId = pId;
		this.name = name;
		this.drag = drag;
		this.open = open;
		this.dropInner = dropInner;
		this.dropRoot = dropRoot;
		this.nocheck=true;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public boolean isParent() {
		return isParent;
	}
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isDropInner() {
		return dropInner;
	}
	public void setDropInner(boolean dropInner) {
		this.dropInner = dropInner;
	}
	public boolean isDropRoot() {
		return dropRoot;
	}
	public void setDropRoot(boolean dropRoot) {
		this.dropRoot = dropRoot;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsParent() {
		return isParent;
	}
	public void setIsParent(boolean isparent) {
		this.isParent = isparent;
	}
	public boolean isDrag() {
		return drag;
	}
	public void setDrag(boolean drag) {
		this.drag = drag;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getWjid() {
		return wjid;
	}
	public void setWjid(String wjid) {
		this.wjid = wjid;
	}
	public boolean isNocheck() {
		return nocheck;
	}
	public void setNocheck(boolean nocheck) {
		this.nocheck = nocheck;
	}
	public int getLeafIndex() {
		return leafIndex;
	}
	public void setLeafIndex(int leafIndex) {
		this.leafIndex = leafIndex;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getWjscjd() {
		return wjscjd;
	}

	public void setWjscjd(String wjscjd) {
		this.wjscjd = wjscjd;
	}
}
