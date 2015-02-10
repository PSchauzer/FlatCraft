package at.styriancoding.flatcraft;

import at.styriancoding.flatcraft.Game.GameStates;
import at.styriancoding.flatcraft.Game.MainMenu;
import at.styriancoding.flatcraft.Util.GameStatePanel;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import javax.print.DocFlavor;
import java.awt.*;

/**
 * Created by philipp on 10.02.15.
 */
public class Flatcraft extends StateBasedGame{

    private MainMenu mainMenu;
    private SplashScreen splashScreen;

    public Flatcraft(String name){
        super(name);
        addState(splashScreen);
        addState(mainMenu);

    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        getState(0).init(gameContainer,this);
        enterState(0);
    }

    public static void main(String[] args) {

        try {
            AppGameContainer container = new AppGameContainer(new Flatcraft("Flatcraft"));
            container.setDisplayMode(800,600,false);
            container.setClearEachFrame(true);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }


}
