package school;

import java.io.Serializable;

public class DisciplineBulletin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double finalNote;
	private boolean approved;
	private Discipline discipline;
	
	public DisciplineBulletin() {
		
	}

	public DisciplineBulletin(Double finalNote, boolean approved) {
		this.finalNote = finalNote;
		this.approved = approved;
	}

	public Double getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(Double finalNote) {
		this.finalNote = finalNote;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	
	

}
