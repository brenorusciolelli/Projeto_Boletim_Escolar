package com.schoolabc.register;

import java.io.Serializable;

public class Discipline implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer code;
	private String name;
	private String initials;
	private Professor professor;
	
	public Discipline() {
		
	}

	public Discipline(Integer code, String name, String initials, Professor professor) {
		this.code = code;
		this.name = name;
		this.initials = initials;
		this.professor = professor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	

}
