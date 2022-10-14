import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BookOnlineTest {

    @Test
   public void BookOnlineTest(){
        String[] ListAuthors = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(ListAuthors);
        String category = "Law";
        DocumentScheme BookOnline = new BookOnline(1974, category, Authors,"3ra edition","MProduction","press","spanish","1230",40,"First example");
        DocumentScheme BookOnline2 = new BookOnline(1974, category, Authors,"3ra edition","MProduction","press","spanish","1230",40,"First Example");
        assertNotSame(BookOnline,BookOnline2);
    }
    @Test
   public void testToStringTest() {
        String[] ListAuthors = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(ListAuthors);
        String category = "Law";
        BookOnline Bookonline = new BookOnline(1974, category, Authors,"3ra edition","MProduction","press","Spanish","1230",40,"First Example");
        BookOnline BookOnline2 = new BookOnline(1975, category, Authors,"3ra edition","MProduction","press","Spanish","1230",40,"First Example");
        assertNotEquals(Bookonline.toString(),BookOnline2.toString());
    }

    @Test
    public void getCategoryTest() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IOnlinePDF onlinebook = documentBook.getDocumentOnline("BookOnline");
        String category = onlinebook.GetCategory("Law");
        String NotCategory = "Coding";
        assertEquals(category,"Law");
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));

    }
}