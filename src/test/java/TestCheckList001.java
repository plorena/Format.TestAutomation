import Dummy.Addition;
import Framework.Annotation.Entites.Jira;
import Framework.Annotation.Entites.TestCheckList;
import Framework.Annotation.Entites.UserStoryInfo;
import Framework.GUITestServiceProvider;
import Framework.TestProviderBase;
import org.junit.Test;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;


public class TestCheckList001  {




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