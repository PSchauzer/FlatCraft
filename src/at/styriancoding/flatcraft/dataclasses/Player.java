package at.styriancoding.flatcraft.dataclasses;

import org.newdawn.slick.Image;

/**
 * Created by ajtma_000 on 10.02.2015.
 */
public class Player {

    private int lookingDirection;
    private int xCoords;
    private int yCoords;
    private Image image;

    public static final int speed = 10;

    public static final int LOOKING_UP = 0;
    public static final int LOOKING_DOWN = 1;
    public static final int LOOKING_RIGHT = 2;
    public static final int LOOKING_LEFT = 3;


    public Player(Image image, int xCoords, int yCoords) {
        this.image = image;
        this.xCoords = xCoords;
        this.yCoords = yCoords;
        this.lookingDirection = LOOKING_DOWN;
    }

    public void walkUp()
    {
        yCoords -= speed;
    }

    public void walkDown()
    {
        yCoords += speed;
    }

    public void walkLeft()
    {
        xCoords += speed;
    }

    public void walkRight()
    {
        xCoords -= speed;
    }

    public int getSpeed()
    {
        return this.speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getLookingDirection() {
        return lookingDirection;
    }

    public void setLookingDirection(int lookingDirection) {
        this.lookingDirection = lookingDirection;
    }

    public int getxCoords() {
        return xCoords;
    }

    public void setxCoords(int xCoords) {
        this.xCoords = xCoords;
    }

    public int getyCoords() {
        return yCoords;
    }

    public void setyCoords(int yCoords) {
        this.yCoords = yCoords;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
