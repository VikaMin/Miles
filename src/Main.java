public class Main {
    public static void main(String[] args) {

        int ticket = 500; // стоимости билета
        int bonus = 20; // стоимость одной милли
        int mill = (ticket / bonus);

        System.out.println(mill + " бонусных миль");

    }
}
