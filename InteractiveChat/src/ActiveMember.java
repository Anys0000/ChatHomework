import java.util.Scanner;

public class ActiveMember extends Member {

    public ActiveMember(String name, int number) {
        super(name, number);
    }

    public void exit_chat(){

    }
    public void send_message(){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);
    }
}
