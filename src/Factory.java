public class Factory {
    //instance variables
    //only use public for instance variables
    public String owner = "Isabel";

    //todo: make 2 varaible called isOpen and yearFounded.
    //What data type do you need? and give the variables values
    public boolean isOpen = true;
    public int yearFounded = 2026;
    public Donuts donutOrder1;
    public Donuts donutOrder2;
    //todo: make a new donut called donuts order 2
    //only do he monopoly box creation.

    //class -> blueprints
    //object -> is the house
    
    public static void main(String[] args) {
        Factory a = new Factory();

    }

    //special method: constructor
    //name has to be the same name as class
    //you do noy say void
    public Factory(){
        System.out.println("Welcome to Isabel's factory");
        System.out.println("the factory was founded in");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");

        //make an object of type Donuts
        donutOrder1 = new Donuts();
        donutOrder1.numberOfDonuts= donutOrder1.numberOfDonuts + 1;
        System.out.println("the amount of donuts are " + donutOrder1.numberOfDonuts);
        System.out.println("it is " + donutOrder1.hasFilling + " that the donut has filling");
        System.out.println("the type of filling is " + donutOrder1.frostingType);

        donutOrder2 = new Donuts();
        //todo: sout the donutsOrder 2 instance vars
        //bonus: give the variables context
        donutOrder2.numberOfDonuts = donutOrder1.numberOfDonuts * 2;
        System.out.println("the amount of donuts in this order are " + donutOrder2.numberOfDonuts);
        System.out.println("it is " + donutOrder2.hasFilling + " that the this donut order has filling");
        System.out.println("the type of filling is " + donutOrder2.frostingType);








        //todo: print all of the instance variables of donuts
        //extra challenge: have words print that explain what the variable is


    }
}
