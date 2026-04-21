package ar.edu.unahur.obj2.w2j.ciudad;

import java.util.ArrayList;
import java.util.List;

public class Escuadron {
    private List<Drone> drones = new ArrayList<>();

    public void agregarDrone(Drone unDrone){
        if (Ciudad.getMaximaCantidadPorEscuadron() >= drones.size()){
            throw new IllegalStateException("Supera el límite permitido");
        }
        drones.add(unDrone);
    }

    public Boolean puedeOperar(Zona unaZona){
        return this.alMenosUnAvanzado() && (int)(this.eficienciaOperativa() * 1.5) > unaZona.getTamaño();
    }

    public Boolean alMenosUnAvanzado(){
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }

    public Integer eficienciaOperativa(){
        return drones.stream().mapToInt(d -> d.eficienciaOperativa()).sum();
    }

    public void operar(Zona unaZona){
        if(this.puedeOperar(unaZona)){
            unaZona.recibirOperacion();
            drones.forEach(d->d.disminuirAutonomia());
        }
    }
}
