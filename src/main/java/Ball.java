public class Ball{

    public static final int WIDTH =640;
    public static  int HEIGHT =480;
    private float yMultiplier;
    private float xMultiplier;

    public Ball(float xMultiplier, float yMultiplier) {
        this.yMultiplier = yMultiplier;
        this.xMultiplier = xMultiplier;

    }

    public float getyMultiplier() {
        return yMultiplier;
    }

    public float getxMultiplier() {
        return xMultiplier;
    }

    public void setxMultiplier(float xMultiplier) {
        this.xMultiplier = xMultiplier;
    }


//    public void drawCircles()
//    {
//        for (int i = 0; i <4 ; i++)
//        {
//            ellipse(xMultiplier*(i+1),(HEIGHT/5.0f)*yMultiplier, 10, 10);
//           xMultiplier++;
//
//        }
//    }
}
