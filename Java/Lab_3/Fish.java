package Lab_3;

public class Fish extends Animal {
    private String habitat;
    private boolean gills;

    public Fish(){
        super(100, 100, "Fish", "O");
        this.habitat = "Water";        
        this.gills = true;
    }

    public Fish( int height, int weight, String animal_type, String blood_type, String habitat, boolean gills){
        super(height, weight, animal_type, blood_type);
        this.habitat = habitat;        
        this.gills = gills;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isGills() {
        return this.gills;
    }

    public void setGills(boolean gills) {
        this.gills = gills;
    }

    @Override
    public String toString() {

        return "\n{Fish:\n" +
            " height = '" + getHeight() + "'" +
            ",weight = '" + getWeight() + "'" +
            ",animal_type = '" + getAnimal_type() + "'" +
            ",blood_type = '" + getBlood_type() + "'" +
            ",habitat = '" + getHabitat() + "'" +
            ",has gills = '" + isGills() + "'" +
            "}";
    }

}
