package school;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 *  Student class with the attributes name, registration, sex end discipline
	 */
	private static final long serialVersionUID = 1L;
	Integer registration;
	public String name;
	char sex;
	String discipline;
	Integer age;
	
	public Student() {
		
	}

	public Student(Integer registration, String name, char sex, String discipline, Integer age) {
		this.registration = registration;
		this.name = name;
		this.sex = sex;
		this.discipline = discipline;
		this.age = age;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
}
