package net.javaguides.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import net.javaguides.springboot.entity.Order;
import net.javaguides.springboot.entity.Payment;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
