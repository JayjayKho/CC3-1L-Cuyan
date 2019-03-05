package rpg;


public class TestCharacter {
    
    public void test(){
        int turn = 1;
        
        Character char1 = new Character("Bob",0,0,0);
        Character char2 = new Character("Joe",0,0,0);       
        
        while(char1.getCurrentLife() > 0 || char2.getCurrentLife() > 0){
            System.out.println("ROUND " + turn);
            System.out.println(char1.getName() + ":" + char1.getCurrentLife());
            System.out.println(char2.getName() + ":" + char2.getCurrentLife());
            
            System.out.println(char1.getName() + " attacks " + char2.getName() + " for " + char1.attack());
            char2.wound(char1.attack());
            System.out.println(char2.getName() + " attacks " + char1.getName() + " for " + char2.attack());
            char1.wound(char2.attack());
            
            if(char1.getCurrentLife() <= 0 || char2.getCurrentLife() <=0){
                                
                if(char1.getCurrentLife() > char2.getCurrentLife()){
                    System.out.println(char1.getName() + " wins!");
                }
                
                else{
                    System.out.println(char2.getName() + " wins!");
                }               
                
                System.exit(0);
            }
            
            turn += 1;
        }
    }
}
