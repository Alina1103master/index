public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double height,weight;
        height = 1_75;
        weight = 74;

        int bmi = service.calculate((int) height,weight);
        System.out.println(bmi);
    }
}
