public class Producer_Factory {

    private Producer_Factory(){}
    public static Document getDocumentBook(Boolean Book){
        if(Book){
            return new DocumentBook();
        }
        return null;
    }

    public static Document getDocumentScientific(Boolean Scientific){
        if(Scientific){
            return new DocumentScientific();
        }
        return null;
    }

    public static Document getDocumentMagazine(Boolean Magazine){
        if(Magazine){
            return new DocumentMagazine();
        }
        return null;
    }

    public static Document getDocumentThesis(Boolean Thesis){
        if(Thesis){
            return new DocumentThesis();
        }
        return null;
    }
}
