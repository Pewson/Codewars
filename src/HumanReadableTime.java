public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int finalSeconds =seconds%60;
        int minutes = seconds/60;
        int finalMinutes = minutes%60;
        int finalHours = minutes/60;

        return String.format("%02d:%02d:%02d", finalHours, finalMinutes, finalSeconds);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(78210));
    }
}
