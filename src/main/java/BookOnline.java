import java.util.Arrays;
import java.util.List;

public class BookOnline extends DocumentScheme implements IOnlinePDF  {

    public BookOnline(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public BookOnline() {
    }

    @Override
    public String toString() {
        return "BookOnline{" +
                "Year=" + Year +
                ", Category='" + Category + '\'' +
                ", Authors=" + Authors +
                ", Edition='" + Edition + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", Format='" + Format + '\'' +
                ", Language='" + Language + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", pages=" + pages +
                ", tittle='" + tittle + '\'' +
                '}';
    }

    @Override
    public String GetCategory(String BookOnlineCategory) {

        if(Arrays.asList(CategoryOnline).contains(BookOnlineCategory)) {
            return BookOnlineCategory;
        }else {
            return null;
        }
    }
}
