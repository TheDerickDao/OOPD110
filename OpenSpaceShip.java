import io.*;
public class OpenSpaceShip
{
public static void main(String [] args)
	{
	ConnectionManager connectToShip;
	Combination code;
	boolean doorUnlocked, getConnection, doorOpened, closeConnection, shipConnected;
	
	connectToShip = new ConnectionManager();
	code = new Combination();
	
	shipConnected = connectToShip.getConnection();
	System.out.println("Connection has been made");
	doorUnlocked = connectToShip.unlockDoor(code);
	System.out.println("Door is unlocked");
	doorOpened = connectToShip.openDoor();
	System.out.println("Door is opened");
	closeConnection = connectToShip.closeConnection();
	System.out.println("Connection closed!");
	System.exit(0);
	}
}

