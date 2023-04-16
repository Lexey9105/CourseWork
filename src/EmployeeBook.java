import java.util.Arrays;

public class EmployeeBook {
    private static final int EmployeeCell = 12;
    private static final int dept=5;
    public Employee[] storage = new Employee[EmployeeCell];

    public String StringToPrint(String workerPrint) {
        workerPrint = workerPrint.replace("null", "");
        workerPrint = workerPrint.replace("[", "");
        workerPrint = workerPrint.replace("]", "");
        workerPrint = workerPrint.replace(",", "");
        return workerPrint;
    }


    public void StorageToString() {
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    public void PrintName() {
        String[] printWorker = new String[storage.length];
        for (int i = 0; i < storage.length; i++) {
            printWorker[i] = storage[i].getWorker();
        }
        String workerPrint = Arrays.toString(printWorker);
        workerPrint = workerPrint.replace("[", "");
        workerPrint = workerPrint.replace("]", "");
        System.out.println(workerPrint);
    }

    public void MonthSalary() {
        int salaryMonth = 0;
        for (int i = 0; i < storage.length; i++) {
            salaryMonth += storage[i].getEmployeeSalary();
        }
        System.out.println(salaryMonth);
    }

    public void MinSalary() {
        int salaryMin = 0;
        String workerMin = "";
        for (int i = 0; i < storage.length - 1; i++) {salaryMin+=storage[i].getEmployeeSalary();
            if (salaryMin > storage[i].getEmployeeSalary()) {
                salaryMin = storage[i].getEmployeeSalary();
            }
            if (salaryMin == storage[i].getEmployeeSalary())
                workerMin = storage[i].getWorker() + storage[i].getEmployeeSalary();
        }
        System.out.println(workerMin);
    }


    public void MaxSalary() {
        int salaryMax = -1;
        String workerMax = "";
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployeeSalary() > salaryMax) {
                salaryMax = storage[i].getEmployeeSalary();
            }
            {
                if (salaryMax == storage[i].getEmployeeSalary())
                    workerMax = storage[i].getWorker() + storage[i].getEmployeeSalary();
            }
        }
        System.out.println(workerMax);
    }

    public void AverageSalary() {
        int salaryMonth = 0;
        for (int i = 0; i < storage.length; i++) {
            salaryMonth += storage[i].getEmployeeSalary();
        }
        System.out.println((double) salaryMonth / storage.length);
    }

    public void IndexSalary() {
        for (int i = 0; i < storage.length; i++) {
            storage[i].setEmployeeSalary(storage[i].getEmployeeSalary() + storage[i].getEmployeeSalary() / 10);
            System.out.println(storage[i].getEmployeeSalary());}
    }

    public void MinDeptSalary( int x) {
        int salaryMin = 3000000;
        String workerMin = "";
        for (int i = 0; i < storage.length; i++) {//salaryMin+=storage[i].getEmployeeSalary();
            if (storage[i].getEmployDept() == x) {
                    if (salaryMin > storage[i].getEmployeeSalary()) {
                        salaryMin = storage[i].getEmployeeSalary();
                    }
                    if (salaryMin == storage[i].getEmployeeSalary())
                        workerMin = storage[i].getWorker() + storage[i].getEmployeeSalary();
            }
        }
        System.out.println(workerMin);
    }

    public void MaxDeptSalary( int x) {
        int salaryMax = -1;
        String workerMax = "";
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                if (storage[i].getEmployeeSalary() > salaryMax) {
                    salaryMax = storage[i].getEmployeeSalary();
                }
                {
                    if (salaryMax == storage[i].getEmployeeSalary())
                        workerMax = storage[i].getWorker() + storage[i].getEmployeeSalary();
                }
            }
        }

        System.out.println(workerMax);
    }

    public void MonthDeptSalary( int x) {
        int salaryMonth = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x)
                salaryMonth += storage[i].getEmployeeSalary();
        }
        System.out.println(salaryMonth);
    }

     public void AverageDeptSalary( int x) {
        int salaryMonth = 0;
        int[] v = new int[storage.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                salaryMonth += storage[i].getEmployeeSalary();
                v[i] = storage[i].getEmployeeSalary();
                if (v[i] != 0) {
                    b = b + 1;
                }
            }
        }
         System.out.println((double) salaryMonth / b);
     }

    public void IndexDeptSalary( int x, int a) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x)
                storage[i].setEmployeeSalary(storage[i].getEmployeeSalary() + storage[i].getEmployeeSalary() / a);
            System.out.println(storage[i].getEmployeeSalary());
        }

    }

    public void PrintDeptName( int x) {
        int b = 0;
        String[] v = new String[storage.length];
        String[] printWorker = new String[b];
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                v[i] = storage[i].getWorker() + storage[i].getEmployeeSalary();
                if (v[i] != null) {
                    b = b + 1;
                }
            }
        }
        String workerPrint = Arrays.toString(v);
        System.out.println(StringToPrint(workerPrint));
    }

    public void MinWorkSalary(Employee[] storage, int x) {
        String[] v = new String[storage.length];
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployeeSalary() < x) {
                v[i] = storage[i].getId() + storage[i].getWorker() + storage[i].getEmployeeSalary();
            }
        }
        String workerPrint = Arrays.toString(v);
        System.out.println(StringToPrint(workerPrint));
    }

    public void MaxWorkSalary(Employee[] storage, int x) {
        String[] v = new String[storage.length];
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployeeSalary() >= x) {
                v[i] = storage[i].getId() + storage[i].getWorker() + storage[i].getEmployeeSalary();
            }
        }
        String workerPrint = Arrays.toString(v);
        System.out.println(StringToPrint(workerPrint));
    }

    private int freeCell() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void addWorker(String worker, int employDept, int employeeSalary) {
        int index = freeCell();
        if (index == -1) {
            System.out.println("Хранилище заполнено");
        } else {
            storage[index] = new Employee(worker, employDept, employeeSalary);
        }
    }
    public void DeleteCell(int id){
        for (int i=0;i<storage.length;i++){if(storage[i].getId()==id){
        storage[i]=null;}
        }
    }

    public void changeDeptSalary(int employDept, int employeeSalary,int id){
        for (int i=0;i<storage.length;i++){if(storage[i].getId()==id){
            storage[i].setEmployDept(employDept);
            storage[i].setEmployeeSalary(employeeSalary);
        }}
    }
    public void printDeptWorker(int dept){
        for (int i=0;i<storage.length;i++){
            if(storage[i].getEmployDept()==dept){
                System.out.println("Департамент: "+storage[i].getEmployDept()+" ФИО: "+storage[i].getWorker());
            }
        }
    }
}
