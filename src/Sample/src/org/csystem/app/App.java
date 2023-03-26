/*----------------------------------------------------------------------------------------------------------------------
	Sınıflararası İlişkiler:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Input a device status text as OPEN, CLOSED or INDETERMINATE:");
		String statusStr = kb.nextLine().toUpperCase();
		DeviceStatus deviceStatus = DeviceStatus.valueOf(statusStr);

		System.out.println(
				switch (deviceStatus) {
					case OPEN -> "Device open";
					case CLOSED -> "Device closed";
					default -> "Device status unknown";
				});

		System.out.println("Thanks!...");
	}
}

enum DeviceStatus {
	OPEN, CLOSED, INDETERMINATE
}

