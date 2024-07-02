import java.util.*;

class Game {
    public int number;
    public int guessnum = 0;
    public int num;

    Game() {
        Random sc = new Random();
        this.number = sc.nextInt(100);
        ;
    }

    public void takeuserinput() {
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
    }

    public boolean iscorrectnum() {
        guessnum++;
        if (number == num) {
            System.out.println("you have guess the correct num");
            System.out.format("no of gueses is %d", guessnum);
            System.out.println();
            return true;
        } else if (num < number) {
            System.out.println("too less");
        } else if (num > number) {
            System.out.println("too high");
        }
        return false;

    }
}

public class numbergame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrectnum();

        }
    }
}
