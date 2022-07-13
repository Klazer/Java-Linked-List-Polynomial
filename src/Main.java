//Isaiah Herr (herrx080, 5333708) and SeeLong Thao (thao0478, 5360173) Project 2

public class Main {

    public static void main(String[] args) {

        Polynomial poly1 = new Polynomial();
        poly1.input();
        System.out.println("Poly 1: "+poly1.getList());
        Polynomial poly2 = new Polynomial();
        poly2.input();
        System.out.println("Poly 2: "+poly2.getList());
        System.out.print("Your Results in multiplication: ");
        poly1.Multiply(poly2);
        System.out.print("Your Results in Addition: ");
        poly1.addition(poly2);
        System.out.println();
        System.out.println();
        System.out.print("For your first polynomial, ");
        poly1.eval();
        System.out.print("For you second polynomial, ");
        poly2.eval();

    }
}
