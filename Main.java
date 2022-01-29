public class Main {

    public static void main(String[] args) {

        double Distance = 8.23;

        double Height = 2.64;

        double sValue = Trajectory.sValue(Distance);
        System.out.println("the S value is: "+ sValue);

        double Angle = Trajectory.Angle(Distance, Height, sValue);
        System.out.println("the Angle to shoot is: "+ Angle);

        double Velocity = Trajectory.Velocity(8.23,Angle,2.64);
        System.out.println("the velocity of the ball is: "+ Velocity);
    }
}
