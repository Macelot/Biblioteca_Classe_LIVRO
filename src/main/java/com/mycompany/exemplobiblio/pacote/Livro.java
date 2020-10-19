/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplobiblio.pacote;

import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class Livro {
    private int id; 
    private String titulo;
    private String autor;
    private String editora;
    private int quantidade;

    public Livro() {
    }

    public Livro(int id, String titulo, String autor, String editora, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public void lista(ArrayList<Livro> ls){
        System.out.println("Lista de Livros");
        for (Livro l: ls) {
            System.out.println("Id.......: "+l.getId());
            System.out.println("Título...: "+l.getTitulo());
            System.out.println("Autor....: "+l.getAutor());
            System.out.println("Editora..: "+l.getEditora());
            System.out.println("Quant....: "+l.getQuantidade());
            System.out.println("------------------------------");
        }
    }
    
    public void listaOrdenado(ArrayList<Livro> ls){
        System.out.println("Ordem de Título");
        Livro temp;
        Livro[] lsO;
        lsO = new Livro[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            lsO[i]=ls.get(i);
        }
        for (int i = 0; i < lsO.length; i++) {
            for (int j = 0; j < lsO.length-1; j++) {
                String t1,t2;
                t1=lsO[j].getTitulo().trim();
                t2=lsO[j+1].getTitulo().trim();
                
                //System.out.println("t1 "+t1 +" "+t1.charAt(0)+"]");
                //System.out.println("t2 "+t2 +" "+t2.charAt(0)+"]");
                //se fosse
                //if(lsO[j].getId()>lsO[j+1].getId()){
                if(t1.charAt(0)>t2.charAt(0)){
                    temp=lsO[j];
                    lsO[j]= lsO[j+1];
                    lsO[j+1]=temp;
                }
            }
        }
        
        
        System.out.println("Lista de Livros");
        for (Livro l: lsO) {
            System.out.println("Id.......: "+l.getId());
            System.out.println("Título...: "+l.getTitulo());
            System.out.println("Autor....: "+l.getAutor());
            System.out.println("Editora..: "+l.getEditora());
            System.out.println("Quant....: "+l.getQuantidade());
            System.out.println("------------------------------");
        }
    }
    
    
    public void listaOrdenadoAutor(ArrayList<Livro> ls){
        System.out.println("Ordem de Autor");
        Livro temp;
        Livro[] lsO;
        lsO = new Livro[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            lsO[i]=ls.get(i);
        }
        for (int i = 0; i < lsO.length; i++) {
            for (int j = 0; j < lsO.length-1; j++) {
                String t1,t2;
                t1=lsO[j].getAutor().trim();
                t2=lsO[j+1].getAutor().trim();
                
                System.out.println("t1 "+t1 +" "+t1.charAt(0)+"]");
                System.out.println("t2 "+t2 +" "+t2.charAt(0)+"]");
                if(t1.charAt(0)>t2.charAt(0)){
                    System.out.println(" comparamos "+t1+" "+t2);
                    System.out.println("Trocar");
                    temp=lsO[j];
                    lsO[j]=lsO[j+1];
                    lsO[j+1]=temp;
                }
            }
        }
        
        
        System.out.println("Lista de Livros");
        for (Livro l: lsO) {
            System.out.println("Id.......: "+l.getId());
            System.out.println("Título...: "+l.getTitulo());
            System.out.println("Autor....: "+l.getAutor());
            System.out.println("Editora..: "+l.getEditora());
            System.out.println("Quant....: "+l.getQuantidade());
            System.out.println("------------------------------");
        }
    }
    

}
