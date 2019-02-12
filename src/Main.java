import AnonymousInnerClass.IList;
import AnonymousInnerClass.Person;
import LocalInnerClass.Calculator;
import MemberInnerClass.Print;
import NestedInterface.Events;
import NestedInterface.View;
import StaticNestedCasses.BackgroundClass;

public class Main implements View{

    public static void main(String[] args) {

        Print printDocument = new Print("Document");
        //parent ka function call kar k oski inner class ko access kia
        System.out.println("\n\n***********Inner Class or Member Inner Class*************");
        System.out.println("\n------Accessing Directly from MemberInnerClass.Print Class----------");
        printDocument.setSlidesToPrint(12);
        printDocument.printTheFile();
        System.out.println("------------------------------------------------------");



        //Same Example, but from different approach.
        System.out.println("\n-------Accessing from outside World---------");
        Print printPicture = new Print("Picture", "awein");
        //reference parent.inner class ka rakha - lekin parent k object sy inner class ko initiate kia
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

        IList list = new IList() {
            private int element;

            @Override
            public void add(int a) {
                element = a;
            }

            @Override
            public int get() {
                return element;
            }
        };
        list.add(1);
        System.out.println("Anonymous Inner Class Get Element: "+list.get());

        //above code is equivalent to
        // class Main.$1 extends Person{
        //        @Override
        //        public void eat() {
        //            System.out.println("Man is eating.");
        //        }
        //
        //        @Override
        //        public void run() {
        //            System.out.println("Man is running.");
        //        }
        //}
        System.out.println("An object of anonymous class is created that is referred as man of Person Type");
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
        //University Object is not been created.
        //Benefit of using static nested class is that it doesn't have a reference of parent class.
        //means better garbage collection
        BackgroundClass.NetworkHit apiHitHome = new BackgroundClass.NetworkHit("HomeAPI");
        apiHitHome.setAPIAttempt(8);

        BackgroundClass.NetworkHit apiHitDashboard = new BackgroundClass.NetworkHit("DashboardAPI");
        apiHitDashboard.setAPIAttempt(4);

        System.out.println("\nGetting API Name: "+apiHitHome.getAPIName());
        System.out.println("Getting # of Attempts: "+apiHitHome.getNumberOfAttempts());

        System.out.println("\nGetting API Name: "+apiHitDashboard.getAPIName());
        System.out.println("Getting # of Attempts: "+apiHitDashboard.getNumberOfAttempts());


        System.out.println("------------------------------------------------------");

        System.out.println("\n\n***********Anonymous Class Implementing Nested Interface*************");
        Events events = new Events();
        //Below is your anonymous class implementing an interface.
        events.setOnClickListener(new View.onClickListener() {
            //Receiving Click Listener
            @Override
            public void onClick() {
                System.out.println("Event Clicked!!");
            }
        });
        events.setOnFocusListener(new View.onFocusChangeListener() {
            //Receiving Click Listener
            @Override
            public void onFocus() {
                System.out.println("Event is being Focused!!");
            }
        });
        events.setClicked();
        events.setFocused();
    }
}
