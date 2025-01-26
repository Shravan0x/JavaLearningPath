public class Org {

    public static void main(String[] args) {
        Manager manager = new Manager("Sandeep Parthe", 40, 1000000, "sales");
        Developer developer = new Developer("Shravan Parthe", 20, 50000, "Java and C++");
        Intern intern = new Intern("Om parthe", 20, 20000, "software tester");
        System.out.println("Manager :"+manager.getName()+ "\n"+ "Age :"+manager.getAge()+ "\n" +"Salary :"+manager.getSalary()+"\n"+ "Departmant :"+manager.getDepartment());
        System.out.println("________________________________");
        System.out.println("Developer :"+developer.getName()+ "\n"+ "Age :"+developer.getAge()+ "\n" +"Salary :"+developer.getSalary()+"\n"+ "Departmant :"+developer.getCodingLanguage());
        System.out.println("________________________________");
        System.out.println("Intern  :"+intern.getName()+ "\n"+ "Age :"+intern.getAge()+ "\n" +"Salary :"+intern.getSalary()+"\n"+ "Departmant :"+intern.getSoftwareDevelopment());

        
    }
}