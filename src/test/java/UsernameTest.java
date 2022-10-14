
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsernameTest {

    @Test
    void testUsername() {
        Student s = new Student("John Legend", 20, "17/08/2002", 123456789);
        String username = s.getUsername();

        assertEquals(username, "johnlegend20");

        Lecturer l = new Lecturer("Ashley Cole", 32, "", 2);
        username = l.getUsername();

        assertEquals(username, "ashleycole32");
    }

}
