package test.level_4;

//// Level 4 < N-Queen

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import log.TLog;

class NQueenT {

	@BeforeEach
	void setUp() throws Exception {
		
		TLog.Log("1check Upload ============ start ==================1");
		TLog.Log("2check Upload ============ start ==================1");
		TLog.Log("3check Upload ============ start ==================1");
		TLog.Log("4check Upload ============ start ==================1");
		TLog.Log("5check Upload ============ start ==================1");
	}
	
	@Test
	void Queen8Find() {
		int len = 8;
		
		int[] flag = new int[len];
		int[] pos = new int[len];
		
		int j = 0;
		for(int i=0;i<8;i++) {
			if(flag[j] == 0) {
				pos[i] = j;
				if(i == 7)
					System.out.println(Arrays.toString(pos));
				
			}else {
				flag[j] = 1;
				
			}
			
			
		}
		
	}
	
	

	@Test
	void QueenNFind() {
	
		
		
	}

}
