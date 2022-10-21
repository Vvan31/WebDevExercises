package Lab_5;

import java.util.ArrayList;

public class Lab5Q3 {
    // Make a record to store information about a car. It should contain fields for: 
    //- brand (String) - model (String) - year (int)
    static class Car{
        private String brand;
        private String model;
        private  Integer year;
        public Car(){
            brand = "brand";
            model = "model";
            year = 0;
        }
        public Car(String brand, String model, Integer year){
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        public String getBrand() {
            return brand;
        }
        public String getModel() {
            return model;
        }
        public Integer getYear() {
            return year;
        }
        @Override
        public String toString() {
            return "\n{" +
                " brand='" + getBrand() + "'" +
                ",model='" + getModel() + "'" +
                ",year='" + getYear() + "'" +
                "}";
        }
    }

    private static void sortCarsByYear(ArrayList<Car> carsList) {
        carsList.sort((o1, o2) -> o1.getYear().compareTo(o2.getYear()));
    }
    public static void main(String[] args) {
        // Create an ArrayList of Car objects.
        ArrayList<Car> CarsList = new ArrayList<Car>();
    
        Car MKXreselved = new Car("Lincoln", "MKXreselved", 2017);
        Car Crossfire = new Car("Chrysler", "Crossfire", 2004);
        Car Wrangler = new Car("Jeep", "Wrangler", 2020);
        Car TR6 = new Car("Triumph", "TR6", 1973);

        CarsList.add(MKXreselved);
        CarsList.add(Crossfire);
        CarsList.add(Wrangler);
        CarsList.add(TR6);

        // Sort the ArrayList of cars by year (Ascending) and print them out.
        sortCarsByYear(CarsList);
        for (Car car : CarsList) {
            System.out.println(car.toString());
        }
    }
}


