import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the name");
        String name = scanner.nextLine();
        System.out.println("insert 1st price");
        double price1 = scanner.nextDouble();
        System.out.println("insert 2nd price");
        double price2 = scanner.nextDouble();
        double subtotal = price2+price1;
        double tax = subtotal*0.19;
        double total = (price1+price2)*1.19;
        System.out.println("La factura: "+ name +" \ntiene un total bruto de "+ subtotal+",\ncon un impuesto de "+ tax+" \ny el monto después de impuesto es de "+ total);
    }
}
