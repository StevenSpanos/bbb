public class Entity extends Main{
    private int x;
    private int y;
    private String c;
    public Entity(int x, int y, String c){
        this.x = x;
        this.y = y;
        this.c = c;
    }
    public int getX(){return x;}
    public void setX(int a){x = a;}
    public int getY(){return y;}
    public void setY(int a){y = a;}
    public String getC(){return c;}
    //public String toString(){return c;}
}
