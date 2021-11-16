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
        expected.add("run a lot  |  Incomplete |  2021-07-23 |");
        expected.add("poop       |  Complete   |  2021-07-09 |");
        expected.add("brush face |  Complete   |  2021-07-14 |");
        //then
        assertEquals(expected, fileManager.readFromFile("test.txt"));
    }
}