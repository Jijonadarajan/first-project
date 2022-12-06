/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricket;

/**
 *
 * @author jijon
 */
public class CRICKETT {
    String name;
    String age;
    
    void playing()
    {
        System.out.println("play cricket");
    }
    
}
class batting extends CRICKETT
{

    static batting kohli;
    String fifties;

    public batting(String fifties,String name,String age) {
        this.fifties = fifties;
        super.name=name;
        super.age=age;
    }
    
    @Override
    void playing(){
        System.out.println("mattaiyadi");
    }
}
class bowling extends CRICKETT
{

    static bowling bumrah;
    String wicket;

    public bowling(String wicket, String name,String age) {
        this.wicket = wicket;
        super.name=name;
        super.age=age;
        
    }
    @Override
    void playing()
    {
        System.out.println("bandhu veechu");
    }
}
    
    
    

    
    
    
    
