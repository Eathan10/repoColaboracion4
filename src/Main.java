import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        funcionAlumno3();
        funcionAlumno4();
        funcionZaira();
    }

    public static void funcionAlumno1() {
        System.out.println("Función desarrollada por Alumno 1");
    }
}
    public static void funcionZaira(){
        System.out.println("Función desarrollada por Zaira");
    }

    
    // Alumno 4
    public static void funcionAlumno4() {
        System.out.println("Función desarrollada por Alumno 4");
    }
        public static void funcionAlumno3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }

}

