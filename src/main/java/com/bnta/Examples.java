package com.bnta;
/*
public class Store {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);*/

/*
Practicing return
* public class Store {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + (price * 0.08);  return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);

  }
}*/


/*
// non void methods can be used in the main method as a variable as part of an expression.
public int numberOfTires() {
   int tires = 4;
   // return statement
   return tires;
}

public static void main(String[] args){
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}



*/

/*
// Using the toString(){} method to return the content of a class so you do not print out the reference point which
is not as useful.

* public class Store {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
    }
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}


*/

/*Defining a method : Methods have a method signature that declares their return type, name, and parameters
        Calling a method : Methods are invoked with a . and ()
        Parameters : Inputs to the method and their types are declared in parentheses in the method signature
        Changing Instance Fields : Methods can be used to change the value of an instance field
        Scope : Variables only exist within the domain that they are created in
        Return : The type of the variables that are output are declared in the method   */

/* ENCAPULATIONS:
CLASS2
    /instance field
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

    /constructor
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }
     /getter
  public int getBalance(){
    return this.balance;
  }
   /setter
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
    /method
  public double getMonlthlyInterest(){
    return this.interestRate * this.balance;
  }

}
 CLASS1
* public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonlthlyInterest());

  }

CONDITIONAL FLOWS
String course = "Theatre";

if (course.equals("Biology")) {

  // Enroll in Biology course

} else if (course.equals("Algebra")) {

  // Enroll in Algebra course

} else if (course.equals("Theatre")) {

  // Enroll in Theatre course

} else {

  System.out.println("Course not found!");

}
int testScore = 72;

if (testScore >= 90) {

  System.out.println("A");

} else if (testScore >= 80) {

  System.out.println("B");

} else if (testScore >= 70) {

  System.out.println("C");

} else if (testScore >= 60) {

  System.out.println("D");

} else {

  System.out.println("F");

}
}

NESTED IF STATEMENTS

PUblic class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;

  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
      if (couponCode.equals("ship50")) {
        return 0.85;
      } else {
        return 1.75;
      }
    } else {
      return .50;
    }
 	}

  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express", "ship50");
    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");

    book.ship();
    chemistrySet.ship();
  }
  }

  SWITCH
  String course = "Biology";

switch (course) {
  case "Algebra":
    // Enroll in Algebra
  case "Biology":
    // Enroll in Biology
  case "History":
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}

// enrolls student in Biology... AND History and Theatre!


CONDITIONAL OPERATORS

public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;

  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }

  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }

  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }

  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}


The AND Operator: possible combinations for conditional logic
true && true
// true
false && true
// false
true && false
// false
false && false
// false

The Or Operator:

        true || true
// true
        false || true
// true
        true || false
// true
        false || false
// false
public class Examples {
}

LOGICAL NOT OPERATOR (!)
!false
// true
!true
// false

ARREY TO LIST :

import java.util.Arrays;

public class Lottery(){

  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
  }

}

MORE ARRAYS

import java.util.Arrays;

public class Newsfeed {

  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;

  public Newsfeed(){
    // Initialize favoriteArticles here:
    favoriteArticles = new String[10] ;

  }

  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
    favoriteArticles[favoriteIndex] = newArticle;


  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();

    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");

    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}


ARRAYLISTS:

// Declaring:
ArrayList<Integer> ages;
// Initializing:
ages = new ArrayList<Integer>();

// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();


ARRAYLIST ADD
ArrayList<Car> carShow = new ArrayList<Car>();

carShow.add(ferrari);
// carShow now holds [ferrari]
carShow.add(thunderbird);
// carShow now holds [ferrari, thunderbird]
carShow.add(volkswagon);
// carShow now holds [ferrari, thunderbird, volkswagon]

ARRAY LIST ADD AT A SPECIFIC INDEX
// Insert object corvette at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagon]

// Insert object porsche at index 2
carShow.add(2, porsche);
// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagon]

import java.util.ArrayList;

class ToDos {

  public static void main(String[] args) {

    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = " Master java";

    // Add to-dos to toDoList
    String toDo3 = " Complete exercises";
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);

  }

}

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
System.out.println(shoppingCart.size());
// 1 is printed
shoppingCart.add("Tweed Houndstooth Hat");
System.out.println(shoppingCart.size());
// 2 is printed
shoppingCart.add("Magnifying Glass");
System.out.println(shoppingCart.size());
// 3 is printed
 */
