package Builders;

import MilkShakes.MilkShake;

public class Builder implements IBuilder {
    public MilkShake milkShake = new MilkShake();


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
    public MilkShake getMilkShake() {
        return this.milkShake;
    }

}
