/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_listNombreImpaire.pkg2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exercice2_listNombreImpaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,n=0;
        System.out.println("Entrer your number");
        n = sc.nextInt();
        while (i<n){
            if (i%2!=0){
                System.out.println(i);
                i=i+1;
           
            }
            else{
                 i=i+1;            }    
        }
            
        
        }
        
    }
    

