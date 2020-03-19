package ua.test.model;

import ua.test.Color;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:40:26
 */
public class Square extends Figure {

	private final int a;

	public Square(int a, Color color) {
		super.name = "Квадрат";
		super.color = color;
		this.a = a;
	}

	public int getSideA() {
		return a;
	}

	@Override
	public double getPerimeter() {
		return a * 4;
	}

	@Override
	public double getArea() {
		return a * a;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", длина стороны: ");
		sb.append(getSideA());
		sb.append(" ед.");
		return sb.toString();
	}
}
