public class DocumentMagazine extends Document {
    @Override
    public IPDF getDocumentPDF(String PDFtype) {
        if(PDFtype.equalsIgnoreCase("MagazinePDF")){
            return new MagazinePDF();
        }
        return null;
    }

    @Override
    public IOnlinePDF getDocumentOnline(String Onlinetype) {
        if(Onlinetype.equalsIgnoreCase("MagazineOnline")){
            return new MagazineOnline();
        }
        return null;
    }
}
