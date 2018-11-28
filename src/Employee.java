public class Employee {



    private String name;
    private int rate;
    private int hours;
    private int salary;
    private int bonuses;
    private static int totalHours;


    public Employee(){

    }

    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;


    }

    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.salary = rate * hours;
        totalHours = totalHours + this.hours;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }




        public void calculateBonuses(int rate, int salary) {

        bonuses = rate*100/salary;
        System.out.println("Bonuses: " + bonuses +"%");

    }

    public void outputSalary(){
        System.out.println("Salary: " + salary);
    }

    public void outputEmployee(){

        System.out.println("Name: " + name);
        System.out.println("Rate: " + rate);
        System.out.println("Hours: " + hours);
        System.out.println("Salary: " + salary);


    }

    public void outputotalHours(){
        System.out.println("totalHours: " + totalHours);
    }

}
