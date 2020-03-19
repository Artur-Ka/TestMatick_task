package ua.test;

import ua.test.managers.FigureManager;
import ua.test.model.Figure;

/**
 * 
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 19:41:00
 */
public class Main {

	public static void main(String[] args) {

		FigureManager.getInstance().createFiguresList();

		for (Figure f : FigureManager.getInstance().getFiguresList()) {
			f.draw();
		}
	}
}
