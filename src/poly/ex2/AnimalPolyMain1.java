package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sountAnimal(dog);
        sountAnimal(cat);
        sountAnimal(caw);
    }

    // 동물이 추가 되어도 변하지 않는 코드
    private static void sountAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
