package module;

import prix.Prix;

public class Film {
	private String titre;
	private Prix prix;  // Nouvelle référence à un objet prix.Prix

	public Film(String titre) {
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setPrix(Prix prix) {
		this.prix = prix;
	}

	// Delegation des calculs à la classe prix.Prix
	public double getMontant(int nbJours) {
		return prix.getMontant(nbJours);
	}

	public int getPointsFidelites(int nbJours) {
		return prix.getPointsFidelites(nbJours);
	}
}
