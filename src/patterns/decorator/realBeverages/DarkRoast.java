package patterns.decorator.realBeverages;

import patterns.decorator.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return 1.50;
    }

    public DarkRoast() {
        description = "DarkRoast";
    }
}
