package ar.edu.unahur.obj2.w2j.ciudad;

public class Zona {
    private Integer tamaño;
    private Integer operacionRecibida = 0;

    public Zona(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public void recibirOperacion(){
        this.operacionRecibida = this.operacionRecibida + 1;
    }

    public Integer getTamaño() {
        return tamaño;
    }
}
