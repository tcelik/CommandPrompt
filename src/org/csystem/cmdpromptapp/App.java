package org.csystem.cmdpromptapp;

import org.csystem.entity.CommandInfo;

public class App {
    public static void main(String[] args)
    {
        CommandInfo ci = new CommandInfo("reverse", System.out::print);
        ci.Proc.proc("ankara");
    }
}
