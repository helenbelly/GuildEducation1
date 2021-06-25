package GuildEducation;

import java.util.Scanner;

public class OrderProcess {


        // Hypothetical: You are the owner of a dog shelter that can hold at most 30 dogs. You want
        //a programmatic way to order the necessary amount of food for next month based on how
        //many dogs you currently have and the remaining food from last month.
        //Sizes of dogs and food needs:
        //● Small - 10lbs.,
        //● Medium - 20lbs.,
        //● Large - 30lbs.
        //When ordering food you always want to order at least 20% more than the minimum needed
        //to feed all dogs currently in your shelter for that month.

        // Example:
        //If at the end of the month I have 5 small dogs, 3 medium dogs, 7 large dogs, and a leftover
        //food supply of 17lbs. I should expect the function would tell me to order 363.6 lbs

        // Deliverable
        // In either Java or Python please provide a runnable function that will take the number of
        //each size of dog currently in your shelter and the remaining food from last month then
        //return how much you should order

        public static void main(String[] args) {
            getFoodOrderCalculation();

        }


        public static double getFoodOrderCalculation(){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter your number of Small size Dog you have");
            int smallDog=input.nextInt();
            System.out.println("Enter your number of Medium size Dog you have");
            int mediumDog=input.nextInt();
            System.out.println("Enter your number of Large size Dog you have");
            int largeDog=input.nextInt();

            int totalDog=smallDog+mediumDog+largeDog;
            System.out.println("Total Dog : "+totalDog);
            double totalFoodForSmallDog=smallDog*10;
            double totalFoodForMediumDog=mediumDog*20;
            double totalFoodForLargeDog=largeDog*30;

            double totalFoodNeeded=totalFoodForSmallDog+totalFoodForMediumDog+totalFoodForLargeDog;
            System.out.println("Total Food in lbs : "+totalFoodNeeded);
            System.out.println("Enter remaining food from last month");
            double remainingFoodFromLastMonth=input.nextDouble();
            double foodNeedToOrder= totalFoodNeeded-remainingFoodFromLastMonth;
            System.out.println("Total Food need after adjusting old food "+foodNeedToOrder);
            double orderQuantityWithPercentage= foodNeedToOrder*1.2;
            System.out.println("Total Order Need including 20% : "+orderQuantityWithPercentage);
            return orderQuantityWithPercentage;
        }



    }



