package CardRecommendService.cardHistory;

import java.util.List;

public record FindAllResponse(List<CardHistoryResponse> cardHistoryList,
                              int totalCount,
                              Integer totalCost) {
}
