public class PrintHallowRectangle {
    public static void printHallowRectangle(int row, int column){

        for(int i=0; i<row; i++ ){
            for(int j=0; j<column; j++){
                if(i==1 || j==1 ||i==row || j==column ){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }



    public static void main(String[] args) {
            printHallowRectangle(4,4);
    }
}
