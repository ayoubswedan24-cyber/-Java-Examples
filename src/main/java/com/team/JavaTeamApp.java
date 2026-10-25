public class Reading<T> {
    private String sensor;
    private T value;

    public Reading(String sensor, T value) {
        this.sensor = sensor;
        this.value = value;
    }

    String getSensor() { return sensor; }
    T getValue() { return value; }

    public String toString() {
        return sensor + ": " + value.toString();
    }
}
public class Temperature<T extends Number> {
    private String city;
    private T celsius;

    public Temperature(String city, T celsius) {
        this.city = city;
        this.celsius = celsius;
    }

    String getCity() { return city; }
    T getCelsius() { return celsius; }

    
    double toFahrenheit() {
        double c = celsius.doubleValue();
        return c * 9 / 5 + 32;
    }

    public String toString() {
        return city + ": " + celsius.toString() + " C";
    }
}public class Main {

    

    
    static void show(Reading<?> r) {
        System.out.println(r);
    }

    
    static double asNumber(Reading<?> r) {
        Number n = (Number) r.getValue();      
        return n.doubleValue();
    }

    

    
    static double asNumberSafe(Reading<? extends Number> r) {
        Number n = r.getValue();               
        return n.doubleValue();
    }

    
    static double average(Temperature<? extends Number> a, Temperature<? extends Number> b) {
        double x = a.getCelsius().doubleValue();
        double y = b.getCelsius().doubleValue();
        return (x + y) / 2;
    }

    
    static <T extends Number> Temperature<T> hotter(Temperature<T> a, Temperature<T> b) {
        if (a.getCelsius().doubleValue() >= b.getCelsius().doubleValue()) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.println("--- Generic class ---");
        Reading<String> status = new Reading<String>("Status", "OK");
        Reading<Integer> humidity = new Reading<Integer>("Humidity", 60);
        Reading<Double> pressure = new Reading<Double>("Pressure", 1013.2);
        System.out.println(status);                       // Status: OK
        System.out.println(humidity);                     // Humidity: 60
        System.out.println(pressure);                     // Pressure: 1013.2

        System.out.println("--- Wildcard ---");
        show(status);                                     // Status: OK
        show(humidity);                                   // Humidity: 60
        System.out.println(asNumber(humidity));           // 60.0
        
        System.out.println("--- Constraining ---");
        System.out.println(asNumberSafe(humidity));       // 60.0
        System.out.println(asNumberSafe(pressure));       // 1013.2
        
        Temperature<Integer> cairo = new Temperature<Integer>("Cairo", 35);    // Ok
        Temperature<Integer> riyadh = new Temperature<Integer>("Riyadh", 45);  // Ok
        Temperature<Double> oslo = new Temperature<Double>("Oslo", 5.0);       // Ok
        
        System.out.println(cairo.toFahrenheit());         // 95.0
        System.out.println(oslo.toFahrenheit());          // 41.0
        System.out.println(average(cairo, oslo));         // 20.0  (Integer and Double mixed)
        System.out.println(hotter(cairo, riyadh));        // Riyadh: 45 C
        
    }
}

