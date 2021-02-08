import java.util.Scanner;

public class fabrica{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        MyQueue todo = new MyQueue(30);
        MyQueue cajaMan = new MyQueue(30);
        MyQueue cajaFre = new MyQueue(30);
        MyQueue cajaMem = new MyQueue(30);

        Fruta temp;

        Fruta fruta = new Fruta();

        for(int i=0;i<30;i++){
            fruta = new Fruta();
            String nombreFruta;
            int peso;            
            System.out.println("Nombre de la Fruta:");
            nombreFruta = teclado.nextLine();
            System.out.println("Peso de la Caja:");
            peso = teclado.nextInt();
            teclado.nextLine();
            System.out.println("--------------------------");
            fruta.frutas = nombreFruta;
            fruta.peso = peso;
            todo.enqueue(fruta);
        } 

        temp = new Fruta(); //Porque la cola recibe un dato de tipo de fruta (Ingresar a la clase fruta)

        while(!todo.isEmpty()){
            temp = todo.dequeue(); 

            if(temp.frutas.equals("manzana") || temp.frutas.equals("Manzana")){
                cajaMan.enqueue(temp);
            }

            if(temp.frutas.equals("fresa") || temp.frutas.equals("Fresa")){
                cajaFre.enqueue(temp);
            }

            if(temp.frutas.equals("membrillo") || temp.frutas.equals("Membrillo")){
                cajaMem.enqueue(temp);
            }
        }

        System.out.println("***Caja de manzanas***");
        imprimeCaja(cajaMan);
        System.out.println("***Caja de fresas***");
        imprimeCaja(cajaFre);
        System.out.println("***Caja de membrillos***");
        imprimeCaja(cajaMem);

    }

    static void imprimeCaja(MyQueue c)throws Exception {
        Fruta t;
        while(!c.isEmpty()){
            t = new Fruta();
            t = c.dequeue();
            System.out.println("Fruta: " + t.frutas + ", Peso de la fruta: "+ t.peso + "kg");
        }
    }
}