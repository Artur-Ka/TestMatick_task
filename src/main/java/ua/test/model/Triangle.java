package ua.test.model;

import ua.test.Color;
import ua.test.utils.Utils;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:40:31
 */
public class Triangle extends Figure {

	private final int a, b, c;

	public Triangle(int a, int b, int c, Color color) {
		super.name = "Треугольник";
		super.color = color;
		this.a = a;
		this.b = b;
		this.c = c;
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

	/**
	 * @return Hypotenuse of triangle.
	 */
	public double getHypotenuse() {
		return isRight() ? Math.max(Math.max(a, b), c) : -1;
	}

	/**
	 * @return Height lowered to side a.
	 */
	public double getHeightA() {
		final double hPerim = getPerimeter() / 2.;
		return (2 * Math.sqrt(hPerim * (hPerim - a) * (hPerim - b) * (hPerim - c))) / a;
	}

	/**
	 * @return Height lowered to side b.
	 */
	public double getHeightB() {
		final double hPerim = getPerimeter() / 2.;
		return (2 * Math.sqrt(hPerim * (hPerim - a) * (hPerim - b) * (hPerim - c))) / b;
	}

	/**
	 * @return Height lowered to side c.
	 */
	public double getHeightC() {
		final double hPerim = getPerimeter() / 2.;
		return (2 * Math.sqrt(hPerim * (hPerim - a) * (hPerim - b) * (hPerim - c))) / c;
	}

	@Override
	public double getPerimeter() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		return a * getHeightA() / 2.;
	}

	/**
	 * @return A triangle is right.
	 */
	public boolean isRight() {
		final int hypotenuse = Math.max(Math.max(a, b), c);
		if (hypotenuse == a) {
			return (hypotenuse * hypotenuse) == ((b * b) + (c * c));
		} else if (hypotenuse == b) {
			return (hypotenuse * hypotenuse) == ((a * a) + (c * c));
		} else {
			return (hypotenuse * hypotenuse) == ((a * a) + (b * b));
		}
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
		sb.append(" ед.");
		if (isRight()) {
			sb.append(", гипотенуза: ");
			sb.append(Utils.round(getHypotenuse()));
		}
		return sb.toString();
	}
}
