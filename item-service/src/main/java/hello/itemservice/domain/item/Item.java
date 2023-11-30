package hello.itemservice.domain.item;

import lombok.Data;

// Data가 핵심 도메인에 쓰는건 위험.. getter, setter, constructor 다 열렸음;; DTO 는 걍 Data 열어도 됨
@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price; // price 가 들어오지 않을 경우
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
