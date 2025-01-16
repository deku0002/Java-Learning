package Devansh.Challenge2;

import javax.sound.sampled.Line;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class UtilityLine implements Mappable{

    private String name;

    private UtilityType type;

    public UtilityLine(String name, UtilityType type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ") ";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LNE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED + " " + Line_Marker.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + Line_Marker.DOTTED;
            case GAS -> Color.ORANGE + " " + Line_Marker.SOLID;
            case WATER -> Color.BLUE + " " + Line_Marker.SOLID;
            default -> Color.BLACK + " " + Line_Marker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "Utility": "%s" """.formatted(name,type);
    }
}
