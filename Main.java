import	java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        char asientos [][] = new char [10][10];
        Scanner s= new Scanner(System.in);
        int op;
        //inicializar asientos en libre 
        for(int f=0;f<10;f++){
            for(int c=0;c<10;c++){
                asientos[f][c]='L';
            }
        }
        System.out.println("--bienvenido al anfiteatro--");
          //mostrar asientos
          for(int f=0;f<10;f++){
            for(int c=0;c<10;c++){
                System.out.print(asientos[f][c] + " ");
            }
            System.out.println();
        }
       
       do{
        System.out.println("ingrese una opcion:");
        System.out.print("1-reservar"+" "+"4-salir");
        System.err.println();
        String mensaje="gracias por su compra";
        op=s.nextInt();
        if (op==1) {
            System.out.println("ingrese la fila (numero del 0-9)");
            int f= s.nextInt();
            System.out.println("ingrese la columna");
            int c= s.nextInt();
            //validar que el asiento no haya sido ya comprado
            if(asientos[f][c]=='X'){
                System.out.println("--------------------");
                System.out.println("el asiento esta ocupado");
                System.out.println("--------------------");
                mensaje="intente de nuevo";
            }else asientos[f][c]='X';
            
               
        }
        System.out.println();
         //mostrar asientos
                for(int f=0;f<10;f++){
                    for(int c=0;c<10;c++){
                        System.out.print(asientos[f][c] + " ");
                    }
                    System.out.println();
                }
    System.out.println();
    System.out.println(mensaje);
    }while(op!=4);
     s.close();
    }
}