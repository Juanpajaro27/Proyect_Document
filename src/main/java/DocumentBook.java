public class DocumentBook extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFtype) {
        if(PDFtype.equalsIgnoreCase("BookPDF")){
            return new BookPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String Onlinetype) {
        if(Onlinetype.equalsIgnoreCase("BookOnline")){
            return new BookOnline();
        }
        return null;
    }
}
