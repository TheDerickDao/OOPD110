import io.*;
public class ConnectionManager
{
private Connector connect;
private Combination code;
public ConnectionManager()
	{
	connect = new Connector();
	code = new Combination();
	}
public boolean getConnection()
	{
	boolean shipConnected;
	shipConnected = false;
	do
		{
		connect.openConnection();
		} while(!connect.openConnection()); 
	return shipConnected = true;
	}
public boolean unlockDoor(Combination code)
	{
	boolean doorUnlocked=false;
	int combo01 = 10;
	int combo02 = 11;
	int combo03 = 12;
	while (combo01 < combo02 && doorUnlocked == false)
		{
		combo02 = combo01 +1;
		while (combo02 < combo03 && doorUnlocked == false)
			{
			combo03 = combo02 + 1;
			while (combo03 <= 99 && doorUnlocked == false)
				{
					code.setCombo(combo01, combo02, combo03);
					System.out.println(code.getCombo01() + " " + code.getCombo02() + " " + code.getCombo03());
					doorUnlocked = connect.unLockDoor(code);
					if(doorUnlocked == true)
						{
						System.out.println("Door Unlocked");
						}
				combo03 = combo03 + 1;
				}
			combo02 = combo02 + 1;
			}
		combo01 = combo01 + 1;
		}
	return doorUnlocked = true;
	}
public boolean openDoor()
	{
	boolean doorOpened;
	doorOpened = false;
	connect.openDoor();
	doorOpened = true;
	return doorOpened;
	}
public boolean closeConnection()
	{
	boolean closeConnection;
	closeConnection = false;
	connect.closeConnection();
	closeConnection = true;
	return closeConnection;
	}
}
