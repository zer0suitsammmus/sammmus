
package zoomonitoringsystem;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;



public class ZooMonitoringSystem {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Users\\Samantha\\Documents\\NetBeansProjects\\ZooMonitoringSystem\\src\\zoomonitoringsystem\\ZooAnimals.txt");
        Scanner scnr2 = new Scanner(System.in);
        
        
        Scanner scnr = new Scanner(text);
        String zooText = "";
        ZooMenus main = new ZooMenus();
        boolean upperCase = !zooText.equals(zooText.toLowerCase());
        
         
   
        System.out.print(main.getMainMenu());
        zooText = scnr2.next();
            
        System.out.print("\n");
        
        while (!zooText.equals("Exit")) {
            
            switch(zooText) {
                case "Exit":
                    System.out.println("Have a nice day! Goodbye!");
                    break;
                    
                case "exit": 
                    System.out.println("ERROR: INVALID ENTRY. Please try again.");
                    break;
                
                case "Back":
                    System.out.print(main.getMainMenu() +"\n");
                    zooText = scnr2.next();
                    break;
                
                case "back":
                    System.out.print("ERROR: INVALID ENTRY. Please try again.");
                    break;
                
                case "animal":
                    System.out.println("ERROR: INVALID ENTRY. Please try again.");
                    break;
                
                case "Animal":
                  System.out.println(main.getAnimalMenu());
                  zooText = scnr2.next();
              
                      String f1;
                    
                      while (scnr.hasNextLine()) {
                        f1 = scnr.nextLine();
                        if (f1.contains(zooText)) {
                           
                            System.out.print(f1 +"\n");
                            f1 = scnr.nextLine();
                            System.out.print(f1 +"\n");
                            f1 = scnr.nextLine();
                            System.out.print(f1 +"\n");
                            f1 = scnr.nextLine();
                            System.out.print(f1 +"\n");
                            f1 = scnr.nextLine();
                            System.out.print(f1 +"\n");
                            System.out.print("\n");
                            
                        }
                        
                     }
 
                    break;
                    
                           
            }      
                    
                    
    }
               

                    

                

            


        
        

    
  
        
    
    }
}

