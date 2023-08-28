package diccionarioinglesespañol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class DiccionarioInglesEspañol {

    private static final Scanner teclado = new Scanner(System.in, "ISO-8859-1");
    private static final ArrayList<Diccionario> diccionario = new ArrayList<>();

    private static void Menu() {
        int opcion = 0;
        do {
            System.out.println("\t\tMENU DICCIONARIO");
            System.out.println("\t1. Agregar Palabra");
            System.out.println("\t2. Consultar palabra en ingles");
            System.out.println("\t3. Consultar palabra en español");
            System.out.println("\t4. Listar todas las palabras");
            System.out.println("\t5. salir");
            System.out.println("Ingrese opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: {
                    AgregarPalabra();
                }
                break;
                case 2: {
                    ConsultarPalabraIngles();
                }
                break;
                case 3: {
                    ConsultarPalabraEspañol();
                }
                break;
                case 4: {
                    ListarPalabras();
                }
                break;
                case 5: {
                    System.out.println("Saliendo");
                }
                break;
            }
            System.out.println("Precione enter para continuar");
            teclado.nextLine();
        } while (opcion != 5);

    }

    private static void AgregarPalabra() {
        System.out.println("Ingrese la palabra en español");
        String Español = teclado.next().toUpperCase();
        System.out.println("Ingrese su correspondiente en ingles");
        String Ingles = teclado.next().toUpperCase();
        Diccionario dicc = new Diccionario(Español, Ingles);
        diccionario.add(dicc);
        System.out.println("PALABRA AGREGADA CORRECTAMENTE");
    }

    private static void ConsultarPalabraIngles() {
        System.out.println("Ingrese la palabra en ingles para consulta y saber su correspondiente en español");
        String palabraIngles = teclado.next().toUpperCase();
        boolean existe = false;
        for (Diccionario dicc : diccionario) {
            if (dicc.getIngles().equals(palabraIngles)) {
                System.out.println("La palabra existe en el diccionario");
                System.out.println("Su correspondiente en español es: " + dicc.getEspañol());
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("La palabra Ingresada No existe");
        }
    }

    private static void ConsultarPalabraEspañol() {
        System.out.println("Ingrese la palabra en español para consulta y saber su correspondiente en ingles");
        String palabraEspañol = teclado.next().toUpperCase();
        boolean existe = false;
        for (Diccionario dicc : diccionario) {
            if (dicc.getEspañol().equals(palabraEspañol)) {
                System.out.println("La palabra existe en el diccionario");
                System.out.println("Su correspondiente en ingles es: " + dicc.getIngles());
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("La palabra Ingresada No existe");
        }
    }

    private static void ListarPalabras() {
        System.out.println("Ingrese el didioma en que desea listar las palabras");
        String listar = teclado.next().toLowerCase();
        if (listar.equals("español")) {
            System.out.println("Las palabras en español son: ");
            for (Diccionario dicc : diccionario) {
                System.out.println("---------------");
                System.out.println(dicc.getEspañol());
            }
            System.out.println("---------------");
        }
        if (listar.equals("ingles")) {
            System.out.println("Las palabras en ingles son: ");
            for (Diccionario dicc : diccionario) {
                System.out.println("---------------");
                System.out.println(dicc.getIngles());
            }
            System.out.println("---------------");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
    }

}
