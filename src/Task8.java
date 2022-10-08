public class Task8 {
    public static void main(String[] args) {
        int salary = 29000;
        double total = 0;
        double percent;
        for (int i = 1; i<= 12; i++){
            percent = total / 100;
            total += salary + percent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total );
        }
    }
}
