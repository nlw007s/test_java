public class Main{

    public static void main(String[] args) {
        int[][] n = {{1, 2}, {3, 4}};
        int[][] m = {{5, 6}, {7, 8}};
        int i, j;
        
        int [][] multi = new int[2][2];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + n[i][j] + " ");
            }System.out.println(" ");
        }System.out.println(" ");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + m[i][j] + " ");
            }System.out.println(" ");
        }System.out.println(" ");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                multi[i][j] = n[i][j] + m[i][j];
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + multi[i][j] + " ");
        } System.out.println(" ");
    }
}
}