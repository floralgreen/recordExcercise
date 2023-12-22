public class Main {

    public static void main(String[] args) {

        Punto punto1 = new Punto(-50, 80);
        Punto punto2 = new Punto(50, 80);

        System.out.println("Cordinate punto 1 " + punto1);
        System.out.println("Cordinate punto 2 " + punto2);

        System.out.println("hashCode punto1 " + punto1.hashCode());
        System.out.println("hashCode punto2 " + punto2.hashCode());

        System.out.println("I due punti sono uguali? " + punto1.equals(punto2));

    }

}
