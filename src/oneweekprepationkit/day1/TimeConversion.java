package oneweekprepationkit.day1;//https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem

public class TimeConversion {

    public static void main(String[] args) {
        timeConversion("07:05:45PM");
    }

    static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        boolean isTwelve = hour.equals("12");
        String timeWithoutSuffix = s.substring(0, s.length() - 2);

        if (s.endsWith("PM")) {
            if (isTwelve) {
                return timeWithoutSuffix;
            }
            return timeWithoutSuffix.replaceFirst(hour, Integer.parseInt(hour) + 12 + "");
        }
        if (s.endsWith("AM")) {
            if (isTwelve) {
                return timeWithoutSuffix.replaceFirst("12", "00");
            }
            return timeWithoutSuffix;
        }
        return "";
    }
}
