package com.springboot.gradu.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * ÿ�ձ�����־��
 * 
 * @author storm
 * 
 */
@Entity
@Table(name = "PUB_MRBS_LOG")
public class PubMrbsLog {

	private String id;
	// ��Ժ����
	private String fydm;
	// ��־����
	private String type;
	// ����״̬
	private String status;
	// ��־��Ϣ
	private String message;
	// ����ʱ��
	private Date time;
	// ��������
	private String errorType;
	// ������־��Ϣ
	private String errorMessage;

	public PubMrbsLog() {
		this.fydm = "";
		this.type = "";
		this.status = "";
		this.message = "";
		this.errorType = "";
		this.errorMessage = "";
	}

	public PubMrbsLog(String fydm, String type, String status, String message,
                      Date time, String errorType, String errorMessage) {
		this.fydm = fydm;
		this.type = type;
		this.status = status;
		this.message = message;
		this.time = time;
		this.errorType = errorType;
		this.errorMessage = errorMessage;
	}

	@Id
	@Column(name = "ID",length = 50)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "FYDM")
	public String getFydm() {
		return fydm;
	}

	public void setFydm(String fydm) {
		this.fydm = fydm;
	}

	@Column(name = "TYPE")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "MESSAGE",length = 250)
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "TIME")
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "ERROR_TYPE")
	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	@Column(name = "ERROR_MESSAGE")
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
