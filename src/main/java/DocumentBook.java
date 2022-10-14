public class DocumentBook extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFType) {
        if(PDFType.equalsIgnoreCase("BookPDF")){
            return new BookPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String OnlineType) {
        if(OnlineType.equalsIgnoreCase("BookOnline")){
            return new BookOnline();
        }
        return null;
    }
}
