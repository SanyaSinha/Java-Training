class Setname extends Thread{
    public void run(){
        System.out.println("run() method");
    }
    public static void main(String args[]){
        Setname t1=new Setname();
        Setname t2=new Setname();
        System.out.println("Name of t1: " +t1.getName());
      System.out.println("Name of t2: " +t2.getName());

        t1.start();
        t2.start();
        t1.setName("Khushi");
                System.out.println("new Name of t1: " +t1.getName());
                System.out.println("new Name of t2: " +t2.getName());


    }
}