package net.flo.parsing;



class Test {

	private void fail(String string) {
		System.out.println(string);
		
	}
	
	public void testRom() {
		if(Conversion.addRomNum("MMMMCMLXXXIV")!=4984)
		{fail("Test failed the value is "+ 4984);
		}else
		{
			succeed();		
		}
	}

	private void succeed() {
		System.out.println("Test succeed !");
		
	}
	public void testRom4000() {
		if(Conversion.addRomNum("MMMM")!=4000)
		{fail("Test failed the value is "+ 4000);
		}else
		{
			succeed();
		}
	}
	public void testRom9() {
		if(Conversion.addRomNum("IX")!=9)
		{fail("Test failed the value is "+ 9);
		}else
		{
			succeed();
		}
	}
	public void testRom55() {
		if(Conversion.addRomNum("VV")==10)
		{fail("Test failed the value is "+ null);
		}else
		{
			succeed();
		}
	}
	public void testRom552() {
		if(Conversion.addRomNum("VV")==5)
		{fail("Test failed the value is "+ null);
		}else
		{
			succeed();
		}
	}
	public void testRomnULL() {
		if(Conversion.addRomNum("")!=0)
		{fail("Test failed the value is "+ null);
		}else
		{
			succeed();
		}
	}
}


