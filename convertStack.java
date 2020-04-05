package BaiTapStack.covert;

import java.util.Stack;

public class convertStack {
    public static void main(String[] args) {
        int number = 111;
        Stack<Integer> listBinary = new Stack<>();
        int naturalPart = number;
        do {
            int remainder = naturalPart % 2;
            naturalPart = naturalPart / 2;
            listBinary.push(remainder);
        } while (naturalPart != 0);
        listBinary.push(naturalPart);
        String binary = "";
        int length = listBinary.size();
        for (int i = 0; i < length; i++) {
            binary += listBinary.pop() + "";
        }
        System.out.printf("%d = (%s)B", number, binary);
    }
}
