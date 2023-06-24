import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Волкова", "Владислава", "Сергеевна", 1, 150_000);
        employees[1] = new Employee("Волков", "Григорий", "Эдуардович", 1, 180_000);
        employees[2] = new Employee("Жукова", "Диана", "Романовна", 3, 30_000);
        employees[3] = new Employee("Иванова", "Мария", "Сергеевна", 2, 80_000);
        employees[4] = new Employee("Семенов", "Дмитрий", "Анатольевич", 4, 50_500);
        employees[5] = new Employee("Кузьмина", "Диана", "Дмитриевна", 5, 35_900);
        employees[6] = new Employee("Кпопов", "Битиес", "Армиевич", 5, 100_000);
        employees[7] = new Employee("Пак", "Чи", "Мин", 1, 40_000);
        employees[8] = new Employee("Собачкина", "Мия", "Японопоповна", 2, 50);
        employees[9] = new Employee("Ким", "Намджуна", "В президенты", 3, 20_000);

        printAllEmployee();
        System.out.println(sumSalary());
        System.out.println(searchMinSalary());
        System.out.println(searchMaxSalary());
        System.out.println(searchMiddleSalary());
        printFullName();
    }


    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            sum += Main.employees[i].getSalary();
        }
        return sum;
    }

    public static String searchMinSalary() {
        Employee min1 = employees[0];
        int min = min1.getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary()< min) {
                min = employees[i].getSalary();
                min1 = employees[i];
            }
        }
       return "Минимальная зарплата " + min1.getLastname() + " "  + min1.getName()  + " " + min1.getMiddleName() + " " + min1.getSalary();
    }

    public static String searchMaxSalary() {
        Employee max1 = employees[0];
        int max = max1.getSalary();
        for (int i = 0; i <employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                max1 = employees[i];
            }
        }
        return "Максимальная зарплата " + max1.getLastname() + " "  + max1.getName()  + " " + max1.getMiddleName() + " " + max1.getSalary();
    }
    public static String  searchMiddleSalary() {
        double middle = 0;
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            middle =(double) sumSalary()/employees.length;
        }
        return "Среднее значение зарплат " + middle;
    }


    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getLastname() + " ");
            System.out.print(employees[i].getName() + " ");
            System.out.print(employees[i].getMiddleName());
            System.out.println();
        }
    }
}
