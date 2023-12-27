class A{
    public static synchronized void showName(String name){  {
        for(int i=0;i<3;i++){                                                 
        System.out.println("Batting : " +name);    //a method named showName is defined
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }

    }
}
}
class MyThread1 extends Thread{
    public void run(){
        A.showName("Khushi");
    }
}
class MyThread2 extends Thread{
    public void run(){
        A.showName("Noopur");
    }
}
class MyThread3 extends Thread{
    public void run(){
        A.showName("Prapti");
    }
}
class BattingSYNCHRONIZATION{
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
        new MyThread3().start();
    }
}