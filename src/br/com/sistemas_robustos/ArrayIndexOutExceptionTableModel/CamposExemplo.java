/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas_robustos.ArrayIndexOutExceptionTableModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felix
 */
public class CamposExemplo {
    public static void main(String[] args) {
        List<String[]> listCampos = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            
            String[] campos = new String[]{null, null, null};

            campos[0]= "cam0 Linha "+i;
            campos[1]= "cam1 Linha "+i;
            campos[2]= "cam2 Linha "+i;
            
            listCampos.add(campos);
        }
        
        
        
        listCampos.stream().forEach(cam -> {
            System.out.println(cam[0]);
            System.out.println(cam[1]);
            System.out.println(cam[2]);
            System.out.println("-----------");
        });
    }
}
