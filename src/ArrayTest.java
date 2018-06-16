public class ArrayTest {
    public static void main(String[] args) {
        int [][] tab = new int[2][];
        int [][] tab2 = new int[1][];
        int [][] tab3 = new int[1][];
        tab[0] = new int[]{1,2,34};
        tab[1] = new int[]{1,5,2};
        tab2[0] = new int[]{4,5,6};
        tab3[0] = new int[]{4,5,6};
ArrayComparator ac = new ArrayComparator();


        System.out.println(ac.compare(tab, tab2));
        System.out.println(ac.compare(tab2, tab3));




    }
}
