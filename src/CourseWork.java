import java.util.Arrays;


public class CourseWork {

    public static String StringToPrint(String workerPrint){
        workerPrint=workerPrint.replace("null","" );
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        workerPrint=workerPrint.replace(",","" );
        return workerPrint;}


   // public static void StorageToString(Employee[] storage) {
        //for (int i = 0; i < storage.length; i++) {
            //System.out.println(storage[i]);
        //}
   // }

    public static String PrintName(Employee [] storage){
         String[] printWorker=new String[storage.length];
        for (int i=0;i<storage.length;i++){
            printWorker[i]=storage[i].getWorker();}
        String workerPrint=Arrays.toString(printWorker);
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        return workerPrint;
    }

    public static int MonthSalary(Employee[] storage){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){salaryMonth+=storage[i].getEmployeeSalary();}
        return salaryMonth;
    }

    public static String MinSalary(Employee[] storage) {
        int salaryMin=MonthSalary(storage);
        String workerMin="";
        for ( int i = 0; i < storage.length-1; i++){
            if (salaryMin>storage[i].getEmployeeSalary()){
             salaryMin=storage[i].getEmployeeSalary();}if (salaryMin==storage[i].getEmployeeSalary())
            workerMin=storage[i].getWorker()+storage[i].getEmployeeSalary();}
        return workerMin;}


    public static String MaxSalary(Employee[] storage) {
        int salaryMax=-1;
        String workerMax="";
        for (int i = 0; i < storage.length; i++){
            if (storage[i].getEmployeeSalary() > salaryMax){
                salaryMax=storage[i].getEmployeeSalary();}
            {if (salaryMax==storage[i].getEmployeeSalary())
            workerMax=storage[i].getWorker()+storage[i].getEmployeeSalary();}}
        return workerMax;
    }

    public static double AverageSalary(Employee[] storage){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){salaryMonth+=storage[i].getEmployeeSalary();}
        return (double)salaryMonth/storage.length;
    }

    public static  Employee [] IndexSalary(Employee[] storage){
        for (int i=0;i<storage.length;i++){storage[i].setEmployeeSalary(storage[i].getEmployeeSalary()+storage[i].getEmployeeSalary()/10);}
        return storage;
    }

    public static String MinDeptSalary(Employee[] storage,int x) {
        int salaryMin=MonthSalary(storage);
        String workerMin="";
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                if (storage[i].getEmployeeSalary() < salaryMin) {
                    if (salaryMin>storage[i].getEmployeeSalary()){
                        salaryMin=storage[i].getEmployeeSalary();}if (salaryMin==storage[i].getEmployeeSalary())
                        workerMin=storage[i].getWorker()+storage[i].getEmployeeSalary();} }
                }
        return workerMin;}

    public static String MaxDeptSalary(Employee[] storage,int x) {
        int salaryMax=-1;
        String workerMax="";
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getEmployDept() == x) {
                if (storage[i].getEmployeeSalary() > salaryMax){
                    salaryMax=storage[i].getEmployeeSalary();}
                {if (salaryMax==storage[i].getEmployeeSalary())
                    workerMax=storage[i].getWorker()+storage[i].getEmployeeSalary();}}}

        return workerMax;}

    public static int MonthDeptSalary(Employee[] storage,int x){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x)
            salaryMonth+=storage[i].getEmployeeSalary();}
        return salaryMonth;
    }

    public static double AverageDeptSalary(Employee[] storage,int x){
        int salaryMonth=0;
        int [] v=new int[storage.length];
        int a=0;
        int b=0;
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x){
            salaryMonth+=storage[i].getEmployeeSalary();
            v[i]=storage[i].getEmployeeSalary();if(v[i]!=0){b=b+1;}}
            }return (double)salaryMonth/b;}

    public static  Employee [] IndexDeptSalary(Employee[] storage,int x,int a){
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x)
            storage[i].setEmployeeSalary(storage[i].getEmployeeSalary()+storage[i].getEmployeeSalary()/a);
        }return storage;}

    public static String PrintDeptName(Employee[] storage,int x){
        int b=0;
        String [] v=new String[storage.length];
        String[] printWorker=new String[b];
        for (int i=0;i<storage.length;i++) {
            if (storage[i].getEmployDept() == x) {
                v[i]=storage[i].getWorker()+storage[i].getEmployeeSalary();if(v[i]!=null){b=b+1;}}}
        String workerPrint=Arrays.toString(v);
        return StringToPrint(workerPrint);}

    public static String MinWorkSalary(Employee[] storage,int x){
        String [] v=new String[storage.length];
        for(int i=0;i<storage.length;i++){if(storage[i].getEmployeeSalary()<x)
        {v[i]=storage[i].getId()+storage[i].getWorker()+storage[i].getEmployeeSalary();}}
        String workerPrint=Arrays.toString(v);
        return StringToPrint(workerPrint);}

    public static String MaxWorkSalary(Employee[] storage,int x){
        String [] v=new String[storage.length];
        for(int i=0;i<storage.length;i++){if(storage[i].getEmployeeSalary()>=x)
        {v[i]=storage[i].getId()+storage[i].getWorker()+storage[i].getEmployeeSalary();}}
        String workerPrint=Arrays.toString(v);
        return StringToPrint(workerPrint);}




    public static    void main (String[] args){

         Employee[] storageW = new Employee[12];
        storageW[0] = new Employee(" Кутин Владимир ", 1, 1000000);
        storageW[1] = new Employee(" Кутина Василиса ", 1, 999999);
        storageW[2] = new Employee(" Пупкина Александра ", 1, 700000);
        storageW[3] = new Employee(" Петрова Екатерина ", 2, 300000);
        storageW[4] = new Employee(" Александров Александр ", 2, 190000);
        storageW[5] = new Employee(" Степанов Станислав ", 3, 85000);
        storageW[6] = new Employee(" Иванова Анастасия ", 3, 65000);
        storageW[7] = new Employee(" Бурунов Владимир ", 4, 30000);
        storageW[8] = new Employee(" Трофимов Никита ", 4, 35000);
        storageW[9] = new Employee(" Назарбек Хасан ", 5, 85000);
        storageW[10] = new Employee(" Мансурбек Бибол ", 5, 81000);
        storageW[11] = new Employee(" Уламбек Нуруло ", 5, 100000);

        EmployeeBook storage=new EmployeeBook();
        storage.addWorker(" Кутин Владимир ", 1, 1000000);
        storage.addWorker(" Кутина Василиса ", 1, 999999);
        storage.addWorker(" Пупкина Александра ", 1, 700000);
        storage.addWorker(" Петрова Екатерина ", 2, 300000);
        storage.addWorker(" Александров Александр ", 2, 190000);
        storage.addWorker(" Степанов Станислав ", 3, 85000);
        storage.addWorker(" Иванова Анастасия ", 3, 65000);
        storage.addWorker(" Бурунов Владимир ", 4, 30000);
        storage.addWorker(" Трофимов Никита ", 4, 35000);
        storage.addWorker(" Назарбек Хасан ", 5, 85000);
        storage.addWorker(" Мансурбек Бибол ", 5, 81000);
        storage.addWorker(" Уламбек Нуруло ", 5, 100000);




                //StorageToString(storageW);
                System.out.println(MonthSalary(storageW));
                System.out.println(MinSalary(storageW));
                System.out.println(MaxSalary(storageW));
                System.out.println(AverageSalary(storageW));
                System.out.println(PrintName(storageW));
                IndexSalary(storageW);


                System.out.println(MinDeptSalary(storageW,5));
                System.out.println(MaxDeptSalary(storageW, 5));
                System.out.println(MonthDeptSalary(storageW, 2));
                System.out.println(AverageDeptSalary(storageW, 2));

                IndexDeptSalary(storageW,5,10);
                System.out.println(PrintDeptName(storageW, 5));


                System.out.println(MinWorkSalary(storageW, 50000));
                System.out.println(MaxWorkSalary(storageW, 50000));
storage.printDeptWorker(5);

        storage.StorageToString();
       storage.IndexSalary();
       storage.MinDeptSalary(5);
        storage.MaxDeptSalary(5);
        storage.MonthDeptSalary( 5);
        storage.AverageDeptSalary(5);
        storage.PrintDeptName(5);
            }
    }

