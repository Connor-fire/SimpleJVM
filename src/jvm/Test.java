package jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
	static Instructions ADD = new Instructions("ADD","a",false);
	static Instructions SUB = new Instructions("SUB","s",false);
	static Instructions MUL = new Instructions("MUL","m",false);
	static Instructions DIV = new Instructions("DIV","d",false);
	static Instructions HALT = new Instructions("HALT","h",false);
	static Instructions PUSH = new Instructions("PUSH","p",true);
//	final static String number = "0123456789";
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		ConvertSrc2Bytecodes s = new ConvertSrc2Bytecodes();
		s.todo();
		LoadBytecodes l=new LoadBytecodes();
		byte[] b=l.todo();
		Engine e=new Engine(b);
		e.todo();

		
}
}
