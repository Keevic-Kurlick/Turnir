package ru.netology.tournir.Player.Exceptions;

public class NotRegisteredException extends Exception {
    public NotRegisteredException(String name) {
        super("Пользователь " + name + " не зарегистрирован!");
    }
}
