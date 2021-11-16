package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class itemTest {

    @Test
    void getItemStatusTrue() {
        //given
        Item item = new Item();
        boolean status = true;
        //when
        item.makeItemStatus(true);
        //then
        assertEquals(status, item.getItemStatus());
    }

    @Test
    void getItemStatusFalse() {
        //given
        Item item = new Item();
        boolean status = false;
        //when
        item.setItemStatus(false);
        //then
        assertEquals(status, item.getItemStatus());
    }


    @Test
    void getItemDueDate() {
        //given
        Item item = new Item();
        LocalDate date = LocalDate.of(2011, 03, 11)
        //when
        item.setItemDueDate(date);
        //then
        assertEquals(date, item.getItemDueDate());

    }
}
