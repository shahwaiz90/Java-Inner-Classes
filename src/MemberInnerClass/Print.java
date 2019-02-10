package MemberInnerClass;

//Outer class
public class Print {
    PrintPreview printPreview;
    private String printType;
    private int totalPagesToPrint;

    public Print(String printType){
        this.printType  = printType;
        //Composition
        printPreview = new PrintPreview();
    }

    public Print(String printType, String method){
        this.printType  = printType;
    }

    public void setSlidesToPrint(int pagesToPrint){
        if(printPreview!=null){
            printPreview.setSlidesToPrint(pagesToPrint);
        }
    }

    public void printTheFile(){
        if(printPreview!=null){
            printPreview.printTheFile();
        }
    }

    //It can access private members and private methods of MemberInnerClass.Print class.
    //Not accessible out of this class.
    //Inner Class
    private class PrintPreview{

        void setSlidesToPrint(int pagesToPrint){
            totalPagesToPrint = pagesToPrint;
            System.out.println("Pages to MemberInnerClass.Print: "+totalPagesToPrint);
        }

        void printTheFile(){
            System.out.println("Printing your "+printType);
        }
    }

    //It can access private members and private methods of MemberInnerClass.Print class
    //This class is accessible from anywhere from the package/ folder's class due to its access modifier.
    //Inner Class
    public class PrinterSettings{
        public void setSlidesToPrint(int pagesToPrint){
            totalPagesToPrint = pagesToPrint;
            System.out.println("Pages to MemberInnerClass.Print: "+totalPagesToPrint);
        }

        public void printTheFile(){
            System.out.println("Printing your "+printType);
        }
    }
}
