import java.util.List;

interface latihan1{
    void output();
}

class main{
    public static void main(String[] args) {
        latihan1 l1 = () -> System.out.println("ini adalah program lambda. ");
l1.output();
List<Integer> lt = List.of(1,2,3,4,5,6,7,8);
System.out.println();
lt.stream()
.filter(n -> n % 2 == 0)
.forEach(n -> System.out.println("angka genap adalah: " + n));
    }
}