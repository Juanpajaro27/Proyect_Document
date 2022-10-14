import java.util.Arrays;
import java.util.List;

public class MagazinePDF extends DocumentScheme implements IPDF{

    public MagazinePDF(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public MagazinePDF() {
    }

    @Override
    public String operation(String OperationMPDF) {
        if(Arrays.asList(OperationList).contains(OperationMPDF)){
            return OperationMPDF;
        }else{
            return null;
        }
    }

    @Override
    public String Category(String CategoryMPDF) {
        if(Arrays.asList(CategoryPDF).contains(CategoryMPDF)) {
            return CategoryMPDF;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
