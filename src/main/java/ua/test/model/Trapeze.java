package ua.test.model;

import ua.test.Color;
import ua.test.utils.Utils;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:40:52
 */
public class Trapeze extends Figure {

	private final int a, b, c, d;

	public Trapeze(int a, int b, int c, int d, Color color) {
		super.name = "Трапеция";
		super.color = color;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getSideA() {
		return a;
	}

	public int getSideB() {
		return b;
	}

	public int getSideC() {
		return c;
	}

	public int getSideD() {
		return d;
	}

	public double getHeight() {
		final double tmp = (((d - b) * (d - b)) + (a * a) - (c * c)) / (2. * (d - b));
		return Math.sqrt((a * a) - (tmp * tmp));
	}

	@Override
	public double getPerimeter() {
		return a + b + c + d;
	}

	@Override
	public double getArea() {
		return ((d + b) * getHeight()) / 2.;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", длина сторон: ");
		sb.append(getSideA());
		sb.append(", ");
		sb.append(getSideB());
		sb.append(", ");
		sb.append(getSideC());
		sb.append(", ");
		sb.append(getSideD());
		sb.append(" ед.");
		sb.append(", высота: ");
		sb.append(Utils.round(getHeight()));
		sb.append(" ед.");
		return sb.toString();
	}
}
