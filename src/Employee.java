public class Employee {
    private final String lastname;
    private final String name;
    private final String middleName;
    private int department;
    private int salary;
    private int id;
    private static int countId = 1;


    public Employee(String lastname, String name, String middleName, int department, int salary) {
        this.lastname = lastname;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = countId++;

    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + " " +
                "ФИО " + getLastname()
                + " " + getName()
                + " " + getMiddleName()
                + " "
                + "Отдел "
                + getDepartment()
                + " " + "Зарплата "
                + salary;
    }

    public void printAllEmployee() {
        for (int i = 0; i < Main.employees.length; i++) {
            Employee employee = Main.employees[i];
            System.out.println(employee.toString());
        }
    }

    public void printFullName() {
        for (int i = 0; i < Main.employees.length; i++) {
            System.out.print(Main.employees[i].getLastname() + " ");
            System.out.print(Main.employees[i].getName() + " ");
            System.out.print(Main.employees[i].getMiddleName());
            System.out.println();
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            sum += Main.employees[i].getSalary();
        }
       return sum;
    }

    public void searchMinSalary() {
        Employee min1 = Main.employees[0];
        int min = min1.getSalary();
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getSalary()< min) {
                min = Main.employees[i].getSalary();
                min1 = Main.employees[i];
            }
        }
        System.out.println("Минимальная зарплата " + min1.getLastname() + " "  + min1.getName()  + " " + min1.getMiddleName() + " " + min1.getSalary());
    }

    public void searchMaxSalary() {
        Employee max1 = Main.employees[0];
        int max = max1.getSalary();
        for (int i = 0; i < Main.employees.length; i++) {
            if (max < Main.employees[i].getSalary()) {
                max = Main.employees[i].getSalary();
                max1 = Main.employees[i];
            }
        }
        System.out.println("Максимальная зарплата " + max1.getLastname() + " "  + max1.getName()  + " " + max1.getMiddleName() + " " + max1.getSalary());
    }
    public void searchMiddleSalary() {
        double middle = 0;
        int sum = 0;
        for (int i = 0; i < Main.employees.length; i++) {
         middle = sumSalary()/Main.employees.length;
        }
        System.out.println("Среднее значение зарплат " + middle);
    }
}


