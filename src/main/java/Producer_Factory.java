public class Producer_Factory {

    public static Document getDocumentBook(Boolean Book){
        if(Book){
            return new DocumentBook();
        }
        return null;
    }

    public static Document getDocumentCientific(Boolean Cientific){
        if(Cientific){
            return new DocumentCientific();
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
