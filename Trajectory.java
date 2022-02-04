public class Trajectory {

    public static double theoDistance(double distance){
        double c1 = Math.pow(distance,2)*0.0378;
        double c2 = 1.15*distance + c1 ;
        double theoDistance = c2 + 0.0397;
        return theoDistance;
    }

    public static double sValue(double distance) {

        double sValue = (0.0679*Math.pow(distance,2))+(2.38*distance)-89.6;
        return sValue;
    }

    public static double Angle(double distance, double height, double sValue) {

        double t1 = Math.tan(Math.toRadians(sValue))* distance - (2*height);
        double t2 = t1/(-1*distance);
        double t3 = Math.atan((t2));
        double angle = Math.toDegrees(t3);  
        return angle;
    }  

    public static double Velocity(double distance, double angle, double height) {

        double t1 = -9.81*Math.pow(distance,2);
        double t12 = (Math.pow(Math.tan(Math.toRadians(angle)),2)+ 1) * t1;
        double t2 = (2*height - 2* distance * Math.tan(Math.toRadians(angle)));
        double t22 = t12/t2;
        double Velocity = Math.sqrt(t22);
        return Velocity;
    }

}