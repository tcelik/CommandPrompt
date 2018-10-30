package org.csystem.entity;

import org.csystem.functional.ICommandProc;

public class CommandInfo {
    //Bir komutta neler olsun.
    public String CmdStr;

    /*Kilit nokta bu her komut kendi arayüz nesnesini tutuyor.

    Neden : Bu fonksiyonel arayüz bir method adresi tutabilir aslında. Bu sayede ne yapıcağını bilmeden ben hangi
    method adresini verirsem onu çağıracağı için ne yapıcağını bilmeden iş yapabilecek böylede sonradan ekleme
    daha kolay olucak

    */
    public ICommandProc Proc;

    public CommandInfo(String cmdStr, ICommandProc proc)
    {
        CmdStr = cmdStr;
        Proc = proc;
    }
}
