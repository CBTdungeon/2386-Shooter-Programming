public class Trajectory {

    public static double S_value(double distance) {

        double S_va = 0.354*Math.pow(distance,2)+3.4*distance-88.8;
        return S_va;
    }

    public static double Angle(double distance, double height, double S_value) {

        double t1 = Math.tan(Math.toRadians(S_value))* distance - (2*height);
        double t2 = t1/(-1*distance);
        double t3 = Math.atan((t2));
        double angle = Math.toDegrees(t3);
        return angle;
    }  

    public static double Velocity(double distance, double angle, double height) {

        double t1 = -9.81*Math.pow(distance,2)*(1+Math.pow(Math.tan(Math.toRadians(angle)),2));
        double t2 = t1/(2*height - 2* distance * Math.tan(Math.toRadians(angle)));
        double Velocity = Math.sqrt(t2);
        return Velocity;
    }

}