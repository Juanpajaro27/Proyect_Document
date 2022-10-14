public abstract class Document {

    public abstract IPDF getDocumentPDF(String PDFType);
    public abstract IOnlinePDF getDocumentOnline(String OnlineType);
}
