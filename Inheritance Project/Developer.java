public class Developer extends Employee {
    private String CodingLanguage;
    Developer(String name, int age, double salary, String CodingLanguage ) {
            super(name, age, salary);
            this.CodingLanguage = CodingLanguage;
        
        }
        

        public String getCodingLanguage() {
        return CodingLanguage;
    }


    public void setCodingLanguage(String codingLanguage) {
        CodingLanguage = codingLanguage;
    }


        public void work(){
            System.out.println("Working In Coding language :"+getCodingLanguage());
        }

}