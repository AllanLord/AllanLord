
import animalstype.Crocodrile;
import animalstype.Eagle;
import animalstype.Eel;

/**
 * @author allan
 */
public class CallAnimals {
    public static void main(String[] args) {
        
        Crocodrile croc = new Crocodrile();
        System.out.println(croc.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
    }
    
}
