import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

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
    void testGetTitre(){
        assertEquals("Film Normal", filmNormal.getTitre());
    }

    @Test
    void testGetPrix(){
        assertEquals(1, filmNouveaute.getCodePrix());
    }
}
