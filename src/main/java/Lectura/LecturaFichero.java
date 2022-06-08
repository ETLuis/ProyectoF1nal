package Lectura;

import java.io.*;
import java.util.*;

public class LecturaFichero {

    // Este método sirve para añadir las palabras sacadas del fichero "palabras.txt" a un arrayList llamado palabras.
    public static void crearPalabra(List<String> palabras){
        
        /* Inicializamos el objeto File con el nombre fichero dándole el archivo "palabras.txt" que debe encontrarse 
           en la carpeta del proyecto para ser leído */
        File fichero = new File("palabras.txt");

        /* Abrimos un try/cacth para leer el fichero por si nos diera error al hacer esta operación y mientras lee cada
           línea del archivo la añade al arrayList "palabras" añadido al principio del método. Cada palabra está en una
           línea por lo cual conseguiremos una lista ordenada de las palabras dentro del List. Por último cerramos la
           conexión con el fichero y capturamos la exception FileNotFound por la cual no encontraría el documento. */
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
