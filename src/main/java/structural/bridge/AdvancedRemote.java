package structural.bridge;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device){
        super.device = device;
    }

    public void mute(){
        device.setVolume(0);
    }
}
