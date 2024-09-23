package com.pettory.pettory.jointshopping.command.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class jointShoppingGroupUpdateRequest {

    @NotBlank
    @NotNull
    private final String jointShoppingGroupName;
    @NotBlank
    @NotNull
    private final String jointShoppingProducts;
    private final String jointShoppingInfo;
    @NotBlank
    @NotNull
    private final Integer jointShoppingCost;
    @NotBlank
    @NotNull
    private final Integer jointShoppingGroupMaximumCount;
    @NotBlank
    @NotNull
    private final Integer jointShoppingParticipationMaximumCount;
    private final String hostInvoiceNum;
    @NotBlank
    @NotNull
    private final Long jointShoppingCategoryNum;
    @NotBlank
    @NotNull
    private final Long userId;

}
