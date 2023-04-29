package org.csystem.app.company;

import com.bengisuuzunyenigun.company.Manager;
import com.bengisuuzunyenigun.company.SalesManager;
import com.dilekozdil.app.employee.ProjectWorker;
import com.dilekozdil.app.employee.Worker;
import com.huseyinemrealtun.app.company.HumanResources;

public class CompanyDemoApp {
    private static Worker getWorker()
    {
        Worker worker = new Worker();

        worker.setName("Ali");
        worker.setCitizenId("12345678912");
        worker.setAddress("Mecidiyeköy");
        worker.setFeePerHour(250);
        worker.setHourPerDay(8);

        return worker;
    }

    private static Manager getManager()
    {
        Manager manager = new Manager();

        manager.setName("Veli");
        manager.setCitizenId("12345678234");
        manager.setAddress("Şişli");
        manager.setDepartment("Pazarlama");
        manager.setSalary(50000);

        return manager;
    }

    private static SalesManager getSalesManager()
    {
        SalesManager manager = new SalesManager();

        manager.setName("Selami");
        manager.setCitizenId("12345678238");
        manager.setAddress("Riva");
        manager.setDepartment("Pazarlama");
        manager.setSalary(50000);
        manager.setExtra(20000);

        return manager;
    }

    private static ProjectWorker getProjectWorker()
    {
        ProjectWorker worker = new ProjectWorker();

        worker.setName("Ayşe");
        worker.setCitizenId("12345678910");
        worker.setAddress("Levent");
        worker.setFeePerHour(250);
        worker.setHourPerDay(8);
        worker.setProjectName("Runner Game Project");
        worker.setExtraFee(10000);

        return worker;
    }

    private static void run()
    {
        HumanResources humanResources = new HumanResources();
        Worker worker = getWorker();
        Manager manager = getManager();
        SalesManager salesManager = getSalesManager();
        ProjectWorker projectWorker = getProjectWorker();

        humanResources.payInsurance(worker);
        humanResources.payInsurance(manager);
        humanResources.payInsurance(salesManager);
        humanResources.payInsurance(projectWorker);
    }

    public static void main(String[] args)
    {
        run();
    }
}
