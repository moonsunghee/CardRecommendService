package CardRecommendService.cardHistory;

import CardRecommendService.memberCard.MemberCardResponse;

import java.time.LocalDateTime;

public record CardHistoryResponse(
        String storeName,
        int amount,
        LocalDateTime paymentDatetime,
        Category category

) {
}
