/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;


import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author sergio
 */
public class ProcesarArchivo  implements Serializable{
    
    public boolean Validar(final String path){
        //Path dir = Paths.get(path);
        if (path != null && path.trim().isEmpty()==false) {
            return Paths.get(path).toFile().isDirectory();   
        }
        return false;
    }
    
    public List<String> ObtenerCSV(String path) throws IOException{
        if (Validar(path)) {
        List<String> lista = null;
        try (Stream<Path> paths = Files.walk(Paths.get(path), 0)) {//el 0 es para que solo vea los directorios
            lista = paths.filter(a-> 
                    Files.isRegularFile(a)&&Files.isWritable(a)&&Files.isReadable(a)&&a.toString().endsWith(".csv")).map(p-> 
                            p.toString()).collect(Collectors.toList());//filtrando y enviando a la lista los paths +

           
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
        }
        return null;
    }
    
    public List<List<String>> parser(final String path, final boolean saltarLinea, final String separador) throws IOException{
        List<List<String>> listado=new ArrayList<>();  //Algo asi como que una lista multidimensional
        
        if (Validar(path)) { //llamamos al metodo validar que creamos
            try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines.skip(saltarLinea?1:0).filter(l->l.contains(separador)).
                    forEach(s -> {
                String[] separado = s.split(separador);   
                listado.add(Arrays.asList(separado));
                    });
            return listado;
            }
        }
        
        return null;
    }
    }


