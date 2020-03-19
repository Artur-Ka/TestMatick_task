package ua.test.model;

import ua.test.Color;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:40:42
 */
public class Circle extends Figure {

	private final int r;

	public Circle(int r, Color color) {
		super.name = "Круг";
		super.color = color;
		this.r = r;
	}

	public int getRadius() {
		return r;
	}

	public int getDiameter() {
		return r * 2;
	}

	@Override
	public double getPerimeter() {
		return getDiameter() * Math.PI;
	}

	@Override
	public double getArea() {
		return Math.PI * (r * r);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", радиус: ");
		sb.append(getRadius());
		sb.append(" ед.");
		return sb.toString();
	}
}
