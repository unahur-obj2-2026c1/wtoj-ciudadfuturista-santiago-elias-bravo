package ar.edu.unahur.obj2.w2j.ciudad;

public class Sensor {
    private Integer capacidad;
    private Integer durabilidad;
    private Boolean tieneMejorasTecno = true;

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(Integer durabilidad) {
        this.durabilidad = durabilidad;
    }

    public Boolean getTieneMejorasTecno() {
        return tieneMejorasTecno;
    }

    public void setTieneMejorasTecno(Boolean tieneMejorasTecno) {
        this.tieneMejorasTecno = tieneMejorasTecno;
    }

    public Integer eficienciaOperativa(){
        if(this.getTieneMejorasTecno()){
            return this.getCapacidad() * 2;
        }
        else{
            return this.getCapacidad();
        }
    }

    public Boolean esDuradero(){
        return this.getDurabilidad() > 2* this.getCapacidad();
    }
}
