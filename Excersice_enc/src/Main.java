import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       Account acount1 = new Account("12345","lama",1000);
       Account acount2 =new Account("6789","ahmed",2000);
       Account acount3 =new Account("101010","razan",3000);

        System.out.println("Accounts: ");
        System.out.println("ID :"+acount1.getId()+" name: "+acount1.getNeme()+" Balance: "+acount1.getBalance());
        System.out.println("ID :"+acount2.getId()+" name: "+acount2.getNeme()+" Balance: "+acount2.getBalance());
        System.out.println("ID :"+acount3.getId()+" name: "+acount3.getNeme()+" Balance: "+acount3.getBalance());
        int debite = acount1.debite(100);
        System.out.println("new balnce after debiten 100 :"+acount1.getBalance());
        int credit=acount2.credite(100);
        System.out.println("new balnce after credite 100 :"+acount2.getBalance());
        System.out.println("Enter the amount to transfare : ");
        int amount3= input.nextInt();
        int trans=acount3.transferTo(acount1,amount3);
        System.out.println("new balnce for acount3 :"+acount3.getBalance());
        System.out.println("new balnce for account 1 :"+acount1.getBalance());





        //employee

        Employee e1=new Employee(1234,"lamia",1000);
        Employee e2=new Employee(1234,"lena",2000);
        Employee e3=new Employee(1234,"ali",3000);

        System.out.println("Employee list: ");
        System.out.println("Id: "+e1.getId()+" name "+e1.getName()+" salary "+e1.getSalary()+" anuualSalary "+e1.AnuualSalary());
        System.out.println("Id: "+e2.getId()+" name "+e2.getName()+"salary "+e2.getSalary()+" anuualSalary "+e2.AnuualSalary());
        System.out.println("Id: "+e3.getId()+" name "+e3.getName()+" salary "+e3.getSalary()+" anuualSalary "+e3.AnuualSalary());
        int raise = (int) e2.raissalary(10);
        System.out.println("after raiesing: "+e2.getSalary());





    }
}