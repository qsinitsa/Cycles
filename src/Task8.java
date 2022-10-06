public class Task8 {
    public static void main(String[] args) {
        int salary = 29000;
        int total = 0;
        int percent;
        for (int i = 1; i<= 12; i++){
            percent = total / 100;
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total );
        }
    }
}
