package hw0627;

import java.util.Scanner;

public class Tail16 {

    public static void main(String[] args) {
        // Prompt the user to enter sixteen coins' Hs and Ts
        System.out.print("Enter the initial sixteen coins Hs and Ts: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] initialNode = s.toCharArray();

        T16Model model = new T16Model();
        java.util.List<Integer> path = model.getShortestPath(T16Model.getIndex(initialNode));

        System.out.println("The steps to flip the coins are ");
        for (int i = 0; i < path.size(); i++)
            T16Model.printNode(
                    T16Model.getNode(path.get(i).intValue()));
    }
}
