package lab5_2;

public class Main {
    public static void main (String[] args){

        Matrix m1 = new Matrix(2,3);
        m1.fillRandom(1,3);
        m1.printMatrix();

        Matrix m2 = new Matrix(2,3);
        m2.fillRandom(1,3);
        m2.printMatrix();

        Matrix m3 = new Matrix(3,2);
        m3.fillRandom(1,3);
        m3.printMatrix();

        Matrix.add(m1,m2).printMatrix();;
        Matrix.multiply(m1,m3).printMatrix();
        Matrix.transpose(m1).printMatrix();
    }

}
