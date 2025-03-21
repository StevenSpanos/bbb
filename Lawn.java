import java.util.ArrayList;

import javax.crypto.EncryptedPrivateKeyInfo;
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
    public void printLawn(){
        for(int r = 0; r < lawn.length; r++){
            for(int c = 0; c < lawn[r].length; c++){
                System.out.print("["+lawn[r][c].getC()+"]");
            }
            System.out.println();
        }
    }

    public void setLawn(){
        for(int r = 0; r < lawn.length; r++){
            for(int c = 0; c < lawn[r].length; c++){
                lawn[r][c] = new Entity(c,r," ");
            }
        }
    }
}
