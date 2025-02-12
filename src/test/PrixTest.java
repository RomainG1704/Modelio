package test;

import module.Film;
import org.junit.Test;
import prix.Prix;
import prix.PrixNormal;
import prix.PrixNouveaute;

import static org.junit.Assert.*;

public class PrixTest {

    @Test
    public void testPrixNormal() {
        Film film = new Film("module.Film Normal");
        Prix prix = new PrixNormal(film);

        // Test Montant
        double montant = prix.getMontant(5);  // 5 jours de location
        assertEquals(10.0, montant, 0.01);

        // Test Points de fidélité
        int pointsFid = prix.getPointsFidelites(5);
        assertEquals(5, pointsFid);
    }

    @Test
    public void testPrixNouveaute() {
        Film film = new Film("module.Film Nouveauté");
        Prix prix = new PrixNouveaute(film);

        // Test Montant
        double montant = prix.getMontant(5);  // 5 jours de location
        assertEquals(15.0, montant, 0.01);

        // Test Points de fidélité
        int pointsFid = prix.getPointsFidelites(5);
        assertEquals(10, pointsFid);
    }
}
