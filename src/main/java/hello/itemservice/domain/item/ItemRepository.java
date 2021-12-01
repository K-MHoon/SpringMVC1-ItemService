package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    /**
     * 아이템 저장
     * @param item 저장할 아이템
     * @return 저장된 아이템
     */
    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    /**
     * 아이디 찾기
     * @param id 찾을 id
     * @return 찾은 Item
     */
    public Item findById(Long id) {
        return store.get(id);
    }

    /**
     * 전체 Item 찾기
     * @return 전체 Item
     */
    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    /**
     * 아이템 업데이트
     * @param itemId 아이템 ID
     * @param updateParam 업데이트 된 아이템
     */
    public void update(Long itemId, Item updateParam) {
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
        findItem.setOpen(updateParam.getOpen());
        findItem.setRegions(updateParam.getRegions());
        findItem.setItemType(updateParam.getItemType());
        findItem.setDeliveryCode(updateParam.getDeliveryCode());
    }

    /**
     * 저장소 비우기
     */
    public void clearStore() {
        store.clear();
    }


}
