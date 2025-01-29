import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ClientTest {

    private Client client;
    private Film filmNormal;
    private Film filmNouveaute;
    private Film filmEnfant;

    @BeforeEach
    void setUp() {
        client = new Client("John Doe");
        filmNormal = new Film("Film Normal", Film.NORMAL);
        filmNouveaute = new Film("Film Nouveauté", Film.NOUVEAUTE);
        filmEnfant = new Film("Film Enfant", Film.ENFANT);
    }

    @Test
    void testGetNom() {
        assertEquals("John Doe", client.getNom());
    }

    @Test
    void testAddLocation() {
        Location location = new Location(filmNormal, 3);
        client.addLocation(location);

        List<Location> locations = client.getLocations();
        assertEquals(1, locations.size());
        assertEquals(location, locations.get(0));
    }

    @Test
    void testSituationAvecUneLocationNormal() {
        Location location = new Location(filmNormal, 3);
        client.addLocation(location);

        String expected = "Situation du client: John Doe\n" +
                "\tFilm Normal\t3.5\n" +
                "Total du 3.5\n" +
                "Vous gagnez 1 points de fidelite\n";

        assertEquals(expected, client.situation());
    }

    @Test
    void testSituationAvecUneLocationNouveaute() {
        Location location = new Location(filmNouveaute, 3);
        client.addLocation(location);

        String expected = "Situation du client: John Doe\n" +
                "\tFilm Nouveauté\t9.0\n" +
                "Total du 9.0\n" +
                "Vous gagnez 2 points de fidelite\n";

        assertEquals(expected, client.situation());
    }

    @Test
    void testSituationAvecUneLocationEnfant() {
        Location location = new Location(filmEnfant, 4);
        client.addLocation(location);

        String expected = "Situation du client: John Doe\n" +
                "\tFilm Enfant\t3.0\n" +
                "Total du 3.0\n" +
                "Vous gagnez 1 points de fidelite\n";

        assertEquals(expected, client.situation());
    }

    @Test
    void testSituationAvecPlusieursLocations() {
        Location location1 = new Location(filmNormal, 3);
        Location location2 = new Location(filmNouveaute, 2);
        Location location3 = new Location(filmEnfant, 4);

        client.addLocation(location1);
        client.addLocation(location2);
        client.addLocation(location3);

        String expected = "Situation du client: John Doe\n" +
                "\tFilm Normal\t3.5\n" +
                "\tFilm Nouveauté\t6.0\n" +
                "\tFilm Enfant\t3.0\n" +
                "Total du 12.5\n" +
                "Vous gagnez 4 points de fidelite\n";

        assertEquals(expected, client.situation());
    }

    @Test
    void testSituationAucuneLocation() {
        String expected = "Situation du client: John Doe\n" +
                "Total du 0.0\n" +
                "Vous gagnez 0 points de fidelite\n";

        assertEquals(expected, client.situation());
    }
}