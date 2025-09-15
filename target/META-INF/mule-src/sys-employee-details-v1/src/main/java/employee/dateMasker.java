package employee;

public class dateMasker {
    public static String maskYear(String date) {
        if (date == null || !date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return date; // return original if not in expected format
        }
        return "XXXX" + date.substring(4);
    }
}