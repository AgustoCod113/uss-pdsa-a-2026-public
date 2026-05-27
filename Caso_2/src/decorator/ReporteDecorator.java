package decorator;

import component.Reporte;

public abstract class ReporteDecorator implements Reporte {

    // Contiene al component
    protected final Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String getDescripcion() {
        return this.reporte.getDescripcion();
    }

    @Override
    public void generar() {
        this.reporte.generar();
    }
}