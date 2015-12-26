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
public class Produit {
    private int num;
    private String type;
    private String contenu;
    private Double prix;
    private String description;
    
    public Produit(int num, String type, String contenu, Double prix, String Description){
        this.num = num;
        this.type = type;
        this.contenu = contenu;
        this.prix = prix;
        this.description = description;
    }
    
    public int getNum(){
        return num;
    }
    
    public String getType(){
        return type;
    }
    
    public String getContenu(){
        return contenu;
    }
    
    public Double getPrix(){
        return prix;
    }
    
    public String getDescription(){
        return description;
    }
    
    public boolean equals(Produit p) {
      return (p instanceof Produit) && 
	  ((Produit)p).getNum()==(num) && 
          ((Produit)p).getType().equals(type) &&
          ((Produit)p).getContenu().equals(contenu) &&
	  ((Produit)p).getPrix()==(prix)&& 
	  ((Produit)p).getDescription().equals(description);
    }
    
    public String toString(){
        return "Num: "+num+"\nType: "+type+"\nContenu: "+contenu+"\nPrix: "+prix+"\nDescription: "+description+"\n";
    }
}
