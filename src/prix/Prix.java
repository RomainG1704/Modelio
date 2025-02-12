package prix;

import module.Film;

public abstract class Prix {
    protected Film film;

    public Prix(Film film) {
        this.film = film;
    }

    public abstract double getMontant(int nbJours);
    public abstract int getPointsFidelites(int nbJours);
}
