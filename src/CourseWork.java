import java.util.Arrays;


public class CourseWork {


    public static void storageToString(Employee[] storage) {
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    public static String printName(Employee[] storage){
        String[] printWorker=new String[storage.length];
        for (int i=0;i<storage.length;i++){
            printWorker[i]= storage[i].getWorker();}
        String workerPrint=Arrays.toString(printWorker);
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        return workerPrint;
    }

    public static int monthSalary(Employee[] storage){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){salaryMonth+=storage[i].getEmployeeSalary();}
        return salaryMonth;
    }

    public static int MinSalary(Employee[] storage) {
        int salaryTotal = 0;
        int salaryMin=0;
        for (int i = 0; i < storage.length; i++) {
            salaryTotal += storage[i].getEmployeeSalary();
            salaryMin=salaryTotal;}
        for (int i = 0; i < storage.length; i++){
            if (storage[i].getEmployeeSalary() < salaryMin)
                salaryMin = storage[i].getEmployeeSalary();}
        return salaryMin;
    }

    public static int MaxSalary(Employee[] storage) {
        int salaryMax=-1;
        for (int i = 0; i < storage.length; i++){
            if (storage[i].getEmployeeSalary() > salaryMax)
                salaryMax = storage[i].getEmployeeSalary();}
        return salaryMax;
    }

    public static int averageSalary(Employee[] storage){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){salaryMonth+=storage[i].getEmployeeSalary();}
        return salaryMonth/storage.length;
    }

    public static  Employee [] indexSalary(Employee[] storage){
        for (int i=0;i<storage.length;i++){storage[i].setEmployeeSalary(storage[i].getEmployeeSalary()+storage[i].getEmployeeSalary()/10);}
        return storage;
    }

    public static int MinDeptSalary(Employee[] storage,int x) {
        int salaryTotal = 0;
        int salaryMin = 0;
        for (int i = 0; i < storage.length; i++) {
            salaryTotal += storage[i].getEmployeeSalary();
            salaryMin = salaryTotal;}
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                if (storage[i].getEmployeeSalary() < salaryMin) {
                    salaryMin = storage[i].getEmployeeSalary();}
                }
        }return salaryMin;}

    public static int MaxDeptSalary(Employee[] storage,int x) {
        int salaryMax=-1;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                if (storage[i].getEmployeeSalary() > salaryMax) {
                    salaryMax = storage[i].getEmployeeSalary();
                } }
        }return salaryMax;}

    public static int monthDeptSalary(Employee[] storage,int x){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x)
            salaryMonth+=storage[i].getEmployeeSalary();}
        return salaryMonth;
    }

    public static int averageDeptSalary(Employee[] storage,int x){
        int salaryMonth=0;
        int [] v=new int[storage.length];
        int a=0;
        int b=0;
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x){
            salaryMonth+=storage[i].getEmployeeSalary();
            v[i]=storage[i].getEmployeeSalary();if(v[i]!=0){b=b+1;}}
            }return salaryMonth/b;}

    public static  Employee [] indexDeptSalary(Employee[] storage,int x,int a){
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x)
            storage[i].setEmployeeSalary(storage[i].getEmployeeSalary()+storage[i].getEmployeeSalary()/a);
        }return storage;}

    public static String printDeptName(Employee[] storage,int x){
        int b=0;
        String [] v=new String[storage.length];
        String[] printWorker=new String[b];
        //int[] printSalary=new int[b];
        for (int i=0;i<storage.length;i++) {
            if (storage[i].getEmployDept() == x) {
                v[i]=storage[i].getWorker()+storage[i].getEmployeeSalary();if(v[i]!=null){b=b+1;}}}
        String workerPrint=Arrays.toString(v);
        workerPrint=workerPrint.replace("null","" );
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        workerPrint=workerPrint.replace(",","" );
        return workerPrint;}

    public static String MinWorkSalary(Employee[] storage,int x){
        String [] v=new String[storage.length];
        for(int i=0;i<storage.length;i++){if(storage[i].getEmployeeSalary()<x)
        {v[i]=storage[i].getId()+storage[i].getWorker()+storage[i].getEmployeeSalary();}}
        String workerPrint=Arrays.toString(v);
        workerPrint=workerPrint.replace("null","" );
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        workerPrint=workerPrint.replace(",","" );
        return workerPrint;}

    public static String MaxWorkSalary(Employee[] storage,int x){
        String [] v=new String[storage.length];
        for(int i=0;i<storage.length;i++){if(storage[i].getEmployeeSalary()>=x)
        {v[i]=storage[i].getId()+storage[i].getWorker()+storage[i].getEmployeeSalary();}}
        String workerPrint=Arrays.toString(v);
        workerPrint=workerPrint.replace("null","" );
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        workerPrint=workerPrint.replace(",","" );
        return workerPrint;}




            public static void main (String[] args){
                Employee[] storage = new Employee[12];
                storage[0] = new Employee(" Кутин Владимир ", 1, 1000000);
                storage[1] = new Employee(" Кутина Василиса ", 1, 999999);
                storage[2] = new Employee(" Пупкина Александра ", 1, 700000);
                storage[3] = new Employee(" Петрова Екатерина ", 2, 300000);
                storage[4] = new Employee(" Александров Александр ", 2, 190000);
                storage[5] = new Employee(" Степанов Станислав ", 3, 85000);
                storage[6] = new Employee(" Иванова Анастасия ", 3, 65000);
                storage[7] = new Employee(" Бурунов Владимир ", 4, 30000);
                storage[8] = new Employee(" Трофимов Никита ", 4, 35000);
                storage[9] = new Employee(" Назарбек Хасан ", 5, 85000);
                storage[10] = new Employee(" Мансурбек Бибол ", 5, 81000);
                storage[11] = new Employee(" Уламбек Нуруло ", 5, 100000);



                System.out.println(printName(storage));
                System.out.println(monthSalary(storage));
                System.out.println(MinSalary(storage));
                System.out.println(MaxSalary(storage));
                System.out.println(averageSalary(storage));

                indexSalary(storage);
                storageToString(storage);
                int x = 1;
                for (int i = 0; i < storage.length; i++) {
                    if (storage[i].getEmployDept() == x) {
                        System.out.println(storage[i]);
                        ;
                    } else break;
                }
                System.out.println(MinDeptSalary(storage,5));
                System.out.println(MaxDeptSalary(storage, 5));
                System.out.println(monthDeptSalary(storage, 2));
                System.out.println(averageDeptSalary(storage, 2));

                indexDeptSalary(storage,5,10);
                storageToString(storage);
                System.out.println(printDeptName(storage, 4));


                System.out.println(MinWorkSalary(storage, 50000));
                System.out.println(MaxWorkSalary(storage, 50000));

            }
    }

