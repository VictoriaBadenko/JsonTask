import classes.BookDto;
import classes.WebsiteDto;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestWebsites {

    WebsiteDto inputData;

    @BeforeTest
    public void beforeTest() {
        WebsiteDto inputData = new WebsiteDto();
        inputData.bookDtos = new ArrayList<BookDto>();
    }

    @Test
    public void testPositive() {
        List<BookDto> expectedData = new ArrayList<BookDto>();
        expectedData.add(new BookDto("Test1", "Pascal"));
        Assert.assertEquals(expectedData, inputData.bookDtos, "Expected book was not found");
    }

    @Test
    public void testNegative() {
        List<BookDto> expectedData = new ArrayList<BookDto>();
        expectedData.add(new BookDto("Test4", "JS"));
        Assert.assertEquals(expectedData, inputData.bookDtos, "Expected book was not found");
    }
}
