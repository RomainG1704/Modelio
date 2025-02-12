package prix;

import module.Film;

public class PrixNormal extends Prix {

    public PrixNormal(Film film) {
        super(film);
    }

    @Override
    public double getMontant(int nbJours) {
        return nbJours * 2.0;  // Exemple de calcul pour un prix normal
    }

    @Override
    public int getPointsFidelites(int nbJours) {
        return nbJours;  // Exemple de points de fidélité
    }
}
