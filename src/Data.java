import java.util.Arrays;
import java.util.Objects;

public class Data {
    /*
        Creating public variables that are used for all the methods
     */
    public static int xMax; //Maximum X Index
    public static int yMax; //Maximum Y Index
    public static String[][] data; // Data Array

    public Data(int xGiven, int yGiven){
        xMax = xGiven+1;
        yMax = yGiven+1;
        data = new String[yMax+1][xMax+1];
        /*
            Format of the data as shown by the Array
            {0, 0, 0}
            {0, 0, 0}
            {0, 0, 0}
         */
        Arrays.fill(data[yMax], " = ");
        for(int row = 0; row<data.length; row++){
            data[row][0] = " I ";
        }
        data[yMax][0] = " + ";
    }

    public static void Display(){
        for(String[] row: data){
            for(String info: row){
                System.out.print(Objects.requireNonNullElse(info, " ` "));
            }
            System.out.println();
        }
        System.out.println("This graph is not completley 100% always correct... please be careful in where you use this, you have been warned");
    }

    public static void Graph(int a, int b, int c, String symbol){ //y = ax^2+bx+c
        String[] badSymbols = {"{","}","-","_","/"};

        for(String i: badSymbols){
            if(symbol.equals(i)){
                System.out.println("Your choices in symbols are bad so I chaged it for you :).");
                symbol ="0";
            }
        }
        int y = 0;
        int x = 0;
        while((y>=0) && (y<=yMax)){
            y = x*x*a + x*b + c;
            y = (yMax-y);
            if(y<=yMax-3 && y>0 && x <= xMax && x>=0){
                data[y][x] = " "+symbol+" ";
            }
            x++;
        }
    }


}
