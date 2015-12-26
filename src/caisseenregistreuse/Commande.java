/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caisseenregistreuse;

/**
 *
 * @author Abdelali
 */
public class Commande {
    private int num;
    private int numService;
    private int numClient;
    
    public Commande(int num, int numService, int numClient){
        this.num = num;
        this.numService = numService;
        this.numClient = numClient;
    }
    
    public int getNum(){
        return num;
    }
    
    public int getNumService(){
        return numService;
    }
    
    public int getNumClient(){
        return numClient;
    }
    
    public boolean equals(Commande c) {
      return (c instanceof Commande) && 
	  ((Commande)c).getNum() == num && 
	  ((Commande)c).getNumClient()== numClient &&
          ((Commande)c).getNumService()== numService;
    }
    
    public String toString(){
        return "Num: "+num+"\nNumClient: "+numClient+"\nNumService "+numService;
    }
}
