//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 < num1 ≤ 100
//        0 < num2 ≤ 100
public class Main03 {
        public int solution(int num1, int num2) {
            int answer = 0;
            if ((num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100)) {
                answer = num1 % num2;
            }
            return answer;
        }
    
    public static void main(String[] args) {
            Main03 obj = new Main03();
            System.out.println(obj.solution(3, 4));
            }
        }
