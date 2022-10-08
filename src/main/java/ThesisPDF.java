public class ThesisPDF extends DocumentScheme implements IPDF{

    @Override
    public String operation(String StringOperation) {
        String operation = StringOperation;
        System.out.println(operation);
        return operation;
    }

    @Override
    public String Category(String Category) {
        String category = Category;

        return category;
    }
}
