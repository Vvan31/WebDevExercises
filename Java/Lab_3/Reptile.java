package Lab_3;

public class Reptile extends Animal {
    private String skinType;
    private String bone;
    private String eggType;

    public Reptile(){
        super(100, 100, "Reptile", "O");
        this.skinType = "Dry Skin";        
        this.bone = "BackBone";
        this.eggType = "Soft-shelled eggs";
    }

    public Reptile( int height, int weight, String animal_type, String blood_type, String skinType, String bone, String eggType){
        super(height, weight, animal_type, blood_type);
        this.skinType = skinType;        
        this.bone = bone;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return this.skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBone() {
        return this.bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return this.eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public String toString() {

        return "\n{Reptile:\n" +
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
