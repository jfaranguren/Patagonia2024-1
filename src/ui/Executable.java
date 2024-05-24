package ui;

import java.util.Scanner;

import model.Controller;

public class Executable {

	public Scanner reader;
	public Controller controller;

	public static void main(String[] args) {
		Executable patagonia = new Executable();
		patagonia.showMainMenu();
	}

	public Executable() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public void showMainMenu() {

		System.out.println("Welcome to Patagonia");

		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nType an option");
			System.out.println("1. Register a Vehicle");
			System.out.println("2. Register a Plane Ticket");
			System.out.println("3. Book a Vehicle");
			System.out.println("4. Book a Flight");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

				case 1:
					registerVehicle();
					break;
				case 2:
					registerPlaneTicket();
					break;
				case 3:
					bookVehicle();
					break;
				case 4:
					bookTicket();
					break;
				case 0:
					System.out.println("Thanks for using our system");
					stopFlag = true;
					break;
				default:
					System.out.println("You must type a valid option");
					break;

			}

		}

	}

	public void registerVehicle() {

		reader.nextLine();
		System.out.println("Type the new Vehicles's ID: ");
		String id = reader.nextLine();

		System.out.println("Type the new Vehicles's brand: ");
		String brand = reader.nextLine();

		System.out.println("Type the new Vehicles's cylinder capacity: ");
		double cylinderCapacity = reader.nextDouble();

		if (controller.registerVehicle(id, brand, cylinderCapacity)) {

			System.out.println("Vehicle registered successfully");

		} else {

			System.out.println("Error, Vehicle couldn't be registered");
		}

	}

	public void registerPlaneTicket() {

		reader.nextLine();
		System.out.println("Type the new Plane Ticket's Airline name: ");
		String airlineName = reader.nextLine();

		System.out.println("Type the new Plane Ticket's Flight Number: ");
		String flightNumber = reader.nextLine();

		System.out.println("Type the new Plane Ticket's kilometers between cities: ");
		double kmBetweenCities = reader.nextDouble();

		if (controller.registerPlaneTicket(airlineName, flightNumber, kmBetweenCities)) {

			System.out.println("Ticket registered successfully");

		} else {

			System.out.println("Error, Ticket couldn't be registered");
		}

	}

	public void bookVehicle() {

	}

	public void bookTicket() {

	}

}
