import AnonymousInnerClass.Person;
import LocalInnerClass.Calculator;
import MemberInnerClass.Print;
import StaticNestedCasses.University;

public class Main {

    public static void main(String[] args) {

        Print printDocument = new Print("Document");

        System.out.println("\n\n***********Inner Class or Member Inner Class*************");
        System.out.println("\n------Accessing Directly from MemberInnerClass.Print Class----------");

        printDocument.setSlidesToPrint(12);
        printDocument.printTheFile();

        //Same Example, but from different approach.
        System.out.println("\n-------Accessing from outside World---------");

        Print printPicture = new Print("Picture", "awein");
        Print.PrinterSettings printSettingsPicture = printPicture.new PrinterSettings();

        printSettingsPicture.setSlidesToPrint(6);
        printSettingsPicture.printTheFile();


        System.out.println("------------------------------------------------------");

        System.out.println("\n\n***********Local Inner Class or Method Local Inner Class*************");
        Calculator calculator = new Calculator();
        calculator.initializeOperands(8, 8);
        calculator.sumWithXFactor();

        System.out.println("------------------------------------------------------");

        System.out.println("\n\n***********Anonymous Inner Class*************");
        //by doing the following you are making an anonymous class which is overriding its parent class methods
        Person man = new Person() {

            @Override
            public void eat() {
                System.out.println("Man is eating.");
            }

            @Override
            public void run() {
                System.out.println("Man is running.");
            }
        };
        System.out.println("An object of anonymous class is created that is referred as man variable of Person Type");
        // This anonymous class is added as ClassFromWhichItIsBeingCalled$1 Main.$2, Main$3 and so on.
        man.eat();
        man.run();

        //Overriding only 1 method, the other one will be called from Person's class
        Person monkey = new Person() {
            @Override
            public void eat() {
                System.out.println("monkey is eating.");
            }
        };
        monkey.eat();
        monkey.run();


        System.out.println("------------------------------------------------------");

        System.out.println("\n\n***********Static Inner Class*************");
        University.Department csDepartment = new University.Department("CS");
        csDepartment.setDepartmentFaculty(8);

        University.Department civilDepartment = new University.Department("Civil");
        civilDepartment.setDepartmentFaculty(4);

        System.out.println("\nGetting Dept Name: "+csDepartment.getDepartmentName());
        System.out.println("Getting # of Faculty Members: "+csDepartment.getNumberOfFaculty());

        System.out.println("\nGetting Dept Name: "+civilDepartment.getDepartmentName());
        System.out.println("Getting # of Faculty Members: "+civilDepartment.getNumberOfFaculty());

    }
}
