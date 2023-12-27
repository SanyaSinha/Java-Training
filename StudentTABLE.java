import java.util.*;
class StudentTABLE {                  //crud operation
    
    int rollno[] =new int[5];
    String sname[] = new String[5] ,add[]= new String[5],mob[]= new String[5];
    static int i=0;
    Scanner sc =new Scanner(System.in);

    public void inputData(){
        System.out.println("Enter Roll No: ");
        rollno[i] = sc.nextInt();
        System.out.println("Enter Name: ");
        sname[i] = sc.next();
        System.out.println("Enter Mobile: ");
        mob[i]= sc.next();
        System.out.println("Enter Address: ");
        add[i]= sc.next();
        ++i;        //to store next set of inputData for rollno,name,mob no,address of next set of student
    }

    public void showInfo(){
        System.out.println("RollNo\tSname\tMobile\tAddress");
        System.out.println("-------------------------------------------");
        for(int k =0;k<i;++k){
            System.out.println(rollno[k]+"\t"+sname[k]+"\t"+mob[k]+"\t"+add[k]);
        }
    }

    public void updateInfo(){
        String nname,nmob,nadd;
        System.out.println("Enter roll no: ");
        int rno =sc.nextInt();
        for(int k=0; k<i; ++k){
            if (rno==rollno[k]) {
                System.out.println("your data is: ");
                System.out.println("1. Name: "+sname[k]);
                System.out.println("2. Mobile: "+mob[k]);
                System.out.println("3. Address: "+add[k]);
                System.out.println("make ur choice to update data: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter new name: ");
                        nname = sc.next();
                        sname[k]=nname;
                        break;
                    case 2:
                        System.out.println("Enter new mobile: ");
                        nmob = sc.next();
                        mob[k]=nmob;
                        break;
                    case 3:
                        System.out.println("Enter new address: ");
                        nadd = sc.next();
                        add[k]=nadd;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                System.out.println("your data is updated");
            }
        }

    }
    
    public void delInfo(){
        // String nname,nmob,nadd;
        System.out.println("Enter roll no: ");
        int rno =sc.nextInt();
        for(int k=0; k<i; ++k){
            if(rno==rollno[k]){
                int loc=k;
                for(int j = loc;j<1;++j){
                    rollno[j]=rollno[j+1];
                    sname[j]=sname[j+1];
                    add[j]=add[j+1];
                }
                System.out.println("data deleted!!");
                --i;

            }
        }
    }


    public static void main(String[] args) {
        StudentTABLE m = new StudentTABLE();
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("1.Enter New Info");
            System.out.println("2.Show Info");
            System.out.println("3.Update Info");
            System.out.println("4.Delete Info");
            System.out.println("5.Exit");
            System.out.println("Select an option");
            int ch = sc1.nextInt();
            // 
            switch (ch) {
                case 1:
                    m.inputData();
                    break;
                case 2:
                    m.showInfo();
                    break;
                case 3:
                    m.updateInfo();
                    break;
                case 4:
                    m.delInfo();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}