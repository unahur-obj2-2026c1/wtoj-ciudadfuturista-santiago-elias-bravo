package ar.edu.unahur.obj2.w2j.ciudad;

public class Seguridad extends Drone{

    public Seguridad(Mision mision, Integer autonomia, Integer nvProcesamiento) {
        super(mision, autonomia, nvProcesamiento);
    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        return this.getNvProcesamiento() > 50;
    }

}
