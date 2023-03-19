/*----------------------------------------------------------------
	FILE		: IntValue.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 19.03.2023

	Immutable IntValue class that wraps an int value by using cache
	for values int [-128, 127] interval

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.wrapper;

public class IntValue {
    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;
    private static final IntValue [] CACHE = new IntValue[CACHE_MAX - CACHE_MIN + 1];

    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static IntValue of(int value)
    {
        //...
    }

    public int getValue()
    {
        return m_value;
    }
}
