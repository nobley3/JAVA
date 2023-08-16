package day20chatt2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client0 {
	Socket s;
	
	DataInputStream dis;
	DataOutputStream dos;
	
	public Client0() {
//			서버의 (ip, port)
		try {
			s = new Socket("61.73.130.228",6100); //localhost : 내pc 아이피
			System.out.println("서버에 요청!!");
			
//			소켓 두개의 기반 스트림이 있음
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
//			보내기
			dataSend();
//			받기
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
		/*
		while(true) {
			String message;
			try {
				message = dis.readUTF();
				System.out.println(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}}});
		t.start();
		
	}
	private void dataSend() {
		Scanner sc  = new Scanner(System.in);
		/*
		while(true) {
			try {
				System.out.println("메시지 작성: ");
				String message = sc.nextLine();
				dos.writeUTF(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				while(true) {
					try {
						System.out.println("메시지 작성: ");
						String message = sc.nextLine();
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}});
		t.start();
		
	}
	public static void main(String[] args) {
		Client0 c = new Client0();
	}

}
