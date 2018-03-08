/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;

import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.util.ArrayList;
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
            return Paths.get(path).toFile().exists();   
        }
        return false;
    }
    
    public List<String> ObtenerCSV(final String a) throws IOException{
        List<String> lista = null;
        try (Stream<Path> paths = Files.walk(Paths.get(a))) {
            lista = paths.map(p -> {
            if (Files.isRegularFile(p) && p.toString().endsWith(".csv")) {
                return p.toString(); 
            }else{
                return "";
            }
            })
            .collect(Collectors.toList());
            lista.remove("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
    
    public List<List<String>> parser(String path, boolean saltarLinea, String separador) throws IOException{
        List<List<String>> listado=new ArrayList<List<String>>();  //Algo asi como que una lista multidimensional
        
        if (Validar(path)) { //llamamos al metodo validar que creamos
            
            Files.lines(Paths.get(path)).skip(saltarLinea?1:0).
                    filter(L -> L.contains(separador))
                    .forEach(L -> {
            String[] sepa=L.split(separador);
        });  
            
            
            
        }
        
        return listado;
    }
    
    
//    public ArrayList<Object> LeerArchivo(String path){
//        ArrayList<Object> lista = new ArrayList<>();
//        File archivo = new File(path);
//        FileReader lector;
//        try {
//            lector = new FileReader(archivo);
//            BufferedReader br = new BufferedReader(lector);            
//            String cadena, vectorcadena[];
//            try {
//                while ((cadena = br.readLine())!=null) {
//                    vectorcadena = cadena.split(",");
//                    lista.addAll(Arrays.asList(vectorcadena));
//                }
////                for (Iterator<Object> it = lista.iterator(); it.hasNext();) {
////                    String string = it.next().toString();
////                    System.out.println(string);
////                }               
//            } catch (Exception ex) {
//                Logger.getLogger(ProcesarArchivo.class.getName()).log(Level.SEVERE, null, ex);
//            }finally{
//                br.close();
//                lector.close();
//            }       
//        } catch (Exception ex) {
//            Logger.getLogger(ProcesarArchivo.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        return lista;
//    }
    
    }


