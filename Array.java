public class Array {
    public static void main(String[] args) {
        int arr[] = new int[2];

        int arr2[] = new int[3];
        arr2[0] = 4;
        arr2[1] = 1;
        arr2[2] = 3;

        // for(int i = 0; i< arr.length; i++){
        // System.err.println(arr2[i]);
        // }

        // --------------------------------- Multi dimensional array generating random
        int[][] test = new int[3][4];

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < 4; j++) {
                test[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.err.print(test[i][j] + " ");
            }
            System.out.println();
        }


        System.err.println("----------------------------------------------");
        
        // Enhanced for loop
        for(int n[]: test){
            for(int m : n){
                System.err.print(m + " ");
            }
            System.err.println();
        }
    }
}
