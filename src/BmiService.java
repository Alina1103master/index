public class BmiService {
    public int calculate(int height, double weight) {
        height = 1_75;
        weight = 74;
        double bmi =  weight / height ;
        return (int) (weight / height);

    }

}

