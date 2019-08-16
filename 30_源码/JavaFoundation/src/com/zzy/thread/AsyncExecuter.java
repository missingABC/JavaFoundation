package com.zzy.thread;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
 
public class AsyncExecuter {
 
	private static Executor executor = Executors.newCachedThreadPool(new ThreadFactory() {
		@Override
		public Thread newThread( Runnable runnable) {
			return new Thread(runnable, "AsyncExecuter");
		}
	});
 
	public static void submit(final Runnable runnable) {
		executor.execute(runnable);
	}
}
