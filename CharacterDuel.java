package rpg;
import java.util.*;


public class CharacterDuel {
    
    public static void main(String[] args) {
        //TestCharacter tc = new TestCharacter();
        //tc.test();
        
        Dice dice = new Dice();
        
        Wizard S = new Wizard("Sorcerer",6,8,10);
        Wizard C = new Wizard("Cleric",8,6,8);
        Wizard W = new Wizard("Wizard",6,7,9);       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pick your character: ");
        System.out.println("[1] Sorcerer  \n[2] Cleric  \n[3] Wizard ");
        int player = sc.nextInt();
        
        System.out.println("+-------------------------------------------------+");
        System.out.println("|               It's GAME TIME!                   |");
        System.out.println("|Pick your opponent and fight till the bitter end.|");
        System.out.println("+-------------------------------------------------+");
        System.out.println("[1] Sorcerer  \n[2] Cleric  \n[3] Wizard ");
        int opponent = sc.nextInt();
        
        while(opponent == player){
            System.out.println("Player taken! Try again.");
            opponent = sc.nextInt();
        }
        
        System.out.println("\nHere's your stats: ");
        if(player ==1){
            System.out.println("Strength: " + S.getStrength());
            System.out.println("Dexterity: " + S.getDexterity());
            System.out.println("Intelligence: " + S.getIntelligence());
            System.out.println("HP: " + S.getCurrentLife() + "\n");
            
            switch(opponent){
                case 2:
                    while(S.getCurrentLife() > 0 || C.getCurrentLife() > 0){                      
                        System.out.println(S.getName() + ":" + S.getCurrentLife());
                        System.out.println(C.getName() + ":" + C.getCurrentLife());
                        
                        ActionMenu();
                        int act = sc.nextInt();
                        if(act == 1){
                            System.out.println(S.getName() + " attacks " + C.getName());
                            C.wound(S.attack());
                            System.out.println(C.getName() + " attacks " + S.getName());
                            S.wound(C.attack());
                        }
                        else if(act == 2){
                            System.out.println(S.getName() + " casts magic to " + C.getName());
                            C.wound(S.castLightningBolt());
                            System.out.println(C.getName() + " hits " + S.getName() + " with a fireball");
                            S.wound(C.castLightningBolt());
                        }
                        else if(act == 3){
                             System.out.println(S.getName() + " heals self ");
                             S.castHeal();
                        }
                        else if(act == 4){
                            System.out.println(C.getName() + " attacks " + S.getName());
                            S.wound(C.attack() - dice.roll());
                        }
                        else{
                            sc.nextLine();
                        }
                        
                        if(S.getCurrentLife() <= 0 || C.getCurrentLife() <= 0){
                            if(S.getCurrentLife() > C.getCurrentLife()){
                                System.out.println(S.getName() + " wins!");
                            }
                
                            else{
                                System.out.println(C.getName() + " wins!");
                            }               
                
                            System.exit(0);
                        }
                    }
                    
                    break;
                case 3:
                    while(S.getCurrentLife() > 0 || W.getCurrentLife() > 0){
                        ActionMenu();
                        int act = sc.nextInt();
                        if(act == 1){//attack
                            System.out.println(S.getName() + " attacks " + W.getName());
                            W.wound(S.attack());
                            System.out.println(W.getName() + " attacks " + S.getName());
                            S.wound(W.attack());
                        }
                        else if(act == 2){//magic
                            System.out.println(S.getName() + " casts magic to " + W.getName());
                            W.wound(S.castLightningBolt());
                            System.out.println(W.getName() + " throws ice shards at " + S.getName());
                            S.wound(W.attack());
                        }
                        else if(act == 3){//heal
                            System.out.println(S.getName() + " heals self ");
                            S.castHeal();
                        }
                        else if(act == 4){
                            System.out.println(W.getName() + " attacks " + S.getName());
                            S.wound(W.attack() - dice.roll());
                        }
                        else{
                            sc.nextLine();
                        }
                        
                        if(S.getCurrentLife() <= 0 || W.getCurrentLife() <= 0){
                            if(S.getCurrentLife() > W.getCurrentLife()){
                                System.out.println(S.getName() + " wins!");
                            }
                
                            else{
                                System.out.println(W.getName() + " wins!");
                            }               
                
                            System.exit(0);
                        }
                    }
                    
                    break;
                default:
                    break;                     
            }
            
        }
        
        else if(player ==2){
            System.out.println("Strength: " + C.getStrength());
            System.out.println("Dexterity: " + C.getDexterity());
            System.out.println("Intelligence: " + C.getIntelligence());
            
            switch(opponent){
                case 1:
                    while(C.getCurrentLife() > 0 || S.getCurrentLife() > 0){                      
                        System.out.println(C.getName() + ":" + C.getCurrentLife());
                        System.out.println(S.getName() + ":" + S.getCurrentLife());
                        
                        System.out.println(S.getName() + " attacks " + C.getName());
                        C.wound(S.attack());
                        ActionMenu();
                        int act = sc.nextInt();
                        if(act == 1){                            
                            System.out.println(C.getName() + " attacks " + S.getName());
                            S.wound(C.attack());
                        }
                        else if(act == 2){
                            System.out.println(C.getName() + " casts fireball to " + S.getName());
                            S.wound(C.castLightningBolt());
                            System.out.println(S.getName() + " casts magic to " + C.getName());
                            C.wound(S.castLightningBolt());
                        }
                        else if(act == 3){
                            System.out.println(C.getName() + " heals self ");
                            C.castHeal();
                        }
                        else if(act == 4){
                            System.out.println(S.getName() + " attacks " + C.getName());
                            C.wound(S.attack() - dice.roll());
                        }
                        else{
                            sc.nextLine();
                        }
                        
                        if(C.getCurrentLife() <= 0 || S.getCurrentLife() <= 0){
                            if(C.getCurrentLife() > S.getCurrentLife()){
                                System.out.println(C.getName() + " wins!");
                            }
                
                            else{
                                System.out.println(S.getName() + " wins!");
                            }               
                
                            System.exit(0);
                        }
                    }
                    break;
                case 3:
                    while(C.getCurrentLife() > 0 || W.getCurrentLife() > 0){                      
                        System.out.println(C.getName() + ":" + C.getCurrentLife());
                        System.out.println(W.getName() + ":" + W.getCurrentLife());
                        
                        System.out.println(W.getName() + " attacks " + C.getName());
                        C.wound(W.attack());
                        ActionMenu();
                        int act = sc.nextInt();
                        if(act == 1){
                            System.out.println(C.getName() + " attacks " + W.getName());
                            W.wound(C.attack());                            
                        }
                        else if(act == 2){
                            System.out.println(C.getName() + " casts fireball to " + W.getName());
                            W.wound(C.castLightningBolt());
                            System.out.println(W.getName() + " throws ice shards at " + C.getName());
                            C.wound(W.attack());
                        }
                        else if(act == 3){
                            System.out.println(C.getName() + " heals self ");
                            C.castHeal();
                        }
                        else if(act == 4){
                            System.out.println(W.getName() + " attacks " + C.getName());
                            C.wound(W.attack() - dice.roll());
                        }
                        else{
                            sc.nextLine();
                        }
                        
                        if(C.getCurrentLife() <= 0 || W.getCurrentLife() <= 0){
                            if(C.getCurrentLife() > W.getCurrentLife()){
                                System.out.println(C.getName() + " wins!");
                            }
                
                            else{
                                System.out.println(W.getName() + " wins!");
                            }               
                
                            System.exit(0);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        
        else if(player ==3){
            System.out.println("Strength: " + W.getStrength());
            System.out.println("Dexterity: " + W.getDexterity());
            System.out.println("Intelligence: " + W.getIntelligence());
            
            switch(opponent){
                case 1:
                    while(W.getCurrentLife() > 0 || S.getCurrentLife() > 0){                      
                        System.out.println(W.getName() + ":" + W.getCurrentLife());
                        System.out.println(S.getName() + ":" + S.getCurrentLife());
                        
                        System.out.println(S.getName() + " attacks " + W.getName());
                        W.wound(S.attack());
                        ActionMenu();
                        int act = sc.nextInt();
                        if(act == 1){                            
                            System.out.println(W.getName() + " attacks " + S.getName());
                            S.wound(W.attack());
                        }
                        else if(act == 2){
                            System.out.println(W.getName() + " throws ice shards at " + S.getName());
                            S.wound(W.castLightningBolt());
                            System.out.println(S.getName() + " casts magic to " + W.getName());
                            W.wound(S.castLightningBolt());
                        }
                        else if(act == 3){
                            System.out.println(W.getName() + " heals self ");
                            W.castHeal();
                        }
                        else if(act == 4){
                            System.out.println(S.getName() + " attacks " + W.getName());
                            W.wound(S.attack() - dice.roll());
                        }
                        else{
                            sc.nextLine();
                        }
                        
                        if(W.getCurrentLife() <= 0 || S.getCurrentLife() <= 0){
                            if(W.getCurrentLife() > S.getCurrentLife()){
                                System.out.println(W.getName() + " wins!");
                            }
                
                            else{
                                System.out.println(S.getName() + " wins!");
                            }               
                
                            System.exit(0);
                        }
                    }
                    break;
                case 2:
                    while(W.getCurrentLife() > 0 || C.getCurrentLife() > 0){                      
                        System.out.println(W.getName() + ":" + W.getCurrentLife());
                        System.out.println(C.getName() + ":" + C.getCurrentLife());
                        
                        System.out.println(C.getName() + " attacks " + W.getName());
                        W.wound(C.attack());
                        ActionMenu();
                        int act = sc.nextInt();
                        if(act == 1){
                            System.out.println(W.getName() + " attacks " + C.getName());
                            C.wound(W.attack());                            
                        }
                        else if(act == 2){
                            System.out.println(W.getName() + " throws ice lance at " + C.getName());
                            C.wound(W.castLightningBolt());
                            System.out.println(C.getName() + " throws a fireball to " + W.getName());
                            W.wound(C.castLightningBolt());
                        }
                        else if(act == 3){
                            System.out.println(W.getName() + " heals self ");
                            W.castHeal();
                        }
                        else if(act == 4){
                            System.out.println(C.getName() + " attacks " + W.getName());
                            W.wound(C.attack() - dice.roll());
                        }
                        else{
                            sc.nextLine();
                        }
                        
                        if(W.getCurrentLife() <= 0 || C.getCurrentLife() <= 0){
                            if(W.getCurrentLife() > C.getCurrentLife()){
                                System.out.println(W.getName() + " wins!");
                            }
                
                            else{
                                System.out.println(C.getName() + " wins!");
                            }               
                
                            System.exit(0);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        
        else{
            System.out.println("Invalid input.");
        }
        
    }
    
    public static void ActionMenu(){
        System.out.println("What do you want to do?"
                + "\n[1] Attack"
                + "\n[2] Cast Magic"
                + "\n[3] Cast Heal"
                + "\n[4] Skip Turn");
    }  
    
    
}
