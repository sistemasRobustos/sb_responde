/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas_robustos.ArrayIndexOutExceptionTableModel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class MainExemploUsuario {
    public static void main(String[] args) {
        DefaultTableModel tbVendas = new DefaultTableModel();
    
        tbVendas.addColumn("Data Venda");
        tbVendas.addColumn("Cliente");
        tbVendas.addColumn("Funcionario");
        tbVendas.addColumn("Total");
        
        String[] str = new String[]{null,null,null,null};
        
        tbVendas.addRow(str);
        
        tbVendas.setValueAt("Valor 0",0, 0);
        tbVendas.setValueAt("Valor 1",0, 1);
        tbVendas.setValueAt("Valor 2",0, 2);
        tbVendas.setValueAt("Valor 3",0, 3);
    }
}
