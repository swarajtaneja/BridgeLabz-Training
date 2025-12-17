/*
 *Create a program to calculate the profit and loss
 *Creating a public Class with name ProfitAndLoss.
 */
public class ProfitAndLoss{

    public static void main(String[] args){

        /*
         *Creating multiline variables with name costPrice and sellingPrice.
         *Assigning the values 129 and 191.
         */
        int costPrice = 129, sellingPrice = 191;

        //Creating a int variable with name profit for calculating the profit amount .
        int profit = (sellingPrice - costPrice);

        /*
         *Creating a double variable with name profitPercentage and calculating the percentage.
         *Use of multiplication (*) and division operator (/)
        */
        double profitPercentage = (profit * 100 ) / costPrice;
        
        //Displaying the cost price and selling price.
        System.out.println("The Cost Price is INR " + costPrice + " Selling Price is INR " + sellingPrice);

        //Displaying the profit and profit percentage.
        System.out.println("The Profit is INR " + profit + " the Profit Percentage is " + profitPercentage); 
                                          }
                }