package org.csystem.cmdpromptapp;

import org.csystem.database.CommandPrompt;

public class App {
    public static void main(String[] args)
    {
        CommandPrompt cp = new CommandPrompt(">");
        cp.run();
    }
}
