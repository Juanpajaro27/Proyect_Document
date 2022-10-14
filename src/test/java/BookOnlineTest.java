import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BookOnlineTest {

    @Test
   public void BookOnlineTest(){
        String[] Authorslist = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(Authorslist);
        String category = "Law";
        DocumentScheme onlinebook = new BookOnline(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        DocumentScheme BookOnline = new BookOnline(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertEquals(onlinebook, onlinebook);
    }
    @Test
   public void testToString() {
        String[] Authorslist = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(Authorslist);
        String category = "Law";
        BookOnline onlinebook = new BookOnline(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        BookOnline onlineboook = new BookOnline(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(onlinebook.toString(),onlineboook.toString());
    }

    @Test
    public void getCategory() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IOnlinePDF onlinebook = documentBook.getDocumentOnline("BookOnline");
        String category = onlinebook.GetCategory("Law");
        String NotCategory = "Coding";
        assertEquals(category,"Law");
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));

    }
}