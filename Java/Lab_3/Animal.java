package Lab_3;

public class Animal {
    private int height;
    private int weight;
    private String animal_type;
    private String blood_type;

    public Animal(){
        this.height = 100;
        this.weight = 100;
        this.animal_type = "Reptile";
        this.blood_type = "O";
    }
    public Animal( int height, int weight, String animal_type, String blood_type){
        this.height = height;
        this.weight = weight;
        this.animal_type = animal_type;
        this.blood_type = blood_type;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimal_type() {
        return this.animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getBlood_type()
    {
		return this.blood_type;
	}

    public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

    @Override
    public String toString() {

        return "\n{" +
            " height='" + getHeight() + "'" +
            ",weight='" + getWeight() + "'" +
            ",animal_type='" + getAnimal_type() + "'" +
            ",blood_type='" + getBlood_type() + "'" +
            "}";
    }
}
