public class Employee {

    private int id;
    private String  name;
    private int salary;
    public int percent;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public  double raissalary( double percent){
        double raiseAmount=(percent/100)*this.salary;
        double newslaray=this.salary+raiseAmount;
        this.salary= (int) newslaray;
        return raiseAmount;
    }

    public int AnuualSalary(){

        int a = this.salary*12;
        return a;
    }


}
