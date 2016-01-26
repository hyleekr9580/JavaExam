import java.util.ArrayList;

public class ArrayListExam2 {
    // M(model)V(view)C(controller) 패턴이라고 한다.
    //MODEL클래스를 이용하여 무엇인가 로직을 짜고 실행 하는 것이 컨트롤러(Controller)
    public static void main(String[] args) {
        //리스트 연습
        //장바구니를 리스트로 표현하기
        //먼저 카트를 만든다. > 상품을 만든다. > 상품을 카트에 넣는다.

        //카트
        ArrayList<Product> cart = new ArrayList<>();

        // 상품을 만든다.
        Product iMac = new Product("iMac 5k", 1, 1500000);

        //카트에 물건을 넣어 본다.
        cart.add(iMac);
        cart.add(new Product("아이패드", 1, 500000));
        cart.add(new Product("Java 네트워크 소녀 네티", 1, 25000));
        System.out.println(cart);

        //카트에 상품을 빼고 싶다.
//        cart.remove(iMac);
//        System.out.println(cart);

        // 상품의 순서를 바꾸고 싶다.
        // 0번과 2번의 순서를 바꾸고 싶다.
        // 새로운 변수를 만들어서 .set하면은 된다.
        Product book = cart.get(2);
        cart.set(0, book);
        cart.set(2, iMac);
        System.out.println(cart);
    }

    // 상품 GET,SET 아무것도 없는 것은 [MODEL] 클래스 이다.
    // 데이터를 담아서 사용하는 용도로만 사용을 한다.
    //메인이 static 이라 class에도 static
    static class Product {
        private String code;    //상품코드
        private int quantity;   //수량
        private int price;  //단가

        //생정자 만들었다.
        public Product(String code, int quantity, int price) {
            this.code = code;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "code='" + code + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}' + "\n";
        }
    }
}
