package concrete_decorator;

import component.Reporte;
import decorator.ReporteDecorator;

public class SeccionTotalesDecorator extends ReporteDecorator {

    public SeccionTotalesDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Sección Totales";
    }

    @Override
    public void generar() {

        super.generar();

        System.out.println("\n----- TOTALES -----");
        System.out.println("Total ventas: S/ 3870");

    }
}