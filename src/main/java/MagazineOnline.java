import java.util.Arrays;
import java.util.List;

public class MagazineOnline  extends DocumentScheme implements IOnlinePDF{

    public MagazineOnline(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public MagazineOnline() {
    }

    @Override
    public String GetCategory(String Category) {
        if(Arrays.asList(CategoryOnline).contains(Category)) {
            System.out.println("Se ha agregado correctamente la categoria");
        }else {
            System.out.println("Ha ocurrido un problema");
        }
        return Category;
    }
}
