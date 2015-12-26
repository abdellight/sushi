/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caisseenregistreuse;

import java.util.Date;



/**
 *
 * @author Abdelali
 */
public class Service {
    private int num;
    private Date debut;
    private Date fin;
    
    public Service(int num, Date debut, Date fin){
        this.num = num;
        this.debut = debut;
        this.fin = fin;
    }
    
    public int getNum(){
        return num;
    }
    
    public Date getDateDebut(){
        return debut;
    }
    
    public Date getDateFin(){
        return fin;
    }
    
    public boolean equals(Service s) {
      return (s instanceof Service) && 
	  ((Service)s).getNum() == num && 
	  ((Service)s).getDateDebut() == debut &&
          ((Service)s).getDateFin() == fin;
    }
    
    public String toString(){
        return "Num: "+num+"\nDate debut: "+debut.toString()+"\nDate fin: "+fin.toString();
    }
}