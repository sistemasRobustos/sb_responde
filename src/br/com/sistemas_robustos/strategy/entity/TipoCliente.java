/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas_robustos.strategy.entity;

import br.com.sistemas_robustos.strategy.desconto.Desconto;
import br.com.sistemas_robustos.strategy.desconto.DescontoEspecial;
import br.com.sistemas_robustos.strategy.desconto.DescontoMaster;
import br.com.sistemas_robustos.strategy.desconto.DescontoPremio;

/**
 *
 * @author felix
 */
public enum TipoCliente {
    PREMIO {
        @Override
        public Desconto getDesconto() {
            return new DescontoMaster();
        }
    },
    MASTER {
        @Override
        public Desconto getDesconto() {
            return new DescontoMaster();
        }
    },
    ESPECIAL{
        @Override
        public Desconto getDesconto() {
            return new DescontoEspecial();
        }
        
    }
    ;
    
    public abstract Desconto getDesconto();
}
