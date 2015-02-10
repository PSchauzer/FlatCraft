package at.styriancoding.flatcraft.Util;

/**
 * Created by philipp on 10.02.15.
 */
public interface GameStatePanel {
    public void init();
    public void load();
    public void unload();
    public void exit();
    public void render();
    public void update();
}
