package animalstype;

/**
 * @author allan
 */
public class Crocodrile {
    public Crocodrile(){
        super(0.5d, 1000.0d, "Reptile", "Cold-blooded", "Dry skin", "Vertebrae", "Hard-shelled eggs");
    }

    public String showInfo(){
        return
        """
        =======================
        Crocodrile
        =======================
        height='""" + getHeight() + "'\n"+
        "weight='" + getWeight() + "'\n"+
        "animalType='" + getAnimalType() + "'\n"+
        "bloodType='" + getBloodType() + "'\n"+
        "skeletalStructure='" + getSkeletalStructure() + "'\n"+
        "skinType='" + getSkinType() + "'\n"+
        "eggType='" + getEggType() + "'\n";
    }

    private String getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getAnimalType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getBloodType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getSkeletalStructure() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getSkinType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getEggType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}