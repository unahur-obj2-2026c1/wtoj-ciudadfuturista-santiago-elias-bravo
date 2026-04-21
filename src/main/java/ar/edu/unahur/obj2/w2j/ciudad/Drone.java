package ar.edu.unahur.obj2.w2j.ciudad;

public abstract class Drone {
    private Integer autonomia = 0;
    private Integer nvProcesamiento = 0;
    private Mision mision;

    public Drone (Mision mision, Integer autonomia, Integer nvProcesamiento) {
        this.mision = mision;
        this.autonomia = autonomia;
        this.nvProcesamiento = nvProcesamiento;
    }

    public Integer eficienciaOperativa(){
        return mision.eficienciaOperativa() + (this.autonomia * 10);
    }

    public Boolean esAvanzado(){
        return this.esAvanzadoSegunTipo() || this.getMision().esAvanzadoSegunMision(this);
    }

    public abstract Boolean esAvanzadoSegunTipo();

    public void disminuirAutonomia(){
        autonomia = (autonomia * 95) / 100;
    }

    public Integer getNvProcesamiento() {
        return nvProcesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public Integer getAutonomia() {
        return autonomia;
    }
}
