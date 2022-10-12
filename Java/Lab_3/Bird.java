package Lab_3;

public class Bird extends Animal {
    private boolean fly;
    private boolean feathers;

    public Bird(){
        super(100, 100, "Bird", "O");
        this.fly = true;        
        this.feathers = true;
    }

    public Bird( int height, int weight, String animal_type, String blood_type, Boolean fly, boolean feathers){
        super(height, weight, animal_type, blood_type);
        this.fly = fly;        
        this.feathers = feathers;
    }

    public boolean isFly() {
        return this.fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isFeathers() {
        return this.feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    @Override
    public String toString() {

        return "\n{Bid:\n" +
            " height = '" + getHeight() + "'" +
            ",weight = '" + getWeight() + "'" +
            ",animal_type = '" + getAnimal_type() + "'" +
            ",blood_type = '" + getBlood_type() + "'" +
            ",has feathers = '" + isFeathers() + "'" +
            ",can fly  = '" + isFly() + "'" +
            "}";
    }

}
