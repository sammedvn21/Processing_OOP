import processing.core.PApplet;

public class MainApp extends PApplet {
    Ball[] b;
    public static void main(String[] args) {
        PApplet.main("MainApp",args);
  }
    @Override
    public void settings() {
        super.settings();
        size(Ball.WIDTH, Ball.HEIGHT);
    }

    @Override
    public void setup() {
            b=new Ball[4];
        for (int i = 0; i <4 ; i++)
        {
            b[i]=new Ball(0,i+1);
        }
    }

    @Override
    public void draw()
    {
        for (int i = 0; i <4 ; i++)
        {
            ellipse(b[i].getxMultiplier()*(i+1),(Ball.HEIGHT/5.0f)*b[i].getyMultiplier(), 10, 10);
            float x = b[i].getxMultiplier();
            x++;
            b[i].setxMultiplier(x);

//            b[i].drawCircles();

        }

    }
}
