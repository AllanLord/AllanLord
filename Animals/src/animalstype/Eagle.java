package animalstype;

/**
 * @author allan
 */
public class Eagle {


    public Eagle(){
        super(200.0, 50.0, "Bird", "Warm-blooded", false, false);
    }

    public String showInfo() {
        return 
        """
        =====================================
        Eagle
        =====================================
        height='""" + getHeight() + "',\n" +
        "weight='" + getWeight() + "',\n" +
        "animalType='" + getAnimalType() + "',\n" +
        "bloodType='" + getBloodType() + "',\n" +
        "featherless='" + isFeatherless() + "',\n" +
        "flightless='" + isFlightless() + "'";
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

    private String isFeatherless() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String isFlightless() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}