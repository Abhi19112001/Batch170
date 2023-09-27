package com.cjc.ims.app.serviceimpl;

public class OverCountException extends RuntimeException{
public OverCountException(String msg) {

	super(msg);
}

}
class CheckD extends RuntimeException{
	public CheckD(String msg) {
		super(msg);
	}
}
