package classes;

import java.util.LinkedList;

public class server {
    private static final Server OBJ = new Server();
    private LinkedList<Messsage> messages;
    private static LinkedList<String> users;
    
    public void addMessage(Message message){
        message.add(message);
    }

    public LinkedList<Message> getMessage(){
        return messages;
    }

    public boolean logIn(){
        Console.writeLine("Tragen Sie Ihren Namen ein");
        String name = Console.readLine();
        if (users.contains(name)) {
            Console.writeLine("Log In erfolgreich");
            Console.writeLine("Geben Sie Ihre Abteilung ein");
        } else {
            Console.writeLine("Log In fehlgeschlagen!\nBenutzer existiert nicht;"); 
        }

    }

    private Server() {
        users = new LinkedList<String>();
        users.add("Luca");
        users.add("Chrissi");
        users.add("Tobi");
    }

    public static Server getInstance() {
        return OBJ;
    }
        


}

