public class Plant extends Entity{
    private int id;
    public Plant(int x, int y, String c, int id){
    super(x,y,c);
    this.id = id;
    }
    
    public int getId(){return id;}
}