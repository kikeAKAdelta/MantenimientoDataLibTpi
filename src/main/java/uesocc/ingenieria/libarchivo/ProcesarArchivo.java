/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.libarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergio
 */
public class ProcesarArchivo  implements Serializable{
    public boolean validarArchivo(String path){
        FileReader lector;
        boolean salida = false;
        try {
            lector = new FileReader(path);
            try {
                int codigo = lector.read();
                while (codigo != -1) {
                    char letra = (char)codigo;
                    codigo = lector.read();
                }    
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally{
                lector.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
        return salida;
    }
    public ArrayList<Object> LeerArchivo(String path){
        ArrayList<Object> lista = new ArrayList<>();
        File archivo = new File(path);
        FileReader lector;
        try {
            lector = new FileReader(archivo);
            BufferedReader br = new BufferedReader(lector);
            
            String cadena, vectorcadena[];
            try {
                while ((cadena = br.readLine())!=null) {
                    vectorcadena = cadena.split(",");
                    lista.addAll(Arrays.asList(vectorcadena));
                }
//                for (Iterator<Object> it = lista.iterator(); it.hasNext();) {
//                    String string = it.next().toString();
//                    System.out.println(string);
//                }
                
               
            } catch (Exception ex) {
                Logger.getLogger(ProcesarArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                br.close();
                lector.close();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProcesarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    }


