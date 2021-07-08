package school;

import java.io.Serializable;

public class BulletinNote implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double noteOne;
	private Double noteTwo; 
	private Double recovery;
	private TwoMonths twoMonths;
	
	public BulletinNote() {
		
	}

	public BulletinNote(Double noteOne, Double noteTwo, Double recovery) {
		this.noteOne = noteOne;
		this.noteTwo = noteTwo;
		this.recovery = recovery;
	}

	public Double getNoteOne() {
		return noteOne;
	}

	public void setNoteOne(Double noteOne) {
		this.noteOne = noteOne;
	}

	public Double getNoteTwo() {
		return noteTwo;
	}

	public void setNoteTwo(Double noteTwo) {
		this.noteTwo = noteTwo;
	}

	public Double getRecovery() {
		return recovery;
	}

	public void setRecovery(Double recovery) {
		this.recovery = recovery;
	}

	public TwoMonths getTwoMonths() {
		return twoMonths;
	}

	public void setTwoMonths(TwoMonths twoMonths) {
		this.twoMonths = twoMonths;
	}
	
	
}
