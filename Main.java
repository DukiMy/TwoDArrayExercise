/**
 * A program to help students visualize the manipulation of a 2dimansional array.
 * 
 * Credits: Durim Miziraj
 * Buy me a coffee: Swish 0762833335.
 */
public class Main {    

    // Declaring variables
    private static String firstRow;
    private static String secondRow;
    private static String thirdRow;
    private static String pos00 = "   ";
    private static String pos01 = "   ";
    private static String pos02 = "   ";
    private static String pos10 = "   ";
    private static String pos11 = "   ";
    private static String pos12 = "   ";
    private static String pos20 = "   ";
    private static String pos21 = "   ";
    private static String pos22 = "   ";
    
    // Setting the final strings for output.
    private final static String POS_MARKER = "███";
    private final static String TABLE_TITLE = "          Item table";
    private final static String COLUMN_INDEX_POINTERS = "           i-0            i-1        i-2";
    private final static String COLUMN_SPECIFIERS = "          | ITEM NUMBER | QUANTITY | PRICE |";
    private final static String HORIZONTAL_LINE = "          ----------------------------------";

    // Declaring a 2-dimensional array.
    private final static String[][] ITEM_TABLE = new String[][] {
        {pos00, pos01, pos02},
        {pos10, pos11, pos12},
        {pos20, pos21, pos22}
    };

    /**
     * The starting point of the program.
     * @param args No arguments are handled.
     */

    public static void main(String... args) {
        
        // CHANGE VALUES HERE!!! CHANGE VALUES HERE!!! CHANGE VALUES HERE!!! 
        ITEM_TABLE[1][2] = POS_MARKER;    // Anything other than number 0, 1 and 2 will crash the program.

        setRowValues();
        printTable();

    }

    /**
     * Sets the values of the rows on the 'ITEM_TABLE'.
     */

    private static void setRowValues() {

        firstRow = String.format("i-0       | %s         | %s      | %s   |", ITEM_TABLE[0][0], ITEM_TABLE[0][1], ITEM_TABLE[0][2]);
        secondRow = String.format("i-1       | %s         | %s      | %s   |", ITEM_TABLE[1][0], ITEM_TABLE[1][1], ITEM_TABLE[1][2]);
        thirdRow = String.format("i-2       | %s         | %s      | %s   |", ITEM_TABLE[2][0], ITEM_TABLE[2][1], ITEM_TABLE[2][2]);
    
    }

    /**
     * Prints the item table.
     */
    private static void printTable() {

        System.out.println(TABLE_TITLE);
        System.out.println(COLUMN_INDEX_POINTERS);
        System.out.println(COLUMN_SPECIFIERS);
        System.out.println(HORIZONTAL_LINE);
        System.out.println(firstRow);
        System.out.println(HORIZONTAL_LINE);
        System.out.println(secondRow);
        System.out.println(HORIZONTAL_LINE);
        System.out.println(thirdRow);
        System.out.println(HORIZONTAL_LINE);

    }
}