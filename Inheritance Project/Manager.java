public class Manager extends Employee {
    
   private String Department;
    Manager(String name, int age, double salary, String Department) {
            super(name, age, salary);
   
   
          this.Department =  Department;
            
        }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
    public void work(){
        System.out.println("Working In deaprtment :"+getDepartment());
    }
}