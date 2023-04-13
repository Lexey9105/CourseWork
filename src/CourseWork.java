import java.util.Arrays;


public class CourseWork {

    public static String StringToPrint(String workerPrint){
        workerPrint=workerPrint.replace("null","" );
        workerPrint=workerPrint.replace("[","" );
        workerPrint=workerPrint.replace("]","" );
        workerPrint=workerPrint.replace(",","" );
        return workerPrint;}


    public static void storageToString(Employee[] storage) {
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    public static String printName(Employee [] storage){
         String[] printWorker=new String[storage.length];
        for (int i=0;i<storage.length;i++){
            printWorker[i]=storage[i].getWorker();}
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

    public static String MinSalary(Employee[] storage) {
        int salaryMin=monthSalary(storage);
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

    public static double averageSalary(Employee[] storage){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){salaryMonth+=storage[i].getEmployeeSalary();}
        return (double)salaryMonth/storage.length;
    }

    public static  Employee [] indexSalary(Employee[] storage){
        for (int i=0;i<storage.length;i++){storage[i].setEmployeeSalary(storage[i].getEmployeeSalary()+storage[i].getEmployeeSalary()/10);}
        return storage;
    }

    public static String MinDeptSalary(Employee[] storage,int x) {
        int salaryMin=monthSalary(storage);
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

    public static int monthDeptSalary(Employee[] storage,int x){
        int salaryMonth=0;
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x)
            salaryMonth+=storage[i].getEmployeeSalary();}
        return salaryMonth;
    }

    public static double averageDeptSalary(Employee[] storage,int x){
        int salaryMonth=0;
        int [] v=new int[storage.length];
        int a=0;
        int b=0;
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x){
            salaryMonth+=storage[i].getEmployeeSalary();
            v[i]=storage[i].getEmployeeSalary();if(v[i]!=0){b=b+1;}}
            }return (double)salaryMonth/b;}

    public static  Employee [] indexDeptSalary(Employee[] storage,int x,int a){
        for (int i=0;i<storage.length;i++){if (storage[i].getEmployDept() == x)
            storage[i].setEmployeeSalary(storage[i].getEmployeeSalary()+storage[i].getEmployeeSalary()/a);
        }return storage;}

    public static String printDeptName(Employee[] storage,int x){
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


                storageToString(storage);
                System.out.println(monthSalary(storage));
                System.out.println(MinSalary(storage));
                System.out.println(MaxSalary(storage));
                System.out.println(averageSalary(storage));
                System.out.println(printName(storage));
                indexSalary(storage);


                System.out.println(MinDeptSalary(storage,5));
                System.out.println(MaxDeptSalary(storage, 5));
                System.out.println(monthDeptSalary(storage, 2));
                System.out.println(averageDeptSalary(storage, 2));

                indexDeptSalary(storage,5,10);
                System.out.println(printDeptName(storage, 5));


                System.out.println(MinWorkSalary(storage, 50000));
                System.out.println(MaxWorkSalary(storage, 50000));

            }
    }

