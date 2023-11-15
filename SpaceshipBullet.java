import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.*;
public class SpaceshipBullet extends GraphicsObject {
    private int width;
    private int height;
    ImageIcon icon = new ImageIcon("PlayerBulletResize.png");
    Image iconimage = icon.getImage();
    public SpaceshipBullet(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {
        g.drawImage(iconimage, (int)this.x, (int)this.y, null);
    }
    @Override
    public void update(int pic_width, int pic_height, int frame) {

        // this will make rectangles bounce off the side of the window

        if (this.y < -10 || this.y + this.height > pic_height) {
            this.y = 399;
            this.speed_y = 0;
        }

        /*
        // this will make rectangles "bob" up and down
        if (frame % 20 == 0) {
            this.speed_y = - this.speed_y;
        }*/

        // let the superclass' update function handle the actual changes to x and y
        super.update(pic_width, pic_height, frame);
    }
}
