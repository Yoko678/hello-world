public class zXyq {
    public static void main(String[] args) {
        int[] yYy = {5, 2, 8, 1, 9, 3};
        sorty(yYy);
        for (int i = 0; i < yYy.length; i++) System.out.print(yYy[i] + " ");
    }

    public static void sorty(int[] b) {
        for (int a = 0; a < b.length - 1; a++) {
            for (int c = a + 1; c < b.length; c++) {
                if (b[a] > b[c]) { // Change to > for ascending
                    int tmp = b[a];
                    b[a] = b[c];
                    b[c] = tmp;
                }
            }
        }
    }
}
