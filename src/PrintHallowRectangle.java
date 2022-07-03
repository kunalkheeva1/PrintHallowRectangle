public class PrintHallowRectangle {
    public static void printHallowRectangle(int row, int column){

        //get a nested loop
        for(int i=0; i<row; i++ ){
            // one for the columns
            for(int j=0; j<column; j++){
                //print star on the borders
                if(i==0|| j==0  || i==row-1 || j==column-1 ){
                    System.out.print(" *");
                    //else space in between
                }else{
                    System.out.print("  ");
                }
                //then move the cursor to the next line and go to i+1th index
            }System.out.println();
        }


    }



    public static void main(String[] args) {
            printHallowRectangle(4,5);
    }
}
