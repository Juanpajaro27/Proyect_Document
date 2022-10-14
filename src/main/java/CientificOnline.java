import java.util.Arrays;
import java.util.List;

public class CientificOnline extends DocumentScheme implements IOnlinePDF{

    public CientificOnline(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public CientificOnline() {
    }

    @Override
    public String GetCategory(String CategoryCOnline) {

        if(Arrays.asList(CategoryOnline).contains(CategoryCOnline)) {
            return CategoryCOnline;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
