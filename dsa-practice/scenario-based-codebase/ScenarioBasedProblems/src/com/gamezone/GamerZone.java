package com.gamezone;

import java.util.ArrayList;

public class GamerZone {

    public static void quickSort(ArrayList<Player> players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(ArrayList<Player> players, int low, int high) {
        int pivot = players.get(high).score; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).score > pivot) {
                i++;
                swap(players, i, j);
            }
        }
        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(ArrayList<Player> players, int i, int j) {
        Player temp = players.get(i);
        players.set(i, players.get(j));
        players.set(j, temp);
    }

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("Alex", 950));
        players.add(new Player("Blaze", 1200));
        players.add(new Player("Cipher", 800));
        players.add(new Player("Drift", 1500));
        players.add(new Player("Echo", 1200));

        quickSort(players, 0, players.size() - 1);

        System.out.println("🏆 GamerZone Leaderboard:");
        int rank = 1;
        for (Player p : players) {
            System.out.println(rank++ + ". " + p.playerName + " - " + p.score);
        }
    }
}
