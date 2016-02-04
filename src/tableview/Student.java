
package tableview;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Student {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;
    private final SimpleStringProperty surname;
    private final SimpleIntegerProperty age;
    
    public Student(Integer id, String name, String surname, Integer age){
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.age = new SimpleIntegerProperty(age);
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id.get();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name.get();
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname.get();
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age.get();
    }
}
