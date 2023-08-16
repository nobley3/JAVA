package day20chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client0 {

	 Socket socket;// 소켓
	 DataInputStream dataInputStream;       // 입력용보조스트림
	 DataOutputStream dataOutputStream;     // 출려용보조스트림
	 
	 
	
	public Client0() {
		 
		try {
			// server IP,  server PORT
			socket = new Socket("localhost", 6100); //localhost : 현재pc
			System.out.println(" connection ....");
			  
			dataInputStream  = new DataInputStream( socket.getInputStream());  //들어오는거
			dataOutputStream = new DataOutputStream( socket.getOutputStream()); //나가는거
			// 
			dataSend();
			dataRecv();
			
		} catch (IOException e) {
			 
			e.printStackTrace();
		}    
		
		
	}
	
	
	private void dataRecv() {
		 
		try {
			String message = dataInputStream.readUTF();			
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

	private void dataSend() {
		Scanner   in = new Scanner(System.in);
		
		try {
			String  message  = in.nextLine();
			dataOutputStream.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {		 
		new Client0();

	}

}
