import Dummy.Addition;
import Framework.Annotation.Entites.Jira;
import Framework.Annotation.Entites.TestCheckList;
import Framework.Annotation.Entites.UserStoryInfo;
import Framework.GUITestServiceProvider;
import Framework.TestProviderBase;
import org.junit.Test;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

@UserStoryInfo(sprint = "N/A", priority = UserStoryInfo.Priority.MEDIUM)
public class TestCheckListNew extends TestProviderBase {


    GUITestServiceProvider gui;
    Screen screen;

    public TestCheckListNew()
    {
        screen = new Screen();
        gui = new GUITestServiceProvider(screen, "C:\\Formatech.TestAutomation\\src\\test\\Images\\", "C:\\Failed\\");
    }

    ///HEre the comment
    //anoter dummy comment
    @Test
    @TestCheckList(Codes = "000",
            Thèmes = "Connexion  000-01 | Connexion 000-02",
            Scenarios = "Se connecter | Se déconnecter",
            typeClient = TestCheckList.TypeClient.UCM,
            prérequis = "Utilisateur/pw",
            Chemin = "clic sur icône de connextion",
            Résultat_attendu = "l'application s'ouvre | l'application se ferme")
    public void Connexion_000() {
        Screen s = new Screen();
        try
        {
            gui.Login();
            gui.Logout();
        }
        catch(Exception e)
        {
            super.HandleException(screen, gui, e);
        }
    }


@Test
    public void Addition0001()
{
    Addition add = new Addition();
    org.junit.Assert.assertEquals(7, add.getResult(3,4));
}


}