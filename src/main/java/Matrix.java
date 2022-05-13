import java.util.ArrayList;

    public class Matrix {

        public Matrix(){
        }

        public static int countNumbersDivisibleBySeven(int[][] matrix) {
            int elem = 0;
            ArrayList<Integer> all = new ArrayList<>();
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    all.add(anInt);
                }
            }
            for (int i = 0; i < all.size(); i++) {
                if ((all.get(i) % 7) == 0)
                    elem += all.get(i);
            }
            return elem;
        }

        public static ArrayList<Integer> columnsWithMax(int[][] matrix){
            ArrayList<Integer> result = new ArrayList<>();

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){


                    if(matrix[i][j] == 0 && result.contains(i) == false) result.add(i);

                }
            }
            return result;
        }
    }
}
