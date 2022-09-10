package com.kerro16.minecraftcheck;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

    String External = "dance-others.craft.playit.gg:12136";
    String Local = "192.168.0.14:25565";
    String result = "Offline";

    public String isOnline(){
        String[] addr = External.split(":");
        try{
            Socket s = new Socket();
            s.connect(new InetSocketAddress(addr[0], Integer.parseInt(addr[1])));
            s.close();
            result = "Online";
            return result;
        }
        catch (IOException e){
            return result;
        }

    }
}
