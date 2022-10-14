import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Producer_FactoryTest {

    @Test
    void getDocumentBookTest() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        Document documentBook2 = Producer_Factory.getDocumentBook(true);

        assertNotSame(documentBook,documentBook2);

        Document documentBook3 = Producer_Factory.getDocumentBook(false);
        assertNull(documentBook3);

    }

    @Test
    void getDocumentScientific() {
        Document documentScientific = Producer_Factory.getDocumentScientific(true);
        Document documentScientific1 = Producer_Factory.getDocumentScientific(true);

        assertNotSame(documentScientific,documentScientific1);

        Document documentScientific2 = Producer_Factory.getDocumentScientific(false);
        assertNull(documentScientific2);
    }

    @Test
    void getDocumentMagazine() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        Document documentMagazine1 = Producer_Factory.getDocumentMagazine(true);

        assertNotSame(documentMagazine,documentMagazine1);

        Document documentMagazine2 = Producer_Factory.getDocumentMagazine(false);
        assertNull(documentMagazine2);
    }

    @Test
    void getDocumentThesis() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        Document documentThesis1 = Producer_Factory.getDocumentThesis(true);

        assertNotSame(documentThesis,documentThesis1);

        Document documentThesis2 = Producer_Factory.getDocumentThesis(false);
        assertNull(documentThesis2);
    }
}