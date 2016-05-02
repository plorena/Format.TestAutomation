import Dummy.Addition;
import org.junit.Test;


public class TestCheckList002 {




@Test
    public void Addition0001()
{
    Addition add = new Addition();
    org.junit.Assert.assertEquals(7, add.getResult(3,4));
}

    @Test
    public void getResultSubstraction()
    {
        Addition add = new Addition();
        org.junit.Assert.assertEquals(6, add.getResultSubstraction(8,2));
    }


}