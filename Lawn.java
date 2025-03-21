import java.util.ArrayList;
public class Lawn {
    private Entity[][] lawn;
    private ArrayList<Entity> bugs = new ArrayList<Entity>();
    private ArrayList<Entity> plants = new ArrayList<Entity>();

    public Lawn(int x, int y){
        lawn = new Entity[y][x];
    }
    
    public Entity[][] getLawn(){return lawn;}
    public int getX(){return lawn[0].length;}
    public int getY(){return lawn.length;}
    public ArrayList<Entity> getPlants(){return plants;}
    public ArrayList<Entity> getBugs(){return bugs;}

    public void addEntity(Entity x){
        lawn[x.getY()][x.getX()] = x;
    }
}
