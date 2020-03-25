package com.Exception;

import java.lang.AutoCloseable;

public class CloseableTest {

	public static void main(String[] args) throws Exception {
		try {
			tryWithCloseException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void tryWithCloseException() throws Exception {
		try (MyAutoCloseable mr = new MyAutoCloseable()) {
			System.out.println("MyAutoCloseable created in try-with-resources");
			if (true)
				throw new Exception("Exception in try");
		}
	}
	
	static class MyAutoCloseable implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("Closing MyAutoCloseable function");
			throw new Exception("Exception in Closing");
		}

	}

	}


