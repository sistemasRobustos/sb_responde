/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas_robustos.strategy;

import br.com.sistemas_robustos.strategy.desconto.Desconto;
import br.com.sistemas_robustos.strategy.entity.Cliente;
import br.com.sistemas_robustos.strategy.entity.TipoCliente;

/**
 *
 * @author felix
 */
public class Main {
    public static void main(String[] args) {
//        criar uma class abstrata para calcular desconto cliente .
//        criar um enum de TipoCliente.
//        criar uma class cliente com o atributo TipoCliente.

//        falar de add mais um
//        caso todos os descontos forem iguais
//        falar in e cod



        Cliente clientePremio = new Cliente("Anderson", TipoCliente.ESPECIAL);
        
        Cliente clienteMaster = new Cliente("Pessoa 2", TipoCliente.MASTER);
        
        
        Desconto descontoPremio = clientePremio.getTipoCliente().getDesconto();
        
        System.out.println("Cliente: "+ clientePremio.getNome());
        System.out.println("Valor desconto: "+ descontoPremio.calculaDesconto(200));
//        
        System.out.println("-----------------");
        
        Desconto descontoMaster = clienteMaster.getTipoCliente().getDesconto();
        
        System.out.println("Cliente: "+ clienteMaster.getNome());
        System.out.println("Valor desconto: "+ descontoMaster.calculaDesconto(200));

        
        
    }
}
