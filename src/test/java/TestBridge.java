import structural.bridge.AdvancedRemote;
import structural.bridge.BasicRemote;
import structural.bridge.Radio;
import structural.bridge.Tv;
import org.junit.Assert;
import org.junit.Test;

public class TestBridge {

    @Test
    public void checkDefaultObjectTv() {
       var tv = new Tv();
       Assert.assertEquals(tv.isEnabled(), Boolean.FALSE);
       Assert.assertEquals(tv.getChannel(), 1);
       Assert.assertEquals(tv.getVolume(), 30);
    }

    @Test
    public void whenPowerTv(){
        var tv = new Tv();
        var basicRemote = new BasicRemote(tv);
        basicRemote.power();
        Assert.assertEquals(tv.isEnabled(), Boolean.TRUE);
    }

    @Test
    public void whenChangeDownChannelTv(){
        var tv = new Tv();
        var basicRemote = new BasicRemote(tv);
        basicRemote.channelDown();
        Assert.assertEquals(tv.getChannel(), 0);
    }

    @Test
    public void whenChangeUpChannelTv(){
        var tv = new Tv();
        var basicRemote = new BasicRemote(tv);
        basicRemote.channelUp();
        Assert.assertEquals(tv.getChannel(), 2);
    }

    @Test
    public void whenVolumeDownTv(){
        var tv = new Tv();
        var basicRemote = new BasicRemote(tv);
        basicRemote.volumeDown();
        Assert.assertEquals(tv.getVolume(), 20);
    }

    @Test
    public void whenVolumeUpTv(){
        var tv = new Tv();
        var basicRemote = new BasicRemote(tv);
        basicRemote.volumeUp();
        Assert.assertEquals(tv.getVolume(), 40);
    }

    @Test
    public void whenAdvancedRemoteTv(){
        var tv = new Tv();
        var advancedRemote = new AdvancedRemote(tv);

        advancedRemote.mute();

        Assert.assertEquals(tv.getVolume(), 0);
    }

    @Test
    public void checkDefaultObjectRadio() {
        var radio = new Radio();
        Assert.assertEquals(radio.isEnabled(), Boolean.FALSE);
        Assert.assertEquals(radio.getChannel(), 1);
        Assert.assertEquals(radio.getVolume(), 30);
    }

    @Test
    public void whenPowerRadio(){
        var radio = new Radio();
        var basicRemote = new BasicRemote(radio);
        basicRemote.power();
        Assert.assertEquals(radio.isEnabled(), Boolean.TRUE);
    }

    @Test
    public void whenChangeDownChannelRadio(){
        var radio = new Radio();
        var basicRemote = new BasicRemote(radio);
        basicRemote.channelDown();
        Assert.assertEquals(radio.getChannel(), 0);
    }

    @Test
    public void whenChangeUpChannelRadio(){
        var radio = new Radio();
        var basicRemote = new BasicRemote(radio);
        basicRemote.channelUp();
        Assert.assertEquals(radio.getChannel(), 2);
    }

    @Test
    public void whenVolumeDownRadio(){
        var radio = new Radio();
        var basicRemote = new BasicRemote(radio);
        basicRemote.volumeDown();
        Assert.assertEquals(radio.getVolume(), 20);
    }

    @Test
    public void whenVolumeUpRadio(){
        var radio = new Radio();
        var basicRemote = new BasicRemote(radio);
        basicRemote.volumeUp();
        Assert.assertEquals(radio.getVolume(), 40);
    }

    @Test
    public void whenAdvancedRemoteRadio(){
        var radio = new Radio();
        var advancedRemote = new AdvancedRemote(radio);

        advancedRemote.mute();

        Assert.assertEquals(radio.getVolume(), 0);
    }
}
