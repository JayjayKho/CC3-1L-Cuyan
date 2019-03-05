package rpg;


public class Character {
static Dice dice = new Dice();
    
    private String Name;
    private int Strength, Dex, Intel;
    
    private int Attack;
    private int CurrentLife;
    private int MaxLife;
    
    public Character(String n, int s, int d, int i){
        Name = n;
        Strength = s;
        Dex = d;
        Intel = i;
        
        MaxLife = dice.roll()+20;
        CurrentLife = MaxLife;
    }
    
    public int attack(){        
        Attack = dice.roll() + Strength;        
        return Attack;
    }
    
    public void wound(int damage){
        CurrentLife -= damage;
    }
    
    public void heal(int heal){        
        if(CurrentLife >= MaxLife){
            CurrentLife += heal;
        }
        else{
            System.out.println("HP Full.");
        }
    }
    
    public String getName(){
        return Name;
    }
    
    public int getStrength(){
        return Strength;
    }
    
    public int getDexterity(){
        return Dex;
    }
    
    public int getIntelligence(){
        return Intel;
    }
    
    public int getCurrentLife(){
        return CurrentLife;
    }
    
    public int getMaxLife(){
        return MaxLife;
    }
    
}
