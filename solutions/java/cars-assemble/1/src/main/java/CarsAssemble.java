public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prod=221;
        if(speed<5){
            return prod*speed;
        }
        else if(speed<9){
            return (speed*prod*0.9);
        }
        else if(speed==9)
            return (speed*prod*0.8);
        else return (speed*prod*0.77);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}
