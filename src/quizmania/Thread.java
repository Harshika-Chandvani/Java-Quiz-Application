/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package quizmania;

/**
 *
 * @author Harshika Chandvani
 */
class A extends Thread{
    public void run(){
        int i;
        for(i=0;i<100;i++){
            System.out.print("a\t");
        }
    }
}
class B extends Thread{
    public void run(){
        int i;
        for(i=0;i<100;i++){
            System.out.print("b\t");
        }
    }
}
class C extends Thread{
    public void run(){
        int i;
        for(i=0;i<100;i++){
            System.out.println(i+1+"\t");
        }
    }
}
public class Thread {

    public static void main(String[] args) {
        new A().run();
        new B().run();
        new C().run();
    }
}