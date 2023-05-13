package org.csystem.generator.random;

import org.csystem.util.math.geometry.Point;

import java.util.Random;

public class RandomPointFactory {
	private final Random m_random;

	public RandomPointFactory(Random random)
	{
		m_random = random;
	}

	public Point createPoint(double min, double bound)
	{
		if (min >= bound)
			return null;

		return Point.createCartesian(m_random.nextDouble(min, bound), m_random.nextDouble(min, bound));
	}
}