/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Scanner;

/*import static java.lang.Math.abs;

/**
 * la classe main pour gérer le jeu
 * @author Groupe 14
 */


public class TestSeance6 {
    public static void main(String[] args) throws Exception {
    
    //String nomSauvegarde = null;
    //
    Scanner reponse = new Scanner(System.in);
    System.out.println("Bonjour !!");
    System.out.println("Voulez-vous charger une partie ? (oui ou non)");
    String rep = reponse.next();
    if("oui".equals(rep)){
         System.out.println("Veuillez mettre votre fichier de sauvegarde au même niveau que les dossiers src, target !!");
         System.out.println("Entrez le nom de votre fichier :");
         String nomFich = reponse.next();
         World w = new World(nomFich);
         int nbr_personne = 100;
         int nbr_monstre = 100;
         int nbr_objet = 500;
         w.setNbr_personne(nbr_personne);
         w.setNbr_monstre(nbr_monstre);
         w.setNbr_objet(nbr_objet);
         boolean tourdejeu = w.tourDeJeu();
    
    while(tourdejeu == false ){
        
        w.player.affiche();
        tourdejeu = w.tourDeJeu();
        
        if(w.player.personne.getPtVie()<=0){
            
            tourdejeu = true;
            System.out.println("######## Vous n'avez plus de point de vie, vous êtes mort monsieur "
                    +w.player.personne.getNom()+" ########");
        }
        
    }
    
    w.affiche();
    
    w.suvegarder_charte();
    System.out.println("Fin du jeu");
    }else{
        World w = new World();
        int nbr_personne = 500;
        int nbr_monstre = 500;
        int nbr_objet = 500;
        w.setNbr_personne(nbr_personne);
        w.setNbr_monstre(nbr_monstre);
        w.setNbr_objet(nbr_objet);
        boolean tourdejeu = w.tourDeJeu();
    
    while(tourdejeu == false ){
        
        w.player.affiche();
        tourdejeu = w.tourDeJeu();
        
        if(w.player.personne.getPtVie()<=0){
            
            tourdejeu = true;
            System.out.println("######## Vous n'avez plus de point de vie, vous êtes mort monsieur "
                    +w.player.personne.getNom()+" ########");
        }
        
    }
    
    w.affiche();
    
    w.suvegarder_charte();
    System.out.println("Fin du jeu");
    } 
    }   
}
