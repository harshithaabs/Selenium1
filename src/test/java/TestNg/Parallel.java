package TestNg;

import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void Test1(){
		System.out.println("test1---"+Thread.currentThread().getId());
		
	}
	@Test
	public void Test2(){
		System.out.println("test2---"+Thread.currentThread().getId());
		
	}

}
