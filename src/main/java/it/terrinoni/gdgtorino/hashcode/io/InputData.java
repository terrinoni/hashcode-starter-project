/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.terrinoni.gdgtorino.hashcode.io;

/**
 * Wrapper class for input data.
 * This class contains all the information available in input files, wrapping data in a unique
 * object.
 *
 * @author Marco Terrinoni <marco.terrinoni@gmail.com>
 */
public class InputData {

    private int numRows; // 1 <= R <= 1000
    private int numColumns; // 1 <= C <= 1000
    private int minNumIngredientsPerSlice; // 1 <= L <= 1000
    private int maxNumCellsSlice; // 1 <= H <= 1000

    public InputData () {
    }

    public InputData (int numRows, int numColumns, int minNumIngredientsPerSlice,
            int maxNumCellsSlice) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.minNumIngredientsPerSlice = minNumIngredientsPerSlice;
        this.maxNumCellsSlice = maxNumCellsSlice;
    }

    public int getNumRows () {
        return numRows;
    }

    public void setNumRows (int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns () {
        return numColumns;
    }

    public void setNumColumns (int numColumns) {
        this.numColumns = numColumns;
    }

    public int getMinNumIngredientsPerSlice () {
        return minNumIngredientsPerSlice;
    }

    public void setMinNumIngredientsPerSlice (int minNumIngredientsPerSlice) {
        this.minNumIngredientsPerSlice = minNumIngredientsPerSlice;
    }

    public int getMaxNumCellsSlice () {
        return maxNumCellsSlice;
    }

    public void setMaxNumCellsSlice (int maxNumCellsSlice) {
        this.maxNumCellsSlice = maxNumCellsSlice;
    }

    @Override
    public String toString () {
        return "InputData{" + "numRows=" + numRows + ", numColumns=" + numColumns
                + ", minNumIngredientsPerSlice=" + minNumIngredientsPerSlice + ", maxNumCellsSlice="
                + maxNumCellsSlice + '}';
    }

}