package com.omega.watch.modal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

// mvn test -Dtest=OrderTest
public class OrderTest {

    @Test
    public void testCreateOrderWithId() {
        User user = new User();
        user.setId(1L);

        Watch watch1 = new Watch();
        watch1.setId(101L);
        Watch watch2 = new Watch();
        watch2.setId(102L);
        List<Watch> watches = new ArrayList<>();
        watches.add(watch1);
        watches.add(watch2);

        Payment payment = new Payment();
        payment.setAmount(250.0);

        Order order = new Order(1L, 500.0, LocalDateTime.now(), "John", "Doe", "New York", "123 Main St",
                "johndoe@example.com", "123-456-7890", "10001", watches, user, payment);

        assertEquals(1L, order.getId());
        assertEquals(500.0, order.getTotalPrice());
        assertNotNull(order.getDate());
        assertEquals("10001", order.getPostIndex());
        assertEquals(2, order.getWatches().size());
        assertEquals(user, order.getUser());
        assertEquals(OrderStatus.PENDING, order.getStatus());
        assertEquals(payment, order.getPayment());
    }

    @Test
    public void testCreateOrderWithoutId() {
        User user = new User();
        user.setId(1L);

        Watch watch = new Watch();
        watch.setId(101L);
        List<Watch> watches = new ArrayList<>();
        watches.add(watch);

        Order order = new Order();

        order.setTotalPrice(500.0);
        order.setPostIndex("1001");
        order.setWatches(watches);
        order.setUser(user);
        order.setPayment(null);

        assertNull(order.getId()); // ID should be null before saving to the database
        assertEquals(500.0, order.getTotalPrice());
        assertNotNull(order.getDate());
        assertEquals("1001", order.getPostIndex());
        assertEquals(1, order.getWatches().size());
        assertEquals(user, order.getUser());
        assertEquals(OrderStatus.PENDING, order.getStatus());
        assertNull(order.getPayment()); // Payment should be null
    }

    @Test
    public void testOrderStatusTransition() {
        Order order = new Order();
        order.setStatus(OrderStatus.PENDING);

        order.setStatus(OrderStatus.PROCESSING);
        assertEquals(OrderStatus.PROCESSING, order.getStatus());

        order.setStatus(OrderStatus.SHIPPED);
        assertEquals(OrderStatus.SHIPPED, order.getStatus());

        order.setStatus(OrderStatus.DELIVERED);
        assertEquals(OrderStatus.DELIVERED, order.getStatus());

        order.setStatus(OrderStatus.CANCELLED);
        assertEquals(OrderStatus.CANCELLED, order.getStatus());
    }

}
