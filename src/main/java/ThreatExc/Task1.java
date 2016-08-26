/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreatExc;

public class Task1 {

    static int result = 0;

    public static void main(String[] args) throws InterruptedException {
        Task1.exc3();
    }

    public static void exc1() throws InterruptedException {

        for (int n = 0; n < 1000000000; n++) {
            for (int j = 0; j <= n; j++) {
                result = result + j;
            }
            System.out.println(result);
        }
    }

    public static void exc2() throws InterruptedException {
    
        for (int i = 0; i < 6; i++) {

            Thread.sleep(2000);
            System.out.println(i);
        }
    }
    
    public static void exc3() throws InterruptedException{
   
        for (int i = 10; i < 20; i++) {

            Thread.sleep(3000);
            System.out.println(i);
        }
    }
}
