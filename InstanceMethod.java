class InstanceMethod {
    int a=6;        //can be written here
        int b=5;
    void add(){
        // int a=6; can be written here
        // int b=5;
        System.out.println("printing the sum: " +(a+b));
    }
    void display(){
        System.out.println("THIS IS NON STATIC METHOD");
    }
    public static void main(String args[]){
        // int a=6;   cannot be written here
        // int b=5;
        InstanceMethod i = new InstanceMethod();
        i.add();
        i.display();
    }
}
