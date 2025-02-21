package org.dmccarthy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * Main Websocket Class
 * @author Dan McCarthy
 * @version 1.0.1
 */
public class WebSocket {
    // Define 
    private static final String GUID ="258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private int port;
    private ServerSocket server;
    private Socket client;

    /**
     * Define default port if not specified.
     */
    public WebSocket() {
        this.port = 4000;
    }

    /**
     * Define port number for WebSocket.
     * @param port Local port to use for websocket
     */
    public WebSocket(int port) {
        this.port = port;
    }

    public void open() {
        try {
            // Open Connection on port
            System.out.printf("[START] Opening WebSocket at ws://localhost:%d\n", this.port);
            this.server = new ServerSocket(this.port);
    
            System.out.println("[WAIT] Awaiting Client Connection...");
            this.client = this.server.accept();

            Scanner read = new Scanner(this.client.getInputStream());

            while (this.port > 0) {
                System.out.println(read.next());
            }

            read.close();
            this.server.close();
        } catch(IOException err) {
            System.out.println("[ERROR] Something went wrong.");
            System.out.println(err);
        }
    }

    /**
     * Handle closing handshake for connections.
     */
    public void close() {
    }
}