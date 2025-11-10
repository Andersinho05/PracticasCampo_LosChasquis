public class ActaFiscalizacion {
    int idActa;
    String fecha;
    String tipoInfraccion;
    String evidencia;
    public ActaFiscalizacion() {
    }
    public ActaFiscalizacion(int idActa, String fecha, String tipoInfraccion, String evidencia) {
        this.idActa = idActa;
        this.fecha = fecha;
        this.tipoInfraccion = tipoInfraccion;
        this.evidencia = evidencia;
    }
}
