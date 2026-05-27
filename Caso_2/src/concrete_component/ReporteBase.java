package concrete_component;

import component.Reporte;

public class ReporteBase implements Reporte {

    @Override
    public String getDescripcion() {
        return "Reporte Base de Ventas";
    }

    @Override
    public void generar() {

        System.out.println("========== REPORTE DE VENTAS ==========");
        System.out.println("ID   PRODUCTO        MONTO");
        System.out.println("1    Laptop          S/ 3500");
        System.out.println("2    Mouse           S/ 120");
        System.out.println("3    Teclado         S/ 250");

    }
}