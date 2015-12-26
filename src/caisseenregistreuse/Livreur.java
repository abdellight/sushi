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
public class Livreur {
    private int num;
    private String nom;
    private String prenom;
    private String tel;
    private int etat;
    
    public Livreur(int num, String nom, String prenom, String tel, int etat){
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.etat = etat;
    }
    
    public int getNum(){
        return num;
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
    
    public int getEtat(){
        return etat;
    }
    
    public void modifEtat(){
        if(etat==0)
            etat = 1;
        else
            etat = 0;
    }
    
    public boolean equals(Client c) {
      return (c instanceof Client)&& 
          ((Client)c).getNum()==(num)&&
	  ((Client)c).getNom().equals(nom)&& 
	  ((Client)c).getPrenom().equals(prenom)&& 
	  ((Client)c).getTel().equals(tel);
    }
    
    public String toString(){
        return "Num: "+num+"\nNom: "+nom+"\nPrenom: "+prenom+"\nTel: "+tel+"\nEtat: "+etat;
    }
}
