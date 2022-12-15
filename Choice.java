public class Choice implements Container {

    private long[] mas;
    private int elements;

    public Choice(int x) {
        mas = new long[x];
        elements = 0;
    }

    public Choice(long[] mas, int elements) {
        this.mas = mas;
        this.elements = elements;
    }

    public void into(int value) {
        mas[elements] = value;
        elements++;
    }

    public void printer() {
        for (int i = 0; i < elements; i++) {
            System.out.print(mas[i]);
            System.out.println("");
        }
        System.out.println("----\n");
    }

    @Override
    public void sort() {
        for (int i = 0; i < elements; i++) {
            int min = i;
            for (int j = i + 1; j < elements; j++) {
                if (mas[j] < mas[min]) {
                    min = j;
                }
            }
            int swap = (int) mas[i];
            mas[i] = mas[min];
            mas[min] = swap;
        }
    }

    @Override
    public void foreach() {
            for (int i = elements - 1; i >= 0; i--) {
                mas[i] = (long) Math.log(mas[i]);
            }
    }
}
