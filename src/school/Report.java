package school;

import java.io.Serializable;
import java.util.List;

public class Report implements Serializable {
	/**
	 *  Report class with the attributes year, school;
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer year;
	private String school;
	private List<DisciplineBulletin> disciplines;
	private List<BulletinNote> notes;
	
	public Report() {
		
	}
	
	public Report(Integer year, String school) {
		this.year = year;
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

	public List<BulletinNote> getNotes() {
		return notes;
	}

	public void setNotes(List<BulletinNote> notes) {
		this.notes = notes;
	}

}
