package com.jimprince99.testers;

import java.net.InetAddress;
import java.util.*;

/**
 * Bean to hold the details of a tester VM
 * 
 * @author jpri1335
 *
 */
public class Tester {
	String name;
	int port;
	InetAddress ip;
	String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public InetAddress getIp() {
		return ip;
	}
	public void setIp(InetAddress ip) {
		this.ip = ip;
	}
	public Tester(String name, int port, InetAddress ip, String username) {
		super();
		this.name = name;
		this.port = port;
		this.ip = ip;
		this.username = username;

	}
	@Override
	public String toString() {
		return "Tester [name=" + name + ", port=" + port + ", ip=" + ip + ", username=" + username + "]";
	}

	

}
