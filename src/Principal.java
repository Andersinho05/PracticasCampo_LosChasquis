import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Pago> pagos = new ArrayList<>();
        ArrayList<Ruta> rutas = new ArrayList<>();
        ArrayList<Inspector> inspectores = new ArrayList<>();
        ArrayList<ActaFiscalizacion> actas = new ArrayList<>();

        System.out.println("=== SISTEMA DE CONTROL DE TRANSPORTE LOS CHASQUIS ===");


        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        buses.add(bus1);
        buses.add(bus2);

        Pago pago1 = new Pago();
        pago1.realizarPago(120.0, "Efectivo"); 
        pagos.add(pago1);

        Pago pago2 = new Pago();
        pago2.realizarPago(200.0, "Yape", 20.0); 
        pagos.add(pago2);

        Ruta ruta1 = new Ruta();
        rutas.add(ruta1);

        Inspector inspector1 = new Inspector();
        inspectores.add(inspector1);

        ActaFiscalizacion acta1 = new ActaFiscalizacion();
        actas.add(acta1);


        System.out.println("\n--- RESUMEN DE COLECCIONES ---");
        System.out.println("Cantidad de buses: " + buses.size());
        System.out.println("Cantidad de pagos: " + pagos.size());
        System.out.println("Cantidad de rutas: " + rutas.size());
        System.out.println("Cantidad de inspectores: " + inspectores.size());
        System.out.println("Cantidad de actas: " + actas.size());


        System.out.println("\n--- LISTA DE PAGOS REGISTRADOS ---");
        for (Pago p : pagos) {
            System.out.println("Pago procesado correctamente.");
        }

 
        System.out.print("\n¿Desea registrar un nuevo pago? (s/n): ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese monto del pago: ");
            double monto = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese método de pago (Efectivo, Yape, Tarjeta): ");
            String metodo = sc.nextLine();

            Pago nuevoPago = new Pago();
            nuevoPago.realizarPago(monto, metodo);
            pagos.add(nuevoPago);

            System.out.println("✅ Pago agregado correctamente. Total de pagos: " + pagos.size());
        }

        System.out.println("\n=== FIN DEL PROGRAMA ===");
        sc.close();
    }
}


