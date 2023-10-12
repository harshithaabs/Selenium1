package ParallelEx;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void Test1(){
		System.out.println("Module1---"+Thread.currentThread().getId());
		
	}
	@Test
	public void Test2(){
		System.out.println("Module2---"+Thread.currentThread().getId());
		
	}
}
