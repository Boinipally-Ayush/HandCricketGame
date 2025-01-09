import java.util.*;
public class HandCricket
{
	public static void main(String[] args) {
// 		System.out.println(Math.ceil(Math.random()));
         Scanner sc = new Scanner(System.in);
          Random random = new Random();
         System.out.println("Enter Odd or Even \n Enter 0 for Odd and 1 for Even");
         int tos=sc.nextInt();
         if(tos==0)
         {
            System.out.println("You have selected Odd");
         }
         else{
            System.out.println("You have selected Even");
         }
         System.out.println("Enter the number:");
         int tos_num=sc.nextInt();
         int comp_tos_num=(random.nextInt(6 - 1 + 1) + 1);
         System.out.println("Computer number is"+comp_tos_num);
         int bat_or_ball,score1=0,score2=0;
         if((((tos_num+comp_tos_num)%2==0)&&(tos==1))||(((tos_num+comp_tos_num)%2!=0)&&(tos==0)))
         {
            System.out.println("You Won the Toss");
            System.out.println("Enter Bat or Ball\n Enter 0 for Ball and 1 for Bat");
            bat_or_ball=sc.nextInt();
            if(bat_or_ball==0)
            {
               System.out.println("----First Innings----");
               System.out.println("Your balling");
               int ball=sc.nextInt();
               int bat=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score2=score2+bat;
                  ball=sc.nextInt();
                  bat=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("Computer is out and the score of the Computer is:"+score2);
               System.out.println("Second Innings");
               bat=sc.nextInt();
               ball=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score1=score1+bat;
                  bat=sc.nextInt();
                  ball=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("You are out and your score is:"+score1);
               if(score1>score2)
               {
                System.out.println("---------YOU WON THE MATCH--------");
               }
               else if (score1<score2)
               {
                  System.out.println("---------YOU LOST THE MATCH--------");
               }
               else{
                  System.out.println("---------DRAW MATCH--------");
               }
            }
            else{
               System.out.println("----First Innings----");
               System.out.println("Your batting");
                int bat=sc.nextInt();
               int ball=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score2=score2+bat;
                  bat=sc.nextInt();
                  ball=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("You are out and your score is:"+score2);
               System.out.println("Second Innings");
               ball=sc.nextInt();
               bat=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score1=score1+bat;
                  ball=sc.nextInt();
                  bat=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("Computer is out and the score of the Computer is:"+score1);
               if(score1>score2)
               {
                System.out.println("---------YOU LOST THE MATCH--------");
               }
               else if (score1<score2)
               {
                  System.out.println("---------YOU WON THE MATCH--------");
               }
               else{
                  System.out.println("---------DRAW MATCH--------");
               }
            }
         }
         else{
            System.out.println("You Lost the Toss");
            bat_or_ball=random.nextInt(2);
            if(bat_or_ball==0)
            {
               System.out.println("----First Innings----");
               System.out.println("Computer balling");
               int bat=sc.nextInt();
               int ball=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score2=score2+bat;
                  bat=sc.nextInt();
                  ball=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("You are out and your score is:"+score2);
               System.out.println("Second Innings");
               ball=sc.nextInt();
               bat=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score1=score1+bat;
                  ball=sc.nextInt();
                  bat=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("Computer is out and the score of the Computer is:"+score1);
               if(score1>score2)
               {
                System.out.println("---------YOU LOST THE MATCH--------");
               }
               else if (score1<score2)
               {
                  System.out.println("---------YOU WON THE MATCH--------");
               }
               else{
                  System.out.println("---------DRAW MATCH--------");
               }
            }
            else{
               System.out.println("----First Innings----");
               System.out.println("Computer batting");
                int ball=sc.nextInt();
               int bat=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score2=score2+bat;
                  ball=sc.nextInt();
                  bat=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("Computer is out and the score of the Computer is:"+score2);
               System.out.println("Second Innings");
               bat=sc.nextInt();
               ball=(random.nextInt(6 - 1 + 1) + 1);
               while(ball!=bat)
               {
                  score1=score1+bat;
                  bat=sc.nextInt();
                  ball=(random.nextInt(6 - 1 + 1) + 1);
               }
               System.out.println("You are out and your score is:"+score1);
               if(score1>score2)
               {
                System.out.println("---------YOU WON THE MATCH--------");
               }
               else if (score1<score2)
               {
                  System.out.println("---------YOU LOST THE MATCH--------");
               }
               else{
                  System.out.println("---------DRAW MATCH--------");
               }
            }
         }
         sc.close();
	}
}
