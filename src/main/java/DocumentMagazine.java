public class DocumentMagazine extends Document {
    @Override
    public IPDF getDocumentPDF(String PDFMagazine) {
        if(PDFMagazine.equalsIgnoreCase("MagazinePDF")){
            return new MagazinePDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String OnlineMagazine) {
        if(OnlineMagazine.equalsIgnoreCase("MagazineOnline")){
            return new MagazineOnline();
        }
        return null;
    }
}
