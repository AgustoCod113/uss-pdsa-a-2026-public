package concrete_decorator;

import component.Reporte;
import decorator.ReporteDecorator;

public class SeccionGraficoDecorator extends ReporteDecorator {

    public SeccionGraficoDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Sección Gráfico";
    }

    @Override
    public void generar() {

        super.generar();

        System.out.println("\n----- GRÁFICO -----");
        System.out.println("Se incluye un gráfico de barras de ventas.");

    }
}