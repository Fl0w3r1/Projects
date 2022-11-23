import java.util.Scanner;

public class SnakesNLadders4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isRightNumber;
        int i = 0, number, dice, k = 0, theseis, counter = 0;
        int ladd[][] = new int[10][2];
        int snake[][] = new int[10][2];
        String player[] = new String[2];
        int posi[] = {0,0};
        int checkNumber;

        while (i < 10)
        {
            System.out.println("Eisagete enan arithmo metaxi 1 k 100: ");
            number = input.nextInt();
            isRightNumber = ((number < 1) || (number > 100));
                if ((!isRightNumber) && ((number + 20) <= 100))
                {
                    ladd[i][0] = number;
                    ladd[i][1] = number + 20;
                    i++;
                }
        }

        i = 0;
        while (i < 10)
        {
            System.out.println("Eisagete enan arithmo metaxi 1 k 100: ");
            number = input.nextInt();
            isRightNumber = ((number < 1) || (number > 100));
                if ((!isRightNumber) && ((number - 115) >= 1))
                {
                    snake[i][0] = number;
                    snake[i][1] = number - 14;
                    i++;
                }
        }

        System.out.println("Eisagete to onoma t protou paikti: ");
        player[0] = input.next();
        System.out.println("Eisagete to onoma t deuterou paikti: ");
        player[1] = input.next();

        while ((posi[0] < 100) && (posi[1] < 100))
        {
            dice = 0;
            while (dice < 1 || dice > 6)
            {
                System.out.println(player[k] + " rixe to zari: ");
                dice = input.nextInt();
            }
            theseis = posi[k] + dice;
            counter = counter + 1;
            if ((counter % 2) != 0)
                k = 0;
            else
                k = 1;
            System.out.println(player[k] + " i nea s thesi einai sto tetragono: " + theseis);
            checkNumber = check(ladd, theseis);
                if (checkNumber != -1)
                    {
                        System.out.println("Petixes skala k tha aneveis sti thesi: " + ladd[checkNumber][1]);
                        posi[k] = ladd[checkNumber][1];
                    }
                else
                {
                    checkNumber = check(snake, theseis);
                        if (checkNumber != -1)
                        {
                            System.out.println("Distixos vreikes fidi k tha kateveis sti thesi: " + snake[checkNumber][1]);
                            posi[k] = snake[checkNumber][1];
                        }
                        else
                            posi[k] = posi[k] + dice;
                }

            if (k == 0)
                k = 1;
            else
                k = 0;
        }

        if (posi[0] >= 100)
            System.out.println("O nikitis einai o paiktis: " + player[0]);
        else
            System.out.println("O nikitis einai o paiktis: " + player[1]);
    }

    public static int check(int A[][], int B)
    {
        int i;
        boolean found = false;
        for (i = 0; i < 10; i++)
        {
            if (A[i][0] == B)
            {
                found = true;
                break;
            }
        }
        if (found)
            return i;
        else
            return -1;
    }
}
