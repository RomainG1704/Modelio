package test;

import module.Film;
import org.junit.Test;
import prix.Prix;
import prix.PrixNormal;
import prix.PrixNouveaute;

import static org.junit.Assert.*;

public class FilmTest {

    @Test
    public void testFilmWithPrixNormal() {
        Film film = new Film("module.Film Normal");
        Prix prix = new PrixNormal(film);
        film.setPrix(prix);

        // Test Montant
        double montant = film.getMontant(5);  // On suppose 5 jours de location
        assertEquals(10.0, montant, 0.01);

        // Test Points de fidélité
        int pointsFid = film.getPointsFidelites(5);
        assertEquals(5, pointsFid);
    }

    @Test
    public void testFilmWithPrixNouveaute() {
        Film film = new Film("module.Film Nouveauté");
        Prix prix = new PrixNouveaute(film);
        film.setPrix(prix);

        // Test Montant
        double montant = film.getMontant(5);  // On suppose 5 jours de location
        assertEquals(15.0, montant, 0.01);

        // Test Points de fidélité
        int pointsFid = film.getPointsFidelites(5);
        assertEquals(10, pointsFid);
    }
}
