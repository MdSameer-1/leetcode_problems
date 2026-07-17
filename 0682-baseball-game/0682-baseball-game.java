class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for (String op : operations) {
            if (op.equals("C")) {
                sum -= st.pop();
            }
            else if (op.equals("D")) {
                int val = 2 * st.peek();
                st.push(val);
                sum += val;
            }
            else if (op.equals("+")) {
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                int val = first + second;
                st.push(val);
                sum += val;
            }
            else {
                int num = Integer.parseInt(op);
                st.push(num);
                sum += num;
            }
        }
        return sum;
    }
}