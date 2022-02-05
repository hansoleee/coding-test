package progammers.learn.courses._30.lessons;


/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 * 로또의 최고 순위와 최저 순위
 */
public class _77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6, 6};
        int score = 0;
        int wildcard = 0;

        // 일치한 숫자와 와일드 카드 갯수 세기
        for (int lotto : lottos) {
            if (lotto == 0) {
                wildcard++;
                continue;
            }
            for (int win_num : win_nums) {
                if (win_num == lotto) {
                    score++;
                }
            }
        }

        // 순위 계산
        int max = score + wildcard;
        int min = score;

        if (max == 6) {
            answer[0] = 1;
        } else if (max >= 2) {
            answer[0] = 6 - max + 1;
        }

        if (min == 6) {
            answer[1] = 1;
        } else if (min >= 2) {
            answer[1] = 6 - min + 1;
        }

        return answer;
    }
}
