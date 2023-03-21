package com.project.naeil.order.service;

import java.util.List;

import com.project.naeil.order.vo.OrderVO;

public interface OrderService {
	public List<OrderVO> listMyOrderGoods(OrderVO orderVO) throws Exception;
	
	public void addNewOrder(List<OrderVO> myOrderList) throws Exception;
	
	public OrderVO findMyOrder(String order_id) throws Exception;
	
}
