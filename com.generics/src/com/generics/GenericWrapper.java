package com.generics;

public class GenericWrapper<T> {
	T t;
	public GenericWrapper(){
		this.t=t;
	}
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
	 GenericWrapper<Integer> gw=new GenericWrapper<Integer>();
	 gw.set(24);
	 //System.out.println(gw.get());
	 System.out.println(gw.get().toString());
	 gw.set(25);
	 System.out.println(gw.get().toString());

	}

}
