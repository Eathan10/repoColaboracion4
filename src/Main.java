import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        funcionAlumno3();

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
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

