import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Horario extends HorarioBase implements IGestiaArchivosHorario {
     

    @Override
    public String caReadHorarioMedicos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'caReadHorarioMedicos'");
    }

    @Override
    public void caShowEspecialidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'caShowEspecialidad'");
    }

    @Override
    public void caShowMedicos() {
        System.out.println("[+ Listado de medicos]");
         String carpetaPath = "src\\Horarios";
        List<String> nombresArchivos = obtenerNombresArchivos(carpetaPath);
        
        for (String nombreArchivo : nombresArchivos) {
            System.out.println(nombreArchivo);
        }
    
        
    }
    public static List<String> obtenerNombresArchivos(String carpetaPath) {
        List<String> nombresArchivos = new ArrayList<>();
        
        // Crear un objeto File con la ruta de la carpeta
        File carpeta = new File(carpetaPath);
        
        // Obtener la lista de archivos en la carpeta
        File[] archivos = carpeta.listFiles();
        
        if (archivos != null) {
            // Recorrer los archivos y obtener sus nombres
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    nombresArchivos.add(archivo.getName());
                }
            }
        }
        
        return nombresArchivos;
    }
    
}
