import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    private Client client;
    private Location location;
    private Film filmtest;

    @BeforeEach
    void setUp() {
        client = new Client("John Doe");
        filmtest = new Film("Film Test", Film.NORMAL);
        location = new Location(filmtest, 5);
    }

    @Test
    void testGetNBJours(){
        assertEquals(5, location.getNbJours());
    }

    @Test
    void testGetFilm(){
        assertEquals(filmtest, location.getFilm());
    }
}
