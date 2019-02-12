package StaticNestedCasses;

public class BackgroundClass {

    BackgroundClass(){
        System.out.println("BackgroundClass Created!!");
    }

    public static class NetworkHit{
        String name;
        int numberOfAttempts;
        NetworkHit(){
            System.out.println("NetworkHit Created!!");
        }
        public NetworkHit(String ApiName){
            name = ApiName;
            System.out.println("NetworkHit Created: "+name);
        }

        public void setAPIAttempt(int attempts){
            numberOfAttempts = attempts;
            System.out.println("Setting # of Attempts: "+numberOfAttempts);
        }

        public String getAPIName(){
            return name;
        }

        public int getNumberOfAttempts(){
            return numberOfAttempts;
        }
    }
}
