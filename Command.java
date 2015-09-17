public class Command {
    private String name;
    private String effect;
    //private Whatever effect; //how would we implement this?
    //public static Command

    public Command(String myName) {
        name = myName;
        effect = name + "\nhey this works";
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        //I guess there's a lot of stuff we'd have to implement, particular to
        //each room, in this method
        return effect;
    }
}
