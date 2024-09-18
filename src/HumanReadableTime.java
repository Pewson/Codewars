public class HumanReadableTime {
/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
 */

    public static String makeReadable(int seconds) {
        if (seconds > 359999){
            System.out.println("The maximum time can't exceed 359999");
            return "0";
        }
        int finalSeconds = seconds % 60;
        int minutes = seconds / 60;
        int finalMinutes = minutes % 60;
        int finalHours = minutes / 60;

        return String.format("%02d:%02d:%02d", finalHours, finalMinutes, finalSeconds);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(360000));
    }
}
