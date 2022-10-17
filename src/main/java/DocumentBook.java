public class DocumentBook extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFBook) {
        if(PDFBook.equalsIgnoreCase("BookPDF")){
            return new BookPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String OnlineBook) {
        if(OnlineBook.equalsIgnoreCase("BookOnline")){
            return new BookOnline();
        }
        return null;
    }
}
