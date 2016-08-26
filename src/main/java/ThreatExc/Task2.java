/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreatExc;

/**
 *
 * @author umita
 */
public class Task2 extends Thread{
    
    public static Thread t;

    public static void main(String[] args)  {
        Task2.controller();
        Task2.next();
    }
    

        private static int n = 0;
       
        public static int next() {
           
            n++;
            n++;
          
           return n;
        }
        
        public static void controller(){
        
            Task2 ts = new Task2();
        
            n++;
            n++;
            
            System.out.println(ts.next());
        
        
        }
    }
    
    

