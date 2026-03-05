import java.util.*;

class Solution {

    static class Job {
        int id;
        int request;
        int duration;

        Job(int id, int request, int duration) {
            this.id = id;
            this.request = request;
            this.duration = duration;
        }
    }

    public int solution(int[][] jobs) {

        int n = jobs.length;

        // 요청 시간 기준 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // 우선순위 큐
        PriorityQueue<Job> pq = new PriorityQueue<>((a, b) -> {
            if (a.duration != b.duration) return a.duration - b.duration;
            if (a.request != b.request) return a.request - b.request;
            return a.id - b.id;
        });

        int time = 0;
        int index = 0;
        int total = 0;

        while (index < n || !pq.isEmpty()) {

            // 현재 시간까지 들어온 작업 큐에 추가
            while (index < n && jobs[index][0] <= time) {
                pq.add(new Job(index, jobs[index][0], jobs[index][1]));
                index++;
            }

            if (!pq.isEmpty()) {
                Job job = pq.poll();

                time += job.duration;
                total += (time - job.request);
            } else {
                // 작업이 없으면 다음 요청 시간으로 이동
                time = jobs[index][0];
            }
        }

        return total / n;
    }
}