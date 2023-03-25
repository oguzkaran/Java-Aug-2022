/*----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.Point;

class App {
	public static void main(String [] args)
	{
		Point p1 = Point.createCartesian(100, 100);
		Point p2 = Point.createPolar(100, 50);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}



