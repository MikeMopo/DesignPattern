public class ManBrain {

    private static ManBrain manBrainInstance = new ManBrain();

    private ManBrain(){}

    public static ManBrain getManBrainInstance(){

        return manBrainInstance;
    }

    public void actionFromBrain(){
        System.out.println("A man's brain can only do one thing at a time");
    }
}
