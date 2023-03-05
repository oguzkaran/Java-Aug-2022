package org.csystem.app.simulation.exam;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation physicsSimulation = new ExamSimulation("Fizik");
        ExamSimulation mathSimulation = new ExamSimulation("Matematik");

        physicsSimulation.run();
        physicsSimulation.printReport();
        mathSimulation.run();
        mathSimulation.printReport();
    }
}
