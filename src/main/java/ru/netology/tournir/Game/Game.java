package ru.netology.tournir.Game;

import ru.netology.tournir.Game.Exceptions.AlreadyRegisteredException;
import ru.netology.tournir.Player.Exceptions.NotRegisteredException;
import ru.netology.tournir.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> listOfPlayers = new ArrayList<>();

    public void register(Player player) throws AlreadyRegisteredException {
        if (!listOfPlayers.contains(player)) {
            listOfPlayers.add(player);
        } else {
            throw new AlreadyRegisteredException(player.getId());
        }
    }

    public String getPlayers() {
        return listOfPlayers.toString();
    }

    public int round(String playerName1, String playerName2) throws NotRegisteredException {
        int result = 0;

        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);

        if (player1.getStrength() > player2.getStrength()) {
            result = 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            result = 2;
        }

        return result;
    }

    private Player findByName(String playerName) throws NotRegisteredException {

        for (Player player : listOfPlayers) {
            if (player.getName().equals(playerName)) {
                return player;
            }
        }
        throw new NotRegisteredException(playerName);
    }
}
