package home;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EmployeeData {
    
    private StringProperty id;
    private StringProperty name;
    private StringProperty department;

    public EmployeeData(String id, String name, String department) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.department = new SimpleStringProperty(department);
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

    public StringProperty departmentProperty() {
        return department;
    }

    public void setDepartment(StringProperty department) {
        this.department = department;
    }
}