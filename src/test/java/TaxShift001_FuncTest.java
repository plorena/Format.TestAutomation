import Framework.Annotation.Entites.Jira;
import Framework.Annotation.Entites.TestCheckList;
import Framework.Annotation.Entites.UserStoryInfo;
import Framework.GUITestServiceProvider;
import Framework.TestProviderBase;
import org.junit.Test;
import org.sikuli.script.Key;
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
   @Jira(Ticket = "FORMATECH-1235 ")
    public void Connexion_000() {
        Screen s = new Screen();
        try
        {
            gui.Login();

            gui.clicker("item_societes");

            s.rightClick(gui.img("item_societes"));
            s.wait(gui.img("submenu_societes"));
            s.click(gui.img("nouveau_societe"));
            gui.AttendrePourImage("creation_societe");



            gui.encoderNumero("13042016");


            s.click(gui.img("code_employeur"));
            gui.encoderNumero(1);


            s.click(gui.img("button_suivant"));
            s.wait(gui.img("return_code_999"));
            s.click(gui.img("button_ok"));


            s.click(gui.img("code_employeur"));
            gui.encoderNumero(99563);

            s.click(gui.img("button_suivant"));

            s.wait(gui.img("creation_employeur_criteres"));
            s.click(gui.img("button_chercher"));

            s.wait(gui.img("resultat_recherche"));
            gui.clicker("0176_AGH");
            s.click(gui.img("check_0176"));
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));

            s.type("PoC Paul Lorena");
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));


            gui.encoderNumero("003");
            gui.clicker("003_societe");

            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));

            s.type("Sint Gommarusstraat");
            s.type(Key.TAB);
            s.type(Key.TAB);
            gui.encoderNumero(66);
            s.type(Key.TAB);
            gui.encoderNumero(66);
            s.type(Key.TAB);
            s.type(Key.TAB);

            gui.encoderNumero(2800);

            s.type(Key.ENTER);
            s.click(gui.img("button_ok"));

            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));


            gui.encoderNumero(2);
            s.click(gui.img("button_suivant"));
            gui.encoderNumero("13042016");


            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));
            s.click(gui.img("button_suivant"));

            s.click(gui.img("button_ok"));
            s.click(gui.img("button_annuler"));
            gui.Logout();
        }
        catch(Exception e)
        {

            super.HandleException(screen, gui, e);
        }
    }
}
