import java.util.Scanner;

public class SnakesNLadders
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int ladders[][] = new int[10][2];
        int tileNumber1 = 1, i = 0, j = 0;
        int snakes[][] = new int[10][2];
        int tileNumber2 = 1;

        int posplayer1 = 0, posplayer2 = 0;
        int tilePositions[] = new int[2];
        String namePlayer1, namePlayer2;
        String players[] = new String[2];
        System.out.println("Leptomeries paixnidiou: Oi 2 paiktes rixnoun enallax to zari gia na proxorisoun koutakia me skopo na ftasoun sto 100o k na kerdisoun! \n Kata tin diarkeia t paixnidiou mporei na pesoun se kapoies apo tis 10 skales p eiparxoun gia na voithisoun tous paiktes \n i se kapoio apo ta 10 fidia pou eiparxoun gia na diskolepsoun tous paiktes apo to na kerdisoun. \n Kali epitixia!");
        System.out.println("Ipenthimisi: Oi vaseis k oi korifes apo tis skales den mporoun na simpiptoun me ta kefalia i tis oures apo ta fidia! \n");

        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 1; j++)
            {
                while (tileNumber1 > 0 && tileNumber1 <= 100)
                {
                    System.out.println("Parakalo eisagete ton arithmo thesis gia tin vasi tis " + (i + 1) + "is skalas!");
                    tileNumber1 = input.nextInt();
                    ladders[i][0] = tileNumber1;
                    break;
                }
            }
        }
        for (i = 0; i < 10; i++)
        {
            for (j = 1; j < 2; j++)
            {
                while (tileNumber1 > 0 && tileNumber1 <= 100)
                {
                    System.out.println("Parakalo eisagete ton arithmo thesis gia tin korifi tis " + (i + 1) + "is skalas!");
                    tileNumber1 = input.nextInt();
                    ladders[i][1] = tileNumber1;
                    break;
                }
            }
        }

        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 1; j++)
            {
                while (tileNumber2 > 0 && tileNumber2 <= 100)
                {
                    System.out.println("Parakalo eisagete ton arithmo thesis gia to kefali apo to " + (i + 1) + "o fidaki!");
                    tileNumber2 = input.nextInt();
                    snakes[i][j] = tileNumber2;
                    break;
                }
            }
        }
        for (i = 0; i < 10; i++)
        {
            for (j = 1; j < 2; j++)
            {
                while (tileNumber2 > 0 && tileNumber2 <= 100)
                {
                    System.out.println("Parakalo eisagete ton arithmo thesis gia tin oura apo to " + (i + 1) + "o fidaki!");
                    tileNumber2 = input.nextInt();
                    snakes[i][1] = tileNumber2;
                    break;
                }
            }
        }

        tilePositions[0] = 0;
        tilePositions[1] = 0;

        System.out.println("Parakalo eisagete to onoma t 1ou paikti!");
        namePlayer1 = scanner.nextLine();
        players[0] = namePlayer1;

        System.out.println("Parakalo eisagete to onoma t 2ou paikti!");
        namePlayer2 = scanner.nextLine();
        players[1] = namePlayer2;

        int dice1 = 1, dice2 = 1;
        while ((dice1 >= 1 && dice1 <= 6) && (dice2 >= 1 && dice2 <= 6))
        {
            if (posplayer2 >= 100 && posplayer1 <= 100)
            {
                System.out.println("Game Over!");
                System.out.println("Sigxaritiria! O nikitis t paixnidiou einai o paiktis: " + players[1]);
            }
            else if (posplayer1 >= 100)
            {
                break;
            }
            else
            {
                System.out.println("Parakalo eisagete ti zaria tou 1ou paikti!");
                dice1 = input.nextInt();

                if (dice1 < 1 || dice1 > 6)
                {
                    System.out.println("Oops! I zaria den ginetai na einai mikroteri t 1 oute megaliteri t 6");
                    System.out.println("Parakalo eisagete sosti timi gia ti zaria tou 1ou paikti!");
                    dice1 = input.nextInt();
                }
                posplayer1 += dice1;
                System.out.println("O paiktis: " + players[0] + " proxorise stin thesi: " + posplayer1 + "\n");

                int newPosLad1 = check(ladders, posplayer1);
                if (newPosLad1 != -1)
                {
                    posplayer1 = ladders[newPosLad1][1];
                    System.out.println("Yeyy! Patises se vasi skalas, anevaineis stin korifi tis sti thesi: " + posplayer1 + "\n");
                }

                int newPosSnake1 = check(snakes, posplayer1);
                if (newPosSnake1 != -1)
                {
                    posplayer1 = snakes[newPosSnake1][1];
                    System.out.println("Ox! Patises se kefali fidiou, katevaineis stin oura t sti thesi: " + posplayer1 + "\n");
                }
            }

            if (posplayer1 >= 100 && posplayer2 <= 100)
            {
                System.out.println("Game Over!");
                System.out.println("Sigxaritiria! O nikitis t paixnidiou einai o paiktis: " + players[0]);
            }
            else if (posplayer2 >= 100)
            {
                break;
            }
            else
            System.out.println("Parakalo eisagete ti zaria t 2ou paikti!");
            dice2 = input.nextInt();

            if (dice2 < 1 || dice2 > 6)
            {
                System.out.println("Oops! I zaria den ginetai na einai mikroteri t 1 oute megaliteri t 6!");
                System.out.println("Parakalo eisagete sosti timi gia ti zaria t 2ou paikti!");
                dice2 = input.nextInt();
            }
            posplayer2 += dice2;
            System.out.println("O paiktis: " + players[1] + " proxorise sti thesi: " + posplayer2 + "\n");

            int newPosLad2 = check(ladders, posplayer2);
            if (newPosLad2 != -1)
            {
                posplayer2 = ladders[newPosLad2][1];
                System.out.println("Yeyy! Patises se vasi skalas, anevaineis stin korifi tis sti thesi: " + posplayer2 + "\n");
            }
            
            int newPosSnake2 = check(snakes, posplayer2);
            if (newPosSnake2 != -1)
            {
                posplayer2 = snakes[newPosSnake2][1];
                System.out.println("Ox! Patises se kefali fidiou, katevaineis stin oura t sti thesi: " + posplayer2 + "\n");
            }
        }
    }
    public static int check(int A[][], int B)
    {
        int i;
        boolean found = false;
        for (i = 0; i < 10; i++)
            if (A[i][0] == B)
            {
                found = true;
                break;
            }
            if (found)
                return - i;
            else
                return -1;
    }
}
