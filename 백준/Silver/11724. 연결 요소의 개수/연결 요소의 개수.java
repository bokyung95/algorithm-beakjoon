import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 문제 번호 : 11724
 * 문제 설명 : 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다.
 * (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
 * 출력 : 첫째 줄에 연결 요소의 개수를 출력한다.
 * 입력 예제
 * 6 5
 * 1 2
 * 2 5
 * 5 1
 * 3 4
 * 4 6
 * 출력 예제
 * 2
 * 문제 Tip : DFS 이용
 * 작성일 : 2022-11-01
 **/
public class Main {

	static ArrayList<Integer>[] arr; //인접 리스트
	static boolean[] visited; // 방문 기록 저장 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());

		arr = new ArrayList[node + 1];
		visited = new boolean[node + 1];

		for (int i = 1; i < node + 1; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			arr[start].add(end);
			arr[end].add(start); //방향이 없기때문에 양쪽 방향 모두 저장
		}

		int count = 0;
		for (int i = 1; i < node + 1; i++) {
			if (!visited[i]) { //방문하지 않은 노드
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
	}

	private static void dfs(int node) {
		if (visited[node]) {//현재 노드가 방문한 노드이면
			return;
		}
		visited[node] = true;
		for (int i : arr[node]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}

}