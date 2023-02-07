/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_28
 */
public  abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double MONEY;
    private double ATK;
    public double getHP(){
        return HP;
    }
    public void setHP(double HP){
        if(this.HP < 0){
            this.HP = 0;
        }
        else{
            this.HP = HP;
        }
        
        
     
    }
    public double getMP(){
        return MP;
    }
    public void setMP(double MP){
        this.MP = MP;
    }
    public  double getEXP(){
        return EXP;
    }
    public void setEXP(double EXP){
        this.EXP = EXP; 
     }
    public double getMONEY(){
        return MONEY;
    }
    public void setMONEY(double MONEY){
        this.MONEY = MONEY;
    }
    public double getATK(){
        return ATK;
    }
    public void setATK(double ATK){
        this.ATK = ATK;
    }
    @Override
    public String toString(){
        return "HP "+getHP()+ " Mp : "+ getMP()+" ATK : "+ getATK();
    }
    public abstract void attack(Player P);
    public abstract void attacked (double n);
}
