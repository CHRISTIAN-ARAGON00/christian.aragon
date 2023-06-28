import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Utilitario.Utility;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String CA_NOMBRE = "christian daniel aragon pazmiño";
        int CA_CEDULA = 1727060491;
        String CA_CORREO = "CHRISTIAN.ARAGON@EPN.EDU.EC";
        String caUsuario1 = "christian.aragon@epn.edu.ec";
        String caClave1 = "1727060491";
        String caUsuario2 = "profe";
        String caClave2 = "1234";
        boolean caValidarLogin = false;
        int caContadorIntentos = 2;

        System.out.println();
        System.out.println("    - CEDULA: " + CA_CEDULA);
        System.out.println("    - CORREO: " + CA_CORREO);
        System.out.println("    - NOMBRE: " + CA_NOMBRE);
        System.out.println();

        caLogearse(caUsuario1, caClave1, caUsuario2, caClave2, caValidarLogin, caContadorIntentos);

        System.out.println();
        System.out.println("1 Visualizar Medicos");
        System.out.println("2 Visualizar Especialidad");
        System.out.println("3 Visualizar Horario");
        System.out.println("4 Visualizar Horario de una especialidad ");
        System.out.println("0 SALIR");
        int menu = Utility.obtenerUnNumeroPositivo("");

        switch (menu) {
            case 1:System.out.println("[+] Listado de medicos");
            System.out.println("202110105-CHUNCHO JIMENEZ ANGEL DAVID");
            System.out.println("202111083-HIDALGO CRUZ PABLO ESTEBAN");
            System.out.println("202120757-ALEMAN OSORIO CARLOS ALEJANDRO");
                
                break;
            case 2:
            System.out.println("[+] Listado de especialidades");
                System.out.println("ICCD343\tAPRECIACI\u00D3N CINEMATOGR\u00C1FICA\r\n" + //
                        "ICCD343\tARQUITECTURA DE COMPUTADORES\r\n" + //
                        "ICCD343\tARQUITECTURA DE COMPUTADORES\r\n" + //
                        "ICCD353\tESTRUCTURA DE DATOS Y ALGORITMOS 1\r\n" + //
                        "ICCD353\tFUNDAMENTOS DE REDES Y CONECTIVIDAD\r\n" + //
                        "CSHD3Bl\tFUNDAMENTOS DE REDES Y CONECTIVIDAD\r\n" + //
                        "MATD223\tINGLES\r\n" + //
                        "ICCD323\tSISTEMAS OPERATIVOS\r\n" + //
                        "ICCD323\tSISTEMAS OPERATIVOS\r\n" + //
                        "");
                break;
            case 3:
                caReader();
                break;
            case 4:
                caReader();
                break;
            case 0:
                System.out.println("Regresa pronto ");
                System.exit(0);
                break;
        }

    }

    private static void caReader() {
        List<String[]> array1 = new ArrayList<>();
        List<String[]> array2 = new ArrayList<>();
        List<String[]> array3 = new ArrayList<>();

        // Rutas de los archivos CSV
        String archivo1 = "src\\Horarios\\202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv";
        String archivo2 = "src\\\\Horarios\\\\202111083-HIDALGO CRUZ PABLO ESTEBAN.csv";
        String archivo3 = "rc\\\\Horarios\\\\202120757-ALEMAN OSORIO CARLOS ALEJANDRO.csv";

        // Lectura del archivo 1
        try (BufferedReader br = new BufferedReader(new FileReader(archivo1))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                array1.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lectura del archivo 2
        try (BufferedReader br = new BufferedReader(new FileReader(archivo2))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                array2.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lectura del archivo 3
        try (BufferedReader br = new BufferedReader(new FileReader(archivo3))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                array3.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir los arrays
        System.out.println("Contenido del array1:");
        for (String[] row : array1) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Contenido del array2:");
        for (String[] row : array2) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Contenido del array3:");
        for (String[] row : array3) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void caLogearse(String caUsuario1, String caClave1, String caUsuario2, String caClave2,
            boolean caValidarLogin, int caContadorIntentos) {
        String caUsuario;
        String caClave;
        while (!caValidarLogin) {
            System.out.println("------------------------");
            System.out.print("+ usuario : ");
            caUsuario = sc.nextLine();
            System.out.print("+ clave   : ");
            caClave = sc.nextLine();
            System.out.println("------------------------");
            System.out.println("*Nro de intentos: " + caContadorIntentos);
            System.out.println();
            if (caUsuario.equals(caUsuario1) && caClave.equals(caClave1)
                    || caUsuario.equals(caUsuario2) && caClave.equals(caClave2)) {
                System.out.println();
                System.out.println("::Bienvenido " + Utility.convertirAMayusculas(caUsuario));
                System.out.println("----------------------------------");
                System.out.println("Carga horario de medico ");
                System.out.println("----------------------------------");

                System.out.println("Usuario: " + caUsuario);
                caValidarLogin = true;
            } else {
                caContadorIntentos--;
                if (caContadorIntentos == -1) {
                    System.out.println();
                    System.out.println("Lo sentimos tu usuario y clave son incorrectos ");
                    System.out.println();
                    System.out.println(" <<<<<<GRACIAS>>>>>> ");
                    System.out.println();
                    System.out.println();
                    System.exit(0);
                }
            }

        }
    }
}
