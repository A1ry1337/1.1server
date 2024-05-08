package main;

import chat.ChatServer;

import java.io.IOException;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            ChatServer server = new ChatServer(5050);
            server.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}