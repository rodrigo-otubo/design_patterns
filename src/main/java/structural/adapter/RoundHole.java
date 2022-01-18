package structural.adapter;

/**
 * BURACOS REDONDOS são compatíveis com pinos redondos
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius){ this.radius = radius; }

    public double getRadius(){ return this.radius; }

    public boolean fits(RoundPeg roundPeg){
      return this.getRadius() >= roundPeg.getRadius();
    }
}
