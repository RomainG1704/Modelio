package module;

public class Location {
	private Film unFilm;
	private int nbJours;

	public Location(Film unFilm, int nbJours) {
		this.unFilm = unFilm;
		this.nbJours = nbJours;
	}

	public double getMontant() {
		return unFilm.getMontant(nbJours);  // Délégation au module.Film
	}

	public int getPointsFidelites() {
		return unFilm.getPointsFidelites(nbJours);  // Délégation au module.Film
	}

	public Film getFilm() {
		return unFilm;
	}

	public int getNbJours() {
		return nbJours;
	}
}
