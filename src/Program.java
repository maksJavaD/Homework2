public class Program{

    public static void main(String[] args) {

        Person undef = new Person();
        undef.outputPerson();

        Person tom = new Person("Tomas", 1990);
        tom.outputPerson();
        tom.agePerson();

        Person bob = new Person("Bob", 1992);
        bob.outputPerson();
        bob.agePerson();




        Employee mark = new Employee("Mark",200, 10);
        mark.outputEmployee();


        Employee ann = new Employee("Ann", 150, 20);
        ann.outputEmployee();

        Employee kate = new Employee("Kate",100, 15);
        kate.outputEmployee();


        kate.calculateBonuses(100, 1500);

        ann.outputotalHours();



    }



}
