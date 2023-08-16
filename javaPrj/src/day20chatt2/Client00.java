package day20chatt2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client00 {

	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Client00() {

		try {
			s = new Socket("localhost",5500);
			System.out.println("서버에 요청해요!");
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			dataSend();
			
			dataRecv();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void dataRecv() {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("메시지를 작성하세요");
			String message = sc.nextLine();
			dos.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void dataSend() {
		try {
			String message = dis.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client00 c = new Client00();
	}

}
