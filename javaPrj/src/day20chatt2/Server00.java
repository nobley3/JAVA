package day20chatt2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server00 {

	ServerSocket ss;
	
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Server00() {
		try {
			ss = new ServerSocket(5500);
			System.out.println("서버시작입니다!");
			s= ss.accept();
			System.out.println("클라이언트 요청수락");
			
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			dataRecv();
			
			dataSend();
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
	public static void main(String[] args) {
		Server00 s = new Server00();
	}

}
