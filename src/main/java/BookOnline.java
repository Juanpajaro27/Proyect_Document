public class BookOnline extends DocumentScheme implements IOnlinePDF  {

    @Override
    public String GetCategory(String Category) {
        String category = getCategory();
        System.out.println(category);
        return category;
    }

}
