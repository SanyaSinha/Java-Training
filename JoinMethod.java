//join method
class MyThread extends Thread {
    public void run()
    {
        for(int i=1;i<=10;++i){
            System.out.println("ChildThread");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){}
        }
    }
    
}
class ThreadDemo{
    public static void main(String args[]) throws InterruptedException{
        MyThread c = new MyThread();
        c.start();
        c.join();
        for(int i=1;i<=10;++i){
           System.out.println("Main Thread");
        }
    }
}
