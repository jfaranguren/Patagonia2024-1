package model;

import java.util.ArrayList;

public class Controller {

	private ArrayList<PlaneTicket> planeTickets;
	private ArrayList<Vehicle> vehicles;

	public Controller() {

		this.planeTickets = new ArrayList<PlaneTicket>();
		this.vehicles = new ArrayList<Vehicle>();

	}

	public String showVehicleList() {

		String list = "";

		if (!vehicles.isEmpty()) {

			for (int i = 0; i < vehicles.size(); i++) {

				list += "\n" + (i + 1) + ". " + vehicles.get(i).getId() + "-" + vehicles.get(i).getBrand();

			}
		} else {

			list = "There are no vehicles registered yet";

		}

		return list;

	}

	public String showPlaneTicketsList() {

		String list = "";

		if (!planeTickets.isEmpty()) {

			for (int i = 0; i < planeTickets.size(); i++) {

				list += "\n" + (i + 1) + ". " + planeTickets.get(i).getAirLineName() + "-"
						+ planeTickets.get(i).getFlightNumber();

			}
		} else {

			list = "There are no tickets registered yet";

		}

		return list;
	}

	public boolean registerVehicle(String id, String brand, double cylinderCapacity) {

		return vehicles.add(new Vehicle(id, brand, cylinderCapacity));
	}

	public boolean registerPlaneTicket(String airLineName, String flightNumber, double kmBetweenCities) {

		return planeTickets.add(new PlaneTicket(airLineName, flightNumber, kmBetweenCities));
	}

}
