
package pkg6.hafta.pkg6.pkg89;

import java.util.Scanner;


public class Hafta689 {

  
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        System.out.println("please enter a number");
        int a  =input.nextInt();
        
         
        System.out.println("please enter a number");
        int b  =input.nextInt();
        
      
        int ta=0 , tb=0;
       
        
       for(int i =1; i<a-1; i++){
                 
             if(a % i == 0){
                 ta=ta+1;
             }
       } 
         
             
                   
        for(int i =1; i<b-1; i++){
                 
             if(b % i == 0){
                 tb=tb+1;
             }
        }
       
           
        if( ta ==b && tb==a){
            System.out.println("Dost sayilar ");
        }  
        else{
         System.out.println("Dost sayilar degil");
        }  
        
          
       
    }
    
}
