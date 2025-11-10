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

    public int getIdActa() {
        return idActa;
    }

    public void setIdActa(int idActa) {
        this.idActa = idActa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoInfraccion() {
        return tipoInfraccion;
    }

    public void setTipoInfraccion(String tipoInfraccion) {
        this.tipoInfraccion = tipoInfraccion;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }
    
}
