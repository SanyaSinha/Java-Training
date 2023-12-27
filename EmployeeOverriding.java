class Employee{
    int salary;
public void work()
    {
        System.out.println("PROJECT XYZ");
    }
public void get_salary(int salary)
{
   this.salary = this.salary +salary;
}
public void printSalary()
 {
    System.out.println("Salary is:" +salary);
 }
}
class HRManager extends Employee{
    int eno,emob;
    String ename;
    HRManager(){
        super.get_salary(70000);
    }

    public void work(){
          System.out.println("PROJECT STATUS");
    }
   public void addEmployee(){


    }
}


