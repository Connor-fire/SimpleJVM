package jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertSrc2Bytecodes {//字节码模块
	
	static Instructions ADD = new Instructions("ADD","a",false);
	static Instructions SUB = new Instructions("SUB","s",false);
	static Instructions MUL = new Instructions("MUL","m",false);
	static Instructions DIV = new Instructions("DIV","d",false);
	static Instructions HALT = new Instructions("HALT","h",false);
	static Instructions PUSH = new Instructions("PUSH","p",true);
	final static String number = "0123456789";
	
	ConvertSrc2Bytecodes(){
		
	}
	public void todo() throws IOException {
		System.out.print("源文件内容:");
		File file = new File("D:/example.txt");//读
		FileInputStream out = new FileInputStream(file);  
        InputStreamReader isr = new InputStreamReader(out);  
        
		File file1 = new File("D:/result.txt");//写 
		FileOutputStream in = new FileOutputStream(file1); 
		byte bt[] = new byte[2048];
		
        int ch = 0;  
    	String s = "";
            while ((ch = isr.read()) != -1) {
            	if((char) ch !=' ') {
                	s = s+(char) ch;
                	if(s.equals(ADD.getSym())) {
                		
                		String a="a";
                		bt=a.getBytes();
                		in.write(bt,0,bt.length);
                		
                		System.out.print(ADD.getIns());
                		s="";
                	}else if(s.equals(SUB.getSym())) {
                		
                		String s1="s";
                		bt=s1.getBytes();
                		in.write(bt,0,bt.length);
                		
                		System.out.print(SUB.getIns());
                		s="";
                	}else if(s.equals(MUL.getSym())) {
                		
                		String m="m";
                		bt=m.getBytes();
                		in.write(bt,0,bt.length);
                		
                		System.out.print(MUL.getIns());
                		s="";
                	}else if(s.equals(DIV.getSym())) {
                		
                		String d="d";
                		bt=d.getBytes();
                		in.write(bt,0,bt.length);
                		
                		System.out.print(DIV.getIns());
                		s="";
                	}
                	else if(s.equals(HALT.getSym())) {
                		
                		String h="h";
                		bt=h.getBytes();
                		in.write(bt,0,bt.length);
                		
                		System.out.print(HALT.getIns());
                		s="";
                	}
                	else if(s.equals(PUSH.getSym())) {
                		
                		
                		String p="p";
                		bt=p.getBytes();
                		in.write(bt,0,bt.length);
                		
                		System.out.print(PUSH.getIns());
                		s="";
                	}else if(number.indexOf(s.charAt(0))!=-1) {
                		
                		String num="000"+s;
                		bt=num.getBytes();
                		in.write(bt,0,bt.length);
                		
                		
                		System.out.print("num:"+s);
                		s="";
                	}
                	else {
                		//System.out.print((char) ch);
                	}
            	}else {
            		System.out.print(s);
            		System.out.print((char) ch);
            		s="";
            	}

        }
            in.close();
	}
}
