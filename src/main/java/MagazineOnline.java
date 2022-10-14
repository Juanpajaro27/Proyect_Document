import java.util.Arrays;
import java.util.List;

public class MagazineOnline  extends DocumentScheme implements IOnlinePDF{

    public MagazineOnline(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public MagazineOnline() {
    }

    @Override
    public String GetCategory(String CategoryMOnline) {
        if(Arrays.asList(CategoryOnline).contains(CategoryMOnline)) {
            return CategoryMOnline;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
