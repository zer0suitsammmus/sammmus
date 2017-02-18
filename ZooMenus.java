
package zoomonitoringsystem;


public class ZooMenus {
    private String mainMenu = "";
    private String animalMenu = "";
    private String habitatMenu = "";
    
    void setMainMenu(String mainMenu) {
        
    }
    
    void setAnimalMenu(String animalMenu) {
        
    }
    
    void setHabitatMenu(String habitatMenu) {
        
    }
    
    String getMainMenu() {
        System.out.print("What would you like to do?" +"\n");
        
        System.out.print("Monitor:" +"\n");
        System.out.print("  -Animal" +"\n");
        System.out.print("  -Habitat" +"\n");
        System.out.print("Exit" +"\n");
        
        System.out.print("\n");
        
        System.out.print("Please enter an option: ");
        
        System.out.print("\n");
        return mainMenu;
    } 
    
    String getAnimalMenu() {
        System.out.print("Which animal would you like to monitor?" +"\n");
        
        System.out.print("  -Lion" +"\n");
        System.out.print("  -Tiger" +"\n");
        System.out.print("  -Bear" +"\n");
        System.out.print("  -Giraffe" +"\n");
        
        System.out.print("\n");
        
        System.out.print("Please enter an option: ");
        
        return animalMenu;
    }
    
    String getHabitatMenu() {
        System.out.print("Which habitat would you like to monitor?" +"\n");
        
        System.out.print("  -Penguin habitat" +"\n");
        System.out.print("  -Bird house" +"\n");
        System.out.print("  -Aquarium" +"\n");
        
        System.out.print("\n");
        
        System.out.print("Please enter an option:");
        
        return habitatMenu;
    }
    
    
    public ZooMenus() {
        String mainMenu = "none";
        String animalMenu = "none";
        String habitatMenu = "none";

    }
    
}
