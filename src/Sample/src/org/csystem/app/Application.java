package org.csystem.app;

import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.*;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

public class Application {
    public static void run(String[] args)
    {
        Console.writeLine(System.getProperty("line.separator").equals("\r\n"));
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
