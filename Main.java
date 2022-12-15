public class Main {
    public static void main (String[] args) {
        System.out.println("Сортировка пузырьком: ");

        Bubble array = new Bubble(5);
        array.into(300);
        array.into(163);
        array.into(184);
        array.into(191);
        array.into(174);

        array.printer();
        array.sort();
        array.printer();
        array.foreach();
        array.printer();

        System.out.println("Сортировка выбором: ");

        Choice solid = new Choice(6);
        solid.into(16);
        solid.into(81);
        solid.into(49);
        solid.into(36);
        solid.into(4);
        solid.into(9);

        solid.printer();
        solid.sort();
        solid.printer();
        solid.foreach();
        solid.printer();
    }
}