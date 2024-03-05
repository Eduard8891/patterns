package builder;

public class Car {
    private String brand;
    private String type;
    private int price;

    private Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public Car(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public static class Builder {
        private String brand;
        private String type;
        private int price;

        private Builder() {
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(brand, type, price);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
