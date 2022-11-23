import java.util.Scanner;

public class SnakesNLadders3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int skala[][] = new int[10][2];
        int num = 1, i = 0, j = 0;
        int pos1 = 0, pos2 = 0;
        String onoma1, onoma2;
        int pos[] = new int[2];
        String paiktis[] = new String[2];

        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 2; j++)
            {
                while (num > 0 && num <= 100)
                {
                    System.out.println("Doste arithmo gia ti skala: ");
                    num = input.nextInt();
                    skala[i][j] = num;
                    break;
                }
            }
        }

        int fidia[][] = new int[10][2];
        int num2 = 1;

        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 2; j++)
            {
                while (num2 > 0 && num2 <= 100)
                {
                    System.out.println("Doste arithmo gia to fidaki: ");
                    num2 = input.nextInt();
                    fidia[i][j] = num2;
                    break;
                }
            }
        }

        pos[0] = 0;
        pos[1] = 0;
        System.out.println("Onoma paikti 1:" + "\n");
        onoma1 = scanner.nextLine();
        paiktis[0] = onoma1;

        System.out.println("Onoma paikti 2:" + "\n");
        onoma2 = scanner.nextLine();
        paiktis[1] = onoma2;

        int ripsi1 = 1, ripsi2 = 1;
        while ((ripsi1 >= 1 && ripsi1 <= 6) && (ripsi2 >= 1 && ripsi2 <= 6))
        {
            System.out.println("Doste arithmo zariou: ");
            ripsi1 = input.nextInt();
            pos1 += ripsi1;

            if (ripsi1 < 1 || ripsi1 > 6)
                System.out.println("Akiro. Lathos eisodos!");
            else
                System.out.println("O paiktis: " + paiktis[0] + " vrisketai sti thesi: " + pos1 + "\n");
            
            check(skala, pos1);
            int k1 = check(skala, pos1);
            if (k1 != 0)
            {
                int var1 = skala[k1][0];
                pos1 += var1;
                System.out.println("Anevaineis skala, metakinise sti thesi: " + pos1);
            }

            check(fidia, pos1);
            int k2 = check(fidia, pos1);
            if (k2 != 0)
            {
                int var2 = skala[k2][0];
                pos1 -= var2;
                System.out.println("Epeses pano se fidi, katevaineis pio kato sti thesi: " + pos1);
            }

            System.out.println("Doste arithmo zariou: ");
            ripsi2 = input.nextInt();
            pos2 += ripsi2;

            if (ripsi2 < 1 || ripsi2 > 6)
                System.out.println("Akiro. Lathos eisodos!");
            else
                System.out.println("O paiktis: " + paiktis[1] + " vrisketai sti thesi: " + pos2 + "\n");

            check(skala, pos2);
            int k3 = check(skala, pos2);
            if (k3 > 0)
            {
                int var3 = skala[k3][0];
                pos2 += var3;
                System.out.println("Anevaineis skala, metakinise sti thesi: " + pos2);
            }

            check(fidia, pos2);
            int k4 = check(fidia, pos2);
            if (k4 > 0)
            {
                int var4 = skala[k4][0];
                pos2 -= var4;
                System.out.println("Epeses pano se fidi, katevaineis pio kato sti thesi: " + pos2);
            }

            if ((pos1 >= 100) || (pos2 >= 100))
                break;
        }
        if (pos1 >= 100)
            System.out.println("O nikitis t paixnidiou einai o paiktis: " + paiktis[0]);
        else if (pos2 >= 100)
            System.out.println("O nikitis t paixnidiou einai o paiktis: " + paiktis[1]);
    }
    public static int check(int A[][], int B)
    {
        int k = 0;
        for (int i = 0; i < 2; i++)
        {
            if (A[i][0] == B)
                k = i;
            else
                k = -1;
        }
        return k;
    }
}
