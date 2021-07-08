package school;

public enum TwoMonths {
	
	FIRST(1, "FIRST"),
	SECOND(2, "SECOND"),
	THIRD(3, "THIRD"),
	FOURTH(4, "FOURTH");
	
	private TwoMonths(Integer number, String name ){
		this.name = name;
		this.number = number;
	}
	
	private Integer number;
	private String name;
	
	public Integer getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOrdinal() {
		return this.number + "º";
	}
	
}
