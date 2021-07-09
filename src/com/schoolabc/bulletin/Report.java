package com.schoolabc.bulletin;

import java.io.Serializable;
import java.util.List;

import com.schoolabc.register.Student;

public class Report implements Serializable {
	/**
	 *  Report class with the attributes year, school;
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer year;
	private String school;
	private Student student;
	private List<DisciplineBulletin> disciplines;
	
	
	public Report() {
		
	}
	
	public Report(Integer year, String school) {
		this.setYear(year);
		this.school = school;
	}

	public String getSchool() { 
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

	public List<DisciplineBulletin> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<DisciplineBulletin> disciplines) {
		this.disciplines = disciplines;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
