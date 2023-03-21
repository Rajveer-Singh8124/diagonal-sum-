
public class diagonalSum {

    private static void diagonal(int max[][]){
        int sum=0;
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if(i==j){
                    sum+=max[i][j];
                    
                }
                else if(i+j==max.length-1){
                    sum+=max[i][j];
                    
                }
            }
        }
        System.out.println(sum);
    }

    private static void diagonal_Sum(int max[][]) {
        int sum=0;
        for (int i = 0; i < max.length; i++) {
            sum+=max[i][i];
            if(i!=max.length-1-i){
                sum+=max[i][i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int value=1;
        int max[][]= new int[4][4] ;
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max.length; j++) {
                max[i][j] =value;
                value++;
            }
        }
        diagonal_Sum(max);
        //diagonal(max);
    }        
}
