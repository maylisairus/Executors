package org.example;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        final int[] time = {0};
//        scheduler.scheduleAtFixedRate(()->{
//            System.out.println(time[0]);
//            time[0]++;
//        },0, 1, SECONDS);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        scheduler.shutdown();
//
//    }
//}
public class Main {
    public static void main(String [] args){
        for(int i=1;i<=15;i++){
            Thread t1 = new Thread(new checks(i));
            t1.start();
            Thread t2 = new Thread(new checks3(i));
            t2.start();
            Thread t3 = new Thread(new checks5(i));
            t3.start();
            Thread t4 = new Thread(new checks35(i));
            t4.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class checks3  implements  Runnable{
    private int x;
 public  checks3(int x){
     this.x = x;
 }
    @Override
    public void run() {
        if(x%3==0&&x%5!=0){
            System.out.println("fizz");
        }
    }
}
class checks5  implements  Runnable{
    private int x;
    public  checks5(int x){
        this.x = x;
    }
    @Override
    public void run() {
        if(x%5==0&&x%3!=0){
            System.out.println("bizz");
        }
    }
}
class checks35  implements  Runnable{
    private int x;
    public  checks35(int x){
        this.x = x;
    }
    @Override
    public void run() {
        if(x%3==0&&x%5==0){
            System.out.println("fizzbuzz");
        }
    }
}
class checks  implements  Runnable{
    private int x;
    public  checks(int x){
        this.x = x;
    }
    @Override
    public void run() {
        if(x%3!=0&&x%5!=0){
            System.out.println(x);
        }
    }
}