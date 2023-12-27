class MyThread extends Thread {
    public void run()
    {
        for(int i=1;i<=10;++i){
            System.out.println("ChildThread");
            Thread.yield();
        }
    }
    
}
class ThreadDemo{
    public static void main(String args[]){
        MyThread c = new MyThread();
        c.start();
        for(int i=1;i<=10;++i){
           System.out.println("Main Thread");
        }
    }
}
