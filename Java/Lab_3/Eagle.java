package Lab_3;

public class Eagle extends Bird {
    public Eagle(){
        super();
    }
    public Eagle(int height, int weight, String animal_type, String blood_type, Boolean fly, boolean feathers){
        super(height, weight, animal_type, blood_type, fly, feathers);
    }

    public String showInfo() {

        return toString();
    }

    
    @Override
    public String toString() {

        return "\n{Eagle:\n" +
            " height = '" + getHeight() + "'" +
            ",weight = '" + getWeight() + "'" +
            ",animal_type = '" + getAnimal_type() + "'" +
            ",blood_type = '" + getBlood_type() + "'" +
            ",has feathers = '" + isFeathers() + "'" +
            ",can fly  = '" + isFly() + "'" +
            "}";
    }
}
