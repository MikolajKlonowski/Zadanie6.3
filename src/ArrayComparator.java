public class ArrayComparator {


    boolean compare(int[][] x, int[][] y) {
        boolean a = true;
        if (x.length != y.length || x[0].length != y[0].length)
            a = false;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] != y[i][j]) {
                    a = false;
                }

            }


        }
        return a;
    }
}