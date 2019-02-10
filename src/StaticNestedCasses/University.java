package StaticNestedCasses;

public class University {

    University(){
        System.out.println("University Created!!");
    }

    public static class Department{
        String name;
        int numberOfFaculty;
        Department(){
            System.out.println("Department Created!!");
        }
        public Department(String departmentName){
            name = departmentName;
            System.out.println("Department Created: "+name);
        }

        public void setDepartmentFaculty(int faculty){
            numberOfFaculty = faculty;
            System.out.println("Setting Department # ofFaculty: "+numberOfFaculty);
        }

        public String getDepartmentName(){
            return name;
        }

        public int getNumberOfFaculty(){
            return numberOfFaculty;
        }
    }
}
