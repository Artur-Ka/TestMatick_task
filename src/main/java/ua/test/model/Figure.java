package ua.test.model;

import ua.test.Color;
import ua.test.utils.Utils;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:40:19
 */
public abstract class Figure {

	protected String name;
	protected Color color;

	/**
	 * @return Figure name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Color of figure.
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return Perimeter of figure.
	 */
	public abstract double getPerimeter();

	/**
	 * @return Area of figure.
	 */
	public abstract double getArea();

	/**
	 * Draw a figure.
	 */
	public void draw() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Фигура: ");
		sb.append(getName());
		sb.append(", площадь: ");
		sb.append(Utils.round(getArea()));
		sb.append(" кв. ед., периметр: ");
		sb.append(Utils.round(getPerimeter()));
		sb.append(" ед., цвет: ");
		sb.append(getColor());
		return sb.toString();
	}
}
