package ua.test.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author A. Karpenko
 * @date 18 мар. 2020 г. 22:13:14
 */
public class Utils {

	public static boolean isValidLength(int val) {
		return val > 0;
	}

	public static boolean isValidTriangle(int a, int b, int c) {
		return (a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a);
	}

	public static boolean isValidQuadrangle(int a, int b, int c, int d) {
		return (a > 0 && b > 0 && c > 0 && d > 0) && (a + b + c > d && a + b + d > c && a + c + d > b && b + c + d > a);
	}

	public static boolean isValidTrapeze(int a, int b, int c, int d) {
		final double tmp = (((d - b) * (d - b)) + (a * a) - (c * c)) / (2. * (d - b));
		final double height = Math.sqrt((a * a) - (tmp * tmp));
		final double area = ((d + b) * height) / 2.;
		return isValidQuadrangle(a, b, c, d)
				&& (height != 0 && !Double.isNaN(height) && area != 0 && !Double.isNaN(area));
	}

	public static float round(double val) {
		return new BigDecimal(val).setScale(2, RoundingMode.HALF_UP).floatValue();
	}
}
