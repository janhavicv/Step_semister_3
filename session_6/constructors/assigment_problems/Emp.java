class Emp {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;
    Emp(String name, double salary) {
        empName = name;
        this.salary = salary;
        employeeCount++;
    }
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        Emp e1 = new Emp("Ravi", 30000);
        Emp e2 = new Emp("Anitha", 40000);
        Emp e3 = new Emp("Karthik", 35000);

        Emp.printCompanyInfo();
    }
}