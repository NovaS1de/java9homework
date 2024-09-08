// Задание 1: Класс для представления человека
public class Person {
    // Поля класса (свойства)
    private String name;
    private int age;
    private String gender;

    // Статическая переменная для отслеживания количества созданных объектов
    private static int count = 0;

    // Конструктор
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        // Увеличиваем счетчик при создании нового экземпляра
        count++;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    // Метод для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения возраста
    public int getAge() {
        return age;
    }

    // Метод для установки возраста
    public void setAge(int age) {
        if (age > 0) { // Простой контроль ввода
            this.age = age;
        } else {
            System.out.println("Возраст должен быть положительным числом.");
        }
    }

    // Метод для получения пола
    public String getGender() {
        return gender;
    }

    // Метод для установки пола
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Метод для представления информации о человеке
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }

    // Статический метод для получения количества созданных объектов
    public static int getCount() {
        return count;
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создание объектов Person
        Person person1 = new Person("Иван", 30, "Мужской");
        Person person2 = new Person("Алексей", 25, "Мужской");
        Person person3 = new Person("Мария", 28, "Женский");

        // Отображение информации о человеке
        person1.displayInfo();
        System.out.println();

        // Отображение общего количества созданных объектов
        System.out.println("Общее количество созданных объектов: " + Person.getCount());

        // Примеры использования Geometry и MathUtils
        System.out.println("Площадь треугольника (основание 5, высота 6): " + Geometry.triangleArea(5, 6));
        System.out.println("Площадь квадрата (сторона 4): " + Geometry.squareArea(4));
        System.out.println("Максимум из (3, 5, 1, 4): " + MathUtils.max(3, 5, 1, 4));
        System.out.println("Факториал 5: " + MathUtils.factorial(5));
    }
}

// Задание 2: Класс для подсчета площади геометрических фигур
class Geometry {
    // Статическая переменная для подсчета вызовов методов
    private static int areaCount = 0;

    // Метод для подсчета площади треугольника
    public static double triangleArea(double base, double height) {
        areaCount++;
        return 0.5 * base * height;
    }

    // Метод для подсчета площади прямоугольника
    public static double rectangleArea(double width, double height) {
        areaCount++;
        return width * height;
    }

    // Метод для подсчета площади квадрата
    public static double squareArea(double side) {
        areaCount++;
        return side * side;
    }

    // Метод для подсчета площади ромба
    public static double rhombusArea(double d1, double d2) {
        areaCount++;
        return 0.5 * d1 * d2;
    }

    // Статический метод для получения количества подсчетов площади
    public static int getAreaCount() {
        return areaCount;
    }
}

// Задание 3: Класс для подсчета максимума, минимума, среднеарифметического и факториала
class MathUtils {
    // Метод для нахождения максимума из четырех аргументов
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    // Метод для нахождения минимума из четырех аргументов
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    // Метод для нахождения среднеарифметического из четырех аргументов
    public static double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    // Метод для нахождения факториала аргумента
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
