import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static ArrayList<String> inputChoices = new ArrayList<String>();
    static Lawn lawn = new Lawn(10,5);
    public static void main(String args[]){
        inputChoices.add("plant");
        inputChoices.add("skip");
        inputChoices.add("exit");
        String choice = "";
        while(!choice.equals("exit")){
        lawn.setLawn();
        lawn.printLawn();
        choice = collectInput();
        if(choice.equals("plant")){
            
        }
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

}