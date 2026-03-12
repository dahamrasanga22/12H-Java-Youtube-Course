
class Car {
    int speed;
    String color;
    double regularPrice;

    double getSalePrice() {
        return regularPrice;
    }
}

class FordTransit extends Car {
    int weight;

    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 90 / 100; // discount price
        } else {
            return regularPrice * 80 / 100;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}

class Audi extends Car {
    int length;

    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 95 / 100;
        } else {
            return regularPrice * 80 / 100;
        }
    }
}


public class MyOwnAutoshop {
    public static void main(String[] args) {

        Audi myAudi = new Audi( 20000, , "Red", 25);
        Ford myFord = new Ford(150, 25000, "Black", 2022, 2000);
        FordTransit myTransit = new FordTransit(140, 22000, "White", 3000);

        System.out.println("Audi Sale Price: " + myAudi.getSalePrice());
        System.out.println("Ford Sale Price: " + myFord.getSalePrice());
        System.out.println("FordTransit Sale Price: " + myTransit.getSalePrice());
    }
}
