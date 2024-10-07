// package org.example;

public class DynamicArray {

    // Attributes
    private int[] pole;
    int max, index;

    // Method for creation of Array
    DynamicArray(){
        pole = new int[5];
        index = -1;
        max = pole.length-1;
    }

    // Print method for normal array
/*  static void printNormalArray(int[] pole){
        for(int i=0;i<pole.length;i++)
            System.out.print(pole[i]+"  ");
        System.out.println();
    }
 */

    // Print method for Dynamic array objects
    void printDynamicArray(){
        System.out.print("Vypisuji pole: ");
        for(int i=0;i<=index;i++)
            System.out.print(pole[i]+"  ");
        System.out.println();
    }

    // Add new number to Array
    void add(int prvek){
        if (index>=max) {
            int[] nove = new int[max * 2];
            for(int i=0;i<=max;i++)
                nove[i] = pole[i];
            pole = nove;
            max = pole.length-1;
        }
        index++;
        pole[index] = prvek;
    }

    void deleteLastElement(){
        pole[index] = 0;
        index--;
    }

    // Delete element in middle, input is position of element
    void deleteMiddleElement(int position){
        pole[position] = 0;

        for (int i=position+1;i<=max;i++) {
            pole[position] = pole[position + 1];
        }
        index--;
    }

    void replaceElement(int position, int newElement){
        pole[position] = newElement;
    }
}