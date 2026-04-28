package factory;

import java.util.Arrays;
import java.util.List;
import model.Reporte;

public abstract class ReporteFactory {
    
    public abstract Reporte crearReporte();
    
    public void enviarReporte(List<String> datos) {
        Reporte r = crearReporte();
        r.exportar(datos);

    }
    
}
