package org.csystem.generator.random;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.math.Complex;
import org.csystem.util.math.geometry.Point;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class RandomObjectArrayGenerator {
    private final Random m_random;

    //String, Complex, Point, Integer, int [], Boolean, Character
    public Object createObject()
    {
        return switch (m_random.nextInt(7)) {
            case 0 -> StringUtil.getRandomTextTR(m_random, m_random.nextInt(5, 11));
            case 1 -> new Complex(m_random.nextDouble(-10, 10), m_random.nextDouble(-10, 10));
            case 2 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> m_random.nextInt(-128, 127);
            case 4 -> m_random.nextBoolean();
            case 5 -> (char)((m_random.nextBoolean() ? 'A' : 'a') + m_random.nextInt(26));
            default -> ArrayUtil.getRandomArray(m_random, m_random.nextInt(5, 16), 0, 100);
        };
    }

    public RandomObjectArrayGenerator()
    {
        m_random = new Random();
    }

    public RandomObjectArrayGenerator(Random random)
    {
        m_random = random;
    }

    public Object [] createObjects(int count)
    {
        Object [] objects = new Object[count];

        for (int i = 0; i < count; ++i)
            objects[i] = createObject();

        return objects;
    }
}
