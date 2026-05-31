package com.tejas;

class GameAccount {
    String username;
    int level;
    boolean isAvailable;

    public GameAccount(String username, int level, boolean isAvailable) {
        this.username = username;
        this.level = level;
        this.isAvailable = isAvailable;
    }
}

public class AccountBroker {

    public static int findSuitableAccount(GameAccount[] inventory) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].level >= 50 && inventory[i].isAvailable == true) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        GameAccount[] inventory = {
                new GameAccount("Slayer99", 55, false),
                new GameAccount("NoobMaster", 15, true),
                new GameAccount("ProGamer", 70, true),
                new GameAccount("CasualSteve", 49, true)
        };

        int resultIndex = findSuitableAccount(inventory);

        if (resultIndex != -1) {
            System.out.println(inventory[resultIndex].username);
        } else {
            System.out.println("No accounts match the criteria.");
        }
    }
}