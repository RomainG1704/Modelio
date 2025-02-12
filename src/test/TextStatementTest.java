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
        String expectedStatement = "Situation du client: Jean Dupont\n\tmodule.Film Normal\t6.0\n\tmodule.Film Nouveauté\t15.0\nTotal du 21.0\nVous gagnez 13 points de fidelite\n";
        String actualStatement = client.getStatement();

        assertEquals(expectedStatement, actualStatement);
    }
}
