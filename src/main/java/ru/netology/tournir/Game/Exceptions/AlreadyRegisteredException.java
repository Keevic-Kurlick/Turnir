package ru.netology.tournir.Game.Exceptions;

public class AlreadyRegisteredException extends Exception {
    public AlreadyRegisteredException(int id) {
        super("Пользователь " + id + " уже существует");
    }
}
