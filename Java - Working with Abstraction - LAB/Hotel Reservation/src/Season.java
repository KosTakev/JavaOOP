import java.util.Locale;

public enum Season {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public static Season fromString(String seasonAsString) {

        // return Season.valueOf(seasonAsString.toUpperCase());

        return switch (seasonAsString) {
            case "Autumn" -> AUTUMN;
            case "Spring" -> SPRING;
            case "Winter" -> WINTER;
            case "Summer" -> SUMMER;
            default -> throw new IllegalArgumentException("There's no such season " + seasonAsString);
        };
    }
}
