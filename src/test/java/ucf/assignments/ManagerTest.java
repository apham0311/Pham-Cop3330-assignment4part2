package ucf.assignments;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void readFromFile() {
        //given
        FileManager fileManager = new FileManager();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Date night  |  Incomplete |  2021-05-30 |");
        expected.add("Pick up food|  Complete   |  2021-11-11 |");
        expected.add("oil change  |  Complete   |  2021-03-11 |");
        //then
        assertEquals(expected, fileManager.readFromFile("test.txt"));
    }
}