class MinStack {

    int[] arr;
    int[] minArr;
    int top;
    public MinStack() {
        arr=new int[9999];
        minArr=new int[9999];
        top=-1;
    }
    
    public void push(int val) {
        arr[++top]=val;
        if(top==0){
            minArr[top]=val;
        }else{
            minArr[top]=Math.min(val,minArr[top-1]);
        }
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        return minArr[top];
    }
}
