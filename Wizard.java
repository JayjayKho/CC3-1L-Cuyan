package rpg;


public class Wizard extends Character {
    
    private int MaxMagic;
    private int CurrentMagic;
    
    public Wizard(String n, int s, int d, int i){    
      super(n, s, d, i);  
        
      MaxMagic = 15 + dice.roll();
      CurrentMagic = MaxMagic;
      
    }
    
    public int castLightningBolt(){
        if(CurrentMagic >= 5){
            CurrentMagic -= 5;
            return dice.roll() + super.getIntelligence();
        }
        
        else{
            return 0;
        }
    }
    
    public int castHeal(){
        int amountHealed = 0;
        if(CurrentMagic >= 8){
            CurrentMagic -= 8;
            amountHealed = dice.roll() + super.getIntelligence();
            super.heal(amountHealed);
        }
        return amountHealed;
    }
    
    public int getMaxMagic(){
       return MaxMagic;
    }
    
    public int getCurrentMagic(){
        return CurrentMagic;
    }
    
    
}
