package pl.przydan.paints;

public class Paint {
    private PaintNames paintNames;
    private Double quantity;

    public Paint(PaintNames paintNames, Double quantity) {
        this.paintNames = paintNames;
        this.quantity = quantity;
    }

    public PaintNames getPaintNames() {
        return paintNames;
    }

    public void setPaintNames(PaintNames paintNames) {
        this.paintNames = paintNames;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return   " " + paintNames + " " +  quantity + " kg" +  "\n"
                ;
    }
}
