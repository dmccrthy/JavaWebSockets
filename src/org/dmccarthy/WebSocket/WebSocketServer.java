package org.dmccarthy.WebSocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class WebSocketServer {
    /**
     * 
     * @param port Local port to use for websocket
     */
    public WebSocketServer(int port) {
        try {
            // Open Connection on port
            System.out.printf("[START] Opening WebSocket at ws://localhost:%d\n", port);
            ServerSocket server = new ServerSocket(port);
    
            System.out.println("[WAIT] Awaiting Client Connection...");
            Socket client = server.accept();
        } catch(IOException err) {
            System.out.println(err);
        }
    }

    /**
     * Handle closing handshake for connections.
     */
    public void close() {
    }
}