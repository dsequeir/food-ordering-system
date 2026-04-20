package com.food.ordering.system.order.service.domain.port.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.service.domain.dto.track.RestaurantApprovedResponse;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovedResponse restaurantApprovedResponse);
    void orderRejected(RestaurantApprovedResponse restaurantApprovedResponse);
}
