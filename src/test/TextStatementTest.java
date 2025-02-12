package test;

import module.Client;
import module.Film;
import module.Location;
import org.junit.Test;
import prix.PrixNormal;
import prix.PrixNouveaute;
import statement.TextStatement;

import static org.junit.Assert.*;

public class TextStatementTest {

    @Test
    public void testStatementGeneration() {
        Film film1 = new Film("module.Film Normal");
        film1.setPrix(new PrixNormal(film1));

        Film film2 = new Film("module.Film Nouveauté");
        film2.setPrix(new PrixNouveaute(film2));

        Location location1 = new Location(film1, 3);
        Location location2 = new Location(film2, 5);

        Client client = new Client("Jean Dupont", new TextStatement());
        client.addLocation(location1);
        client.addLocation(location2);

        // Test génération du statement en texte
        String expectedStatement = "Facture pour Jean Dupont\nmodule.Film Normal: 10.0€\nmodule.Film Nouveauté: 15.0€\nTotal: 25.0€";
        String actualStatement = client.getStatement();

        assertEquals(expectedStatement, actualStatement);
    }
}
