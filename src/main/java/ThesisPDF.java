import java.util.Arrays;
import java.util.List;

public class ThesisPDF extends DocumentScheme implements IPDF{

    public ThesisPDF(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public ThesisPDF() {
    }

    @Override
    public String operation(String OperationTHPDF) {
        if(Arrays.asList(OperationList).contains(OperationTHPDF)){
            return OperationTHPDF;
        }else{
            return null;
        }
    }

    @Override
    public String Category(String CategoryTHPDF) {
        if(Arrays.asList(CategoryPDF).contains(CategoryTHPDF)) {
            return CategoryTHPDF;
        }else {
            return null;
        }
    }
}
