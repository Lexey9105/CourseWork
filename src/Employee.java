import java.util.Objects;
import java.util.Arrays;

public class Employee {
    private static int count=1;
    private String worker;
    private int employDept;
    private int employeeSalary;
    private final int id;



    public  Employee(String worker,int employDept, int employeeSalary){
this.worker=worker;
this.employDept=employDept;
this.employeeSalary=employeeSalary;
this.id=count++;
    }

   // public static int generateRandomArray() {
        //java.util.Random random = new java.util.Random();
       // int x=random.nextInt(100_000) + 100_000;
      //  return  x;
   // }

public int getId(){return id;}
    public String getWorker(){return this.worker;}
    public int getEmployDept(){return this.employDept;}
    public int getEmployeeSalary(){return this.employeeSalary;}

    public String setWorker(String worker){return this.worker=worker;}
    public int setEmployDept(int employDept){return this.employDept=employDept;}
    public int setEmployeeSalary(int employeeSalary){return this.employeeSalary=employeeSalary;}

    public  String toString(){return "Работник "+worker+" работает в "+employDept+" отделе, зарплата "+employeeSalary;}
    public boolean equals(Object other){
        if(this==other)return true;
        if(other==null||this.getClass()!=other.getClass())return false;
        Employee employee=(Employee)other;
        return Objects.equals(worker,employee.worker)&&Objects.equals(employDept,employee.employDept)&&Objects.equals(employeeSalary,employee.employeeSalary);
    }
public int hashCod(){return Objects.hash(worker,employDept,employeeSalary);}


    }


