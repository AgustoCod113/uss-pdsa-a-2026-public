package concrete_decorator;

import component.Reporte;
import decorator.ReporteDecorator;

public class SeccionEnviosDecorator extends ReporteDecorator {

    public SeccionEnviosDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Sección Envíos";
    }

    @Override
    public void generar() {

        super.generar();

        System.out.println("\n----- ENVÍOS -----");
        System.out.println("Pedido 1 -> Lima");
        System.out.println("Pedido 2 -> Arequipa");
        System.out.println("Pedido 3 -> Cusco");

    }
}