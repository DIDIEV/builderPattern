package Builders;

import MilkShakes.MilkShake;
import java.util.Scanner;

public class Builder implements IBuilder {
    public MilkShake milkShake = new MilkShake();
    public static Scanner input = new Scanner(System.in);


    @Override
    public void buildName(String name) {
        // Implementation here
        milkShake.setName(name);
    }
    @Override
    public void buildMilk(String milkFlavour) {
        // Implementation here
        milkShake.setMilkFlavour(milkFlavour);
    }
    @Override
    public void buildIceCream(String iceCreamFlavour) {
        // Implementation here
        milkShake.setIceCreamFlavour(iceCreamFlavour);
    }

    @Override
    public void buildFlavour(String milkShakeFlavour) {
        // Implementation here
        milkShake.setFlavour(milkShakeFlavour);
    }

    @Override
    public MilkShake getMilkShake() {
        return this.milkShake;
    }

    
    @Override
    public void buildIfMilk(){
        if (!this.milkShake.addMilk){
            System.out.println("Which milk flavour do you want?");
            String milkFlavour = input.nextLine();
            this.milkShake.addMilk = true;
            buildMilk(milkFlavour);
            
        }
    }

    @Override
    public void buildIfIceCream(){
        if (!this.milkShake.addMilk){
            this.milkShake.addIceCream = true;
        }
    }
    @Override
    public void buildIfWater(){
        if (!this.milkShake.addMilk){
            this.milkShake.addWater = true;
        }
    }
}
