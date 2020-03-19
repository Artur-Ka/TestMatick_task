package ua.test;

public enum Color {

	BLACK("чёрный"),
	BLUE("синий"),
	GRAY("серый"),
	GREEN("зелёный"),
	ORANGE("оранжевый"),
	PINK("розовый"),
	RED("красный"),
	WHITE("белый"),
	YELLOW("жёлтый");
	
	private final String descr;
	
	Color (String descr){
		this.descr = descr;
	}
	
	@Override
	public String toString() {
		return descr;
	}
}
