package jvm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LoadBytecodes {//�ֽ���װ��ģ��
	LoadBytecodes(){
		
	}
	public byte[] todo() throws IOException {
		System.out.print("\n"+"�ֽ����ļ�����:");
		InputStream in=new FileInputStream("D:/result.txt");
		byte[] b=new byte[in.available()];
		in.read(b);
		String ss=new String(b,"GBK");
		System.out.print(ss);
		in.close();
		return b;
	}
}
