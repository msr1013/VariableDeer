package Salary;

public class Employee {
    private double salary;
    private int hoursOfWorkPerDay;

    public void getInfo(double salary, int hoursOfWorkPerDay){
        this.salary=salary;
        this.hoursOfWorkPerDay=hoursOfWorkPerDay;
    }

    public void addSal(){
        if (this.salary<3){
            this.salary+=5;
        }
        else{
            this.salary=this.salary;
        }
    }

    public void addWork(){
        if(this.hoursOfWorkPerDay>6){
            this.salary+=10;
        }
        else{
            this.salary=this.salary;
        }
    }

    public void displaySalary(){
        System.out.println("the total salary is :" + this.salary);
    }
}
