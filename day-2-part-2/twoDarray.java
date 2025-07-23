import java.util.Scanner;
public class twoDarray {
    int matrixsum=0;
    int matricsum(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                matrixsum+=a[i][j];
            }
        }
        return matrixsum;
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Matric Row: ");
        int matrxrow=scan.nextInt();
        System.out.print("Matric Colom: ");
        int matrixcolom=scan.nextInt();
        int matrix[][]=new int[matrxrow][matrixcolom];
        for(int q=0;q<matrxrow;q++){
            for(int w=0;w<matrixcolom;w++){
                System.out.print("Enter number:["+q+"]["+w+"] : ");
                matrix[q][w]=scan.nextInt();
            }
        }
        System.out.println("Print The Matric ");
        System.out.println("*****************");
        for(int e=0;e<matrxrow;e++){
            for(int r=0;r<matrixcolom;r++){
                System.out.print(matrix[e][r]+"  ");
            }
            System.out.println();
        }
        twoDarray obj=new twoDarray();
        int matricsum=obj.matricsum(matrix);
        System.out.println("");
        System.out.println("Matrix Sum is: "+matricsum);
        System.out.println("------------------------");
        int rowsum=0;
        for(int m=0;m<matrxrow;m++){

            for(int n=0;n<matrixcolom;n++){
                rowsum+=matrix[m][n];
            }
            System.out.println("Row Sum: "+rowsum);
            rowsum=0;
        }
        int columsum=0;
        for(int f=0;f<matrxrow;f++){
            for(int g=0;g<matrixcolom;g++){
                columsum+=matrix[g][f];
            }
            System.out.println("Colom Sum: "+columsum);
            columsum=0;
        }
        System.out.println("Matrix Transport");
        for(int v=0;v<matrxrow;v++){
            for(int b=0;b<matrixcolom;b++){
                System.out.print(matrix[b][v]+"  ");
            }
            System.out.println("");
        }
    }
}

