import java.util.Arrays;
import java.util.List;

public class CientificPDF extends DocumentScheme implements IPDF{

    public CientificPDF(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        super(year, category, authors, edition, editorial, format, language, ISBN, pages, tittle);
    }

    public CientificPDF() {
    }

    @Override
    public String operation(String Operation) {
        if(Arrays.asList(OperationList).contains(Operation)){
            System.out.println("Se ha realizado la operacion");
        }else{
            System.out.println("No se ha podido realizar la operacion");
        }
        return Operation;
    }

    @Override
    public String Category(String Category) {
        if(Arrays.asList(CategoryPDF).contains(Category)) {
            System.out.println("Se ha agregado correctamente la categoria");
        }else {
            System.out.println("Ha ocurrido un problema");
        }
        return Category;
    }
}
