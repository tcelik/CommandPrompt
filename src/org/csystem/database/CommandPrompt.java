package org.csystem.database;

import org.csystem.entity.CommandInfo;
import org.csystem.util.StringUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandPrompt {
    private String m_prompt;
    private Scanner m_kb;
    private ArrayList<CommandInfo> m_cmdList;

    {
        m_cmdList = new ArrayList<>();

        m_cmdList.add(new CommandInfo("ls", this::lsProc));
        m_cmdList.add(new CommandInfo("cp", this::cpProc));
        m_cmdList.add(new CommandInfo("reverse", StringUtil::reverse));
        m_cmdList.add(new CommandInfo("len", StringUtil::len));
    }

    private void lsProc(String cmd)
    {
        System.out.println("lsproc");
    }

    private void cpProc(String cmd)
    {
        System.out.println("cpproc");
    }

    private CommandInfo findCommand(String cmdStr)
    {
        for (CommandInfo ci : m_cmdList)
            if (ci.CmdStr.equals(cmdStr))
                return ci;


            return null;

    }

    public CommandPrompt(String prompt)
    {
        m_kb = new Scanner(System.in);
        m_prompt = prompt;
    }

    public void run()
    {
        for (;;) {
            System.out.print(m_prompt);
            String cmd = m_kb.nextLine();
            String [] cmdArray = cmd.split(" ");

            //bu komutu aldıktan sonra find edilmesi lazım.
            CommandInfo ci = this.findCommand(cmdArray[0]);

            if (ci != null)
                ci.Proc.proc(cmdArray[1]);
            else
                System.out.println("geçersiz komut");
        }

    }

}
