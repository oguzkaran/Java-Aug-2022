/*----------------------------------------------------------------
	FILE		: Console.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 17.06.2023

	Utility class for standard input and output operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB;

    static {
        KB = new Scanner(System.in);
    }

    private Console()
    {
    }

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String prompt)
    {
        return readInt(prompt, "");
    }

    public static int readInt(String prompt, String invalidMessage)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(invalidMessage);
            }
        }
    }

    public static double readDouble()
    {
        return readDouble("");
    }

    public static double readDouble(String prompt)
    {
        return readDouble(prompt, "");
    }

    public static double readDouble(String prompt, String invalidMessage)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(invalidMessage);
            }
        }
    }

    public static long readLong()
    {
        return readLong("");
    }

    public static long readLong(String prompt)
    {
        return readLong(prompt, "");
    }

    public static long readLong(String prompt, String invalidMessage)
    {
        while (true) {
            try {
                System.out.print(prompt);

                return Long.parseLong(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(invalidMessage);
            }
        }
    }

    public static String readString(String prompt)
    {
        write(prompt);
        return KB.nextLine();
    }

    //...


    public static void write(Object arg)
    {
        write("%s", arg);
    }

    public static void write(String format, Object...args)
    {
        System.out.printf(format, args);
    }

    public static void writeLine(String format, Object...args)
    {
        write(format + "\n", args);
    }

    public static void writeLine()
    {
        System.out.println();
    }

    public static void writeLine(Object arg)
    {
        writeLine("%s", arg);
    }

    //...
}
