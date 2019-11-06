package pl.przydan.paint;

public class Paint {
    private String paintName;
    private Double quantity;

    public Paint(String paintName, Double quantity) {
        this.paintName = paintName;
        this.quantity = quantity;
    }

    public String getPaintName() {
        return paintName;
    }

    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "paintName='" + paintName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
