public class Bank {
    long capital;

    Bank(long capital) {
        this.capital = capital;
    }

    void credit(Human human) {
        if (human.capital < 100000){
            System.out.println("Ваш капитал слишком маленький!");
        } else {
            System.out.println("Кредит одобрен!");
        }
    }

    void save(float contribution, Human human, int years) {
        human.capital = (human.capital - contribution) + (contribution * years * 1.2f);
        human.age = human.age + years;
    }
}