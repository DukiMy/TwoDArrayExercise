/**
 * A program to help students visualize the manipulation of a 2dimansional array.
 * 
 * Credits: Durim Miziraj
 * Buy me a coffee: Swish 0762833335.
 */
public class Main {    

    public static void main(String[] args) {

        // Declaring variables
        String pos00 = "   ";
        String pos01 = "   ";
        String pos02 = "   ";
        String pos10 = "   ";
        String pos11 = "   ";
        String pos12 = "   ";
        String pos20 = "   ";
        String pos21 = "   ";
        String pos22 = "   ";
        final String POS_MARKER = "███";
        
        // Declaring a 2-dimensional array.
        String[][] ITEM_TABLE = new String[][] {
            {pos00, pos01, pos02},
            {pos10, pos11, pos12},
            {pos20, pos21, pos22}
        };

        // CHANGE VALUES HERE!!! CHANGE VALUES HERE!!! CHANGE VALUES HERE!!! 
        ITEM_TABLE[1][0] = POS_MARKER;    // Anything other than number 0, 1 and 2 will crash the program.

        // Setting the final strings for output.
        final  String TABLE_TITLE = "          Item table";
        final  String COLUMN_INDEX_POINTERS = "           i-0            i-1        i-2";
        final  String COLUMN_SPECIFIERS = "          | ITEM NUMBER | QUANTITY | PRICE |";
        final  String HORIZONTAL_LINE = "          ----------------------------------";
        final  String FIRST_ROW = String.format("i-0       | %s         | %s      | %s   |", ITEM_TABLE[0][0], ITEM_TABLE[0][1], ITEM_TABLE[0][2]);
        final  String SECOND_ROW = String.format("i-0       | %s         | %s      | %s   |", ITEM_TABLE[1][0], ITEM_TABLE[1][1], ITEM_TABLE[1][2]);
        final  String THIRD_ROW = String.format("i-0       | %s         | %s      | %s   |", ITEM_TABLE[2][0], ITEM_TABLE[2][1], ITEM_TABLE[2][2]);

        // Prints out the table.
        System.out.println(TABLE_TITLE);
        System.out.println(COLUMN_INDEX_POINTERS);
        System.out.println(COLUMN_SPECIFIERS);
        System.out.println(HORIZONTAL_LINE);
        System.out.println(FIRST_ROW);
        System.out.println(HORIZONTAL_LINE);
        System.out.println(SECOND_ROW);
        System.out.println(HORIZONTAL_LINE);
        System.out.println(THIRD_ROW);
        System.out.println(HORIZONTAL_LINE);
    }
}