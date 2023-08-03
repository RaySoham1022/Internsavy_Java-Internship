import java.util.*;
 
public class Currency_Converter
{
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro, yen, yuan, ruble ;
      int select;
 
 
      Scanner sc = new Scanner(System.in);

    System.out.println("Currency Conversion Tool");
    System.out.println("----------------------------\n");
 
      System.out.println("Select Your Currency Type :");
      System.out.println("Enter 1 for Indian Rupee");
      System.out.println("Enter 2 for US Dollar");
      System.out.println("Enter 3 for Pound");
      System.out.println("Enter 4 for Euro");
      System.out.println("Enter 5 for Japanese Yen");
      System.out.println("Enter 6 for Chinese Yuan");
      System.out.println("Enter 7 for Russian Ruble");
 
      System.out.print("\nEnter Your Choice  : ");
      select = sc.nextInt();
 
      System.out.print("Enter the Amount : ");
      amount = sc.nextFloat();
      System.out.print("\n");
 
      switch (select)
      {
         case 1:  // Converting from Rupee
            dollar = amount * 0.012 ;
            System.out.println(amount + " Rupee = " + dollar + " Dollar");
 
            pound = amount * 0.0095;
            System.out.println(amount + " Rupee = " + pound + " Pound");
 
            euro = amount * 0.011 ;
            System.out.println(amount + " Rupee = " + euro + " Euro");
 
            yen = amount * 1.74 ;
            System.out.println(amount + " Rupee = " + yen + " Yen");
 
            yuan = amount * 0.086 ;
            System.out.println(amount + " Rupee = " + yuan + " Yuan");

            ruble = amount * 1.14;
            System.out.println(amount + " Rupee = " + ruble + " Ruble\n");

            break;
 
         case 2:  // Converting from Dollar
            rupee = amount * 82.70;
            System.out.println(amount + " Dollar = " + rupee + " Ruppes");
 
            pound = amount *0.79;
            System.out.println(amount + " Dollar = " + pound + " Pound");
 
            euro = amount *0.91;
            System.out.println(amount + " Dollar = " + euro + " Euro");
 
            yen = amount *143.53;
            System.out.println(amount + " Dollar = " + yen + " Yen");
 
            yuan = amount * 7.15;
            System.out.println(amount + " Dollar = " + yuan + " Yuan");

            ruble = amount * 93.85;
            System.out.println(amount + " Dollar = " + ruble + " Ruble\n");
            break;
 
         case 3:  // Converting from Pound
            rupee = amount * 105.08;
            System.out.println(amount + " Pound = " + rupee + " Ruppes");
 
            dollar = amount *1.27;
            System.out.println(amount + " Pound = " + dollar + " Dollar");
 
            euro = amount *1.16;
            System.out.println(amount + " Pound = " + euro + " Euro");

            yen = amount *182.36;
            System.out.println(amount + " Pound = " + yen + " Yen");
 
            yuan = amount * 9.09 ;
            System.out.println(amount + " Pound = " + yuan + " Yuan");

            ruble = amount *119.18;
            System.out.println(amount + " Pound = " + ruble + " Ruble\n");
            break;
 
         case 4:  // Converting from Euro
            rupee = amount * 90.49;
            System.out.println(amount + " Euro = " + rupee + " Ruppes");
 
            dollar = amount *1.09;
            System.out.println(amount + " Euro = " + dollar + " Dollar");
 
            pound = amount *0.86;
            System.out.println(amount + " Euro = " + pound + " Pound");
 
            yen = amount *157.04;
            System.out.println(amount + " Euro = " + yen + " Yen");
 
            yuan = amount * 7.82;
            System.out.println(amount + " Euro = " + yuan + " Yuan");

            ruble = amount *102.83;
            System.out.println(amount + " Euro = " + ruble + " Ruble\n");
            break;
 
         case 5:  // Converting from Yen
            rupee = amount *0.58;
            System.out.println(amount + " Yen = " + rupee + " Ruppes");
 
            dollar = amount *0.0070 ;
            System.out.println(amount + " Yen = " + dollar + " Dollar");
 
            pound = amount *0.0055;
            System.out.println(amount + " Yen = " + pound + " Pound");
 
            euro = amount *0.0064;
            System.out.println(amount + " Yen = " + euro + " Euro");
 
            yuan = amount *0.050;
            System.out.println(amount + " Yen = " + yuan + " Yuan");

            ruble = amount *0.65;
            System.out.println(amount + " Yen = " + ruble + " Ruble\n");
            break;
 
         case 6:  // Converting from Yuan
            rupee = amount *11.57;
            System.out.println(amount + " Yuan = " + rupee + " Ruppes");
 
            dollar = amount *0.14;
            System.out.println(amount + " Yuan = " + dollar + " Dollar");
 
            pound = amount *0.11;
            System.out.println(amount + " Yuan =: " + pound + " Pound");
 
            euro = amount *0.13;
            System.out.println(amount + " Yuan = " + euro + " Euro");
 
            yen = amount *20.07;
            System.out.println(amount + " Yuan = " + yen + " Yen");

            ruble = amount *13.17;
            System.out.println(amount + " Yuan = " + ruble + " Ruble\n");
            break;
 
        case 7:  // Converting from Ruble
            rupee = amount *0.88;
            System.out.println(amount + " Ruble = " + rupee + " Ruppes");
 
            dollar = amount *0.011;
            System.out.println(amount + " Ruble = " + dollar + " Dollar");
 
            pound = amount *0.0084;
            System.out.println(amount + " Ruble =: " + pound + " Pound");
 
            euro = amount *0.0098;
            System.out.println(amount + " Ruble = " + euro + " Euro");
 
            yen = amount *1.53;
            System.out.println(amount + " Ruble = " + yen + " Yen");

            yuan = amount *0.076;
            System.out.println(amount + " Ruble = " + yuan + " Yuan\n");

            break;

          //Default case
         default:
            System.out.println("Not a Valid Currency\n");
      }
   }
}