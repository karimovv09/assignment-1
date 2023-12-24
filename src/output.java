public class output {
    private static void task1(){
        Person_task1 p = new Person_task1();
        p.name="Sam";
        p.age=20;
        System.out.println("Name:" + p.name + "Age:"+p.age);
    }
    private static void task2(){
        Person_task2 p = new Person_task2();
        p.name="Sam";
        p.age=20;
        p.printDetails();
    }
    private static void task3(){
        Person_task3 p = new Person_task3();
        p.setName("Sam");
        p.setAge(20);
        System.out.println("Name:" + p.getName() + "Age:"+ p.getAge());
    }
    private static void task4(){
        Person_task4 p = new Person_task4("Sam",20);
        p.printDetails();
    }
    public static void main(String[] args){
        task4();
    }
}
