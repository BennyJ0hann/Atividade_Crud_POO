package com.company;

public class Carros {

    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public String chassi;
    public int revisoes;
    public double km;

    public Carros(String modelo, String marca, int ano, String cor, String chassi){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;

        this.revisoes = 0;
        this.km = 0;

    }

}
