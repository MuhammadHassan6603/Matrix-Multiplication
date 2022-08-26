class Multiplication
{
    public static void main(String[] args) {
        int A[][]={{2,2},{2,2}};
        int B[][]={{3,3},{3,3}};
        int Res[][]=new int[2][2];
        int i,j,k;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                for(k=0;k<2;k++)
                {
                    Res[i][j]=Res[i][j]+A[i][k]*B[k][j];
                }
                System.out.print(Res[i][j] + " ");
            }
            System.out.println();
        }
    }
}