class Person_task1 {
    String name;
    int age;
}
class Person_task2{
    String name;
    int age;
    public void printDetails(){
        System.out.print("Name:" + this.name + " Age:" + this.age);
    }
}
class Person_task3{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Person_task4{
    private final String name;
    private final int age;
    Person_task4(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void printDetails(){
        System.out.print("Name:" + this.name + " Age:" + this.age);
    }
}