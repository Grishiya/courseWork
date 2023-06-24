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

        System.out.println(employees[8]);
        System.out.println();

        employees[9].printAllEmployee();
        System.out.println();

        employees[9].printFullName();
        System.out.println();

        System.out.println("Сумма всех зарплат " + employees[9].sumSalary());
        System.out.println();

        employees[9].searchMinSalary();
        System.out.println();

        employees[9].searchMaxSalary();
        System.out.println();

        employees[9].searchMiddleSalary();

    }
}
