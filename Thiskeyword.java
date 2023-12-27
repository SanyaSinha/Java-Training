class Thiskeyword {
//     int a;
//     int b;
//     Thiskeyword(int a,int b){
//         a= a;                                              //here if we dont use this keyword then it gives a =0 and b=0 cause when object is created then the variable is intially initialized to zero
//         b= b;                
//     }
//     void display(){                                                   //correct version of this code is provided below
//         System.out.println("a=" +a+ " b=" +b);     
//     }
//     public static void main(String args[]){

//         Thiskeyword object= new Thiskeyword(40, 80);
//         object.display();
//     }
// }


//     int a;
//     int b;
//     Thiskeyword(int a,int b){
//         this.a= a;   
//         this.b=b;                                           
//     }
//     void display(){                                                   //first way correct version using this keyword
//         System.out.println("a=" +a+ " b=" +b);     
//     }
//     public static void main(String args[]){
//         Thiskeyword object= new Thiskeyword(40, 80);
//         object.display();
//     }

// }


int a,b,x,y;

    Thiskeyword(int x,int y){
        a= x;   
        b=y;                                           
    }
    void display(){                                                   //Second way correct version without using this keyword :)
        System.out.println("a=" +a+ " b=" +b);     
    }
    public static void main(String args[]){
        Thiskeyword object= new Thiskeyword(40, 80);
        object.display();
    }
}
