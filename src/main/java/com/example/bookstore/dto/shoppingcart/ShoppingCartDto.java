package com.example.bookstore.dto.shoppingcart;

import com.example.bookstore.dto.cartitem.CartItemDto;
import java.util.Set;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ShoppingCartDto {
    private Long id;
    private Long userId;
    private Set<CartItemDto> cartItemDtoSet;
}
