package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ItemType {
    BOOK("도서"), FOOD("식품"), ETC("기타");

    private final String desc;
}
