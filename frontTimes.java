public class frontTimes {
    public String frontTimes(String str, int n) {
        String front = str.substring(0, Math.min(3, str.length()));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(front);
        }

        return result.toString();
    }

}
