/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jebsoftware.classes;

import java.util.ArrayList;

/**
 *
 * @author TitanNot
 */
public class ContaCorrente {
    private int numero;
    private float saldo;
    private boolean especial;
    private float limite;
    //private Movimentacao movimentacao;
    private ArrayList<Movimentacao> lista_de_movimentacoes = new ArrayList<>();
    
    public ContaCorrente() {
    
    }

    public ContaCorrente(int numero, float saldo, boolean especial, float limite, ArrayList<Movimentacao> lista_de_movimentacoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.lista_de_movimentacoes = lista_de_movimentacoes;
    }

    
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     * @param movimentacao
     */
    public void setSaldo(float saldo,Movimentacao movimentacao) {
        this.saldo = saldo;
        if(movimentacao != null){
            this.lista_de_movimentacoes.add(movimentacao);
        }
    }

    /**
     * @return the especial
     */
    public boolean isEspecial() {
        return especial;
    }

    /**
     * @param especial the especial to set
     */
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }

    /**
     * @return the lista_de_movimentacoes
     */
    public ArrayList<Movimentacao> getLista_de_movimentacoes() {
        //for (Movimentacao lista_de_movimentacoe : lista_de_movimentacoes) {
        //    System.out.println("Valor: "+lista_de_movimentacoe.getValor());
        //}
        return lista_de_movimentacoes;
        
        
    }

    
}
