import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DocumentSchemeTest {
    String[] lauthors = {"Jorge","Manuel"};
    List<String> authors= Arrays.asList(lauthors);
    DocumentScheme scheme = new BookOnline(1976,"Law",authors,"2da","Cartagena","Impreso","Español","ABSF",23,"NuevoLibro");
    @Test
    public void getYear() {
        int year = scheme.getYear();
        assertEquals(year,1976);
    }

    @Test
    public void setYear() {
         scheme.setYear(1989);
         int Newyearscheme= scheme.getYear();
         assertEquals(Newyearscheme,1989);
    }

    @Test
    public void getCategory() {
        String Category = scheme.getCategory();
        assertEquals(Category,"Law");
    }

    @Test
    public void setCategory() {
        scheme.setCategory("Art");
        String Newcategory = scheme.getCategory();
        assertEquals(Newcategory,"Art");
    }

    @Test
    public void getAuthors() {

    }

    @Test
    public void setAuthors() {
    }

    @Test
    public void getEdition() {
        String GetEdition = scheme.getEdition();
        assertEquals(GetEdition,"2da");
    }

    @Test
    public void setEdition() {
        scheme.setEdition("3ra");
        String NewEdition = scheme.getEdition();
        assertEquals(NewEdition,"3ra");
    }

    @Test
    public void getEditorial() {
        String editorial = scheme.getEditorial();
        assertEquals(editorial,"Cartagena");
    }

    @Test
    public void setEditorial() {
        scheme.setEditorial("Pearson");
        String newEditorial = scheme.getEditorial();
        assertEquals(newEditorial,"Pearson");
    }

    @Test
    public void getFormat() {
        String getFormat = scheme.getFormat();
        assertEquals(getFormat,"Impreso");
    }

    @Test
    public void setFormat() {
        scheme.setFormat("Online");
        String getFormat = scheme.getFormat();
        assertEquals(getFormat,"Online");
    }

    @Test
    public void getLanguage() {
        String GetLenguage = scheme.getLanguage();
        assertEquals(GetLenguage,"Español");
    }

    @Test
    public void setLanguage() {
        scheme.setLanguage("English");
        String SetLenguage = scheme.getLanguage();
        assertEquals(SetLenguage,"English");
    }

    @Test
    public void getISBN() {
        String GetISBN = scheme.getISBN();
        assertEquals(GetISBN,"ABSF");
    }

    @Test
    public void setISBN() {
        scheme.setISBN("ACFM");
        String SetISBN = scheme.getISBN();
        assertEquals(SetISBN,"ACFM");
    }

    @Test
    public void getPages() {
        int GetPage = scheme.getPages();
        assertEquals(GetPage,23);
    }

    @Test
    public void setPages() {
        scheme.setPages(45);
        int SetPages = scheme.getPages();
        assertEquals(SetPages,45);
    }

    @Test
    public void getTittle() {
        String GetTittle = scheme.getTittle();
        assertEquals(GetTittle,"NuevoLibro");
    }

    @Test
    public void setTittle() {
        scheme.setTittle("SecondBook");
        String SetTittle = scheme.getTittle();
        assertEquals(SetTittle,"SecondBook");
    }

    @Test
    public void testToString() {
        DocumentScheme scheme2 = new BookOnline(1971,"Science",authors,"2da","Cartagena","Impreso","Español","ABSF",23,"SecondBook");
        assertNotEquals(scheme.toString(),scheme2.toString());
    }
}