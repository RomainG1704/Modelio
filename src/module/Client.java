package module;

import statement.Statement;

import java.util.LinkedList;
import java.util.List;

public class Client {
	private String nom;
	private List<Location> locations = new LinkedList<Location>();
	private Statement statementStrategy;  // Référence à la stratégie de présentation

	public Client(String nom, Statement statementStrategy) {
		this.nom = nom;
		this.statementStrategy = statementStrategy;
	}

	public void addLocation(Location location) {
		this.locations.add(location);
	}

	public List<Location> getLocations() {
		return locations;
	}

	public String getNom() {
		return this.nom;
	}

	public String getStatement() {
		return statementStrategy.getClientSummary(this);
	}

	public double getMontantTotal() {
		double montantTotal = 0;
		for (Location location : locations) {
			montantTotal += location.getMontant();
		}
		return montantTotal;
	}

	public int getPointsFidelitesTotal() {
		int pointsFidelitesTotal = 0;
		for (Location location : locations) {
			pointsFidelitesTotal += location.getPointsFidelites();
		}
		return pointsFidelitesTotal;
	}
}
