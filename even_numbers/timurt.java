class FindEvenNumbers {
    public void solve(int from, int to) {
        for (int i = from; i<= to; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int minNum = 0;
        int maxNum = 100;
        new FindEvenNumbers().solve(minNum, maxNum);
    }
}
