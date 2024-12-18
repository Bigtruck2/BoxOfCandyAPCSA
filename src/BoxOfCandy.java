public class BoxOfCandy {
    /** box contains at least one row and is initialized in the constructor. */
    private final Candy[][] box;
    public BoxOfCandy(Candy[][] box){
        this.box = box;
    }

    public Candy[][] getBox() {
        return box;
    }

    /**
     * Moves one piece of candy in column col, if necessary and possible, so that the box
     * element in row 0 of column col contains a piece of candy, as described in part (a).
     * Returns false if there is no piece of candy in column col and returns true otherwise.
     * Precondition: col is a valid column index in box.
     */
    public boolean moveCandyToFirstRow(int col)
    { /* to be implemented in part (a) */
        if(box[0][col]!=null) return true;
        for(Candy[] row: box){
            if(row[col]!=null){
                box[0][col] = row[col];
                row[col] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Removes from box and returns a piece of candy with flavor specified by the parameter, or
     * returns null if no such piece is found, as described in part (b)
     */
    public Candy removeNextByFlavor(String flavor)
    { /* to be implemented in part (b) */
        for(int i = box.length-1;i>=0;i--){
            for(int j = 0;j<box[0].length;j++){
                if(box[i][j]!=null&&box[i][j].getFlavor().equals(flavor)){
                    Candy candy = box[i][j];
                    box[i][j] = null;
                    return candy;
                }
            }
        }
        return null;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}