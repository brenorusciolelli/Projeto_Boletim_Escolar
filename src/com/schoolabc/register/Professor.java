package com.schoolabc.register;

import java.io.Serializable;

public class Professor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Discipline discipline;
	private Integer code;
	
	public Professor() {
		
	}

	

	public Professor(String name, Integer code) {
		this.name = name;
		this.setCode(code);
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Integer getCode() {
		return code;
	}



	public void setCode(Integer code) {
		this.code = code;
	}



	public Discipline getDiscipline() {
		return discipline;
	}



	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	
	

}
