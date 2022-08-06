import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double pricePerDays = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];

//        int multiplier = switch (season) {
//          case "Autumn" -> 1;
//          case "Spring" -> 2;
//          case "Winter" -> 3;
//          case "Summer" -> 4;
//            default -> throw new IllegalArgumentException("There's no such season!" + season);
//        };

//        int multiplier = Season.fromString(season).getMultiplier();


//        if (discountType.equals("VIP")) {
//            percentDiscount = 0.2;
//        } else if (discountType.equals("SecondVisit")) {
//            percentDiscount = 0.1;
//        } else {
//
//        }

//        double percentDiscount = Discount.fromString(discountType).getPercentage();
//        double totalPrice = pricePerDays * numberOfDays * multiplier * (1 - percentDiscount);

        PriceCalculator calculator = new PriceCalculator(pricePerDays,
                numberOfDays, Season.fromString(season),
                Discount.fromString(discountType));

        System.out.printf("%.2f", calculator.calculate());
    }
}
