import java.util.Arrays;
import java.util.List;

public class BookPDF extends DocumentScheme implements IPDF{

    public BookPDF(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    @Override
    public String operation(String OperationBook) {
        if(Arrays.asList(OperationList).contains(OperationBook)){
            return OperationBook;
        }else{
            return null;
        }
    }

    public BookPDF() {
    }

    @Override
    public String Category(String BookCategory) {
        if(Arrays.asList(CategoryPDF).contains(BookCategory)) {
            return BookCategory;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
