# -Java-Examples
.ly


import java.util.ArrayList;

public class Main {
    public static double total(ArrayList<? extends Number> prices) {
        double sum = 0;

        for (Number p : prices) {
            sum += p.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(20);
        prices.add(30);

        System.out.println(total(prices));
    }
}