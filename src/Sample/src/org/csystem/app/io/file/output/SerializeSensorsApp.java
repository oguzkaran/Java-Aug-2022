package org.csystem.app.io.file.output;

import org.csystem.app.io.file.data.Sensor;
import org.csystem.util.console.Console;

import java.io.*;

import static org.csystem.util.console.commandline.CommandLineArgsUtil.checkLengthEquals;

public class SerializeSensorsApp {
    public static void run(String[] args)
    {
        checkLengthEquals(args.length, 1, "Wrong number of arguments!...");

        try (FileOutputStream fos = new FileOutputStream(args[0], true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            while (true) {
                int id = Console.readInt("Input id:");
                if (id <= 0)
                    break;

                String name = Console.readString("Input name:");

                Sensor sensor = new Sensor(id, name);

                oos.writeObject(sensor);
            }

            Console.writeLine();
        }
        catch (InvalidClassException ex) {
            Console.writeErrLine("Invalid class to serialize:%s", ex.getMessage());
        }
        catch (NotSerializableException ex) {
            Console.writeErrLine("All of the elements do not implement Serializable:%s", ex.getMessage());
        }
        catch (IOException ex) {
            Console.writeErrLine("I/O problem occurs:%s", ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
