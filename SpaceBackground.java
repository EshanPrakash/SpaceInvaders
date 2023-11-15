import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class SpaceBackground extends GraphicsObject{
    private int width;
    private int height;
    private Color starcolor;
    Random randstar = new Random();

    public SpaceBackground(int x, int y, int width, int height, Color starcolor) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.starcolor = starcolor;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.starcolor);
        g.fillRect((int)this.x, (int)this.y, this.width, this.height);
    }
    @Override
    public void update(int pic_width, int pic_height, int frame) {

        // this will make rectangles bounce off the side of the window
        if (this.x < 0 || this.x + this.width > pic_width) {
            this.speed_x = - this.speed_x;
        }

        if (this.y < 0 || this.y + this.height > pic_height) {
            this.y = 0;
        }

        /*
        // this will make rectangles "bob" up and down
        if (frame % 20 == 0) {
            this.speed_y = - this.speed_y;
        }*/

        // we can also change color
        // we can also change color
        Random randd = new Random();
        this.starcolor = new Color(
                randd.nextInt(255),
                randd.nextInt(255),
                randd.nextInt(255)
        );

        // let the superclass' update function handle the actual changes to x and y
        super.update(pic_width, pic_height, frame);
    }

}
