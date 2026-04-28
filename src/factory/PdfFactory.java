package factory;

import model.Reporte;
import model.ReportePdf;

public class PdfFactory extends ReporteFactory {

    @Override
    public Reporte crearReporte() {
        return new ReportePdf();
    }

}
