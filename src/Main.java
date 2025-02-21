import org.dmccarthy.WebSocket;

/**
 * Test websocket functionality
 * @author Dan McCarthy
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        WebSocket test = new WebSocket();
        test.open();
    }
}
