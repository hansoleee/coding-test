package progammers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LearnCourses30Lessons92334Test {

    LearnCourses30Lessons92334 lessons92334 = new LearnCourses30Lessons92334();

    @Test
    void solution_1() {
        int[] solution = lessons92334.solution(
                new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2);
        Assertions.assertArrayEquals(solution, new int[]{2, 1, 1, 0});
    }

    @Test
    void solution_2() {
        int[] solution = lessons92334.solution(
                new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3);
        Assertions.assertArrayEquals(solution, new int[]{0, 0});
    }

    @Test
    void solution_3() {
        int[] solution = lessons92334.solution(
                new String[]{"1", "2", "3", "4", "5", "6"},
                new String[]{"1 2", "2 3", "3 4", "4 5", "5 6", "6 1"},
                1);
        Assertions.assertArrayEquals(solution, new int[]{1, 1, 1, 1, 1, 1});
    }
}
