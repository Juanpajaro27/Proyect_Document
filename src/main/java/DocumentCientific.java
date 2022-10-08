public class DocumentCientific extends Document{
    @Override
    public IPDF getDocumentPDF(String PDFtype) {
        if(PDFtype.equalsIgnoreCase("CientificPDF")){
            return new CientificPDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String Onlinetype) {
        if(Onlinetype.equalsIgnoreCase("CientificOnline")){
            return new CientificOnline();
        }
        return null;
    }
}
