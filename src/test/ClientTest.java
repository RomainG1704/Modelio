package test;

import module.Client;
import module.Film;
import module.Location;
import org.junit.Test;
import prix.PrixNormal;
import prix.PrixNouveaute;
import statement.TextStatement;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void testMontantTotal() {
        Film film1 = new Film("module.Film 1");
        film1.setPrix(new PrixNormal(film1));

        Film film2 = new Film("module.Film 2");
        film2.setPrix(new PrixNouveaute(film2));

        Location location1 = new Location(film1, 3);
        Location location2 = new Location(film2, 5);

        Client client = new Client("Jean Dupont", new TextStatement());
        client.addLocation(location1);
        client.addLocation(location2);

        double montantTotal = client.getMontantTotal();
        assertEquals(21.0, montantTotal, 0.01);
    }

    @Test
    public void testPointsFidelitesTotal() {
        Film film1 = new Film("module.Film 1");
        film1.setPrix(new PrixNormal(film1));

        Film film2 = new Film("module.Film 2");
        film2.setPrix(new PrixNouveaute(film2));

        Location location1 = new Location(film1, 3);
        Location location2 = new Location(film2, 5);

        Client client = new Client("Jean Dupont", new TextStatement());
        client.addLocation(location1);
        client.addLocation(location2);

        int pointsFidelitesTotal = client.getPointsFidelitesTotal();
        assertEquals(13, pointsFidelitesTotal);
    }
}
