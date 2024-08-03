import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pruebas {
    public static void main(String[] args) {
            Scanner leer = new Scanner (System.in);
            int opcion = 0;
            String tipo = "";
            String nombre = "";
            String genero = "";
     Map<String, List<Animal>> tiposAnimales = new TreeMap<>();
        List<Animal> Animales_Terrestres = new ArrayList<>();
        List<Animal> Animales_Acuaticos = new ArrayList<>();
        List<Animal> Animales_Aereos = new ArrayList<>();
        do {            
            menu();
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("procedera a ingresar un animal terrestre");
                    tipo = "terrestre";
                    System.out.println("Ingrese el nombre del animal");
                    nombre = leer.next();
                    System.out.println("ingrese el genero");
                    genero = leer.next();
                    Animal AnimalTerrestre = new Animal(nombre, genero, genero);
                    Animales_Terrestres.add(AnimalTerrestre);
                    tiposAnimales.put("Terrestres:", Animales_Terrestres);
                    break;
                case 2:
                    System.out.println("procedera a ingresar un animal acuatico");
                    tipo = "Acuatico";
                    System.out.println("Ingrese el nombre del animal");
                    nombre = leer.next();
                    System.out.println("ingrese el genero");
                    genero = leer.next();
                    Animal AnimalAcuatico = new Animal(nombre, genero, genero);
                    Animales_Acuaticos.add(AnimalAcuatico);
                    tiposAnimales.put("Acuaticos:", Animales_Acuaticos);
                    break;
                case 3:
                    System.out.println("procedera a ingresar un animal terrestre");
                    tipo = "Aereo";
                    System.out.println("Ingrese el nombre del animal");
                    nombre = leer.next();
                    System.out.println("ingrese el genero");
                    genero = leer.next();
                    Animal AnimalAereo = new Animal(nombre, genero, genero);
                    Animales_Aereos.add(AnimalAereo);
                    tiposAnimales.put("Aéreos:", Animales_Aereos);
                    break;
                case 4:
                    for (Map.Entry<String, List<Animal>> entry: tiposAnimales.entrySet()){
                        String key = entry.getKey();
                        List<Animal> Value = entry.getValue();
                        System.out.println(key);
                        for (Animal ani : Value){
                            System.out.println(ani.getNombre());
                            System.out.println(ani.getGenero());
                        }      
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizarme");
                    break;
                

            }
        } while (opcion != 5);
    }
    public static void menu(){
        System.out.println("Elija la opción que quiere hacer");
        System.out.println("1. Agregar animales terrestres");
        System.out.println("2. Agregar animales acuaticos");
        System.out.println("3. Agregar animales aereos");
        System.out.println("4. Listar todos los animales");
        System.out.println("5. Salir");
    }
}
