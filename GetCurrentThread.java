//Program to get the current thread
class Demo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo t1=new Demo();
        Demo t2=new Demo();
        t1.start();
        t2.start();
    }
}