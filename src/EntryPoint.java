public class EntryPoint {

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 3, 4 };
        int size = arr.length;

        System.out.println(
                "Minimum number of multiplications is "
                        + multiplicacaoMatrizesDinamico(arr, size));

    }

    static int multiplicacaoMatrizesDinamico(int p[], int n){

        int m[][] = new int[n][n];

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int q = 0;

        for(i = 1 ; i < n ; i+=1){

          m[i][i] = 0;

        }

        for(l = 2 ; l < n ; l+=1){

            for(i = 1 ; i < n - l + 1 ; i+=1){

              j = l + i - 1;

              m[i][j] = Integer.MAX_VALUE;

              for(k = i ; k <= j - 1 ; k+=1){

                  q = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];

                  if(q < m[i][j]){
                      m[i][j] = q;
                  }

                }

            }

        }
        return m[1][n-1];
    }

}
