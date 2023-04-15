/*----------------------------------------------------------------
	FILE		: AnalyticalCircle.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 15.04.2023

	AnalyticalCircle class that represents a circle in
	cartesian plane

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private MutablePoint m_center;

    public AnalyticalCircle(double radius, double x, double y)
    {
        super(radius);
        m_center = MutablePoint.createCartesian(x, y);
    }

    public double getX()
    {
        return m_center.getX();
    }

    public void setX(double x)
    {
        m_center.setX(x);
    }

    public double getY()
    {
        return m_center.getY();
    }

    public void setY(double y)
    {
        m_center.setY(y);
    }

    //...
}
