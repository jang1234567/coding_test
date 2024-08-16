//숫자비교하기
//두 숫자가 같으면 리턴 1, 다르면 -1
public class Main {
        public int solution(int num1, int num2) {
            int answer = 0;
            if(num1 != num2){
                return -1;
            }
            else
                return 1;
        }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution(4, 2));
        System.out.println(main.solution(4, 4));

    }
}