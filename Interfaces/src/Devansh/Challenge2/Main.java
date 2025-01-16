package Devansh.Challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera Hall", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic blvd", UtilityType.WATER));


        for ( var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
