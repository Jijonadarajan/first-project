/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cricket;

import static cricket.batting.kohli;
import static cricket.bowling.bumrah;

/**
 *
 * @author jijon
 */
public class Cricket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        batting.kohli=new batting("67","kohli","34");
        System.out.println("batsman name is"+kohli.name);
        kohli.playing();
        bowling.bumrah=new bowling("50","bumrah","32");
        bumrah.playing();
    }
    
}
