import java.util.Arrays;
import java.util.List;

public class CientificPDF extends DocumentScheme implements IPDF{

    public CientificPDF(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public CientificPDF() {
    }

    @Override
    public String operation(String OperationCPDF) {
        if(Arrays.asList(OperationList).contains(OperationCPDF)){
            return OperationCPDF;
        }else{
            return null;
        }
    }

    @Override
    public String Category(String CategoryCPDF) {
        if(Arrays.asList(CategoryPDF).contains(CategoryCPDF)) {
            return CategoryCPDF;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
