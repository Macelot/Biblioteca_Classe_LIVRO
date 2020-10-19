/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplobiblio.pacote;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("livros.txt");
        try {
            FileInputStream fr = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
            BufferedReader bf = new BufferedReader(isr);
            
            String linha;
            String[] dadosLivro;
            linha = bf.readLine();
            ArrayList<Livro> livros;
            livros = new ArrayList<>();
            Livro livro;
            while(true){
                linha = bf.readLine();
                if(linha==null){
                    break;
                }
                System.out.println(linha);
                livro = new Livro();
                dadosLivro=linha.split(";");
                if(dadosLivro.length==5){
                    livro.setId(Integer.parseInt(dadosLivro[0]));
                    livro.setTitulo(dadosLivro[1]);
                    livro.setAutor(dadosLivro[2]);
                    livro.setEditora(dadosLivro[3]);
                    livro.setQuantidade(Integer.parseInt(dadosLivro[4]));
                    livros.add(livro);
                }
                
            }
            bf.close();
            System.out.println("Temos "+livros.size());
            
            Scanner teclado;
            teclado = new Scanner(System.in);
            int opcao=0;
            livro=new Livro();
            for (;;) {
                System.out.println("Escolha uma opção");
                System.out.println("1 - Listar livros");
                System.out.println("2 - Listar livros por ordem de Titulo");
                System.out.println("3 - Listar livros por ordem de Autor");
                System.out.println("9 - Sair");
                
                opcao=teclado.nextInt();
                switch (opcao){
                    case 1:
                        livro.lista(livros);
                        break;
                    case 2:
                        livro.listaOrdenado(livros); 
                        break;
                    case 3:
                        livro.listaOrdenadoAutor(livros); 
                        break;    
                    case 9:
                        System.out.println("FIM");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Escolha outra opção");
                }
                        
                        
            }
            //1teclado.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
