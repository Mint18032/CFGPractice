public class trainFareCalculating {

    public static int trainFareCalculate(int h, int age) {
        if(!isValidAge(age) || !isValidHour(h)) {
            return -1;
        }
        if (age >= 0 && age < 6) {
            return 0;
        }
        if (isPeakHour(h)) {
            if (age >= 6 && age <= 10) return 45000;
            if (age > 10 && age < 60) return 60000;
            return 51000;
        }
        // (h >= 9 && h < 17) || (h >= 19 && h < 24)
        if (age >= 6 && age <= 10) return 30000;
        if (age > 10 && age < 60) return 40000;
        return 34000;
    }


    /**
     * @param h hour
     * @return true if the hour is valid.
     */
    private static boolean isValidHour(int h) {
        return (h >= 0 && h < 24);
    }

    /**
     * @param age age of customer
     * @return true if the age is valid.
     */
    private static boolean isValidAge(int age) {
        return (age >= 0 && age <= 200);
    }

    /**
     * @param h hour
     */
    private static boolean isPeakHour(int h) {
        return (h >= 0 && h < 9) || (h >= 17 && h < 19);
    }
}