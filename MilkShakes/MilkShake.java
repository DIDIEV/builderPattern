package MilkShakes;

public class MilkShake {
    private String name;
    private String milkFlavour;
    private String iceCreamFlavour;
    private String Flavour;
    public boolean addMilk = false;
    public boolean addIceCream = false;
    public boolean addWater = false;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMilkFlavour() {
        return milkFlavour;
    }

    public void setMilkFlavour(String milkFlavour) {
        this.milkFlavour = milkFlavour;
    }

    public String getIceCreamFlavour() {
        return iceCreamFlavour;
    }

    public void setIceCreamFlavour(String iceCreamFlavour) {
        this.iceCreamFlavour = iceCreamFlavour;
    }

    public void setFlavour(String flavour){
        this.Flavour = flavour;
    }

    public String getFlavour() {
        return this.Flavour;
    }

    public void showMilkshake(){
        System.out.println("---Name:"+ this.name + "---");
        System.out.println("---Flavour:"+ this.Flavour + "---");
        
        if (this.addIceCream && this.addMilk){
            System.out.println("---Milk flavour:"+ this.milkFlavour + "---");
            System.out.println("---Ice cream flavour:"+ this.iceCreamFlavour + "---");
        }else if (this.addIceCream) {
            System.out.println("---Ice cream flavour:"+ this.iceCreamFlavour + "---");
        }else if(this.addMilk){
            System.out.println("---Milk flavour:"+ this.milkFlavour + "---");
        }

        if (this.addWater) {
            System.out.println("This milkshake contains water");
        }
    }
}



