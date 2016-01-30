
package filechooser;

import javafx.beans.property.*;

public class MyNumber {
    
    private DoubleProperty number;

    /**
     * @return the number
     */
    public final double getNumber() {
        if(number != null)
          return number.get();
        return 0;
    }

   
    public final void setNumber(double number) {
        this.numberProperty().setValue(number);
    }
    
    public final DoubleProperty numberProperty(){
        if(number == null){
            number = new SimpleDoubleProperty();
        }
        return number;
    }
}
