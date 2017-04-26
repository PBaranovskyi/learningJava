package ua.kstt.justymenko.module05;

/**
 * Created by n1kropol on 4/25/17.
 */
public class LW_167_FindAreas {
    public static void main(String[] args) {
        int iDimension = 4;
        int jDimension = 5;
        int[][] matrix = new int[iDimension][jDimension];
//        Random random = new Random();
//        for (int i = 0; i < iDimension; i++) {
//            for (int j = 0; j < jDimension; j++) {
//                matrix[i][j] = random.nextInt(jDimension) + 1;
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

        int[] matrix1 = {1, 1, 1, 0, 1};
        int[] matrix2 = {1, 0, 1, 1, 1};
        int[] matrix3 = {1, 0, 1, 0, 1};
        int[] matrix4 = {0, 1, 1, 1, 1};

        matrix[0] = matrix1;
        matrix[1] = matrix2;
        matrix[2] = matrix3;
        matrix[3] = matrix4;


        StringBuilder builder = new StringBuilder();
        int finder = 1;
        for (int i = 0; i < matrix.length; i++) {

            String prefix = "";
            int begin = 0;
            int end = 0;
            boolean isBeginSet = false;
            boolean isContinueValue = false;

            for (int j = 0; j < matrix.length - 2; j++) {

                if (matrix[i][j] == finder && matrix[i][j + 1] == finder && matrix[i][j + 2] == finder){
                    isContinueValue = true;
                    if (!isBeginSet){
                        isBeginSet = true;
                        begin = j;
                    }
                    end = j + 2;
                    continue;
                }
                else{
                    if (matrix.length - 2 != j){
                        if (isContinueValue){
                            builder.append(begin + "-" + end);
                        }
                        continue;
                    }
                    if (isContinueValue){
                        builder.append(begin + "-" + end);
                    }


                    builder.append(prefix);
                    prefix = ",";
                    builder.append(j);
                }
            }


            i++;
            System.out.println("Line " + i + ": [" + builder + "]");
            i--;
            builder.setLength(0);
        }



    }
}
