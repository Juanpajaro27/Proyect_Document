public class DocumentScientific extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFType) {
        if(PDFType.equalsIgnoreCase("ScientificPDF")){
            return new ScientificPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String OnlineType) {
        if(OnlineType.equalsIgnoreCase("ScientificOnline")){
            return new ScientificOnline();
        }
        return null;
    }
}
