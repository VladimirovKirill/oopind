public class Bubble implements Container {
    private long[] mas;
    private int elements;

    public Bubble(int x) {
        mas = new long[x];
        elements = 0;
    }

    public Bubble(long[] mas, int elements) {
        this.mas = mas;
        this.elements = elements;
    }

    public void into(int value) {
        mas[elements] = value;
        elements++;
    }

    public void printer() {
        for (int i = 0; i < elements; i++) {
            System.out.print(mas[i] + " ");
            System.out.println("");
        }
        System.out.println("----\n");
    }

    private void toSwap(int x, int y) {
        long dummy = mas[x];
        mas[x] = mas[y];
        mas[y] = dummy;
    }

    @Override
    public void sort() {
        for (int i = elements - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1])
                    toSwap(j, j + 1);
            }
        }
    }

    @Override
    public void foreach() {
        for (int i = elements - 1; i >= 0; i--) {
            mas[i] = (long) Math.sqrt(mas[i]);
        }
    }
}
