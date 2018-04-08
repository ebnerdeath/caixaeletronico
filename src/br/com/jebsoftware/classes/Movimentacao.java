/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jebsoftware.classes;

/**
 *
 * @author TitanNot
 */
public class Movimentacao {
    private String descricao;
    private float valor;
    private boolean credito;
    
    
    public Movimentacao() {
    
    }
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the credito
     */
    public boolean getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    
    
}
