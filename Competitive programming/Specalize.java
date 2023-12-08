import java.util.*;
class AddElements<T> {
    public T add(T element1, T element2) {
        return null; 
    }
}
class AddElementsString extends AddElements<String> {
    public String add(String element1, String element2) {
        return element1 + element2;
    }
}
class AddElementsInteger extends AddElements<Integer> {
        public Integer add(Integer element1, Integer element2) {
        return element1 + element2;
    }
}
class AddElementsFloat extends AddElements<Float> {
    public Float add(Float element1, Float element2) {
        return element1 + element2;
    }
}
public class Specalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String dataType = scanner.next();
            if (dataType.equals("string")) {
                AddElementsString addElementsString = new AddElementsString();
                String element1 = scanner.next();
                String element2 = scanner.next();
                System.out.println(addElementsString.add(element1, element2));
            } else if (dataType.equals("int")) {
                AddElementsInteger addElementsInteger = new AddElementsInteger();
                int element1 = scanner.nextInt();
                int element2 = scanner.nextInt();
                System.out.println(addElementsInteger.add(element1, element2));
            } else if (dataType.equals("float")) {
                AddElementsFloat addElementsFloat = new AddElementsFloat();
                float element1 = scanner.nextFloat();
                float element2 = scanner.nextFloat();
                System.out.println(addElementsFloat.add(element1, element2));
            }
        }
    }
}
