package com.company;

import java.util.Scanner;

public class Main {

    /*
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArr = new int[10];
    private static int capacity;
    */

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Dont fuck with me!!! Please enter correct option!");
                    break;
            }
        }

        /*
        //Part I of the video
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseArr);
        System.out.print("Enter capacity in order to resize array: ");
        capacity = scanner.nextInt();
        resizeArray();
        //System.out.println("Enter " + capacity + " integers: ");
        //getInput();

        printArray(baseArr);*/
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please add the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter current item number: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String  itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();

        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        }
        else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    /*
    private static void getInput() {
        for (int i = 0; i < baseArr.length; i++) {
            baseArr[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] originalArray = baseArr;
        baseArr = new int[capacity];

        for (int i = 0; i < originalArray.length; i++) {
            baseArr[i] = originalArray[i];
        }
    }
    */
}
