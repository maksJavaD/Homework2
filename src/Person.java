class Person{

    private String name;
    private int age;
    private int birthYear;
    private static int CurrentYear;

    static{
        CurrentYear = 2018;

    }

    public Person(){


    }

    public Person(String name){
        this.name = name;

    }

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        age = CurrentYear - birthYear;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setBirthYear(int birthYear){

            this.birthYear = birthYear;
    }

    public void outputPerson(){

        System.out.printf("Name: %s \n", name);
        System.out.printf("birthYear: %d \n", birthYear);
    }

    public void agePerson(){
        System.out.printf("Age: %d \n", age);

    }





}