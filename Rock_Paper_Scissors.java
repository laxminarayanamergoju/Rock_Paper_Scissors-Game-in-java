import java.util.*;
public class Rock_Paper_Scissors {
    public static void main(String[] args)
    {
           Scanner sc=new Scanner(System.in);
           Random random=new Random();
           String choose[]={"rock","paper","scissors"};
           System.out.print("Enter your choice (rock, paper, scissors): ");
           String userchoise=sc.nextLine().toLowerCase();
           String mechchoise=choose[random.nextInt(3)];
           System.out.println(check(userchoise,mechchoise));
           System.out.println("Computer choise :"+mechchoise);
    }
    public static String check(String user,String mech)
    {
            if(user.equals(mech))
            {
                return "Its tie";
            }
            if(user.equals("rock") && mech.equals("scissors")
              || user.equals("paper") && mech.equals("rock")
               || user.equals("scissors") && mech.equals("paper"))
               {
                return "YOU ARE THE WINNER";
               }
               else{
                return "Computer is the winner";
               }
    }
}
