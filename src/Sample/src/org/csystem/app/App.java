/*----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki "aggregation" ilişkisinin genel bir implementasyonu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Driver driver = new Driver("Ali Serçe");
		Car car = new Car(driver);

		car.run();
	}
}

class Plane {
	private Engine [] m_engines;
	private Pilot[] m_pilots;
	//...
}

class Car {
	private Engine m_engine;
	private Driver m_driver;

	public Car(Driver driver/*...*/)
	{
		m_engine = new Engine(/*...*/);
		m_driver = driver;
	}

	public void brake()
	{
		//...
		m_engine.slowEngine();
	}

	public void run()
	{
		System.out.printf("Driver: %s%n", m_driver.toString());
		m_engine.startEngine();
		m_engine.accelerateEngine();

		System.out.println("running!...");
		//...

		brake();
		m_engine.stopEngine();
	}

	//...
}

class Pilot {
	private String m_name;
	private int m_title;
	//...

	public Pilot(String name, int title)
	{
		//...
		m_name = name;
		m_title = title;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		//...
		m_name = name;
	}

	public int getTitle()
	{
		return m_title;
	}

	public void setTitle(int title)
	{
		//...
		m_title = title;
	}

	public String toString()
	{
		return String.format("[%d]%s", m_title, m_name);
	}
}


class Driver {
	private String m_name;
	//...

	public Driver(String name)
	{
		//...
		m_name = name;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		//...
		m_name = name;
	}

	public String toString()
	{
		return m_name;
	}
}

class Engine {
	//...
	public void startEngine()
	{
		System.out.println("Start engine");
	}

	public void accelerateEngine()
	{
		System.out.println("Accelerate engine");
	}

	public void slowEngine()
	{
		System.out.println("Slow engine");
	}

	public void stopEngine()
	{
		System.out.println("Stop engine");
	}
}