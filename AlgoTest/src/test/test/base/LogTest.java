package test.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import log.TLog;

class LogTest {

	@BeforeEach
	void setUp() throws Exception {
		TLog.nType = 3;
		TLog.Log("=================start======================");
	}

	@Test
	void logTest() {
		TLog.Log(1, "Log 1");
		TLog.Log(2, "Log 1");
	}

}
