import java.util.*;

class Grid{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of 'N' for the Matrix (N X N) : ");
        int n = s.nextInt();
        System.out.println("Enter the coordinates of Start postion (row col) : ");
        int row = s.nextInt();
        int col = s.nextInt();
        if(row <0 || row >=n ||col <0 || col >=n){
            System.out.println("Invalid Input . . . ");
            return;
        }
        System.out.println("Enter the coordinates of Destination (row col) : ");
        int drow = s.nextInt();
        int dcol = s.nextInt();
        if(drow <0 || drow >=n || dcol <0 || dcol >=n){
            System.out.println("Invalid Input . . . ");
            return;
        }
        System.out.println("Matrix : ");
        char[][] grid = new char[n][n];
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(i == row && j == col){
                    grid[i][j]='A';
                    System.out.print("A ");
                }
                else if( i == drow && j == dcol ){
                    grid[i][j] = 'D';
                    System.out.print("D ");
                }
                else {
                    grid[i][j] = 'O';
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        System.out.println("Shortest Distance to travel point A to D is : "+shortestDist(row,col,drow,dcol));
    }
    public static int shortestDist(int rowx ,int colx , int rowy ,int coly){
        return Math.max(Math.abs(rowx - rowy) , Math.abs(colx - coly));
    }
}