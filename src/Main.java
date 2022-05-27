import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // for
        for(int i=0;i<5;i++) {
            // i++ es un incrementador (i=i+1)
            System.out.println("ciclo for #"+i);
        }
        for(int i=4;i>=0;i--) {
            // i-- es un de-crementador (i=i-1)
            System.out.println("ciclo for inverso #"+i);
        }
        // while (solamente lo vamos a ocupar, cuando no sabemos la cantidad
        // de valores a leer)
        int contador=0;
        while(contador<4) {
            System.out.println("while #"+contador);
            contador++;
        }
        // do/while, la diferencia al while, es que se realiza por lo menos una vez.
        contador=9999;
        do {
            System.out.println("while(2) #"+contador);
            contador++;
        } while(contador<4);

        // for each
        List<String> paises=new ArrayList<>();
        paises.add("Chile");
        paises.add("Argentina");
        paises.add("Peru");

        for(int i=0;i<paises.size();i++) {
            System.out.println("for con paises #"+paises.get(i));
        }

        for(String pais: paises) {
            System.out.println("for each #"+pais);
        }

        // stream (JAVA 8)
        // (alias) -> operacion  : operacion lambda.
        // -> indica un "donde".
        paises.forEach(
                (pais)-> System.out.println("stream #"+pais)
        );

        paises.stream().forEach(
                (pais)-> System.out.println("stream #"+pais)
        );




    }
}