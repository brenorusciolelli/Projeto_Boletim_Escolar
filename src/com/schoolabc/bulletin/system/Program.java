package com.schoolabc.bulletin.system;

import java.util.ArrayList;
import java.util.List;

import com.schoolabc.bulletin.DisciplineBulletin;
import com.schoolabc.bulletin.Report;
import com.schoolabc.register.Student;
import com.schoolabc.repository.Repository;

public class Program {
	
	public static void main(String[] args) {
		
		Repository repository = new Repository();
		
///////////////////////////////////////////////////////////////////////////	
		
		Report report = new Report();
		report.setYear(2021);
		report.setSchool("Brasil para Todos");
		Student student = repository.seachStudent(1);
		System.out.println(student.getName());
		
///////////////////////////////////////////////////////////////////////////
		
		List<DisciplineBulletin> disciplineBulletins = new ArrayList<>();
		DisciplineBulletin bd = new DisciplineBulletin();
		DisciplineBulletin bd1 = new DisciplineBulletin();
		DisciplineBulletin bd2 = new DisciplineBulletin();
		bd.setDiscipline(repository.seachDiscipline(1));
		bd1.setDiscipline(repository.seachDiscipline(2));
		bd2.setDiscipline(repository.seachDiscipline(3));
		disciplineBulletins.add(bd);
		disciplineBulletins.add(bd1);
		disciplineBulletins.add(bd2);
		report.setDisciplines(disciplineBulletins);
		
		for(DisciplineBulletin d:report.getDisciplines()) {
			System.out.println(d.getDiscipline().getName() + " - " + d.getDiscipline().getCode());
			
		}
		
	}
}
