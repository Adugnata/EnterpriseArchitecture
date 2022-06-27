package edu.miu.lab4partb.service;

import edu.miu.lab4partb.domain.Order;
import edu.miu.lab4partb.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService{
    @Autowired
    OrderRepo orderRepo;
    @Override
    public void Save(Order order) {
        orderRepo.save(order);
    }
}
