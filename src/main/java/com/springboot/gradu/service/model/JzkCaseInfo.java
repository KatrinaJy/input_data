package com.springboot.gradu.service.model;



public class JzkCaseInfo {
	/**
	 * �������
	 */
	private int ajxh;
	/**
	 * ��Ժ����
	 */
	private String fydm;
	/**
	 * ��Ժ���
	 */
	private String fyjc;
	/**
	 * ���б��
	 */
	private int jzbh;
	/**
	 * ����
	 */
	private String ah;
	/**
	 * ��������
	 */
	private String ajmc;
	/**
	 * ����״̬
	 */
	private String ajzt;
	/**
	 * ���г���
	 */
	private String spcx;
	/**
	 * �������Ƽ�д
	 */
	private String ajmc_s;
	/**
	 * ��������
	 */
	private String larq;

	/**
	 * �᰸����
	 */
	private String jarq;
	/**
	 * ��������
	 */
	private String ajlx;
	/**
	 * ��������
	 */
	private String ajxz;
	/**
	 * �참��Ժ
	 */
	private String bafy;
	/**
	 * �참����ͥ
	 */
	private String baspt;
	
	public JzkCaseInfo() {
	}

	public JzkCaseInfo(int ajxh, String fydm, String fyjc, int jzbh, String ah,
			String ajmc, String ajzt, String spcx, String ajmc_s, String larq,
			String jarq, String ajlx, String ajxz, String bafy, String baspt) {
		super();
		this.ajxh = ajxh;
		this.fydm = fydm;
		this.fyjc = fyjc;
		this.jzbh = jzbh;
		this.ah = ah;
		this.ajmc = ajmc;
		this.ajzt = ajzt;
		this.spcx = spcx;
		this.ajmc_s = ajmc_s;
		this.larq = larq;
		this.jarq = jarq;
		this.ajlx = ajlx;
		this.ajxz = ajxz;
		this.bafy = bafy;
		this.baspt = baspt;
	}

	public int getAjxh() {
		return ajxh;
	}

	public void setAjxh(int ajxh) {
		this.ajxh = ajxh;
	}

	public String getFydm() {
		return fydm;
	}

	public void setFydm(String fydm) {
		this.fydm = fydm;
	}

	public String getFyjc() {
		return fyjc;
	}

	public void setFyjc(String fyjc) {
		this.fyjc = fyjc;
	}

	public int getJzbh() {
		return jzbh;
	}

	public void setJzbh(int jzbh) {
		this.jzbh = jzbh;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	public String getAjmc() {
		return ajmc;
	}

	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}

	public String getAjzt() {
		return ajzt;
	}

	public void setAjzt(String ajzt) {
		this.ajzt = ajzt;
	}

	public String getSpcx() {
		return spcx;
	}

	public void setSpcx(String spcx) {
		this.spcx = spcx;
	}

	public String getAjmc_s() {
		return ajmc_s;
	}

	public void setAjmc_s(String ajmc_s) {
		this.ajmc_s = ajmc_s;
	}

	public String getLarq() {
		return larq;
	}

	public void setLarq(String larq) {
		this.larq = larq;
	}

	public String getJarq() {
		return jarq;
	}

	public void setJarq(String jarq) {
		this.jarq = jarq;
	}

	public String getAjlx() {
		return ajlx;
	}

	public void setAjlx(String ajlx) {
		this.ajlx = ajlx;
	}

	public String getAjxz() {
		return ajxz;
	}

	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}

	public String getBafy() {
		return bafy;
	}

	public void setBafy(String bafy) {
		this.bafy = bafy;
	}

	public String getBaspt() {
		return baspt;
	}

	public void setBaspt(String baspt) {
		this.baspt = baspt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ah == null) ? 0 : ah.hashCode());
		result = prime * result + ((ajlx == null) ? 0 : ajlx.hashCode());
		result = prime * result + ((ajmc == null) ? 0 : ajmc.hashCode());
		result = prime * result + ((ajmc_s == null) ? 0 : ajmc_s.hashCode());
		result = prime * result + ajxh;
		result = prime * result + ((ajxz == null) ? 0 : ajxz.hashCode());
		result = prime * result + ((ajzt == null) ? 0 : ajzt.hashCode());
		result = prime * result + ((bafy == null) ? 0 : bafy.hashCode());
		result = prime * result + ((baspt == null) ? 0 : baspt.hashCode());
		result = prime * result + ((fydm == null) ? 0 : fydm.hashCode());
		result = prime * result + ((fyjc == null) ? 0 : fyjc.hashCode());
		result = prime * result + ((jarq == null) ? 0 : jarq.hashCode());
		result = prime * result + jzbh;
		result = prime * result + ((larq == null) ? 0 : larq.hashCode());
		result = prime * result + ((spcx == null) ? 0 : spcx.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JzkCaseInfo other = (JzkCaseInfo) obj;
		if (ah == null) {
			if (other.ah != null)
				return false;
		} else if (!ah.equals(other.ah))
			return false;
		if (ajlx == null) {
			if (other.ajlx != null)
				return false;
		} else if (!ajlx.equals(other.ajlx))
			return false;
		if (ajmc == null) {
			if (other.ajmc != null)
				return false;
		} else if (!ajmc.equals(other.ajmc))
			return false;
		if (ajmc_s == null) {
			if (other.ajmc_s != null)
				return false;
		} else if (!ajmc_s.equals(other.ajmc_s))
			return false;
		if (ajxh != other.ajxh)
			return false;
		if (ajxz == null) {
			if (other.ajxz != null)
				return false;
		} else if (!ajxz.equals(other.ajxz))
			return false;
		if (ajzt == null) {
			if (other.ajzt != null)
				return false;
		} else if (!ajzt.equals(other.ajzt))
			return false;
		if (bafy == null) {
			if (other.bafy != null)
				return false;
		} else if (!bafy.equals(other.bafy))
			return false;
		if (baspt == null) {
			if (other.baspt != null)
				return false;
		} else if (!baspt.equals(other.baspt))
			return false;
		if (fydm == null) {
			if (other.fydm != null)
				return false;
		} else if (!fydm.equals(other.fydm))
			return false;
		if (fyjc == null) {
			if (other.fyjc != null)
				return false;
		} else if (!fyjc.equals(other.fyjc))
			return false;
		if (jarq == null) {
			if (other.jarq != null)
				return false;
		} else if (!jarq.equals(other.jarq))
			return false;
		if (jzbh != other.jzbh)
			return false;
		if (larq == null) {
			if (other.larq != null)
				return false;
		} else if (!larq.equals(other.larq))
			return false;
		if (spcx == null) {
			if (other.spcx != null)
				return false;
		} else if (!spcx.equals(other.spcx))
			return false;
		return true;
	}
	
}
