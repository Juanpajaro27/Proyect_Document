import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DocumentSchemeTest {
    String[] ListAuthors = {"Jorge","Manuel"};
    List<String> authors= Arrays.asList(ListAuthors);
    DocumentScheme scheme = new BookOnline(1976,"Law",authors,"2da","Cartagena","Press","Spanish","New",23,"NewBook");
    @Test
    public void getYearTest() {
        int year = scheme.getYear();
        assertEquals(year,1976);
    }

    @Test
    public void setYearTest() {
         scheme.setYear(1989);
         int NewYearScheme= scheme.getYear();
         assertEquals(NewYearScheme,1989);
    }

    @Test
    public void getCategoryTest() {
        String Category = scheme.getCategory();
        assertEquals(Category,"Law");
    }

    @Test
    public void setCategoryTest() {
        scheme.setCategory("Art");
        String NewCategory = scheme.getCategory();
        assertEquals(NewCategory,"Art");
    }

    @Test
    public void getAuthors() {

    }

    @Test
    public void setAuthors() {
    }

    @Test
    public void getEditionTest() {
        String GetEdition = scheme.getEdition();
        assertEquals(GetEdition,"2da");
    }

    @Test
    public void setEditionTest() {
        scheme.setEdition("3ra");
        String NewEdition = scheme.getEdition();
        assertEquals(NewEdition,"3ra");
    }

    @Test
    public void getEditorialTest() {
        String editorial = scheme.getEditorial();
        assertEquals(editorial,"Cartagena");
    }

    @Test
    public void setEditorialTest() {
        scheme.setEditorial("Pearson");
        String newEditorial = scheme.getEditorial();
        assertEquals(newEditorial,"Pearson");
    }

    @Test
    public void getFormatTest() {
        String getFormat = scheme.getFormat();
        assertEquals(getFormat,"Press");
    }

    @Test
    public void setFormatTest() {
        scheme.setFormat("Online");
        String getFormat = scheme.getFormat();
        assertEquals(getFormat,"Online");
    }

    @Test
    public void getLanguageTest() {
        String GetLanguage = scheme.getLanguage();
        assertEquals(GetLanguage,"Spanish");
    }

    @Test
    public void setLanguageTest() {
        scheme.setLanguage("English");
        String SetLanguage = scheme.getLanguage();
        assertEquals(SetLanguage,"English");
    }

    @Test
    public void getISBNTest() {
        String GetISBN = scheme.getISBN();
        assertEquals(GetISBN,"New");
    }

    @Test
    public void setISBNTest() {
        scheme.setISBN("New2");
        String SetISBN = scheme.getISBN();
        assertEquals(SetISBN,"New2");
    }

    @Test
    public void getPagesTest() {
        int GetPage = scheme.getPages();
        assertEquals(GetPage,23);
    }

    @Test
    public void setPagesTest() {
        scheme.setPages(45);
        int SetPages = scheme.getPages();
        assertEquals(SetPages,45);
    }

    @Test
    public void getTittleTest() {
        String GetTittle = scheme.getTittle();
        assertEquals(GetTittle,"NewBook");
    }

    @Test
    public void setTittleTest() {
        scheme.setTittle("SecondBook");
        String SetTittle = scheme.getTittle();
        assertEquals(SetTittle,"SecondBook");
    }

    @Test
    public void testToStringTest() {
        DocumentScheme scheme2 = new BookOnline(1971,"Science",authors,"2da","Cartagena","Press","Spanish","New2",23,"SecondBook");
        assertNotEquals(scheme.toString(),scheme2.toString());
    }
}