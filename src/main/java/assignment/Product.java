package assignment;

class Product {
    String name;
    private int price;
    private int stock;


    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void restock(int quantity){
        if(stock < quantity){
            stock += quantity;
        }
        System.out.println("상품명" + name + quantity + "개 입고 완료, 현재 재고: " + stock);
    }

    public void sell(int quantity){
        if(stock >= quantity){
            stock -= quantity;
            System.out.println(name + " " + quantity + "개 판매 성공, 남은 재고: " + stock);
        }else{
            System.out.println(name + " 판매 실패, 재고 부족(현재 " + stock + "개)");
        }
    }
    public int stockValue(){
        return price * stock;
    }
}

