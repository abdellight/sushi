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
public class CommandeProduit {
    private int numProduit;
    private int numCommande;
    private int qte;
    
    public CommandeProduit(int numProduit, int numCommande, int qte){
        this.numCommande = numCommande;
        this.numProduit = numProduit;
        this.qte = qte;
    }
    
    public int getNumCommande(){
        return numCommande;
    }
    
        public int getNumProduit(){
        return numProduit;
    }
        
    public int getQte(){
        return qte;
    }
}
