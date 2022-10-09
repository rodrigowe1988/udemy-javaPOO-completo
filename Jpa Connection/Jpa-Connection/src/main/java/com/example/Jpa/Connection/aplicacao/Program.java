package com.example.Jpa.Connection.aplicacao;

import com.example.Jpa.Connection.dominio.Pessoa;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Rodrigo Weber", "rodrigo@email.com");
        Pessoa p2 = new Pessoa(2, "Rogério Weber", "rogerio@email.com");
        Pessoa p3 = new Pessoa(3, "Aline Bays", "aline@email.com");
        Pessoa p4 = new Pessoa(4, "Rafa Rosseti", "rafaela@email.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
