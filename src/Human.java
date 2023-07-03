public class Human {
    int age;
    String FIO;
    float capital;

    Human(String FIO, float capital, int age){
        this.age = age;
        this.FIO = FIO;
        this.capital = capital;
    }
    void work(int DaysOfWork){
        capital = capital + 2000 * DaysOfWork;
    }
    void walk(int DaysOfWalk){
        capital = capital - 2000 * DaysOfWalk;
    }
}
