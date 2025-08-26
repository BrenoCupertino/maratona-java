package portfolio.breno.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone  {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Reflexivo, simetrico, transitivo e consistente.
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Smartphone o = (Smartphone) obj;
        return serialNumber.equals(o.getSerialNumber());
    }

    // Numero único que será gerado para os objetos.
    /*
    * x.equals(y) == true -> y.hashCode() == x.hashCode
    * y.hashCode() == x.hashCode não significa x.equals(y) == true
    * x.equals(y) != true -> y.hashCode() != x.hashCode
    * */
    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
