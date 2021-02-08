public class Fruta{
    String frutas;
    int peso;

    public String imprimir(){
        return frutas + ":" + peso;
    }
    
    public String toString(){       //ToStirng para reemplazar datos de tipo objeto por los datos string en este caso el nombre de la fruta y el peso (si no se utiliza imprime datos  basura)
        return frutas + ":" + peso;
    }
}