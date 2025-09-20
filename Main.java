
import Builders.Builder;
import Directors.Director;
import MilkShakes.MilkShake;
import java.util.*;




public class Main {
    public static void main(String[] args) {

        List<MilkShake> milkShakes = new ArrayList<>(); 
        Director starBicks = new Director(new Builder());
        
        int condition = -1;
        while (condition != 0) {
            System.out.println("1. Order Choco Tin");
            System.out.println("2. Order Frezz Berry");
            System.out.println("3. Order Bananini");
            System.out.println("4. Show all orders");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            if (Builder.input.hasNextLine()) {
                Builder.input.nextLine(); // Consume any leftover newline
            } switch (condition) {
                case 1:
                    MilkShake chocoTin = starBicks.buildChocoTin();
                    milkShakes.add(chocoTin);
                    System.out.println("Choco Tin ordered!");
                    break;
                case 2:
                    MilkShake frezzBerry = starBicks.buildFrezzBerry();
                    milkShakes.add(frezzBerry);
                    System.out.println("Frezz Berry ordered!");
                    break;
                case 3:
                    MilkShake bananini = starBicks.buildBananini();
                    milkShakes.add(bananini);
                    System.out.println("Bananini ordered!");
                    break;    
                case 4:
                    if (milkShakes.isEmpty()) {
                        System.out.println("No orders yet.");
                    } else {
                        for (MilkShake milkShake : milkShakes) {
                            milkShake.showMilkshake();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        Builder.input.close();
    }
}
