package com.lambda;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;

	public class OrderList {

	static List<Order> orderList = new ArrayList<Order>();
		static {
			Random random = new Random();
			for(int i=0;i<40;i++) {
				String status = i%2==0 ? "Accepted" : "Completed";
				int price = random.nextInt(2000);
				Order order = new Order(price,status);
				orderList.add(order);
			}
		}
		public static List<Order> getOrders() {
			return orderList;
		}
		public static void printOrder(List<Order> order) {
			for(Order or:order){
				System.out.println(or);
			}
		}
	}


