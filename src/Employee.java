public class Employee {
    private final String lastname;
    private final String name;
    private final String middleName;
    private int department;
    private int salary;
    private int id;
    private static int countId = 1; //статичный, потому что принадлежит классу


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

}


