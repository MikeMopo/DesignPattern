public class HowDoesAMansBrainWork {
    public static void main(String[] args) {
        ManBrain accessObject = ManBrain.getManBrainInstance();
        /*notice we didnt use:
        * ManBrain man = new ManBrain();
        * this called would have caused an error as the constructor is private
        * this secures that our class creates only one object and hence saves memory*/
        accessObject.actionFromBrain();
    }

}
