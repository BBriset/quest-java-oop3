public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude=altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    @Override
    public void takeOff() {
        System.out.println(this.getName() +" takes off in the sky.");
    }
    @Override
    public void land() {
        if(getAltitude()<=1){
            System.out.println(this.getName() +" lands on the ground");
        }
        else{
            System.out.println(this.getName() +" is too high, it can't lands.");
        }
    }
    @Override
    public void ascend(int i) {
        setAltitude(getAltitude()+i);
        System.out.println(this.getName() +" flies upward, altitude : "+getAltitude());
        
    }
    @Override
    public void glide() {
        System.out.println(" It glides into the air.");
    }
    @Override
    public void descend(int i) {
        setAltitude(getAltitude()-i);
        System.out.println(this.getName() +" flies downward, altitude : "+getAltitude());
    }
}
