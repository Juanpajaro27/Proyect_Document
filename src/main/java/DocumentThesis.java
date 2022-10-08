public class DocumentThesis extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFtype) {
        if(PDFtype.equalsIgnoreCase("Thesis")){
            return new ThesisPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String Onlinetype) {
        if(Onlinetype.equalsIgnoreCase("MagazinePDF")){
            return new ThesisOnline();
        }
        return null;
    }
}
