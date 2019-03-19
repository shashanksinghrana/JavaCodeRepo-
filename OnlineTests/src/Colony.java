public class Colony {
    public static int[] cellCompete(int[] cell, int day) {
        int[] ar = new int[10];
        for(int i=1; i<9; i++) {
            ar[i] = cell[i-1];
        }
        while(day-- >0) {
            int temp = 0;
            for(int i=1; i<9; i++) {
                if(Math.abs(temp-ar[i+1])==1) {
                    temp = ar[i];
                    ar[i] = 1;
                }
                else {
                    temp = ar[i];
                    ar[i] = 0;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {

        int[] cell = {1,0,0,0,0,1,0,0};
        int day = 1;
        cell = cellCompete(cell, day);
        for(int i=1; i<9; i++) {
            System.out.print(cell[i]+" ");
        }
    }
}