public class DocumentMagazine extends Document {
    @Override
    public IPDF getDocumentPDF(String PDFType) {
        if(PDFType.equalsIgnoreCase("MagazinePDF")){
            return new MagazinePDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String OnlineType) {
        if(OnlineType.equalsIgnoreCase("MagazineOnline")){
            return new MagazineOnline();
        }
        return null;
    }
}
