package com.Functionalprograms;
import java.util.concurrent.TimeUnit;

import com.bridgelabz.functionalutil.FunctionalUtil;
public class StopWatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

long start=System.currentTimeMillis();
System.out.println(start);
try {
	TimeUnit.SECONDS.sleep(5);
	
}catch(InterruptedException e) {
	e.printStackTrace();
}
long now=System.currentTimeMillis();
System.out.println(now);
double time=FunctionalUtil.stopWatch(now,start);
//int time=
System.out.println("time elapse " +time);

	}

}
