package org.csystem.cmdpromptapp;

import org.csystem.database.CommandPrompt;
import org.csystem.entity.CommandInfo;

public class App {
    public static void main(String[] args)
    {
        CommandPrompt cp = new CommandPrompt(">");
        cp.run();
    }
}
