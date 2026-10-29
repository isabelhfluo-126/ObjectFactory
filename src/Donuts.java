public class Donuts {
    //class: blueprints for the things we want to make

    //instance variables
    //todo:make the three comments into variables. think about the data types
    //frosting type
    public String frostingType;
    //is there a filling or no filling
    public boolean hasFilling;
    //how many donuts
    public int numberOfDonuts;

    //constructor
    //method
    //don't say void
    //has to match exactly the name of class
    public Donuts(int pNumberOfDonuts){
        frostingType = "boston Creme";
        hasFilling = true;
        numberOfDonuts = pNumberOfDonuts;
    }//end of donut constructor

    //todo:make a method called printInfo
    public void printInfo(){
        //a sout is System.out.println. the exam would require context
        //todo:use souts to print the instance variables
        System.out.println("the frosting type is " + frostingType);
        System.out.println("it is " + hasFilling + " that the donut has filling");
        System.out.println("there are " + numberOfDonuts + " donuts");

    }



}//end of donuts class
