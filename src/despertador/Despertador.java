/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author vit
 */
public class Despertador {
static boolean pausa = false;
public static Player pl;

    /**
     * @throws java.io.FileNotFoundException
     * @throws javazoom.jl.decoder.JavaLayerException
     */
    public static void despertado()throws FileNotFoundException, JavaLayerException, InterruptedException {

         pl = new Player(new FileInputStream("c:/du_hast.mp3"));


   new Thread() {
         public void run() {
            try {
               while (true) {
                  if (!pausa) {
                     if (!pl.play(5)) {
                        break;
                     }
                  }
               }
            } catch (JavaLayerException e) {
               e.printStackTrace();
            }
         }
      }.start();

      Thread.sleep(25000);
      pausa = true;
      System.out.println("pausado");
      //Thread.sleep(3000);
      pausa = false;
      System.out.println("No hago nada! ");
      
   
      
      
      
      
        // TODO code application logic here
    }
    public void pararalarm(){}
    
}
