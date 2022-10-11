public interface IPDF {

    String[] CategoryPDF = {"Art","Law","Engineering"};
    String[] OperationList = {"Impress","Send","Copied"};
    public String operation(String StringOperation);
    public String Category(String Category);
}
