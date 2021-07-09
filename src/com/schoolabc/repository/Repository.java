package com.schoolabc.repository;
import java.util.ArrayList;
import java.util.List;

import com.schoolabc.register.Discipline;
import com.schoolabc.register.Professor;
import com.schoolabc.register.Student;


public class Repository {
	
	private List<Student> student;
	private List<Professor> professor;
	private List<Discipline> disciplines;
	
	public Repository() {
		//<Geberucs> = Genericos
		this.student = new ArrayList<Student>();
		this.professor = new ArrayList<Professor>();
		this.disciplines = new ArrayList<Discipline>();
		
		
		//instance, constructor, objects
		Student Breno = new Student(2021,"Breno Rusciolelli", 'M', "Ingles", 25);
		Student Cecilia = new Student(2021,"Cecilia Rusciolelli", 'F', "Ingles", 03);
		Student Leticia = new Student(2021,"Leticia Rusciolelli", 'F', "Ingles", 22);
		student.add(Breno);
		student.add(Cecilia);
		student.add(Leticia);
		
		
		Professor Igor = new Professor("Igor Pimenta", 1);
		Professor Fabio = new Professor("Fabio Gomes", 2);
		Professor Leandro = new Professor("Linguagem de Programacao 4", 3);
		professor.add(Igor); 
		professor.add(Fabio);
		professor.add(Leandro);
		
		disciplines.add(new Discipline(1, "Ingles", "ES", Igor));
		disciplines.add(new Discipline(2, "Banco de Dados", "BD", Fabio));
		disciplines.add(new Discipline(3, "Linguagem de Programacao IV", "LP4", Leandro));
		
		
	}
	
	public Student seachStudent(Integer registration) {
		return this.student.get(registration - 1);
	}
	
	public Professor seachProfessor(Integer code) {
		return this.professor.get(code - 1);
	}
	
	public Discipline seachDiscipline(Integer code) {
		return this.disciplines.get(code - 1);
	}

}
