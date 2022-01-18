import org.junit.Assert;
import org.junit.Test;
import structural.adapter.RoundHole;
import structural.adapter.RoundPeg;
import structural.adapter.SquarePeg;
import structural.adapter.SquarePegAdapter;

public class TestAdapter {


    @Test
    public void whenRoundHoleIsEqualRoundPeg() {
        var roundHole = new RoundHole(5);
        var roundPeg = new RoundPeg(5);

        Assert.assertEquals(roundHole.fits(roundPeg) , Boolean.TRUE);
    }

    @Test
    public void whenAdapterSquarePegIsEqualToRoundHole(){
        var roundHole = new RoundHole(5);
        var smallSquarePeg = new SquarePeg(2);
        var smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);

        Assert.assertEquals(roundHole.fits(smallSquarePegAdapter),Boolean.TRUE);
    }

    @Test
    public void whenAdapterSquarePegIsNotEqualToRoundHole(){
        var roundHole = new RoundHole(5);
        var largeSquarePeg = new SquarePeg(10);
        var largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        Assert.assertNotEquals(roundHole.fits(largeSquarePegAdapter), Boolean.TRUE);
    }
}
