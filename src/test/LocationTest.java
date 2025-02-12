package test;

import module.Film;
import module.Location;
import org.junit.Test;
import prix.PrixNormal;
import prix.PrixNouveaute;

import static org.junit.Assert.*;

public class LocationTest {

    @Test
    public void testLocationWithPrixNormal() {
        Film film = new Film("module.Film Normal");
        film.setPrix(new PrixNormal(film));

        Location location = new Location(film, 5); // module.Location de 5 jours

        // Test Montant de la location
        double montant = location.getMontant();
        assertEquals(10.0, montant, 0.01);

        // Test Points de fidélité de la location
        int pointsFid = location.getPointsFidelites();
        assertEquals(5, pointsFid);
    }

    @Test
    public void testLocationWithPrixNouveaute() {
        Film film = new Film("module.Film Nouveauté");
        film.setPrix(new PrixNouveaute(film));

        Location location = new Location(film, 5); // module.Location de 5 jours

        // Test Montant de la location
        double montant = location.getMontant();
        assertEquals(15.0, montant, 0.01);

        // Test Points de fidélité de la location
        int pointsFid = location.getPointsFidelites();
        assertEquals(10, pointsFid);
    }
}
