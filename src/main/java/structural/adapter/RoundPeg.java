package structural.adapter;

/**
 * PINOS REDONDOS são compatíveis com buracos redondos
 */
public class RoundPeg {

    private double radius;

    public RoundPeg(){}

    public RoundPeg(double radius){ this.radius = radius; }

    public double getRadius(){ return this.radius; }
}
