package IfAndIfElseStatements;

import java.util.Scanner;

class TheCellSell{
  

    public static void main (String[] args){
      Scanner scan = new Scanner( System.in );

      System.out.println("How many daytime minutes do you use?");
      double daytimeMinutues = scan.nextInt();

      System.out.println("How many evening mintues do you use?");
      double eveningMinutues = scan.nextInt();

      System.out.println("How many weekend minutes do you use?");
      double weekendMinutes = scan.nextInt();

      if (daytimeMinutues, eveningMinutues, weekendMinutes < 0) {
        System.out.println("You can't have negative minutes!!!")
      }

      double planA = Math.max(0, (daytimeMinutues - 100) * 0.25) + eveningMinutues * 0.15 + weekendMinutes * 0.20;

      double planB = Math.max(0,(daytimeMinutues - 250) * 0.45) + eveningMinutues * 0.35 + weekendMinutes * 0.25;

      double roundedPlanB = Math.round(planB * 100.0) / 100.0;
      double roundedPlanA = Math.round(planA * 100.0) / 100.0;
      

      System.out.println("Plan A costs: " + roundedPlanA);
      System.out.println("Plan B costs: " + roundedPlanB);
      
      if (roundedPlanA == roundedPlanB) { 
        System.out.println("The plans are equal.");
      }

        else {
            if (planA < planB){
                System.out.println("Plan A is cheapest.");
            }
            else {
                System.out.println("Plan B is the cheapest");
            }
          }
        }
      }
    
  


      
