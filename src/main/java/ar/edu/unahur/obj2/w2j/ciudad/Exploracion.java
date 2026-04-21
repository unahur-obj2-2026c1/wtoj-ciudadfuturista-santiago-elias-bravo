package ar.edu.unahur.obj2.w2j.ciudad;

public class Exploracion extends  Mision{

    @Override
    public Integer eficienciaOperativa() {
        return 0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Drone unDron) {
       return unDron.eficienciaOperativa() % 2 == 0;
    }


}
