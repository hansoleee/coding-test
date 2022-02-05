package progammers.learn.courses._30.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class _77484Test {

    _77484 solution = new _77484();

    @Test
    @DisplayName("2/2")
    void solution_1() {
        int[] solution = this.solution.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});

        Assertions.assertArrayEquals(new int[]{3, 5}, solution);
    }

    @Test
    @DisplayName("0/6")
    void solution_2() {
        int[] solution = this.solution.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});

        Assertions.assertArrayEquals(new int[]{1, 6}, solution);
    }

    @Test
    @DisplayName("6/0")
    void solution_3() {
        int[] solution = this.solution.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});

        Assertions.assertArrayEquals(new int[]{1, 1}, solution);
    }

    @Test
    @DisplayName("0/0")
    void solution_4() {
        int[] solution = this.solution.solution(new int[]{7, 7, 7, 7, 7, 7}, new int[]{1, 2, 3, 4, 5, 6});

        Assertions.assertArrayEquals(new int[]{6, 6}, solution);
    }

    @Test
    @DisplayName("0/1")
    void solution_5() {
        int[] solution = this.solution.solution(new int[]{7, 7, 7, 7, 7, 0}, new int[]{1, 2, 3, 4, 5, 6});

        Assertions.assertArrayEquals(new int[]{6, 6}, solution);
    }

    @Test
    @DisplayName("0/2")
    void solution_6() {
        int[] solution = this.solution.solution(new int[]{7, 7, 7, 7, 0, 0}, new int[]{1, 2, 3, 4, 5, 6});

        Assertions.assertArrayEquals(new int[]{5, 6}, solution);
    }

    @Test
    @DisplayName("0/3")
    void solution_7() {
        int[] solution = this.solution.solution(new int[]{7, 7, 7, 0, 0, 0}, new int[]{1, 2, 3, 4, 5, 6});

        Assertions.assertArrayEquals(new int[]{4, 6}, solution);
    }

    @Test
    @DisplayName("1/0")
    void solution_8() {
        int[] solution = this.solution.solution(new int[]{7, 7, 7, 7, 7, 1}, new int[]{1, 2, 3, 4, 5, 6});

        Assertions.assertArrayEquals(new int[]{6, 6}, solution);
    }

    @Test
    @DisplayName("1/1")
    void solution_9() {
        int[] solution = this.solution.solution(new int[]{7, 7, 7, 7, 0, 1}, new int[]{1, 2, 3, 4, 5, 6});

        Assertions.assertArrayEquals(new int[]{5, 6}, solution);
    }
}