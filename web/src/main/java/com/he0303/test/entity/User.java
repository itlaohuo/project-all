package com.he0303.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
@Entity
@Table(name = "sys_user")
public class User  extends BaseEntity<Integer>{
	@Column(name = "login_name")
	private String loginName;
	private String name;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
