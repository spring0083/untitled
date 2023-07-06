public class ShoppingCart implements Cloneable {
    private String name;
    private long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public ShoppingCart() {
    }

    public ShoppingCart(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public ShoppingCart clone() throws CloneNotSupportedException {
        return (ShoppingCart)super.clone();    // 얕은 사본을 반환
    }
}