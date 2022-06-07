package Lectura;

import java.io.*;
import java.util.*;

public class LecturaFichero {

    // Este método sirve para añadir las palabras sacadas del fichero "palabras.txt" a un arrayList llamado palabras.
    public static void crearPalabra(List<String> palabras){
        File fichero = new File("palabras.txt");

        try{
            Scanner leer = new Scanner(fichero);
            while (leer.hasNext()){
                palabras.add(leer.next());
            }
            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
