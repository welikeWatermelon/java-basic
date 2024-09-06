package access.ex;
    public class Item {
        private String name;
        private int price;
        private int quantity;

        public Item(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String inforM(){
            return name;
        }

        public int inforP(){
            return price * quantity;
        }
        //TODO 나머지 코드를 완성해라.
}
