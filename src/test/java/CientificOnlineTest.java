import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CientificOnlineTest {

    @Test
    public void getCategory() {
        Document documentCientific = Producer_Factory.getDocumentCientific(true);
        IOnlinePDF onlineCientific = documentCientific.getDocumentOnline("CientificOnline");
        String category = onlineCientific.GetCategory("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }
}