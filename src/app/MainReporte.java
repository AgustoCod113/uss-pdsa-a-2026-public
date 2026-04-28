package app;

import factory.PdfFactory;
import factory.ReporteFactory;
import java.util.Arrays;

public class MainReporte {

    public static void main(String[] args) {
        ReporteFactory reporte;

        reporte = new PdfFactory();
        reporte.enviarReporte(Arrays.asList("Guerrero Diaz", "Felix Agusto"));

    }

}
