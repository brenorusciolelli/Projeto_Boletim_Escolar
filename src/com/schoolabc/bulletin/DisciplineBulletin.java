package com.schoolabc.bulletin;

import java.io.Serializable;

import com.schoolabc.register.Discipline;

public class DisciplineBulletin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double finalNote;
	private boolean approved;
	private Discipline discipline;
	
	private double firstNote1;
	private double firstNote2;
	private double firstNoteRecovery;
	
	private double secondNote1;
	private double secondNote2;
	private double secondNoteRecovery;
	
	private double thirdNote1;
	private double thirdNote2;
	private double thirdNoteRecovery;
	
	private double fourthNote1;
	private double fourthNote2;
	private double fourthoteRecovery;
	
	private Report report;
	
	public DisciplineBulletin() {
		
	}

	public DisciplineBulletin(Double finalNote, boolean approved, Discipline discipline, double firstNote1,
			double firstNote2, double firstNoteRecovery, double secondNote1, double secondNote2,
			double secondNoteRecovery, double thirdNote1, double thirdNote2, double thirdNoteRecovery,
			double fourthNote1, double fourthNote2, double fourthoteRecovery) {
		super();
		this.finalNote = finalNote;
		this.approved = approved;
		this.discipline = discipline;
		this.firstNote1 = firstNote1;
		this.firstNote2 = firstNote2;
		this.firstNoteRecovery = firstNoteRecovery;
		this.secondNote1 = secondNote1;
		this.secondNote2 = secondNote2;
		this.secondNoteRecovery = secondNoteRecovery;
		this.thirdNote1 = thirdNote1;
		this.thirdNote2 = thirdNote2;
		this.thirdNoteRecovery = thirdNoteRecovery;
		this.fourthNote1 = fourthNote1;
		this.fourthNote2 = fourthNote2;
		this.fourthoteRecovery = fourthoteRecovery;
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

	public double getFirstNote1() {
		return firstNote1;
	}

	public void setFirstNote1(double firstNote1) {
		this.firstNote1 = firstNote1;
	}

	public double getFirstNote2() {
		return firstNote2;
	}

	public void setFirstNote2(double firstNote2) {
		this.firstNote2 = firstNote2;
	}

	public double getFirstNoteRecovery() {
		return firstNoteRecovery;
	}

	public void setFirstNoteRecovery(double firstNoteRecovery) {
		this.firstNoteRecovery = firstNoteRecovery;
	}

	public double getSecondNote1() {
		return secondNote1;
	}

	public void setSecondNote1(double secondNote1) {
		this.secondNote1 = secondNote1;
	}

	public double getSecondNote2() {
		return secondNote2;
	}

	public void setSecondNote2(double secondNote2) {
		this.secondNote2 = secondNote2;
	}

	public double getSecondNoteRecovery() {
		return secondNoteRecovery;
	}

	public void setSecondNoteRecovery(double secondNoteRecovery) {
		this.secondNoteRecovery = secondNoteRecovery;
	}

	public double getThirdNote1() {
		return thirdNote1;
	}

	public void setThirdNote1(double thirdNote1) {
		this.thirdNote1 = thirdNote1;
	}

	public double getThirdNote2() {
		return thirdNote2;
	}

	public void setThirdNote2(double thirdNote2) {
		this.thirdNote2 = thirdNote2;
	}

	public double getThirdNoteRecovery() {
		return thirdNoteRecovery;
	}

	public void setThirdNoteRecovery(double thirdNoteRecovery) {
		this.thirdNoteRecovery = thirdNoteRecovery;
	}

	public double getFourthNote1() {
		return fourthNote1;
	}

	public void setFourthNote1(double fourthNote1) {
		this.fourthNote1 = fourthNote1;
	}

	public double getFourthNote2() {
		return fourthNote2;
	}

	public void setFourthNote2(double fourthNote2) {
		this.fourthNote2 = fourthNote2;
	}

	public double getFourthoteRecovery() {
		return fourthoteRecovery;
	}

	public void setFourthoteRecovery(double fourthoteRecovery) {
		this.fourthoteRecovery = fourthoteRecovery;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	
	
	

}
