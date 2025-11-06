package Enum;

enum Level {
    LOW("low Level"),
    MEDIUM("Medium Level"),
    HIGH("High Level");

    private String description;

    private Level(String description)
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
}

public class FirstEnum {
    public static void main(String[] args) {
        Level my = Level.MEDIUM;
        
        for(Level m : my.values())
        {
            System.out.println(m + "  : " + m.getDescription());
        }
    }
}
