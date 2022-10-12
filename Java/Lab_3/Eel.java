package Lab_3;

public class Eel extends Fish{
    private boolean electricCharge;

    public Eel (){
        super();
        electricCharge = true; 
    }
    public Eel(int height, int weight, String animal_type, String blood_type, String habitat, boolean gills, boolean electricCharge){
        super(height, weight, animal_type, blood_type, habitat, gills);
        this.electricCharge = electricCharge;
    }

    public boolean isElectricCharge() {
        return this.electricCharge;
    }

    public void setElectricCharge(boolean electricCharge) {
        this.electricCharge = electricCharge;
    }

    public String showInfo() {

        return toString();
    }

    @Override
    public String toString() {

        return "\n{Eel:\n" +
            " height = '" + getHeight() + "'" +
            ",weight = '" + getWeight() + "'" +
            ",animal_type = '" + getAnimal_type() + "'" +
            ",blood_type = '" + getBlood_type() + "'" +
            ",habitat = '" + getHabitat() + "'" +
            ",has gills = '" + isGills() + "'" +
            ",release electric charge  = '" + isElectricCharge() + "'" +
            "}";
    }
}
