package org.csystem.app;

import org.csystem.util.console.Console;

import java.nio.file.Path;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

public class Application {
    public static void run(String[] args)
    {
        checkLengthEquals(args.length, 1, "Wrong number of arguments!...");
        Path path = Path.of(args[0]);

        Console.writeLine(path);
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
