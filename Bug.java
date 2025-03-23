public class Bug extends Entity{
    private int type;
    public Bug(int x, int y, String c, int t){
    super(x,y,c);
    type = t;
    }
    public void move(){
        setX(getX()-1);
    }

    public int getType(){return type;}
}
