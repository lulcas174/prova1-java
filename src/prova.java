public class prova {
    public static void main(String[] args) {
        int[] a={7,5,3,2,0,1};

        for (int i=1; i<6; i++) {

            if (a[i] < a[0]) {
                a[0]=a[i];

            }

        }
    }
}
