package org.csystem.app.io.file.copy;

import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class BackupAndCopyApp {
    public static void run(String [] args)
    {
        try {
            Path src = Path.of(args[0]);
            Path dest = Path.of(args[1]);

            if (Files.isDirectory(src) || Files.isDirectory(dest)) {
                Console.writeErrLine("Source and/or destination can not be a directory");
                System.exit(0);
            }

            BackupAndCopy backupAndCopy = new BackupAndCopy(Path.of(args[0]), Path.of(args[1]), "-bak");

            backupAndCopy.doCopy();
        }
        catch (NoSuchFileException ex) {
            Console.writeErrLine("'%s' not exists", ex.getFile());
        }
        catch (InvalidPathException ex) {
            Console.writeErrLine("'%s' is invalid", ex.getInput());
        }
        catch (SecurityException ignore) {
            Console.writeErrLine("Security problem occurs!...");
        }
        catch (IOException ignore) {
            Console.writeErrLine("I/O problem occurs!...");
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
