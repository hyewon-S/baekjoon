package Level13;

public class q_10989 {
    import sys

    n = int(sys.stdin.readline())
    C = [0] * 10001

    for _ in range(n):
        C[int(sys.stdin.readline())] += 1

    for i in range(10001):
        for _ in range(C[i]):
            print(i)
}
