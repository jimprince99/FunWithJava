package com.jimprince99.testers;

import java.util.*;

/**
 * Bean to hold a command to be run on a remote VM
 * 
 * @author jpri1335
 *
 */
public class Command {
	String cmd;
	int resultCode;
	String resultString = "";
	
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultString() {
		return resultString;
	}
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public Command(String cmd) {
		super();
		this.cmd = cmd;
		
	}
	@Override
	public String toString() {
		return "Command [cmd=" + cmd + ", resultCode=" + resultCode + ", resultString=" + resultString + "]";
	}
	
	

}
