import Framework.Annotation.Entites.TestCheckList;
import Framework.Annotation.Entites.UserStoryInfo;
import Framework.GUITestServiceProvider;
import Framework.TestProviderBase;
import org.junit.Test;
import org.sikuli.script.Screen;

/**
 * Created by paul.lorena on 02/05/2016.
 */
@UserStoryInfo(sprint = "N/A", priority = UserStoryInfo.Priority.MEDIUM)
public class TaxShift001_FuncTest extends TestProviderBase {


    GUITestServiceProvider gui;
    Screen screen;

    public TaxShift001_FuncTest()
    {
        screen = new Screen();
        gui = new GUITestServiceProvider(screen, "C:\\Formatech.TestAutomation\\src\\test\\Images\\", "C:\\Failed\\");
    }


    ///Here the comment
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
}
