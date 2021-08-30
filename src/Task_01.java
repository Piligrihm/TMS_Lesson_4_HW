import java.util.Scanner;
import com.tms.finder.wordFinder;

public class Task_01 extends wordFinder {
    public static void main(String[] args) {
        String str1 = "aaaaa 4354 bbbbbb f s wwwwwww cccc";

        System.out.println(str1);

        findLastShortestWord(str1);
        findLongestWord(str1);

        findLastShortestWord("");
        findLongestWord(null);
    }
}
