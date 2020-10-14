package com.jimprince99.testers;

import static org.junit.jupiter.api.Assertions.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestersTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test10001() {
		Testers t = new Testers();
		
		InetAddress ip;
		try {
			ip = InetAddress.getByName("148.181.19.245");
		} catch (UnknownHostException e) {
			fail("cound not set ip address");
		}
		Tester tester = new Tester("tester2", 8888, ip, "root");

		
		String sshCommand = String.format("ssh %s@%s -c ls", tester.getUsername(), tester.getIp());
		Command cmd = new Command(sshCommand);
		
		ErrorCodes result = t.runCmd(tester, cmd);
		
		System.out.println("result = " + result.ordinal());
		
		System.out.println("resultString=" + cmd.getResultString());
		
	}

}
