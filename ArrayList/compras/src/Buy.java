public class Buy implements Comparable<Buy>{
    private String description;
    private double value;

    public Buy(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Descrição da compra " + description +
                " Valor = " + value;
    }

    @Override
    public int compareTo(Buy anotherPurchase) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(anotherPurchase.getValue()));
    }
}
