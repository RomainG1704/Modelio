package prix;

import module.Film;

public class PrixNouveaute extends Prix {

    public PrixNouveaute(Film film) {
        super(film);
    }

    @Override
    public double getMontant(int nbJours) {
        return nbJours * 3.0;  // Exemple de calcul pour une nouveauté
    }

    @Override
    public int getPointsFidelites(int nbJours) {
        return nbJours * 2;  // Exemple de points de fidélité
    }
}
