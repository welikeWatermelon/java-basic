package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1= new ProductOrder();
        ProductOrder order2= new ProductOrder();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = {order1, order2};

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        createOrder(order1, "apple",5000,2);
        createOrder(order2, "banana",3000,3);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        getTotalAmount(orders);
        // 총 결제 금액 출력
    }

    public static void createOrder(ProductOrder order, String productName,int price, int quantity ){
            order.productName = productName;
            order.price = price;
            order.quantity = quantity;
        }



    public static void printOrders(ProductOrder[] orders){
        for(int i=0; i<orders.length; i++ ){
            System.out.println("주문 내역: "+orders[i].productName+" 가격: "+orders[i].price+" 수량: "+orders[i].quantity);
        }
    }

    public static void getTotalAmount(ProductOrder[] orders){
        int sum=0;
        for (int i=0; i<orders.length;i++ ){
            sum += orders[i].price*orders[i].quantity;
        }
        System.out.println("총 합계금액: "+sum);
    }
}
