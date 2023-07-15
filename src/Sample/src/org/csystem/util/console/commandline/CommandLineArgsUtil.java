/*----------------------------------------------------------------
	FILE		: CommandLineUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 15.07.2023

	Utility class for Command Line Arguments

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.console.commandline;

import org.csystem.util.console.Console;

public final class CommandLineArgsUtil {
    private CommandLineArgsUtil()
    {
    }

    public static void checkLengthEquals(int length, int value, String message, int exitCode)
    {
        if (value != length) {
            Console.writeErrLine(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthEquals(int length, int value, String message)
    {
        checkLengthEquals(length, value, message, 1);
    }

    //...
}
