package com.zzy.ssm.redis17.pojo;

import java.io.Serializable;

/**
 * 对象要序列化，需要实现serializable接口，往往需要重写serialVersionUID
 * @author zhengzhongyi
 *
 */
public class Role implements Serializable {

	
	private static final long serialVersionUID = 9104409810804967381L;
	private long id;
	private String roleName;
	private String note;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}

