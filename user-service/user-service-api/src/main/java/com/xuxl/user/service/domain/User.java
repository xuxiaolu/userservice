package com.xuxl.user.service.domain;

import java.io.Serializable;
import java.util.Date;

import com.xuxl.common.annotation.http.api.Description;

@Description("用户")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Description("名字")
	private String name;
	
	@Description("年龄")
	private int age;
	
	@Description("生日")
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
