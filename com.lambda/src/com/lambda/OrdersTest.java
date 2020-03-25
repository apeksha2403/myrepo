package com.lambda;
import java.util.*;
import java.util.function.*;

public class OrdersTest {

	public static void main(String[] args) {
	
     List<Order> orderlist = OrderList.getOrders();

     OrderPred bystatus = (Order t) -> "Completed".equals(t.getStatus());
     OrderPred byprice = (Order t) -> t.getPrice() >1000;

    List<Order> filteredorder = filterOrders(orderlist, bystatus);
  //  OrderList.printOrder(filteredorder);

   // OrderList.printOrder(filteredorder);


     System.out.println("\n\n");


     List<Order>  filteredorder1 = filterOrders(filteredorder ,byprice);
     OrderList.printOrder(filteredorder1);


     }

     public static List<Order> filterOrders(List<Order> Orders, OrderPred predicate) {
     List<Order> filteredOrders = new ArrayList<Order>();
     for(Order Order: Orders) {
     if (predicate.test(Order)) {
     filteredOrders.add(Order);
     }
     }
     return filteredOrders;

     }



	}


@FunctionalInterface
interface OrderPred{
boolean test(Order t);
}
