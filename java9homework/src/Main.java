public class Main {
    // Поля класса (свойства)
    private String name;
    private int age;
    private String gender;

    // Статическая переменная для отслеживания количества созданных объектов
    private static int count = 0;

    // Конструктор
    public Main(String name, int age, String gender) {
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
        Main person1 = new Main("Иван", 30, "Мужской");
        Main person2 = new Main("Алексей", 25, "Мужской");
        Main person3 = new Main("Мария", 28, "Женский");

        // Отображение информации о человеке
        person1.displayInfo();
        System.out.println();

        // Отображение общего количества созданных объектов
        System.out.println("Общее количество созданных объектов: " + Main.getCount());
    }
}