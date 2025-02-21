/**
 * Frontend for testing WebSockets
 */

const WebSocket = require("ws");

let socket = new WebSocket("ws://localhost:4000");

socket.onopen = () => {
  alert("[open] Connection established");
  alert("Sending to server");
  socket.send("My name is John");
};
