import java.util.List;

public abstract class DocumentScheme {

    public int Year;

    public String Category;
    public List<String> Authors;
    public String Edition;
    public String Editorial;
    public String Format;
    public String Language;
    public String ISBN;
    public int pages;
    public String tittle;

    protected DocumentScheme(int year, String category, List<String> authors, String edition, String editorial, String format, String language, String ISBN, int pages, String tittle) {
        Year = year;
        Category = category;
        Authors = authors;
        Edition = edition;
        Editorial = editorial;
        Format = format;
        Language = language;
        this.ISBN = ISBN;
        this.pages = pages;
        this.tittle = tittle;
    }

    protected DocumentScheme() {
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public List<String> getAuthors() {
        return Authors;
    }

    public void setAuthors(List<String> authors) {
        Authors = authors;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "BoolOnline{" +
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
}
