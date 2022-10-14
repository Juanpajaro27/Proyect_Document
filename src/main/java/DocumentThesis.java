public class DocumentThesis extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFType) {
        if(PDFType.equalsIgnoreCase("Thesis")){
            return new ThesisPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String OnlineType) {
        if(OnlineType.equalsIgnoreCase("MagazinePDF")){
            return new ThesisOnline();
        }
        return null;
    }
}
