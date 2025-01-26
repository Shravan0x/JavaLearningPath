public class Intern extends Employee {
    private String SoftwareDevelopment;

    Intern(String name, int age, double salary ,  String SoftwareDevelopment) {
        super(name, age, salary);
        this.SoftwareDevelopment = SoftwareDevelopment;
  
    }

    public String getSoftwareDevelopment() {
        return SoftwareDevelopment;
    }

    public void setSoftwareDevelopment(String softwareDevelopment) {
        SoftwareDevelopment = softwareDevelopment;
    }

    public void work(){
        System.out.println("work at department :"+getSoftwareDevelopment());
    }

    

}