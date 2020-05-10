package jvm;

import java.io.UnsupportedEncodingException;

public class Engine {//执行模块
	byte[] b;
	static Instructions ADD = new Instructions("ADD","a",false);
	static Instructions SUB = new Instructions("SUB","s",false);
	static Instructions MUL = new Instructions("MUL","m",false);
	static Instructions DIV = new Instructions("DIV","d",false);
	static Instructions HALT = new Instructions("HALT","h",false);
	static Instructions PUSH = new Instructions("PUSH","p",true);
	Engine(byte[] b){
		this.b=b;
	}
	public void todo() throws UnsupportedEncodingException {
		String ss=new String(b,"GBK");
		int[] stack=new int[100];//栈
		int sp=-1;//栈顶指针
		int pc=0;//程序计数器
		char [] arr = ss.toCharArray();
		for(int i=0;;i++) {
			if(arr[i]==PUSH.getIns().charAt(0)) {
				pc=pc+4;
				stack[sp+1] = Integer.parseInt(String.valueOf(arr[pc]));
				sp=sp+1;
				pc=pc+1;
				i=i+4;
			}if(arr[i]==ADD.getIns().charAt(0)) {
				int num1 = stack[sp-1];
				int num2 = stack[sp];
				int result=num1+num2;
				stack[sp-1] = result;
				sp=sp-1;
				pc=pc+1;
			}if(arr[i]==SUB.getIns().charAt(0)) {
				int num1 = stack[sp-1];
				int num2 = stack[sp];
				int result=num1-num2;
				stack[sp-1] = result;
				sp=sp-1;
				pc=pc+1;
			}
			if(arr[i]==MUL.getIns().charAt(0)) {
				int num1 = stack[sp-1];
				int num2 = stack[sp];
				int result=num1*num2;
				stack[sp-1] = result;
				sp=sp-1;
				pc=pc+1;
			}if(arr[i]==DIV.getIns().charAt(0)) {
				int num1 = stack[sp-1];
				int num2 = stack[sp];
				int result=num1/num2;
				stack[sp-1] = result;
				sp=sp-1;
				pc=pc+1;
			}
			if(arr[i]==HALT.getIns().charAt(0)) {
				System.out.print("\n"+"计算结果为:"+stack[sp]);
				break;
			}
		}
	}
}
