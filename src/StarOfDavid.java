import java.util.Scanner;

public class StarOfDavid
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to be used to scale the Star of David: ");
        int number = keyboard.nextInt();
        System.out.println("If you would like the Star of David to be wide, enter 'yes', otherwise click enter to continue.");
        keyboard.nextLine();
        String isWide = keyboard.nextLine();
        boolean useExtra = isWide.equalsIgnoreCase("yes");
        System.out.println(createStarOfDavid(number, useExtra));
    }

    private static String createStarOfDavid(int n, boolean isExtraSpace)
    {
        StringBuilder builder = new StringBuilder();
        int m = n / 3;

        for (int row = 0; row < (n + m + 1); row++)
        {
            for (int col = 0; col < (2 * n + 1); col++)
            {
                //triangle bases
                if (row == n || row == m)
                {
                   builder.append("*");
                }
                //left diagonal top triangle
                else if (row + col == n)
                {
                   builder.append("*");
                }
                //left diagonal bottom triangle
                else if (row - col == m)
                {
                    builder.append("*");
                }
                //right diagonal top triangle
                else if (col - row == n)
                {
                   builder.append("*");
                }
                //right diagonal bottom triangle
                else if (row + col == (n * 2 + m))
                {
                   builder.append("*");
                }
                //
                else
                {
                    builder.append(" ");
                }
                if (isExtraSpace)
                {
                    builder.append(" ");
                }
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
