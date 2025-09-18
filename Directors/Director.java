package Directors;

import Builders.IBuilder;
import MilkShakes.MilkShake;

public class Director {
    private final  IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public MilkShake buildChocoTin() {
        builder.buildName("Choco Tin");
        builder.buildIfMilk();
        builder.buildMilk("Chocolate");
        builder.buildIfIceCream();
        builder.buildIceCream("Chocolate");
        return builder.getMilkShake();
    }

    public MilkShake buildFrezzBerry() {
        builder.buildName("Frezz Berry");
        builder.buildIfMilk();
        builder.buildIfIceCream();
        builder.buildIceCream("Chocolate");
        return builder.getMilkShake();
    }

    public MilkShake buildBananini() {
        builder.buildName("Bananini");
        builder.buildIfMilk();
        builder.buildIfIceCream();
        builder.buildIceCream("Vanilla");
        return builder.getMilkShake();
    }
}
