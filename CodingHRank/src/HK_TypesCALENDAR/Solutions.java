package HK_TypesCALENDAR;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String findDay(int month, int day, int year) {
        
        String [] day_of_week={"SUNDAY", "MONDAY", "TUESDAY","WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        Calendar cal=Calendar.getInstance();
        
        cal.set(year, month-1, day);
        int p=cal.get(Calendar.DAY_OF_WEEK);
        
        return day_of_week[p-1];

    }

}

public class Solutions {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
