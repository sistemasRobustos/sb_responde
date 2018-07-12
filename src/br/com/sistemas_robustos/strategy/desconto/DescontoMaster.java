/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas_robustos.strategy.desconto;

/**
 *
 * @author felix
 */
public class DescontoMaster implements Desconto{

    @Override
    public float calculaDesconto(float valor) {
        return (valor * 20) /100;
    }
    
}
