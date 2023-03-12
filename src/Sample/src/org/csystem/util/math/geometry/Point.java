/*----------------------------------------------------------------
	FILE		: Point.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 12.03.2023

	Point class that represents 2 dimensional point in
	Cartesian plane

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	private double m_x;
	private double m_y;
	
	public Point()
	{		
	}
	
	public Point(double x)
	{
		m_x = x;
	}
	
	public Point(double x, double y)
	{
		m_x = x;
		m_y = y;
	}

	public double getX()
	{
		return m_x;
	}

	public void setX(double x)
	{
		m_x = x;
	}

	public double getY()
	{
		return m_y;
	}

	public void setY(double y)
	{
		m_y = y;
	}

	public double distance()
	{
		return distance(0, 0);			
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public double distance(double x, double y)
	{
		return sqrt(pow(m_x - x, 2) + pow(m_y - y, 2));
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		m_x += dx;
		m_y += dy;
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", m_x, m_y);
	}
}
