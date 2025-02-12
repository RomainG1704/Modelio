package prix;

import module.Film;

public class PrixEnfant extends Prix {

    // Constructeur
    public PrixEnfant(Film film) {
        super(film);  // Appel au constructeur de la classe parent prix.Prix
    }

    @Override
    public double getMontant(int nbJours) {
        // Montant de base pour la location
        double montant = 1.5;

        // Calcul du montant supplémentaire si les jours de location sont supérieurs à 3
        if (nbJours > 3) {
            montant += (nbJours - 3) * 1.5;
        }

        return montant;
    }

    @Override
    public int getPointsFidelites(int nbJours) {
        // Les points de fidélité pour le tarif Enfant sont fixés à 1
        return 1;
    }
}
