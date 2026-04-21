package ar.edu.unahur.obj2.w2j.ciudad;


public class Transporte extends Mision{

    @Override
    public Integer eficienciaOperativa(){
        return 100;
        
    }

    @Override
    public Boolean esAvanzadoSegunMision(Drone unDrone) {
        return unDrone.getAutonomia() >= 50;
    }
}
