package lab10_5;

import java.util.Random;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public void fillRandom(double a, double b){
        Random random = new Random();
        for(int i = 0; i<this.rows; ++i){
            for(int j = 0; j<this.columns; ++j){
                this.data[i][j] = random.nextDouble()*(b-a)+a;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix(){
        for(int i = 0; i<rows; ++i){
            for(int j = 0; j<columns; ++j){
                System.out.printf("%6.2f ",data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Matrix add(Matrix m1, Matrix m2){
        if(m1.rows != m2.rows || m1.columns != m2.columns){
            System.out.println("error Mx add");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m1.columns);
        for(int i = 0; i<m1.rows; ++i){
            for(int j = 0; j<m1.columns; ++j){
                result.data[i][j] = m1.data[i][j]+m2.data[i][j];
            }
        }
        return result;
    }

    public static Matrix multiply(Matrix m1, Matrix m2){
        if(m1.rows != m2.columns || m1.columns != m2.rows){
            System.out.println("error Mx multiply");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m2.columns);
        for(int i = 0; i<m1.rows; ++i){
            for(int j = 0; j<m2.columns; ++j){
                for(int k = 0; k< m2.rows; ++k){
                    result.data[i][j] += m1.data[i][k]+m2.data[k][j];
                }
            }
        }
        return result;
    }

    public static Matrix transpose(Matrix m1){
        Matrix result = new Matrix(m1.columns, m1.rows);
        for(int i = 0; i<m1.rows; ++i){
            for(int j = 0; j<m1.columns; ++j){
                result.data[j][i] = m1.data[i][j];
            }
        }
        return result;
    }
}
