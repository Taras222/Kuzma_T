public class Farm {
    private double chemicUsage;
    private double natureUsage;

    public Farm(double chemicUsage, double natureUsage) {
        this.chemicUsage = chemicUsage;
        this.natureUsage = natureUsage;;
    }

    public void aboutChemAndNat() {
        System.out.println("Було викорстано хімікатів: " + chemicUsage);
        System.out.println("Було використано природніх добрив: " + natureUsage);
    }

    public String productReady() {
        if (chemicUsage >= 2.3 && chemicUsage <= 3.2 && natureUsage >= 3.8) {
            return "Плід вирощений згідно стандартів";
        } else {
            return "Плід не відповідає стандартам!!!";
        }
    }


    public double getChemicUsage() {
        return chemicUsage;
    }

    public void setChemicUsage(double chemicUsage) {
        this.chemicUsage = chemicUsage;
    }

    public void setNatureUsage(double natureUsage) {
        this.natureUsage = natureUsage;
    }

    public double getNatureUsage() {
        return natureUsage;
    }
}
