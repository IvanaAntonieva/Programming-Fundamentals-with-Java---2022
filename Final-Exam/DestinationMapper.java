import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destinations = scanner.nextLine();

        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(destinations);

        List<String> destinationsList = new ArrayList<>();
        int points = 0;

        while (matcher.find()) {
            String validDestination = matcher.group("destination");
            destinationsList.add(validDestination);
            points += validDestination.length();
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinationsList));
        System.out.println("Travel Points: " + points);
    }
}
