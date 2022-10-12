package Lab_3;

public class Crocodile extends Reptile{
    public Crocodile(int height, int weight, String animal_type, String blood_type, String skinType, String bone, String eggType){
        super( height,  weight,  animal_type,  blood_type,  skinType,  bone,  eggType);
    }
    public Crocodile(){
        super();
    }

    public String showInfo() {

        return toString();
    }
    
    @Override
    public String toString() {

        return "\n{Crocodile:\n" +
            " height = '" + getHeight() + "'" +
            ",weight = '" + getWeight() + "'" +
            ",animal_type = '" + getAnimal_type() + "'" +
            ",blood_type = '" + getBlood_type() + "'" +
            ",skinType = '" + getSkinType() + "'" +
            ",bone = '" + getBone() + "'" +
            ",eggType = '" + getEggType() + "'" +
            "}";
    }
}
