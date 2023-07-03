import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human mus = new Human("Kosoev Muslim Kazb", 50000, 17);
        Bank Alfa = new Bank(1000000000);

        mus.work(32);
        mus.walk(6);

        Alfa.save(10000, mus, 10);
        System.out.println(mus.capital);
        System.out.println(mus.age);
    }
}