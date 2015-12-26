/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caisseenregistreuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Abdelali
 */
public class Bdd {
    private static String url = "jdbc:mysql://localhost:3306/centralsushi";
    private static String login = "root";
    private static String passwd = "root";
    private static Connection cn =null;
    private static Statement st =null;
    private static ResultSet rs =null;
    
    public static void main(String[] args) {
        /* Connexion à la base de données */    
       
    }

    public Boolean ConnexionUtilisateur(String log, String pass) {
       Boolean in = false;
       try {
            // Etape 1 : Chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            // Etape 2 : récupération de la connexion
            cn = DriverManager.getConnection(url, login, passwd);
            // Etape 3 : Création d'un statement
            st = cn.createStatement();
            String sql = "SELECT * FROM utilisateur where login='"+log+"' and pass='"+pass+"'";

            rs = st.executeQuery(sql);
            int i = 0;
            while (rs.next()) {
                System.out.println(rs.getString(1));
                i++;
            }
            
            if(i!=0)
                in=true;
            
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                // TODO: handle exception
                e.printStackTrace();
        } finally {
            try {
            // Etape 6 : libérer ressources de la mémoire.
                    cn.close();
                    st.close();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
       return in;
    }
    public ArrayList getCommandes() {
       ArrayList a = new ArrayList();
       try {
            // Etape 1 : Chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            // Etape 2 : récupération de la connexion
            cn = DriverManager.getConnection(url, login, passwd);
            // Etape 3 : Création d'un statement
            st = cn.createStatement();
            String sql = "SELECT * FROM commande";
            int i = 0;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Commande c = new Commande(rs.getInt("ID"),rs.getInt("ID_SERVICE"),rs.getInt("ID_CLIENT"));
                a.add(c);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                // TODO: handle exception
                e.printStackTrace();
        } finally {
            try {
            // Etape 6 : libérer ressources de la mémoire.
                    cn.close();
                    st.close();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
       return a;
    }
}
