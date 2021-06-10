import classes.Books;
import org.testng.Assert;
import org.testng.annotations.Test;
import readJson.ReadJson;

public class TestWebsites {

    ReadJson jSon = new ReadJson();

    @Test
    public void validBook() {
        Books pascal = new Books("Test1", "Pascal");
        Assert.assertTrue(jSon.readJson().getAmazon().getBooks().contains(pascal));
    }

    @Test
    public void inValidBook() {
        Books js = new Books("Test4", "JS");
        Assert.assertFalse(jSon.readJson().getRozetka().getBooks().contains(js));
    }


}
