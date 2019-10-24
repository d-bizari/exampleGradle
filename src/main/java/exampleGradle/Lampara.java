package exampleGradle;

public class Lampara {
    private boolean estado;

    public Lampara(){
        estado = false;
    }

    public boolean encender(){
        estado = true;
        return estado;
    }

    public boolean apagar(){
        estado = false;
        return estado;
    }
}
