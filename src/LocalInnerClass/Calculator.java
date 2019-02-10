package LocalInnerClass;

//Outer class
public class Calculator {
    private int firstOperand;
    private int secondOperand;

    public void initializeOperands(int a, int b){
        this.firstOperand   = a;
        this.secondOperand  = b;
    }

    public void sumWithXFactor(){
        int someValue = 2;
        //only accessible with in this method only.
        //Local Inner Class or Method local inner class
        class HelperClassForSum{
            private int getSomeSpecialValue(){
                //After millions of line of code we got 'somevalue'
                return someValue*2+firstOperand+secondOperand;
            }
        }

        HelperClassForSum helperClassForSum = new HelperClassForSum();

        //-->helperClassForSum.someValue;  Can't access local variables of method
        //because local variables are on stack and perish as soon as method ends.
        System.out.println("Total Sum with X Factor: "+helperClassForSum.getSomeSpecialValue());
    }

}
