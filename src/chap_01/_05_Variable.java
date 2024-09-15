package chap_01;

public class _05_Variable {
    public static void main(String[] args) {
        //변수 이름 짓는법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄 문자 숫자 사용가능 (공백 사용가능) 밑줄 또는 문자로 사용가능
        // 3. 한단어 또는 두 단어로만 가능
        // 4. 소문자로 시작, 각 단어의 시작글자는 대문자
        // 5. 예약어 안됨

        String nationality = "대한민국";
        String firstName = "현성";
        String lasName = "김";

        // 절대 변하지 않는 상수는 대문자로!
        String CODA ="KR"; // 지금은 변수인데
        final String CODE = "KR";// final 붙이면 상수
    }
}
