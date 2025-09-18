package Directors;

import Builders.IBuilder;
import MilkShakes.MilkShake;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public MilkShake buldMilkShake() {
        builder.buildName("ChocoLoco");
        builder.buildMilk("Chocolate");
        builder.buildIceCream("Vanilla");
        return builder.getMilkShake();
    }
}
