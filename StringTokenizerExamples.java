import java.util.StringTokenizer;

public class StringTokenizerExamples {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Let's pause, and " + "then reflect.");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}



