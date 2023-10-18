public class Main {
    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void main(String[] args) {
        Integer value = 33;
        System.out.println("Исходное значение переменной value: " + value);

        changeValue(value);
        System.out.println("Измененное значение переменной value: " + value);
    }
}