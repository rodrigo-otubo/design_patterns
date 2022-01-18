package structural.adapter;

/**
 * PINOS QUADRADOS não são compatíveis com buracos redondos,
 * porém temos que nos adaptar com os buracos/pinos redondos
 */
public class SquarePeg {

    private double width;

    public SquarePeg(double width){ this.width = width; }

    public double getWidth(){ return this.width; }

    public double getSquare(){
      return Math.pow(this.width, 2);
    }

}
