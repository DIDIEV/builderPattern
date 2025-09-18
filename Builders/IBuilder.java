package Builders;

import MilkShakes.MilkShake;

public interface IBuilder {
    public void buildName(String name);
    public void buildMilk(String milkFlavour);
    public void buildIceCream(String iceCreamFlavour);
    public MilkShake getMilkShake();
}
