//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int initialbalance = 1500;
        int addend = 300;
        int bonus = 0;
        if (addend > 1000); {
            bonus = addend / 100;
        }
        int finalbalance = initialbalance+addend+bonus;
        System.out.println("Итоговый счет:" + finalbalance);
        System.out.println("Бонус: " + bonus);
    }
}