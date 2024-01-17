/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica6_ficheros.modelo;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Files {
    private String ruta;
    
    public Files() {
        this.ruta = "";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    
    public boolean crearDirectorio(String nombreArchivo) {
        try {
    
        String nombreDirectorio = JOptionPane.showInputDialog("Ingrese el directorio:");
        if (nombreDirectorio == null || nombreDirectorio.trim().isEmpty()) {
            System.out.println("No se proporcionó un directorio válido.");
            return false;
        }

        File directorio = new File(nombreDirectorio);

        if (!directorio.exists()) {
            directorio.mkdir();
        }else{
            return false;
        }

        File archivo = new File(directorio, nombreArchivo);

        if (!archivo.exists()) {
            archivo.createNewFile();
            System.out.println("Creado Correctamente");
            return true; 
        } else {
            System.out.println("Ya Existe");
            return false; 
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura/escritura");
                return false; 
        }
    }
    
    
    public List<String> listaDirectorios() {
        List<String> listaElementos = new ArrayList<>();
        File Raiz = new File(ruta);

        // Verificar si la ruta existe y es un directorio
        if (Raiz.exists() && Raiz.isDirectory()) {
            File[] archivos = Raiz.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    listaElementos.add(archivo.getAbsolutePath());
                }
            }
            
        } else {
            System.out.println("La ruta no existe");
        }
        return listaElementos;
    }
    
        
    
    public boolean eliminar(String ruta) {
        if (ruta == null || ruta.trim().isEmpty()) {
            System.out.println("Debe proporcionar una ruta válida.");
            return false;
        }
        File archivoADelete = new File(ruta);
        if (archivoADelete.exists()) {
            return archivoADelete.delete();
        } else {
            System.out.println("El archivo o directorio no existe.");
            return false;
        }
    }
    
    
    public boolean editar( String ruta, String nuevoNombre){
        if (ruta == null || ruta.trim().isEmpty() || nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                System.out.println("Nombres no validos.");
            return false;
        }

        File archActual = new File(ruta);
        File archNuevo = new File(archActual.getParent(), nuevoNombre);

        if (archActual.renameTo(archNuevo)) {
            System.out.println("Renombrado Exitosamente: " + nuevoNombre);
            return true;
        } else {
            System.out.println("Error al renombrar ");
            return false;
        }
    }
    
    public List<File> listarArchivosOcultos() {
        List<File> archivosOcultos = new ArrayList<>();
        File carpeta = new File(ruta);
        // Verificar si la ruta existe y es un directorio
        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    // Si el archivo es oculto, añadir a la lista
                    if (archivo.isHidden()) {
                    archivosOcultos.add(carpeta);
                    }
                }
            }
        } else {
            System.out.println("La ruta proporcionada no es un directorio o no existe.");
        }
            return archivosOcultos;
    }
    
    public List<File> listarDirectoriosOcultos(){
        List<File> direcOcultos = new ArrayList<>();
        File carpeta = new File(ruta);

        // Verificar si la ruta existe y es un directorio
        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                // Si es un directorio y es oculto, añadirlo a la lista
                    if (archivo.isDirectory() && archivo.isHidden()) {
                        direcOcultos.add(archivo);
                    }
                }
            }
        }else {
                System.out.println("La ruta proporcionada no existe.");
        }
        return direcOcultos;
    }
    
}
