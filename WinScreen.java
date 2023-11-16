import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.*;
public class WinScreen extends GraphicsObject{
    private int width;
    private int height;
    private Color backgroundcolor;
    ImageIcon icon = new ImageIcon("WinScreen.png");
    Image iconimage = icon.getImage();
    public WinScreen(int x, int y, int width, int height, Color backgroundcolor) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.backgroundcolor = backgroundcolor;
    }
    @Override
    public void draw(Graphics g) {
        // change the color of the pen
        g.setColor(this.backgroundcolor);
        g.fillRect((int)this.x, (int)this.y, this.width, this.height);
        g.drawImage(iconimage,250, 200, null);
    }
    @Override
    public void update(int pic_width, int pic_height, int frame) {




        // let the superclass' update function handle the actual changes to x and y
        super.update(pic_width, pic_height, frame);
    }
}
