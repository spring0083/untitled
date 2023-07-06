import java.util.ArrayList;
import java.util.List;

public class untitled {
    public static void main(String[] args) throws CloneNotSupportedException {
//        ShoppingCart[] cartA = { new ShoppingCart("apple", 3000l), new ShoppingCart("banana", 5000l) };
//        ShoppingCart[] cartB = cartA; // 얕은 복사
//        ShoppingCart[] cartB = cartA.clone(); //깊은 복사
        List<ShoppingCart> cartA = new ArrayList<>();
        cartA.add(new ShoppingCart("apple", 3000l));
        cartA.add(new ShoppingCart("banana", 5000l));
        List<ShoppingCart> cartB = cartA; // 얕은 복사
//        List<ShoppingCart> cartB = new ArrayList<>(cartA); // 깊은 복사

        System.out.println("cartA " + Integer.toHexString(cartA.hashCode()));
//        System.out.println("cartA[0] " + Integer.toHexString(cartA[0].hashCode()));
        System.out.println("cartA[0] " + Integer.toHexString(cartA.get(0).hashCode()));
        for (ShoppingCart a : cartA) {
            System.out.println(a.toString());
        }

        System.out.println("cartB " + Integer.toHexString(cartB.hashCode()));
        for (ShoppingCart b : cartB) {
            System.out.println(b.toString());
        }
        System.out.println();

//        cartB[0] = new ShoppingCart("apple", 3500l);
        cartB.remove(0);
        cartB.add(0, new ShoppingCart("apple", 3500l));

        System.out.println("cartA " + Integer.toHexString(cartA.hashCode()));
//        System.out.println("cartA[0] " + Integer.toHexString(cartA[0].hashCode()));
        System.out.println("cartA[0] " + Integer.toHexString(cartA.get(0).hashCode()));
        for (ShoppingCart a : cartA) {
            System.out.println(a.toString());
        }

        System.out.println("cartB " + Integer.toHexString(cartB.hashCode()));
        for (ShoppingCart b : cartB) {
            System.out.println(b.toString());
        }
        System.out.println();

//        cartB[0].setPrice(3800l);
        cartB.get(0).setPrice(3800l);

        System.out.println("cartA " + Integer.toHexString(cartA.hashCode()));
//        System.out.println("cartA[0] " + Integer.toHexString(cartA[0].hashCode()));
        System.out.println("cartA[0] " + Integer.toHexString(cartA.get(0).hashCode()));
        for (ShoppingCart a : cartA) {
            System.out.println(a.toString());
        }
        System.out.println("cartB " + Integer.toHexString(cartB.hashCode()));
        for (ShoppingCart b : cartB) {
            System.out.println(b.toString());
        }
        System.out.println();

        try {
//            ShoppingCart b0 = cartB[0].clone();
            ShoppingCart b0 = cartB.get(0).clone();
            b0.setPrice(3900l);
//            cartB[0] = b0;
            cartB.remove(0);
            cartB.add(0, b0);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("cartA " + Integer.toHexString(cartA.hashCode()));
//        System.out.println("cartA[0] " + Integer.toHexString(cartA[0].hashCode()));
        System.out.println("cartA[0] " + Integer.toHexString(cartA.get(0).hashCode()));
        for (ShoppingCart a : cartA) {
            System.out.println(a.toString());
        }
        System.out.println("cartB " + Integer.toHexString(cartB.hashCode()));
        for (ShoppingCart b : cartB) {
            System.out.println(b.toString());
        }
    }
}
