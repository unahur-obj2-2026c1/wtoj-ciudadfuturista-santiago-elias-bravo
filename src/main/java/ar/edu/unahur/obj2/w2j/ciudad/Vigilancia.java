package ar.edu.unahur.obj2.w2j.ciudad;

import java.util.ArrayList;
import java.util.List;

public class Vigilancia extends  Mision{

    private List<Sensor> sensores = new ArrayList<>();

    @Override
    public Integer eficienciaOperativa() {
        return sensores.stream().mapToInt(s -> s.eficienciaOperativa()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Drone unDron) {
        return sensores.stream().allMatch(s->s.esDuradero());
    }

}
