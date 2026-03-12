
class Car {
    int speed;
    String color;
    double regularPrice;

    double getSalePrice() {
        return regularPrice;
    }
}


public class MyOwnAutoshop {
    public static void main(String[] args) {

        Audi myAudi = new Audi( 122, "Red", 20000,  25);
        System.out.println("Audi Sale Price: " + myAudi.getSalePrice());
    }
}
