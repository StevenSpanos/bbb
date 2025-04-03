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
    public Entity getPlant(int x){if(!(x < plants.size())){return null;}return plants.get(x);}
    public Entity getBug(int x){if(!(x < bugs.size())){return null;}return bugs.get(x);}

    public void addEntity(Entity x){
        lawn[x.getY()][x.getX()] = x;
        if(x instanceof Bug){
            bugs.add(x);
        }
        if(x instanceof Plant){
            plants.add(x);
        }
    }
    public void printLawn(){
        System.out.print(" "); for(int x = 0; x < lawn[0].length; x++){System.out.print(" "+(x)+" ");}
        System.out.println();
        int row = 0;
        //int col = 0;
        for(Entity[] r : lawn){
            System.out.print(row);
            for(Entity c : r){
                System.out.print("["+c.getC()+"]");
            }
            row++;
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

    public void spawnBug(){
        int random = (int) (Math.random()*5);
        addEntity(new Bug(lawn[0].length-1,random, "X",1));
    }

    public void moveBugs(){
        Bug temp = new Bug(69,69,"amogus",420);
        Class c1 = temp.getClass();
        for(Entity[] r : lawn){
            for(Entity c : r){
                Class c2 = c.getClass();
                if(c1 == c2){
                    ((Bug) c).move();
                    lawn[c.getY()][c.getX()] = c;
                    lawn[c.getY()][c.getX()+1] = new Entity(c.getY(),c.getX()+1," ");
                }
            }
        }
    }
}
