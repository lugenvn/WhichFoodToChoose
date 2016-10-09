package self.lugen.whichfoodwechoose.model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by lugen on 10/8/16.
 */
@Table(name = "food_type")
public class FoodType {

    @Column(name = "name")
    String name;
    @Column(name = "parent_id")
    Integer parentId;

    public FoodType(){
        super();
    }

    public FoodType(String name, int parent) {
        super();
        this.name = name;
        this.parentId = parent;
    }
}
