public class ArrayComparator {


    boolean compare(int[][] x, int[][] y) {
        boolean a = true;

        for (int i = 0; i < x.length ; i++) {
            if (x.length != y.length || x[i].length != y[i].length)
                return  false;
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] != y[i][j]) {
                    a = false;
                }

            }


        }
        return a;
    }
}