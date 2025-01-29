import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    private Location location;
    private Film filmtest;

    @BeforeEach
    void setUp() {
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
