/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Bruna Silveira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIAR 10 OBJETOS DA CLASS ALUNO USANDO O CONSTRUTOR CHEIO
        
        Aluno aluno01 = new Aluno( 999, " MATHEUS", "999");
        Aluno aluno02 = new Aluno( 2, " MATHEUS", "9999-8888");
        Aluno aluno03 = new Aluno( 3, " MATHEUS", "9999-8888");
        Aluno aluno04 = new Aluno( 4, " MATHEUS", "9999-8888");
        Aluno aluno05 = new Aluno( 5, " MATHEUS", "9999-8888");
        Aluno aluno06 = new Aluno( 6, " MATHEUS", "9999-8888");
        Aluno aluno07 = new Aluno( 7, " MATHEUS", "9999-8888");
        Aluno aluno08 = new Aluno( 8, " MATHEUS", "9999-8888");
        Aluno aluno09 = new Aluno( 9, " MATHEUS", "9999-8888");
        Aluno aluno10 = new Aluno( 10, "MATHEUS", "9999-8888");
        
        //objeto 'listaAlunos' pertence a classe 'ArraylList'
        //instanciando uma lista vazia que só   receberá objetos da 
        //classe Aluno
        //classe TIPADA ArrayList <T>
        
        ArrayList <Aluno> listaAluno = new ArrayList <Aluno>();
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
       //listaAluno.add("Aluno11"); ERRO - LISTA NEGRA
       //NÃO ACEITA STRING
       
       for(int j = 11; j<=15; j++){
       Aluno objAluno = new Aluno(j, "MATHEUS", "9999"+j+j);
       listaAluno.add(objAluno);
       }
       //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA USANDO FOR
       //MÉTODO SIZE RETORNA O TAMANHO DA LISTA
       
       for(int i = 0; i < listaAluno.size(); i++){
           System.out.println("Aluno " + listaAluno.get(i).getIdAluno() + " - " + listaAluno.get(i).getNome());
       }
        
        for(int i = 0; i < listaAluno.size(); i++){
           Aluno objAluno = listaAluno.get(i);
           System.out.println("Aluno " +objAluno.getIdAluno() + " - " + objAluno.getNome());
        }
        
        //Novos objetos definidos FORA DO FOR
        //DEU RUIM, PORQUE O OBJETO DEVE SER INSTANCIADO DENTRO DO FOR
        Aluno objAluno = new Aluno();
        for(int j = 11; j<=15; j++){
            objAluno.setIdAluno(j);
            objAluno.setNome("novo aluno"+j);
            objAluno.setCelular("85555");
            
        }
        Aluno objAluno2 = new Aluno();
        for(int k = 0; k<listaAluno.size(); k++){
          objAluno2 = listaAluno.get(k);
          if(objAluno2.getIdAluno() == 999)
                System.out.println("Encontrei o FDP " + objAluno2.getIdAluno());
        }
        
    }
}
        