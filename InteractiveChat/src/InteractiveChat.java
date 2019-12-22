import java.*;
import java.time.*;
import java.util.Scanner;

public class InteractiveChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_members = scan.nextInt();
        Member member = null;
        for (int i = 0; i < number_of_members; ++i) {
            member = new ActiveMember("mem", i);
            System.out.println("Press 1,and send your message.");
            System.out.println("Press 2,and exit from chat.");
            int choice = scan.nextInt();
            if (choice == 2) {
                member = null;
            } else {

                LocalDate date = LocalDate.now(); // получаем текущую дату
                int year = date.getYear();
                int month = date.getMonthValue();
                int dayOfMonth = date.getDayOfMonth();
                DayOfWeek dayOfWeek = date.getDayOfWeek();
                System.out.printf("%d.%d.%d ", dayOfMonth, month, year, " ");
                LocalTime localTime = LocalTime.now();
                System.out.print(localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond() + " ");
                System.out.print(member + " ");
                ((ActiveMember) member).send_message();
            }
        }
        }


}
