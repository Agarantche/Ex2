public class Main {
    public static void main(String[] args) {

        String[] days = { "Sunday", "Monday", "Tuesday","wednesday", "Thursday", "Friday", "Saturday"};
        int[] currentTemperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] probabilityPrecipitation = { 95, 60, 25, 5, 0, 75, 90};


        for (int i = 0;i < days.length; i++) {
            if (currentTemperatures[i] <= 32 && probabilityPrecipitation[i] >= 50) {
                System.out.println(days[i]);
            }

        }
    }
}