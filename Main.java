import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static ArrayList<String> inputChoices = new ArrayList<String>();
    static ArrayList<Packet> unlockedPlants = new ArrayList<Packet>();
    static ArrayList<Plant> plants = new ArrayList<Plant>();
    static ArrayList<Bug> bugs = new ArrayList<Bug>();

    static Lawn lawn = new Lawn(10,5);
    static int rounds = 0;
    public static void main(String args[]){
        inputChoices.add("plant"); //adding input choices
        inputChoices.add("skip");
        inputChoices.add("exit");

        unlockedPlants.add(new Packet(1,"Bamboozler","B")); //adding first plant
        String choice = ""; //initializing choice
        lawn.setLawn(); //sets the lawn object to default Entities
        //lawn.spawnBug(); //spawns a bug

        while(!choice.equals("exit")){
        lawn.printLawn();
        choice = collectInput();
        if(choice.equals("plant")){
            plant();
        }
        step();
        }
    }
    public static String collectInput(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();  //clears console
        lawn.printLawn();
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < inputChoices.size(); x++){System.out.print(inputChoices.get(x)+" ");}
        System.out.println();
        String choice = input.nextLine();
        while(!inputChoices.contains(choice)){
            System.out.println("Invalid Input.");
            choice = input.nextLine();
        }
        return choice;
    }
    public static void plant(){
        Scanner input = new Scanner(System.in);
        for(Packet x : unlockedPlants){System.out.println(x.getId()+". "+x.getName());}
        int plant = input.nextInt();
        boolean valid = false;
        while(!valid){
            for(int i = 0; i < unlockedPlants.size(); i++){if(unlockedPlants.get(i).getId() == plant){ valid = true; break;}}
            if(valid){break;}
            System.out.println("Invalid Input");
            plant = input.nextInt();
        }
        Packet choice = unlockedPlants.get(plant - 1);
        System.out.println("Input x value: ");
        int x = input.nextInt();
        System.out.println("Input y value: ");
        int y = input.nextInt();
        System.out.println(choice.getCharacter());
        System.out.println(choice.getId());
        lawn.addEntity(new Plant(x, y, choice.getCharacter(), choice.getId()));
    }

    public static void step(){
        if(rounds % 2 == 0)lawn.moveBugs();
        if(rounds%10 == 0)lawn.spawnBug();
        rounds++;
    }
}