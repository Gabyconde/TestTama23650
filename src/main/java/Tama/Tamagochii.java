package Tama;


public class Tamagochii {

    private Integer nivel;
    private String nombre;

    private String estado;
    public Tamagochii(Integer nivel) {
        this.nivel = nivel;
    }


    public Tamagochii(String nombre) {

        this.nombre = nombre;
    }

    public Tamagochii() {
        this.nivel = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setEstado(String estado) {
        this.estado=estado;
    }

    public String getEstado() {
        return estado;
    }

    public void comer() {
        if (estado.equals("hambriento")){
            setEstado("contento");
       } if (estado.equals("contento")){
            nivel++;
        }
    }

}
