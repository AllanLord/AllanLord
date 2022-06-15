package animalstype;

/**
 * @author allan
 */
public class Eel {

     private String feature;

    public Eel(){
        super();
        this.feature = "Release electric charge";
    }

    public Eel(double height, double weight, String animalType, String bloodType, String habitat, boolean withGills,
            String feature) {
        super(height, weight, animalType, bloodType, habitat, withGills);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public String showInfo() {
        return 
        """
        =====================================
        Eel
        =====================================
        height='""" + getHeight() + "',\n" +
        "weight='" + getWeight() + "',\n" +
        "animalType='" + getAnimalType() + "',\n" +
        "bloodType='" + getBloodType() + "',\n" +
        "habitat='" + getHabitat() + "',\n" +
        "withGills='" + isWithGills() + "',\n" +
        "feature='" + getFeature() + "'";
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

    private String getHabitat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String isWithGills() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}