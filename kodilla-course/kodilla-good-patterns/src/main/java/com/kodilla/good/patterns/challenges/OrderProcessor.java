package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private OrderConfirmationService orderConfirmationService;
    private ProductOrderService productOrderService;
    private ShelfMonitoringService shelfMonitoringService;

    public OrderProcessor(final OrderConfirmationService orderConfirmationService,
                          final ProductOrderService productOrderService,
                          final ShelfMonitoringService shelfMonitoringService) {
        this.orderConfirmationService = orderConfirmationService;
        this.productOrderService = productOrderService;
        this.shelfMonitoringService = shelfMonitoringService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest);

        if (isOrdered) {
            orderConfirmationService.confirmation(orderRequest);
            shelfMonitoringService.updateQuantity(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
