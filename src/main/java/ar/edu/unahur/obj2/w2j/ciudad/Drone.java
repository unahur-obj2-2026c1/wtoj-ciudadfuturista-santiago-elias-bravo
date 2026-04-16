package ar.edu.unahur.obj2.w2j.ciudad;

public class Drone {
    private Integer autonomia;
    private Integer nvProcesamiento;
    private Mision mision;

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getNvProcesamiento() {
        return nvProcesamiento;
    }

    public void setNvProcesamiento(Integer nvProcesamiento) {
        this.nvProcesamiento = nvProcesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

}
