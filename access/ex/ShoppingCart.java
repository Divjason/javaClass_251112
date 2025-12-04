package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }
    
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.printf("상품명 : %s, 합계 : %d\n", item.getName(), item.getTotalPrice());
        }
        System.out.printf("전체 가격의 합 : %d\n", calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return  totalPrice;
    }
}
