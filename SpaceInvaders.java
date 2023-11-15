// utility
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

// graphics

// events
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// swing
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SpaceInvaders extends JPanel implements ActionListener, KeyListener, Runnable {

    private final int canvasWidth;
    private final int canvasHeight;
    private final Color backgroundColor;

    private final int framesPerSecond = 25;
    private final int msPerFrame = 1000 / framesPerSecond;
    private Timer timer;
    private int frame = 0;
    private SpaceBackground Star1;
    private SpaceBackground Star2;
    private SpaceBackground Star3;
    private SpaceBackground Star4;
    private SpaceBackground Star5;
    private SpaceBackground Star6;
    private SpaceBackground Star7;
    private SpaceBackground Star8;
    private SpaceBackground Star9;
    private SpaceBackground Star10;
    private SpaceBackground Star11;
    private SpaceBackground Star12;
    private SpaceBackground Star13;
    private SpaceBackground Star14;
    private SpaceBackground Star15;
    private SpaceBackground Star16;
    private SpaceBackground Star17;
    private SpaceBackground Star18;
    private SpaceBackground Star19;
    private SpaceBackground Star20;


    private Spaceship Spaceship;

    private SpaceshipBullet PlayerBullet1;
    private SpaceshipBullet PlayerBullet2;
    private SpaceshipBullet PlayerBullet3;
    private SpaceshipBullet PlayerBullet4;
    private SpaceshipBullet PlayerBullet5;
    private SpaceshipBullet PlayerBullet6;
    private SpaceshipBullet PlayerBullet7;
    private SpaceshipBullet PlayerBullet8;
    private SpaceshipBullet PlayerBullet9;
    private SpaceshipBullet PlayerBullet10;
    private SpaceshipBullet PlayerBullet11;
    private SpaceshipBullet PlayerBullet12;
    private SpaceshipBullet PlayerBullet13;
    private SpaceshipBullet PlayerBullet14;
    private SpaceshipBullet PlayerBullet15;
    private SpaceshipBullet PlayerBullet16;
    private SpaceshipBullet PlayerBullet17;
    private SpaceshipBullet PlayerBullet18;
    private SpaceshipBullet PlayerBullet19;
    private SpaceshipBullet PlayerBullet20;
    ArrayList<SpaceshipBullet> bulletList = new ArrayList<>();
    int currentBulletIndex = 0;
    private SpaceInvaderBullet InvaderBullet1;
    private SpaceInvaderBullet InvaderBullet2;
    private SpaceInvaderBullet InvaderBullet3;
    private SpaceInvaderBullet InvaderBullet4;
    private SpaceInvaderBullet InvaderBullet5;

    private SpaceInvader Invader1;
    private SpaceInvader Invader2;
    private SpaceInvader Invader3;
    private SpaceInvader Invader4;
    private SpaceInvader Invader5;
    private SpaceInvader Invader6;
    private SpaceInvader Invader7;
    private SpaceInvader Invader8;
    private SpaceInvader Invader9;
    private SpaceInvader Invader10;
    private SpaceInvader Invader11;
    private SpaceInvader Invader12;
    private SpaceInvader Invader13;
    private SpaceInvader Invader14;
    private SpaceInvader Invader15;
    private SpaceInvader Invader16;
    private SpaceInvader Invader17;
    private SpaceInvader Invader18;
    private SpaceInvader Invader19;
    private SpaceInvader Invader20;
    private SpaceInvader Invader21;
    private SpaceInvader Invader22;
    private SpaceInvader Invader23;
    private SpaceInvader Invader24;
    private SpaceInvader Invader25;
    private SpaceInvader Invader26;
    private SpaceInvader Invader27;
    private SpaceInvader Invader28;
    private SpaceInvader Invader29;
    private SpaceInvader Invader30;
    private SpaceInvader Invader31;
    private SpaceInvader Invader32;
    private SpaceInvader Invader33;
    private SpaceInvader Invader34;
    private SpaceInvader Invader35;
    private SpaceInvader Invader36;
    private SpaceInvader Invader37;
    private SpaceInvader Invader38;
    private SpaceInvader Invader39;
    private SpaceInvader Invader40;
    int currentInvaderIndex = -1;
    ArrayList<SpaceInvader> invaderList = new ArrayList<>();



    Random rand = new Random();

    // FIXME list your game objects here



    /* Constructor for a Space Invaders game
     */
    public SpaceInvaders() {
        // fix the window size and background color
        this.canvasWidth = 600;
        this.canvasHeight = 400;
        this.backgroundColor = Color.BLACK;
        setPreferredSize(new Dimension(this.canvasWidth, this.canvasHeight));

        // set the drawing timer
        this.timer = new Timer(msPerFrame, this);

        this.Star1 = new SpaceBackground(10, 10, 2, 2, Color.WHITE);
        Star1.speed_x = 0;
        Star1.speed_y = 9;
        this.Star2 = new SpaceBackground(50, 30, 2, 2, Color.WHITE);
        Star2.speed_x = 0;
        Star2.speed_y = 8;
        this.Star3 = new SpaceBackground(100, 20, 2, 2, Color.WHITE);
        Star3.speed_x = 0;
        Star3.speed_y = 7;
        this.Star4 = new SpaceBackground(250, 100, 2, 2, Color.WHITE);
        Star4.speed_x = 0;
        Star4.speed_y = 7;
        this.Star5 = new SpaceBackground(300, 250, 2, 2, Color.WHITE);
        Star5.speed_x = 0;
        Star5.speed_y = 6;
        this.Star6 = new SpaceBackground(350, 10, 2, 2, Color.WHITE);
        Star6.speed_x = 0;
        Star6.speed_y = 5;
        this.Star7 = new SpaceBackground(400, 30, 2, 2, Color.WHITE);
        Star7.speed_x = 0;
        Star7.speed_y = 4;
        this.Star8 = new SpaceBackground(450, 20, 2, 2, Color.WHITE);
        Star8.speed_x = 0;
        Star8.speed_y = 8;
        this.Star9 = new SpaceBackground(500, 100, 2, 2, Color.WHITE);
        Star9.speed_x = 0;
        Star9.speed_y = 4;
        this.Star10 = new SpaceBackground(550, 250, 2, 2, Color.WHITE);
        Star10.speed_x = 0;
        Star10.speed_y = 6;
        this.Star11 = new SpaceBackground(300, 10, 2, 2, Color.WHITE);
        Star11.speed_x = 0;
        Star11.speed_y = 9;
        this.Star12 = new SpaceBackground(600, 30, 2, 2, Color.WHITE);
        Star12.speed_x = 0;
        Star12.speed_y = 8;
        this.Star13 = new SpaceBackground(550, 20, 2, 2, Color.WHITE);
        Star13.speed_x = 0;
        Star13.speed_y = 7;
        this.Star14 = new SpaceBackground(430, 100, 2, 2, Color.WHITE);
        Star14.speed_x = 0;
        Star14.speed_y = 7;
        this.Star15 = new SpaceBackground(250, 250, 2, 2, Color.WHITE);
        Star15.speed_x = 0;
        Star15.speed_y = 6;
        this.Star16 = new SpaceBackground(130, 10, 2, 2, Color.WHITE);
        Star16.speed_x = 0;
        Star16.speed_y = 5;
        this.Star17 = new SpaceBackground(410, 30, 2, 2, Color.WHITE);
        Star17.speed_x = 0;
        Star17.speed_y = 4;
        this.Star18 = new SpaceBackground(470, 20, 2, 2, Color.WHITE);
        Star18.speed_x = 0;
        Star18.speed_y = 8;
        this.Star19 = new SpaceBackground(510, 100, 2, 2, Color.WHITE);
        Star19.speed_x = 0;
        Star19.speed_y = 4;
        this.Star20 = new SpaceBackground(170, 250, 2, 2, Color.WHITE);
        Star20.speed_x = 0;
        Star20.speed_y = 4;

        this.Spaceship = new Spaceship(100, 350, 23, 10);
        Spaceship.speed_x = 0;
        Spaceship.speed_y = 0;

        this.PlayerBullet1 = new SpaceshipBullet(0, 398, 7, 8);
        PlayerBullet1.speed_x = 0;
        PlayerBullet1.speed_y = 0;
        this.PlayerBullet2 = new SpaceshipBullet(10, 398, 7, 8);
        PlayerBullet2.speed_x = 0;
        PlayerBullet2.speed_y = 0;
        this.PlayerBullet3 = new SpaceshipBullet(20, 398, 7, 8);
        PlayerBullet3.speed_x = 0;
        PlayerBullet3.speed_y = 0;
        this.PlayerBullet4 = new SpaceshipBullet(30, 398, 7, 8);
        PlayerBullet4.speed_x = 0;
        PlayerBullet4.speed_y = 0;
        this.PlayerBullet5 = new SpaceshipBullet(40, 398, 7, 8);
        PlayerBullet5.speed_x = 0;
        PlayerBullet5.speed_y = 0;
        this.PlayerBullet6 = new SpaceshipBullet(50, 398, 7, 8);
        PlayerBullet6.speed_x = 0;
        PlayerBullet6.speed_y = 0;
        this.PlayerBullet7 = new SpaceshipBullet(60, 398, 7, 8);
        PlayerBullet7.speed_x = 0;
        PlayerBullet7.speed_y = 0;
        this.PlayerBullet8 = new SpaceshipBullet(70, 398, 7, 8);
        PlayerBullet8.speed_x = 0;
        PlayerBullet8.speed_y = 0;
        this.PlayerBullet9 = new SpaceshipBullet(80, 398, 7, 8);
        PlayerBullet9.speed_x = 0;
        PlayerBullet9.speed_y = 0;
        this.PlayerBullet10 = new SpaceshipBullet(90, 398, 7, 8);
        PlayerBullet10.speed_x = 0;
        PlayerBullet10.speed_y = 0;
        this.PlayerBullet11 = new SpaceshipBullet(0, 398, 7, 8);
        PlayerBullet11.speed_x = 0;
        PlayerBullet11.speed_y = 0;
        this.PlayerBullet12 = new SpaceshipBullet(10, 398, 7, 8);
        PlayerBullet12.speed_x = 0;
        PlayerBullet12.speed_y = 0;
        this.PlayerBullet13 = new SpaceshipBullet(20, 398, 7, 8);
        PlayerBullet13.speed_x = 0;
        PlayerBullet13.speed_y = 0;
        this.PlayerBullet14 = new SpaceshipBullet(30, 398, 7, 8);
        PlayerBullet14.speed_x = 0;
        PlayerBullet14.speed_y = 0;
        this.PlayerBullet15 = new SpaceshipBullet(40, 398, 7, 8);
        PlayerBullet15.speed_x = 0;
        PlayerBullet15.speed_y = 0;
        this.PlayerBullet16 = new SpaceshipBullet(50, 398, 7, 8);
        PlayerBullet16.speed_x = 0;
        PlayerBullet16.speed_y = 0;
        this.PlayerBullet17 = new SpaceshipBullet(60, 398, 7, 8);
        PlayerBullet17.speed_x = 0;
        PlayerBullet17.speed_y = 0;
        this.PlayerBullet18 = new SpaceshipBullet(70, 398, 7, 8);
        PlayerBullet18.speed_x = 0;
        PlayerBullet18.speed_y = 0;
        this.PlayerBullet19 = new SpaceshipBullet(80, 398, 7, 8);
        PlayerBullet19.speed_x = 0;
        PlayerBullet19.speed_y = 0;
        this.PlayerBullet20 = new SpaceshipBullet(90, 398, 7, 8);
        PlayerBullet20.speed_x = 0;
        PlayerBullet20.speed_y = 0;

        bulletList.add(PlayerBullet1);
        bulletList.add(PlayerBullet2);
        bulletList.add(PlayerBullet3);
        bulletList.add(PlayerBullet4);
        bulletList.add(PlayerBullet5);
        bulletList.add(PlayerBullet6);
        bulletList.add(PlayerBullet7);
        bulletList.add(PlayerBullet8);
        bulletList.add(PlayerBullet9);
        bulletList.add(PlayerBullet10);
        bulletList.add(PlayerBullet11);
        bulletList.add(PlayerBullet12);
        bulletList.add(PlayerBullet13);
        bulletList.add(PlayerBullet14);
        bulletList.add(PlayerBullet15);
        bulletList.add(PlayerBullet16);
        bulletList.add(PlayerBullet17);
        bulletList.add(PlayerBullet18);
        bulletList.add(PlayerBullet19);
        bulletList.add(PlayerBullet20);


        this.InvaderBullet1 = new SpaceInvaderBullet(0, -10, 4, 10);
        InvaderBullet1.speed_x = 0;
        InvaderBullet1.speed_y = 0;
        this.InvaderBullet2 = new SpaceInvaderBullet(10, -10, 4, 10);
        InvaderBullet2.speed_x = 0;
        InvaderBullet2.speed_y = 0;
        this.InvaderBullet3 = new SpaceInvaderBullet(20, -10, 4, 10);
        InvaderBullet3.speed_x = 0;
        InvaderBullet3.speed_y = 0;
        this.InvaderBullet4 = new SpaceInvaderBullet(30, -10, 4, 10);
        InvaderBullet4.speed_x = 0;
        InvaderBullet4.speed_y = 0;
        this.InvaderBullet5 = new SpaceInvaderBullet(40, -10, 4, 10);
        InvaderBullet5.speed_x = 0;
        InvaderBullet5.speed_y = 0;


        this.Invader1 = new SpaceInvader(0,50, 19, 12);
        Invader1.speed_x = 1;
        Invader1.speed_y = 0;
        this.Invader2 = new SpaceInvader(50,50, 19, 12);
        Invader2.speed_x = 1;
        Invader2.speed_y = 0;
        this.Invader3 = new SpaceInvader(100,50, 19, 12);
        Invader3.speed_x = 1;
        Invader3.speed_y = 0;
        this.Invader4 = new SpaceInvader(150,50, 19, 12);
        Invader4.speed_x = 1;
        Invader4.speed_y = 0;
        this.Invader5 = new SpaceInvader(200,50, 19, 12);
        Invader5.speed_x = 1;
        Invader5.speed_y = 0;
        this.Invader6 = new SpaceInvader(250,50, 19, 12);
        Invader6.speed_x = 1;
        Invader6.speed_y = 0;
        this.Invader7 = new SpaceInvader(300,50, 19, 12);
        Invader7.speed_x = 1;
        Invader7.speed_y = 0;
        this.Invader8 = new SpaceInvader(350,50, 19, 12);
        Invader8.speed_x = 1;
        Invader8.speed_y = 0;
        this.Invader9 = new SpaceInvader(400,50, 19, 12);
        Invader9.speed_x = 1;
        Invader9.speed_y = 0;
        this.Invader10 = new SpaceInvader(450,50, 19, 12);
        Invader10.speed_x = 1;
        Invader10.speed_y = 0;

        this.Invader1 = new SpaceInvader(0,50, 19, 12);
        Invader1.speed_x = 1;
        Invader1.speed_y = 0;
        this.Invader2 = new SpaceInvader(50,50, 19, 12);
        Invader2.speed_x = 1;
        Invader2.speed_y = 0;
        this.Invader3 = new SpaceInvader(100,50, 19, 12);
        Invader3.speed_x = 1;
        Invader3.speed_y = 0;
        this.Invader4 = new SpaceInvader(150,50, 19, 12);
        Invader4.speed_x = 1;
        Invader4.speed_y = 0;
        this.Invader5 = new SpaceInvader(200,50, 19, 12);
        Invader5.speed_x = 1;
        Invader5.speed_y = 0;
        this.Invader6 = new SpaceInvader(250,50, 19, 12);
        Invader6.speed_x = 1;
        Invader6.speed_y = 0;
        this.Invader7 = new SpaceInvader(300,50, 19, 12);
        Invader7.speed_x = 1;
        Invader7.speed_y = 0;
        this.Invader8 = new SpaceInvader(350,50, 19, 12);
        Invader8.speed_x = 1;
        Invader8.speed_y = 0;
        this.Invader9 = new SpaceInvader(400,50, 19, 12);
        Invader9.speed_x = 1;
        Invader9.speed_y = 0;
        this.Invader10 = new SpaceInvader(450,50, 19, 12);
        Invader10.speed_x = 1;
        Invader10.speed_y = 0;

        this.Invader11 = new SpaceInvader(0,50, 19, 12);
        Invader11.speed_x = 1;;
        Invader11.speed_y = 0;
        this.Invader12 = new SpaceInvader(50,50, 19, 12);
        Invader12.speed_x = 1;;
        Invader12.speed_y = 0;
        this.Invader13 = new SpaceInvader(100,50, 19, 12);
        Invader13.speed_x = 1;;
        Invader13.speed_y = 0;
        this.Invader14 = new SpaceInvader(150,50, 19, 12);
        Invader14.speed_x = 1;;
        Invader14.speed_y = 0;
        this.Invader15 = new SpaceInvader(200,50, 19, 12);
        Invader15.speed_x = 1;;
        Invader15.speed_y = 0;
        this.Invader16 = new SpaceInvader(250,50, 19, 12);
        Invader16.speed_x = 1;;
        Invader16.speed_y = 0;
        this.Invader17 = new SpaceInvader(300,50, 19, 12);
        Invader17.speed_x = 1;;
        Invader17.speed_y = 0;
        this.Invader18 = new SpaceInvader(350,50, 19, 12);
        Invader18.speed_x = 1;;
        Invader18.speed_y = 0;
        this.Invader19 = new SpaceInvader(400,50, 19, 12);
        Invader19.speed_x = 1;;
        Invader19.speed_y = 0;
        this.Invader20 = new SpaceInvader(450,50, 19, 12);
        Invader20.speed_x = 1;;
        Invader20.speed_y = 0;

        this.Invader21 = new SpaceInvader(0,100, 19, 12);
        Invader21.speed_x = 1;
        Invader21.speed_y = 0;
        this.Invader22 = new SpaceInvader(50,100, 19, 12);
        Invader22.speed_x = 1;
        Invader22.speed_y = 0;
        this.Invader23 = new SpaceInvader(100,100, 19, 12);
        Invader23.speed_x = 1;
        Invader23.speed_y = 0;
        this.Invader24 = new SpaceInvader(150,100, 19, 12);
        Invader24.speed_x = 1;
        Invader24.speed_y = 0;
        this.Invader25 = new SpaceInvader(200,100, 19, 12);
        Invader25.speed_x = 1;
        Invader25.speed_y = 0;
        this.Invader26 = new SpaceInvader(250,100, 19, 12);
        Invader26.speed_x = 1;
        Invader26.speed_y = 0;
        this.Invader27 = new SpaceInvader(300,100, 19, 12);
        Invader27.speed_x = 1;
        Invader27.speed_y = 0;
        this.Invader28 = new SpaceInvader(350,100, 19, 12);
        Invader28.speed_x = 1;
        Invader28.speed_y = 0;
        this.Invader29 = new SpaceInvader(400,100, 19, 12);
        Invader29.speed_x = 1;
        Invader29.speed_y = 0;
        this.Invader30 = new SpaceInvader(450,100, 19, 12);
        Invader30.speed_x = 1;
        Invader30.speed_y = 0;

        this.Invader31 = new SpaceInvader(0,150, 19, 12);
        Invader31.speed_x = 1;;
        Invader31.speed_y = 0;
        this.Invader32 = new SpaceInvader(50,150, 19, 12);
        Invader32.speed_x = 1;;
        Invader32.speed_y = 0;
        this.Invader33 = new SpaceInvader(100,150, 19, 12);
        Invader33.speed_x = 1;;
        Invader33.speed_y = 0;
        this.Invader34 = new SpaceInvader(150,150, 19, 12);
        Invader34.speed_x = 1;;
        Invader34.speed_y = 0;
        this.Invader35 = new SpaceInvader(200,150, 19, 12);
        Invader35.speed_x = 1;;
        Invader35.speed_y = 0;
        this.Invader36 = new SpaceInvader(250,150, 19, 12);
        Invader36.speed_x = 1;;
        Invader36.speed_y = 0;
        this.Invader37 = new SpaceInvader(300,150, 19, 12);
        Invader37.speed_x = 1;;
        Invader37.speed_y = 0;
        this.Invader38 = new SpaceInvader(350,150, 19, 12);
        Invader38.speed_x = 1;;
        Invader38.speed_y = 0;
        this.Invader39 = new SpaceInvader(400,150, 19, 12);
        Invader39.speed_x = 1;;
        Invader39.speed_y = 0;
        this.Invader40 = new SpaceInvader(450,150, 19, 12);
        Invader40.speed_x = 1;;
        Invader40.speed_y = 0;

        invaderList.add(Invader1);
        invaderList.add(Invader2);
        invaderList.add(Invader3);
        invaderList.add(Invader4);
        invaderList.add(Invader5);
        invaderList.add(Invader6);
        invaderList.add(Invader7);
        invaderList.add(Invader8);
        invaderList.add(Invader9);
        invaderList.add(Invader10);
        invaderList.add(Invader11);
        invaderList.add(Invader12);
        invaderList.add(Invader13);
        invaderList.add(Invader14);
        invaderList.add(Invader15);
        invaderList.add(Invader16);
        invaderList.add(Invader17);
        invaderList.add(Invader18);
        invaderList.add(Invader19);
        invaderList.add(Invader20);
        invaderList.add(Invader21);
        invaderList.add(Invader22);
        invaderList.add(Invader23);
        invaderList.add(Invader24);
        invaderList.add(Invader25);
        invaderList.add(Invader26);
        invaderList.add(Invader27);
        invaderList.add(Invader28);
        invaderList.add(Invader29);
        invaderList.add(Invader30);
        invaderList.add(Invader31);
        invaderList.add(Invader32);
        invaderList.add(Invader33);
        invaderList.add(Invader34);
        invaderList.add(Invader35);
        invaderList.add(Invader36);
        invaderList.add(Invader37);
        invaderList.add(Invader38);
        invaderList.add(Invader39);
        invaderList.add(Invader40);




        // FIXME initialize your game objects

    }

    /* Start the game
     */
    @Override
    public void run() {
        // show this window
        display();

        // set a timer to redraw the screen regularly
        this.timer.start();
    }

    /* Create the window and display it
     */
    private void display() {
        JFrame jframe = new JFrame();
        jframe.addKeyListener(this);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setContentPane(this);
        jframe.pack();
        jframe.setVisible(true);
    }

    /* Run all timer-based events
     *
     * @param e  An object describing the timer
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // update the game objects
        update();
        // draw every object (this calls paintComponent)
        repaint(0, 0, this.canvasWidth, this.canvasHeight);
        // increment the frame counter
        this.frame++;
    }

    /* Paint/Draw the canvas.
     *
     * This function overrides the paint function in JPanel. This function is
     * automatically called when the panel is made visible.
     *
     * @param g The Graphics for the JPanel
     */
    @Override
    protected void paintComponent(Graphics g) {
        // clear the canvas before painting
        clearCanvas(g);
        if (hasWonGame()) {
            paintWinScreen(g);
        } else if (hasLostGame()) {
            paintLoseScreen(g);
        } else {
            paintGameScreen(g);
        }
    }

    /* Clear the canvas
     *
     * @param g The Graphics representing the canvas
     */
    private void clearCanvas(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(this.backgroundColor);
        g.fillRect(0, 0, this.canvasWidth, this.canvasHeight);
        g.setColor(oldColor);
    }

    /* Respond to key release events
     *
     * A key release is when you let go of a key
     * 
     * @param e  An object describing what key was released
     */
    public void keyReleased(KeyEvent e) {
        // you can leave this function empty
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyChar() == 'a') {
            // FIXME what happens when left arrow is pressed
            System.out.println("Left Arrow Released!");
            Spaceship.speed_x = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyChar() == 'd') {
            // FIXME what happens when right arrow is pressed
            System.out.println("Right Arrow Released!");
            Spaceship.speed_x = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            // FIXME what happens when space bar is pressed
            System.out.println("Space Bar Released!");
        }
    }

    /* Respond to key type events
     *
     * A key type is when you press then let go of a key
     * 
     * @param e  An object describing what key was typed
     */
    public void keyTyped(KeyEvent e) {
        // you can leave this function empty

    }

    /* Respond to key press events
     *
     * A key type is when you press then let go of a keyRe
     * 
     * @param e  An object describing what key was typed
     */
    public void keyPressed(KeyEvent e) {
        //The player must control a ship that moves left and right at the bottom of the screen, that can fire projectiles at the enemy.
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyChar() == 'a') {
            //System.out.println("Left Arrow Pressed!");
            Spaceship.speed_x = -2;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyChar() == 'd') {
            //System.out.println("Right Arrow Pressed!");
            Spaceship.speed_x = 2;
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            //System.out.println("Space Bar Pressed!");

            //check if bullet is already fired or not
            //check one at a time
            if (currentBulletIndex < bulletList.size()) {
                SpaceshipBullet bullet = bulletList.get(currentBulletIndex);
                if (bullet.y > 300) {
                    bullet.speed_y = -2;
                    bullet.y = Spaceship.y;
                    bullet.x = Spaceship.x + 7;
                    currentBulletIndex++;
                }
            }
            if (currentBulletIndex >= bulletList.size()) {
                currentBulletIndex = 0;
            }



        }
    }

    /* Update the game objects
     */
    private void update() {
        // FIXME update game objects here
        Star1.update(600, 400, frame);
        Star1.x += Star1.speed_x;
        Star1.y += Star1.speed_y;
        Star2.update(600, 400, frame);
        Star2.x += Star2.speed_x;
        Star2.y += Star2.speed_y;
        Star3.update(600, 400, frame);
        Star3.x += Star3.speed_x;
        Star3.y += Star3.speed_y;
        Star4.update(600, 400, frame);
        Star4.x += Star4.speed_x;
        Star4.y += Star4.speed_y;
        Star5.update(600, 400, frame);
        Star5.x += Star5.speed_x;
        Star5.y += Star5.speed_y;
        Star6.update(600, 400, frame);
        Star6.x += Star6.speed_x;
        Star6.y += Star6.speed_y;
        Star7.update(600, 400, frame);
        Star7.x += Star7.speed_x;
        Star7.y += Star7.speed_y;
        Star8.update(600, 400, frame);
        Star8.x += Star8.speed_x;
        Star8.y += Star8.speed_y;
        Star9.update(600, 400, frame);
        Star9.x += Star9.speed_x;
        Star9.y += Star9.speed_y;
        Star10.update(600, 400, frame);
        Star10.x += Star10.speed_x;
        Star10.y += Star10.speed_y;
        Star11.update(600, 400, frame);
        Star11.x += Star1.speed_x;
        Star11.y += Star1.speed_y;
        Star12.update(600, 400, frame);
        Star12.x += Star2.speed_x;
        Star12.y += Star2.speed_y;
        Star13.update(600, 400, frame);
        Star13.x += Star3.speed_x;
        Star13.y += Star3.speed_y;
        Star14.update(600, 400, frame);
        Star14.x += Star4.speed_x;
        Star14.y += Star4.speed_y;
        Star15.update(600, 400, frame);
        Star15.x += Star5.speed_x;
        Star15.y += Star5.speed_y;
        Star16.update(600, 400, frame);
        Star16.x += Star6.speed_x;
        Star16.y += Star6.speed_y;
        Star17.update(600, 400, frame);
        Star17.x += Star7.speed_x;
        Star17.y += Star7.speed_y;
        Star18.update(600, 400, frame);
        Star18.x += Star8.speed_x;
        Star18.y += Star8.speed_y;
        Star19.update(600, 400, frame);
        Star19.x += Star9.speed_x;
        Star19.y += Star9.speed_y;
        Star20.update(600, 400, frame);
        Star20.x += Star10.speed_x;
        Star20.y += Star10.speed_y;

        Spaceship.update(600, 400, frame);
        Spaceship.x += Spaceship.speed_x;
        Spaceship.y += Spaceship.speed_y;

        InvaderBullet1.update(600, 400, frame);
        InvaderBullet1.x += InvaderBullet1.speed_x;
        InvaderBullet1.y += InvaderBullet1.speed_y;
        InvaderBullet2.update(600, 400, frame);
        InvaderBullet2.x += InvaderBullet2.speed_x;
        InvaderBullet2.y += InvaderBullet2.speed_y;
        InvaderBullet3.update(600, 400, frame);
        InvaderBullet3.x += InvaderBullet3.speed_x;
        InvaderBullet3.y += InvaderBullet3.speed_y;
        InvaderBullet4.update(600, 400, frame);
        InvaderBullet4.x += InvaderBullet4.speed_x;
        InvaderBullet4.y += InvaderBullet4.speed_y;
        InvaderBullet5.update(600, 400, frame);
        InvaderBullet5.x += InvaderBullet5.speed_x;
        InvaderBullet5.y += InvaderBullet5.speed_y;

        //There must be a grid of aliens that move left and right, and that moves down towards the player over time.
        for (SpaceInvader inv : invaderList) {
            inv.update(600, 400, frame);
            inv.x += inv.speed_x;
            inv.y += inv.speed_y;
            //If an alien touches the player, the player loses.
            //If an alien gets past the bottom of the screen, the player loses.
            if (inv.x >= Spaceship.x && inv.x <= Spaceship.x +23 && inv.y >= Spaceship.y || inv.y >= Spaceship.y + 24) {
                System.out.println("game over");
            }
        }

        for (SpaceshipBullet bullet: bulletList) {
            bullet.update(600, 400, frame);
            bullet.x += bullet.speed_x;
            bullet.y += bullet.speed_y;
            for (SpaceInvader inv : invaderList) {
                //If a player-fired projectile touches an alien, the alien must be removed.
                if (bullet.x > inv.x && bullet.x < inv.x + 19 && bullet.y > inv.y && bullet.y < inv.y + 12) {
                    //System.out.println("hit " + currentInvaderIndex);
                    bullet.y = 399;
                    currentInvaderIndex = invaderList.indexOf(inv);
                    //System.out.println(invaderList.size() + " enemies left");
                }

            }
        }

        //If all aliens are destroyed, the player wins.
        if (invaderList.isEmpty()) {
            System.out.println("you win!");
        }

        if (currentInvaderIndex != -1) {
            invaderList.remove(currentInvaderIndex);
            currentInvaderIndex = -1;
        }


        if (frame%125 == 0 && frame != 0 && !invaderList.isEmpty()) {
            int randomIndex = rand.nextInt(invaderList.size());
            int randomIndex1 = rand.nextInt(invaderList.size());
            int randomIndex2 = rand.nextInt(invaderList.size());
            int randomIndex3 = rand.nextInt(invaderList.size());
            int randomIndex4 = rand.nextInt(invaderList.size());
            System.out.println(randomIndex);
            SpaceInvader nthObject = invaderList.get(randomIndex);
            SpaceInvader nthObject1 = invaderList.get(randomIndex1);
            SpaceInvader nthObject2 = invaderList.get(randomIndex2);
            SpaceInvader nthObject3 = invaderList.get(randomIndex3);
            SpaceInvader nthObject4 = invaderList.get(randomIndex4);
            int xValue = (int)nthObject.x;
            int yValue = (int)nthObject.y;
            int xValue1 = (int)nthObject1.x;
            int yValue1 = (int)nthObject1.y;
            int xValue2 = (int)nthObject2.x;
            int yValue2 = (int)nthObject2.y;
            int xValue3 = (int)nthObject3.x;
            int yValue3 = (int)nthObject3.y;
            int xValue4 = (int)nthObject4.x;
            int yValue4 = (int)nthObject4.y;

            InvaderBullet1.x = xValue;
            InvaderBullet1.y = yValue + 10;
            InvaderBullet1.speed_y = 3;
            InvaderBullet2.x = xValue1;
            InvaderBullet2.y = yValue1 + 10;
            InvaderBullet2.speed_y = 3;
            InvaderBullet3.x = xValue2;
            InvaderBullet3.y = yValue2 + 10;
            InvaderBullet3.speed_y = 3;
            InvaderBullet4.x = xValue3;
            InvaderBullet4.y = yValue3 + 10;
            InvaderBullet4.speed_y = 3;
            InvaderBullet5.x = xValue4;
            InvaderBullet5.y = yValue4 + 10;
            InvaderBullet5.speed_y = 3;
        }

        //If an alien-fired projectile touches the player, the player loses.
        if (InvaderBullet1.x >= Spaceship.x && InvaderBullet1.x + 4 <= Spaceship.x +23 && InvaderBullet1.y > Spaceship.y && InvaderBullet1.y < Spaceship.y + 10
        || InvaderBullet2.x >= Spaceship.x && InvaderBullet2.x + 4 <= Spaceship.x +23 && InvaderBullet2.y > Spaceship.y && InvaderBullet2.y < Spaceship.y + 10
        || InvaderBullet3.x >= Spaceship.x && InvaderBullet3.x + 4 <= Spaceship.x +23 && InvaderBullet3.y > Spaceship.y && InvaderBullet3.y < Spaceship.y + 10
        || InvaderBullet4.x >= Spaceship.x && InvaderBullet4.x + 4 <= Spaceship.x +23 && InvaderBullet4.y > Spaceship.y && InvaderBullet4.y < Spaceship.y + 10
        || InvaderBullet5.x >= Spaceship.x && InvaderBullet5.x + 4 <= Spaceship.x +23 && InvaderBullet5.y > Spaceship.y && InvaderBullet5.y < Spaceship.y + 10
        ) {
            System.out.println("game over");
        }



        //System.out.println(frame);

    }

    /* Check if the player has lost the game
     * 
     * @returns  true if the player has lost, false otherwise
     */
    private boolean hasLostGame() {
        return false; // FIXME delete this when ready
    }

    /* Check if the player has won the game
     * 
     * @returns  true if the player has won, false otherwise
     */
    private boolean hasWonGame() {
        return false; // FIXME delete this when ready
    }

    /* Paint the screen during normal gameplay
     *
     * @param g The Graphics for the JPanel
     */
    private void paintGameScreen(Graphics g) {
        // FIXME draw game objects here

        Star1.draw(g);
        Star2.draw(g);
        Star3.draw(g);
        Star4.draw(g);
        Star5.draw(g);
        Star6.draw(g);
        Star7.draw(g);
        Star8.draw(g);
        Star9.draw(g);
        Star10.draw(g);
        Star11.draw(g);
        Star12.draw(g);
        Star13.draw(g);
        Star14.draw(g);
        Star15.draw(g);
        Star16.draw(g);
        Star17.draw(g);
        Star18.draw(g);
        Star19.draw(g);
        Star20.draw(g);

        Spaceship.draw(g);

        InvaderBullet1.draw(g);
        InvaderBullet2.draw(g);
        InvaderBullet3.draw(g);
        InvaderBullet4.draw(g);
        InvaderBullet5.draw(g);

        for (SpaceInvader inv : invaderList) {
            inv.draw(g);
        }
        for (SpaceshipBullet bullet : bulletList) {
            bullet.draw(g);
        }

    }

    /* Paint the screen when the player has won
     *
     * @param g The Graphics for the JPanel
     */
    private void paintWinScreen(Graphics g) {
        // FIXME draw the win screen here
    }

    /* Paint the screen when the player has lost
     *
     * @param g The Graphics for the JPanel
     */
    private void paintLoseScreen(Graphics g) {
        // FIXME draw the game over screen here

    }

    public static void main(String[] args) {
        /*The player must control a ship that moves left and right at the bottom of the screen, that can fire projectiles at the enemy.
        * There must be a grid of aliens that move left and right, and that moves down towards the player over time. The aliens must randomly fire projectiles at the player.
        * If a player-fired projectile touches an alien, the alien must be removed.
        * If an alien-fired projectile touches the player, the player loses.
        * If an alien touches the player, the player loses.
        * If an alien gets past the bottom of the screen, the player loses.
        * If all aliens are destroyed, the player wins.
        * There must be end screens when the player wins and loses.
        */
        SpaceInvaders invaders = new SpaceInvaders();
        EventQueue.invokeLater(invaders);
    }
}
