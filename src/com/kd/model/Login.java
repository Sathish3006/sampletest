package com.kd.model;

import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {
	@Id
	@Column(name="uname")
	private String uname;
	@Column(name="pwd")
	private String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
