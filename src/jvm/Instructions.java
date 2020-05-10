package jvm;

public class Instructions {
	String sym;
	String ins;
	boolean follow;
	Instructions(String sym,String ins,boolean follow){
		this.sym=sym;
		this.ins=ins;
		this.follow=follow;
	}
	public String getSym() {
		return sym;
	}
	public void setSym(String sym) {
		this.sym = sym;
	}
	public String getIns() {
		return ins;
	}
	public void setIns(String ins) {
		this.ins = ins;
	}
	public boolean getFollow() {
		return follow;
	}
	public void setFollow(boolean follow) {
		this.follow = follow;
	}
	
}
