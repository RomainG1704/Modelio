package test;

import module.Client;
import module.Film;
import module.Location;
import org.junit.Test;
import prix.PrixNormal;
import prix.PrixNouveaute;
import statement.HtmlStatement;

import static org.junit.Assert.*;

public class HtmlStatementTest {

    @Test
    public void testStatementGeneration() {
        Film film1 = new Film("module.Film Normal");
        film1.setPrix(new PrixNormal(film1));

        Film film2 = new Film("module.Film Nouveauté");
        film2.setPrix(new PrixNouveaute(film2));

        Location location1 = new Location(film1, 3);
        Location location2 = new Location(film2, 5);

        Client client = new Client("Jean Dupont", new HtmlStatement());
        client.addLocation(location1);
        client.addLocation(location2);

        // Test génération du statement en HTML
        String expectedStatement = "<h1>Situation du client: Jean Dupont</h1><p>module.Film Normal: 6.0</p><p>module.Film Nouveauté: 15.0</p><p>Total: 21.0</p><p>Vous gagnez 13 points de fidelite</p>";
        String actualStatement = client.getStatement();

        assertEquals(expectedStatement, actualStatement);
    }
}
