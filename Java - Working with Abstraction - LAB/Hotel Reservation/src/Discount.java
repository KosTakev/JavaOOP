public enum Discount {
    VIP(0.2),
    SECOND_VISIT(0.1),
    NONE(0.0);

    private double percentage;

    Discount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public static Discount fromString(String discountFromString) {
        return switch (discountFromString) {
          case "VIP" -> VIP;
          case "SecondVisit" -> SECOND_VISIT;
          case "None" -> NONE;
            default -> throw new IllegalArgumentException("There's no such discount " + discountFromString);
        };
    }
}
