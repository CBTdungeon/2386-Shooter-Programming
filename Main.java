public class Main {

    public static void main(String[] args) {

        double Distance = 8.23;

        double Height = 2.64;

        double S_value = Trajectory.S_value(Distance);
        System.out.println("the S value is: "+ S_value);

        double Angle = Trajectory.Angle(Distance, Height, S_value);
        System.out.println("the Angle to shoot is: "+ Angle);

        double Velocity = Trajectory.Velocity(8.23,Angle,2.64);
        System.out.println("the velocity of the ball is: "+ Velocity);
    }
}
