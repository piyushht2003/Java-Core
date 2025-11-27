package If_Else;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C.P. : ");
        double cp = sc.nextDouble();
        System.out.print("Enter S.P. : ");
        double sp = sc.nextDouble();
        double profit = sp - cp;
        double loss = cp - sp;
        double profitPercentage = (profit/cp)*100;
        double lossPercentage = (loss/cp)*100;
        sc.close();
        if (sp > cp) System.out.println("Profit is : " + profit + " " + "And Profit percentage is : " + profitPercentage + "%");
        else if (sp == cp) System.out.println("No profit no loss");
        else System.out.println("Loss is : " + loss + "And Loss percentage is : " + lossPercentage + "%");

    }
}
