/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author Fran
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Video v[] = new Video[3];
      v[0] = new Video("Aula 1 de POO");
      v[1] = new Video("Aula 12 de PHP");
      v[2] = new Video("Aula 10 de Java");  
        
      Aluno a[] = new Aluno[2];
      a[0] = new Aluno("Jubileu", 22, "M", "juba");
      a[1] = new Aluno ("Joana", 12, "F", "joanita");
      
      Visualizacao vis [] = new Visualizacao [5];
      vis[0] = new Visualizacao(a[0], v[2]); //Jubileu assiste Java
      vis[0].avaliar();
      System.out.println(vis[0].toString());
      
      vis[1] = new Visualizacao(a[0], v[1]); //Jubileu assiste PHP
      vis[1].avaliar(87.0f);
      System.out.println(vis[1].toString());
      
      vis [2] = new Visualizacao(a[1], v[0]); //Joana assiste POO
      vis [2].avaliar();
      System.out.println(vis[2].toString());
      
      vis[3] = new Visualizacao(a[1], v[2]); //Joana assiste Java
      vis[3].avaliar(35.0f);
      System.out.println(vis[3].toString());    
    }   
}
