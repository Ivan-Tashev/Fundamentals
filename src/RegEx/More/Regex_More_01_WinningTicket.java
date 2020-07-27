package RegEx.More;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_More_01_WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cash$$$$$$Ca$$$$$$sh
        //$$$$$$$$$$$$$$$$$$$$, aabb  , th@@@@@@eemo@@@@@@ey
        //validticketnomatch:(

        String[] tickets = scanner.nextLine().split(",\\s+");
        Pattern sixToNine = Pattern.compile("[@#$^]{6,9}");
        Pattern ten = Pattern.compile("[@#$^]{10}");

        for (int i = 0; i < tickets.length; i++) {
            String ticket = tickets[i];
            if (ticket.length() < 20) {
                System.out.println("invalid ticket");
                continue;
            }
            String left = ticket.substring(0, 10);
            String right = ticket.substring(10, 20);

            Matcher jackpot = ten.matcher(ticket);
            Matcher winLeft = sixToNine.matcher(left);
            Matcher winRight = sixToNine.matcher(right);

            if (jackpot.find()) {
                System.out.println(String.format("ticket \"%s\" - 10%c Jackpot!", ticket, ticket.charAt(0)));
            } else if (winLeft.find() && winRight.find()) {
                int count = winLeft.group().length();
                System.out.println(String.format("ticket \"%s\" - %d%c", ticket, count, left.charAt(5)));
            } else if (!jackpot.find() || winLeft.find() || winRight.find()) {
                System.out.println(String.format("ticket \"%s\" - no match", ticket));
            }
        }
    }
}