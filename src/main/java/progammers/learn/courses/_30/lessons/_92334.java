package progammers.learn.courses._30.lessons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 * 신고 결과 받기
 */
public class _92334 {

    /**
     * @param id_list ["muzi", "frodo", "apeach", "neo"]
     * @param report  ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
     * @param k       2
     * @return [2, 1, 1, 0]
     */
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reportBox = new HashMap<>();
        for (String r : report) {
            String[] s = r.split(" ");
            Set<String> strings;
            if (reportBox.containsKey(s[1])) {
                strings = reportBox.get(s[1]);
                strings.add(s[0]);
            } else {
                reportBox.put(s[1], new HashSet<>() {{
                    add(s[0]);
                }});
            }
        }

        for (String s : reportBox.keySet()) {
            Set<String> reporters = reportBox.get(s);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    for (int i = 0; i < id_list.length; i++) {
                        if (id_list[i].equals(reporter)) {
                            answer[i] = answer[i] + 1;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
