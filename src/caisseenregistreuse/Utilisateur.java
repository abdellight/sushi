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
public class Utilisateur {
    private int num;
    private String login;
    private String pass;
    private int etat;
    public Utilisateur(int num, String login, String pass, int etat){
        this.num = num;
        this.login = login;
        this.pass = pass;
        this.etat = etat;
    }
    
    public int getEtat(){
        return etat;
    }
    
    public int getNum(){
        return num;
    }
    
    public String getLog(){
        return login;
    }
    
    public String getPass(){
        return pass;
    }
    
    public boolean equals(Utilisateur u) {
      return (u instanceof Utilisateur) && 
          ((Utilisateur)u).getNum()==(num) &&    
	  ((Utilisateur)u).getLog().equals(login) && 
	  ((Utilisateur)u).getPass().equals(pass);
    }
}
