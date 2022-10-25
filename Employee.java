public class Employee {
    //Attributes (Nitelikler)
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructor (Kurucu Metod)
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(double salary){
        if(salary<1000)
            return 0;
        else{
            return salary*0.03;
        }
    }

    public double bonus(int workHours){
        if(workHours>40){
            return 30*(workHours-40);
        }
        else
            return 0;
    }
    public double raiseSalary(Employee x){
        double salary = x.salary + tax(x.salary) + bonus(x.workHours);
        if(x.hireYear>2011)
            return salary*0.05;
        else if (x.workHours<2002)
            return salary*0.15;
        else
            return salary*0.1;
    }

    @Override
    public String toString() {
        System.out.println("Employee{" +
                "\nname='" + name + '\'' +
                "\nsalary=" + salary +
                "\nworkHours=" + workHours +
                "\nhireYear=" + hireYear +
                "\ntax=" + tax(this.salary) +
                "\nbonus=" + bonus(this.workHours) +
                "\nMaaş Artışı:" + raiseSalary(this) +
                "\nVergi ve Bonuslarla Birlikte Maaş:" + salary + tax(this.salary) + bonus(this.workHours) +
                "\nTotalSalary=" + salary + tax(this.salary) + bonus(this.workHours) + raiseSalary(this) +
                '}');
        return         "\nname='" + name + '\'' +
                "\nsalary=" + salary +
                "\nworkHours=" + workHours +
                "\nhireYear=" + hireYear +
                "\ntax=" + tax(this.salary) +
                "\nbonus=" + bonus(this.workHours) +
                "\nMaaş Artışı:" + raiseSalary(this) +
                "\nVergi ve Bonuslarla Birlikte Maaş:" + (salary + tax(this.salary) + bonus(this.workHours)) +
                "\nTotalSalary=" + (salary + tax(this.salary) + bonus(this.workHours) + raiseSalary(this)) ;
    }
}

