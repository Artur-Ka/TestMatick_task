package ua.test.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ua.test.Color;
import ua.test.model.Circle;
import ua.test.model.Figure;
import ua.test.model.Square;
import ua.test.model.Trapeze;
import ua.test.model.Triangle;
import ua.test.utils.Utils;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:46:16
 */
public class FigureManager {

	public static final int MIN_LIST_SIZE = 5;
	public static final int MAX_LIST_SIZE = 30;
	public static final int MAX_SIDE_LENGTH = 30;

	private List<Figure> figuresList;

	private FigureManager() {

	}

	public List<Figure> getFiguresList() {
		return figuresList;
	}

	public List<Figure> createFiguresList() {

		final int randomSize = (int) (Math.random() * (MAX_LIST_SIZE - MIN_LIST_SIZE + 1) + MIN_LIST_SIZE);
		figuresList = new ArrayList<Figure>(randomSize);

		for (int i = 0; i < randomSize; i++) {
			figuresList.add(generateFigure());
		}

		return figuresList;
	}

	private Figure generateFigure() {
		Figure figure = null;

		final Random random = new Random();
		final int rnd = random.nextInt(1001);

		if (rnd < 250) {
			int a = 0;

			while (!Utils.isValidLength(a)) {
				a = random.nextInt(MAX_SIDE_LENGTH + 1);
			}
			figure = new Square(a, Color.values()[random.nextInt(Color.values().length)]);
		} else if (rnd < 500) {
			int a = 0, b = 0, c = 0;

			while (!Utils.isValidTriangle(a, b, c)) {
				a = random.nextInt(MAX_SIDE_LENGTH + 1);
				b = random.nextInt(MAX_SIDE_LENGTH + 1);
				c = random.nextInt(MAX_SIDE_LENGTH + 1);
			}
			figure = new Triangle(a, b, c, Color.values()[random.nextInt(Color.values().length)]);
		} else if (rnd < 750) {
			int r = 0;

			while (!Utils.isValidLength(r)) {
				r = random.nextInt(MAX_SIDE_LENGTH + 1);
			}
			figure = new Circle(r, Color.values()[random.nextInt(Color.values().length)]);
		} else {
			int a = 0, b = 0, c = 0, d = 0;

			while (!Utils.isValidTrapeze(a, b, c, d)) {
				a = random.nextInt(MAX_SIDE_LENGTH + 1);
				b = random.nextInt(MAX_SIDE_LENGTH + 1);
				c = random.nextInt(MAX_SIDE_LENGTH + 1);
				d = random.nextInt(MAX_SIDE_LENGTH + 1);
			}
			figure = new Trapeze(a, b, c, d, Color.values()[random.nextInt(Color.values().length)]);
		}
		return figure;
	}

	public static final FigureManager getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		private static final FigureManager INSTANCE = new FigureManager();
	}
}
