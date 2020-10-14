package com.jimprince99.testers;

import static com.jimprince99.testers.ErrorCodes.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * Run a load-test on the Testers
 * 
 * @param args
 */
public class Testers {
	
	StringBuffer output = new StringBuffer();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testers t = new Testers();

		// t.runCmd(tester, cmd);

	}

	protected ErrorCodes runCmd(Tester tester, Command cmd) {
		if (tester == null)
			return TESTER_IS_NULL;
		if (cmd == null)
			return CMD_ID_NULL;

		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

		Process process;
		if (isWindows) {
			try {
				process = Runtime.getRuntime().exec(String.format("cmd.exe /c %s", cmd.getCmd()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("failed to create command");
				return FAILED_TO_CREATE_COMMAND;
			}
		} else {
			try {
				process = Runtime.getRuntime().exec(cmd.getCmd());
			} catch (IOException e) {

				e.printStackTrace();
				return PROCESS_IS_NULL;
			}

		}

		OutputString output = new OutputString(process.getInputStream(), addResultString::accept);
		Executors.newSingleThreadExecutor().submit(output);
		int exitCode;
		try {
			exitCode = process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return PROCESS_RETURNED_ERROR_EXIT;
		}

		cmd.setResultCode(exitCode);
		cmd.setResultString(output.toString());
		return SUCCESS;
	}
	
	Consumer<String> addResultString = element -> {
		output.append(element);
	};

}
