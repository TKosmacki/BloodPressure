package bloodPressure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class knowledgeBaseTest {
	
	CreateBloodPressure myBp;

	@Before
	public void setUp() throws Exception {
		myBp = new CreateBloodPressure();
	}
	//-------------------------------------------------------
	//Male Start
	//-------------------------------------------------------
	//15-18
	@Test
	public void fifteenHighMale() {
		int age= 15;
		int sys=131;
		int dias=96;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fifteenLowMale() {
		int age= 15;
		int sys=114;
		int dias=74;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fifteenHealthyMale() {
		int age= 15;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//19-24
	@Test
	public void nineteenHighMale() {
		int age= 19;
		int sys=131;
		int dias=96;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void nineteenLowMale() {
		int age= 19;
		int sys=109;
		int dias=68;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void nineteenHealthyMale() {
		int age= 19;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//25-29
	@Test
	public void twentyfiveHighMale() {
		int age= 25;
		int sys=131;
		int dias=96;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void twentyfiveLowMale() {
		int age= 25;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void twentyfiveHealthyMale() {
		int age= 25;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//30-345
	@Test
	public void thirtyHighMale() {
		int age= 30;
		int sys=135;
		int dias=95;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void thirtyLowMale() {
		int age= 30;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void thirtyHealthyMale() {
		int age= 30;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//36-39
	@Test
	public void thirtysixHighMale() {
		int age= 36;
		int sys=135;
		int dias=95;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void thirtysixLowMale() {
		int age= 36;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void thirtysixHealthyMale() {
		int age= 36;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//40-45
	@Test
	public void fortyHighMale() {
		int age= 40;
		int sys=135;
		int dias=95;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fortyLowMale() {
		int age= 40;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fortyHealthyMale() {
		int age= 40;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//46-49
	@Test
	public void fortysixHighMale() {
		int age= 46;
		int sys=135;
		int dias=95;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fortysixLowMale() {
		int age= 46;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fortysixHealthyMale() {
		int age= 46;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//50-55
	@Test
	public void fiftyHighMale() {
		int age= 50;
		int sys=140;
		int dias=97;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fiftyLowMale() {
		int age= 50;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fiftyHealthyMale() {
		int age= 50;
		int sys=120;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//56-59
	@Test
	public void fiftysixHighMale() {
		int age= 56;
		int sys=145;
		int dias=100;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fiftysixLowMale() {
		int age= 56;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void fiftysixHealthyMale() {
		int age= 56;
		int sys=125;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//60+
	@Test
	public void sixtyHighMale() {
		int age= 56;
		int sys=145;
		int dias=100;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void sixtyLowMale() {
		int age= 56;
		int sys=110;
		int dias=69;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertTrue(emer);
	}
	@Test
	public void sixtyHealthyMale() {
		int age= 56;
		int sys=125;
		int dias=85;
		String sex= "Male";
		boolean emer = myBp.componentTask(sys,dias,age,sex);
		assertFalse(emer);
	}
	//-------------------------------------------------------
	//Female Start
	//-------------------------------------------------------
	//15-18
		@Test
		public void fifteenHighFemale() {
			int age= 15;
			int sys=131;
			int dias=96;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fifteenLowFemale() {
			int age= 15;
			int sys=106;
			int dias=55;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fifteenHealthyFemale() {
			int age= 15;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//19-24
		@Test
		public void nineteenHighFemale() {
			int age= 19;
			int sys=131;
			int dias=96;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void nineteenLowFemale() {
			int age= 19;
			int sys=109;
			int dias=68;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void nineteenHealthyFemale() {
			int age= 19;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//25-29
		@Test
		public void twentyfiveHighFemale() {
			int age= 25;
			int sys=131;
			int dias=96;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void twentyfiveLowFemale() {
			int age= 25;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void twentyfiveHealthyFemale() {
			int age= 25;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//30-345
		@Test
		public void thirtyHighFemale() {
			int age= 30;
			int sys=135;
			int dias=95;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void thirtyLowFemale() {
			int age= 30;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void thirtyHealthyFemale() {
			int age= 30;
			int sys=125;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//36-39
		@Test
		public void thirtysixHighFemale() {
			int age= 36;
			int sys=135;
			int dias=95;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void thirtysixLowFemale() {
			int age= 36;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void thirtysixHealthyFemale() {
			int age= 36;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//40-45
		@Test
		public void fortyHighFemale() {
			int age= 40;
			int sys=135;
			int dias=95;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fortyLowFemale() {
			int age= 40;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fortyHealthyFemale() {
			int age= 40;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//46-49
		@Test
		public void fortysixHighFemale() {
			int age= 46;
			int sys=135;
			int dias=95;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fortysixLowFemale() {
			int age= 46;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fortysixHealthyFemale() {
			int age= 46;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//50-55
		@Test
		public void fiftyHighFemale() {
			int age= 50;
			int sys=140;
			int dias=97;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fiftyLowFemale() {
			int age= 50;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fiftyHealthyFemale() {
			int age= 50;
			int sys=120;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//56-59
		@Test
		public void fiftysixHighFemale() {
			int age= 56;
			int sys=145;
			int dias=100;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fiftysixLowFemale() {
			int age= 56;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void fiftysixHealthyFemale() {
			int age= 56;
			int sys=125;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
		//60+
		@Test
		public void sixtyHighFemale() {
			int age= 56;
			int sys=145;
			int dias=100;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void sixtyLowFemale() {
			int age= 56;
			int sys=110;
			int dias=69;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertTrue(emer);
		}
		@Test
		public void sixtyHealthyFemale() {
			int age= 56;
			int sys=125;
			int dias=85;
			String sex= "Female";
			boolean emer = myBp.componentTask(sys,dias,age,sex);
			assertFalse(emer);
		}
}