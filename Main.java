public class Main {
    public static void main(String[] args) {

        double S_value = Trajectory.S_value(8.23);
        System.out.println(S_value);

        double Angle = Trajectory.Angle(8.23, 2.64, S_value);
        System.out.println(Angle);
    }
}
