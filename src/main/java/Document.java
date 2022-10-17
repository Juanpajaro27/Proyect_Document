public abstract class Document {

    public abstract IPDF getDocumentPDF(String DocumentType);
    public abstract IOnlinePDF getDocumentOnline(String OnlineDocumentType);
}
