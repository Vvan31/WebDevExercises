package home;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserData {
    
    private StringProperty id;
    private StringProperty name;
    private StringProperty sign;
    private StringProperty todaysHoroscope;

    public UserData(String id, String name, String sign) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.sign = new SimpleStringProperty(sign);
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(StringProperty id) {
        this.id = id;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(StringProperty name) {
        this.name = name;
    }

    public StringProperty signProperty() {
        return sign;
    }

    public void setsign(StringProperty sign) {
        this.sign = sign;
    }

    public StringProperty signTodaysHoroscope() {
        return todaysHoroscope;
    }

    public void setTodaysHoroscope(StringProperty todaysHoroscope) {
        this.todaysHoroscope = todaysHoroscope;
    }
}