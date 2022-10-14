import java.util.Arrays;
import java.util.List;

public class ThesisOnline extends DocumentScheme implements IOnlinePDF{

    public ThesisOnline(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public ThesisOnline() {
    }

    @Override
    public String GetCategory(String CategoryTOnline) {
        if(Arrays.asList(CategoryOnline).contains(CategoryTOnline)) {
            return CategoryTOnline;
        }else {
            return null;
        }
    }

}
