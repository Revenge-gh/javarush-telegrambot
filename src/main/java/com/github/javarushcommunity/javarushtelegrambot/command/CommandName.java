package com.github.javarushcommunity.javarushtelegrambot.command;

public enum CommandName {

    /**
     * Enumeration for {@link Command}'s.
     */

    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    NO("no_command");


    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
