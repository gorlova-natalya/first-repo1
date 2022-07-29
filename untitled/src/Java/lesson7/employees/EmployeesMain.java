package Java.lesson7.employees;

public class EmployeesMain {
    public static void main(String[] args) {
        Employee director = new Director(10, "John", "Director", "управление компанией",
                50);
        Employee worker = new Worker(4, "Billy", "Worker", "настройка оборудования");
        Employee accountant = new Accountant( 5, "Bella", "Accountant",
                "ведение бухгалтерского учета", "c 9:00 до 18:00 пн-пт");

        Employee [] employees = {director, worker, accountant};

        for (Employee employee : employees) {
            employee.printPosition();
        }
    }
}
