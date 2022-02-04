public class Main {

    public static void main(String[] args) {

        double Distance = 8.23;
        System.out.println("limelight distance is: "+ Distance);

        double Height = 2.64;
        System.out.println("limelight height is: "+ Height);

        double theoDistance = Trajectory.theoDistance(Distance);
        System.out.println("the distance to negate air resistance is: " + theoDistance);

        double sValue = Trajectory.sValue(theoDistance);
        System.out.println("the S value is: "+ sValue);

        double Angle = Trajectory.Angle(theoDistance, Height, sValue);
        System.out.println("the Angle to shoot is: "+ Angle);

        double Velocity = Trajectory.Velocity(theoDistance,Angle,Height);
        System.out.println("the velocity of the ball is: "+ Velocity);
    }
}
