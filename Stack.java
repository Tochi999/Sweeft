public class Stack <T>{
    private T[] st;
    private int size;
    private int logLen;
    public Stack(){
        st = (T[]) new Object[2];
        size = 2;
        int logLen = 0;
    }
    private void grow(){
        T[] curSt = (T[]) new Object[2*size];
        for(int i = 0; i < st.length; i++){
            curSt[i] = st[i];
        }
        size = size*2;
        st = curSt;
    }
    public void push(T cur){
        if(logLen == st.length - 1){
            grow();
        }
        st[logLen] = cur;
        logLen++;
    }
    public T pop(){
        T answer = null;
        if(logLen != 0){
            logLen--;
            answer = st[logLen];

        }
        return answer;
    }
    public boolean isEmpty(){
        if(logLen != 0){
            return false;
        }
        return true;
    }
    public T front(){
        T answer = null;
        if(logLen != 0){
            answer = st[logLen - 1];
        }
        return answer;
    }

}
