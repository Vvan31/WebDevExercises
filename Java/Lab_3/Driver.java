package Lab_3;

public class Driver {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile(100, 150, "Reptile", "AB", "Dry Skin", "Backbone", "Hard-Shelled egg"); 
        Eel eel = new Eel();
        Eagle eagle = new Eagle(); 
        eagle.setHeight(900);
        eagle.setWeight(6);
        System.out.println(crocodile.toString());
        System.out.println(eel.toString());
        System.out.println(eagle.toString());
    }
}
