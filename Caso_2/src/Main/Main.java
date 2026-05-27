package Main;

import component.Reporte;
import concrete_component.ReporteBase;
import concrete_decorator.SeccionEnviosDecorator;
import concrete_decorator.SeccionGraficoDecorator;
import concrete_decorator.SeccionTotalesDecorator;

public class Main {

    public static void main(String[] args) {

        // Reporte 1: Solo reporte base
        Reporte r1 = new ReporteBase();
        imprimir(r1);

        // Reporte 2: Base con totales
        Reporte r2 = new SeccionTotalesDecorator(new ReporteBase());
        imprimir(r2);

        // Reporte 3: Base con gráfico y totales
        Reporte r3 = new SeccionGraficoDecorator(
                        new SeccionTotalesDecorator(
                                new ReporteBase()));
        imprimir(r3);

        // Reporte 4: Base con gráfico, totales y envíos
        Reporte r4 = new SeccionEnviosDecorator(
                        new SeccionGraficoDecorator(
                                new SeccionTotalesDecorator(
                                        new ReporteBase())));
        imprimir(r4);

    }

    public static void imprimir(Reporte reporte) {

        System.out.println("\n======================================");
        System.out.println(reporte.getDescripcion());
        System.out.println("======================================");

        reporte.generar();

        System.out.println();

    }
}