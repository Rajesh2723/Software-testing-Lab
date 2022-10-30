package nextdate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class equind2pgm {
	//weak and strong normal test case
	@Test
	public void test_1()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(15,6,1912),"16/6/1912");
	}
	@Test
	public void test_2()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(10,6,1912),"11/6/1912");
	}
	@Test
	public void test_3()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(10,6,1900),"11/6/1900");
	}
	@Test
	public void test_4()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(10,5,1912),"11/5/1912");
	}
	@Test
	public void test_5()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(20,10,2010),"21/10/2010");
	}
	//weak robust test cases
	@Test
	public void test3()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(-1,10,1912),"Invalid Values");
	}
	@Test
	public void test31()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,7,1912),"13/7/1912");
	}
	@Test
	public void test32()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,8,1912),"13/8/1912");
	}
	@Test
	public void test33()
	{ 
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,4,1912),"13/4/1912");
	}
	@Test
	public void test34()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,9,1912),"13/9/1912");
	}
	@Test
	public void test35()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,1,1912),"13/1/1912");
	}
	@Test
	public void test36()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,2,1912),"13/2/1912");
	}
	@Test
	public void test37()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(12,3,1912),"13/3/1912");
	}
	@Test
	public void test30()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(10,3,1912),"11/3/1912");
	}
	@Test
	public void test4()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(15,13,1912),"Invalid Values");
	}
	@Test
	public void test5()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(1,6,2200),"Invalid Values");
	}
	@Test
	public void test6()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(32,6,1912),"Invalid Values");
	}
	@Test
	
	public void test8()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(15,6,2013),"Invalid Values");
	}
	//strong robust test cases @Test
	public void test9()
	{
	nextdate ob1=new nextdate();
	assertEquals(ob1.nextday(2,1,1912),"3/1/1912");
	}
	@Test
	public void test10()
	{ 
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(-1,3,1900),"Invalid Values");
	}
	@Test
	public void test11()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(15,0,1811),"Invalid Values");
	}
	@Test
	public void test12()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(33,12,1912),"Invalid Values");
	}
	@Test
	public void test14()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(-1,6,-1),"Invalid Values");
	}
	@Test
	public void test15()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(-1,-1,-1),"Invalid Values");
	}
	@Test
	public void test16()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(31,12,2010),"1/1/2011");
	}
	@Test
	public void test17()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(30,11,2010),"1/12/2010");
	}
	//////leap @Test
	public void test18()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(3,2,2010),"4/2/2010");
	}
	@Test
	public void test19()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(28,2,2010),"1/3/2010");
	}
	@Test
	public void test20()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(20,2,2008),"21/2/2008");
	}
	@Test
	public void test21()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(29,2,2000),"1/3/2000");
	}
	@Test
	public void test22()
	{
	nextdate ob1=new nextdate(); 
	assertEquals(ob1.nextday(28,2,1900),"1/3/1900");
	}
	}

