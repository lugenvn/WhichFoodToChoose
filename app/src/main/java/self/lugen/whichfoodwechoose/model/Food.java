package self.lugen.whichfoodwechoose.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by lugen on 10/8/16.
 */
@Table(name = "food")
public class Food extends Model {

    @Column(name = "name")
    String name;

    @Column( name = "type")
    Integer type;

    public Food() {
        super();
    }

    public Food(String name, int type) {
        super();
        this.name = name;
        this.type = type;
    }
}
