package ar.edu.unahur.obj2.w2j.ciudad;

public class Comercial extends  Drone{

    public Comercial(Mision mision, Integer autonomia, Integer nvProcesamiento) {
        super(mision, autonomia, nvProcesamiento);
    }

    @Override
    public Integer eficienciaOperativa() {
        return (int) (super.eficienciaOperativa() * 1.1);
    }
    @Override
    public Boolean esAvanzadoSegunTipo() {
        return false;
    }
}
