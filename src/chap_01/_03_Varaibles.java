package chap_01;

public class _03_Varaibles {
    public static void main(String[] args) {
        String name;
        name = "조채연";
        int hour = 15;
        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료됩니다");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다 학점은 " + grade + "학점입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요 ? " + pass);

        double d = 3.143445034;
        float f = 3.1423423424f; //정밀한 값은 안됨
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        System.out.println(l);// int의 범위를 벗어남 따라서 long 써야함
    }
}
