public class Packet {
    private int id;
    private String name;
    private String character;
    public Packet(int i, String n, String c){id = i; name = n; character = c;}

    public int getId(){return id;}
    public String getName(){return name;}
    public String getCharacter(){return character;}
}
