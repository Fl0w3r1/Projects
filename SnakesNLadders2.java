import java.util.Scanner;

public class SnakesNLadders2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //Scanner gia na paro tis times apo ton xristi
        int lad[][] = new int[10][2]; //Pinakas gia tis skales
        int sn[][] = new int[10][2]; //Pinakas gia ta fidia
        String player[] = new String[2]; //Pinakas gia ta onomata ton paikton
        int position[] = new int[2]; //Pinakas gia tin topothesia ton paikton
        //Metavlites gia to kato k pano meros tis skalas k ton fidion antistoixa
        int ladderD = 0;
        int ladderU = 0;
        int snakeD = 0;
        int snakeU = 0;

        //O xristis dinei tis skales
        System.out.println("Dose 10 skales\n");
        for (int i = 0; i < 10; i++)
        {
            do
            {
                System.out.println("Skala " + (i + 1) + ":");
                ladderD = keyboard.nextInt();
                ladderU = keyboard.nextInt();
            }
            while (! (ladderD >= 1 && ladderD <= 100) || ! (ladderU >= 1 && ladderU <= 100));
            lad[i][0] = ladderD;
            lad[i][1] = ladderU;
        }

        //O xristis dinei ta fidia
        System.out.println("Dose 10 fidia\n");
        for (int i = 0; i < 10; i++)
        {
            do
            {
                System.out.println("Fidi " + (i + 1) + ":");
                snakeD = keyboard.nextInt();
                snakeU = keyboard.nextInt();
            }
            while (! (snakeD >= 1 && snakeD <= 100) || ! (snakeU >= 1 && snakeU <= 100));
            sn[i][0] = snakeD;
            sn[i][1] = snakeU;
        }

        //O xristis dinei ta onomata
        System.out.println("Onomata paikton");
        System.out.println("Onoma paikti 1: ");
        player[0] = keyboard.next();
        position[0] = 0;
        System.out.println("Onoma paikti 2: ");
        player[1] = keyboard.next();
        position[1] = 0;

        int flag = -1; //Dimiourgo flag gia na paizoun oi xristes enallax
        int dice = 0;
        while (! (isWinner(position[0]) || isWinner(position[1])))
        //An den einai kanenas nikitis sinexize na paizeis
        {
            flag++; //To auxano kata 1 kathe fora p paizoun oi xristes
            if (flag % 2 == 0)
            //O protos paizei otan einai zigoi oi aritmoi
            {
                do
                {
                    System.out.println("Dose zaria gia ton " + player[0]);
                    dice = keyboard.nextInt();
                }
                while (! (dice >= 1 && dice <= 6));
                position[0] += dice;
                System.out.println(player[0] + " einai se thesi " + position[0]);
                //Elegxos gia skala
                int l = check(lad, position[0]);
                if (l != 0)
                {
                    System.out.println("Petixes skala k tha aneveis sti thesi: " + l);
                    position[0] = l;
                }
                //Elegxos gia fidi
                int s = check (sn, position[0]);
                if (s != 0)
                {
                    System.out.println("Distixos vreikes fidi k tha kateveis sti thesi: " + s);
                    position[0] = s;
                }
            }
            else
            //O deuteros paizei otan einai artioi oi arithmoi
            {
                do
                {
                    System.out.println("Dose zaria gia ton " + player[1]);
                    dice = keyboard.nextInt();
                }
                while (! (dice >= 1 && dice <= 6)); //Krataei to zari an einai pano apo 1 k kato apo 6
                position[1] += dice;
                System.out.println(player[1] + " einai sti thesi " + position[1]);
                //Elegxos gia skala
                int l = check(lad, position[1]);
                if (l != 0)
                {
                    System.out.println("Petixes skala k tha aneveis sti thesi: " + l);
                    position[1] = l;
                }
                //Elegxos gia fidi
                int s = check(sn, position[1]);
                if (s != 0)
                {
                    System.out.println("Distixos vreikes fidi k tha aneveis sti thesi: " + s);
                    position[1] = s;
                }
            }
        }
        if (isWinner(position[0]))
        {
            System.out.println("O " + player[0] + " einai o nikitis!");
        }
        else
        {
            System.out.println("O " + player[1] + " einai o nikitis!");
        }
        keyboard.close();
    }
    
    public static boolean isWinner(int position)
    {
    //Elegxo an i thesi t xristi einai pano apo 100 na vgainei nikitis
        if (position >= 100)
        {
            return true;
        }
        return false;
    }

    public static int check (int a[][], int b)
    {
    //Elegxo an o xristis einai se skala i fidi
    for (int i = 0; i < 10; i++)
    {
        if (a[i][0] == b)
        {
            return a[i][1];
        }
    }
    return 0;
    }
}
