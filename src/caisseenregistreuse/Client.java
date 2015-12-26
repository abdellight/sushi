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
public class Client {
    private int numClient;
    private String nom;
    private String prenom;
    private String tel;
    
    public Client(int numClient, String nom, String prenom, String tel){
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }
    
    public int getNum(){
        return numClient;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getTel(){
        return tel;
    }
    
    public boolean equals(Client p) {
      return (p instanceof Client) && 
          ((Client)p).getNum()==(numClient) &&
	  ((Client)p).getNom().equals(nom) && 
	  ((Client)p).getPrenom().equals(prenom)&& 
	  ((Client)p).getTel().equals(tel);
    }
    
    public String toString(){
        return "Num: "+numClient+"\nNom: "+nom+"\nPrenom: "+prenom+"\nTel: "+tel+"\n";
    }
}
