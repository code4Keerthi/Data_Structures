public class MyStack {
    int[] a;
    int top;
    int size;
    public MyStack(int size) {
        this.top=0;
        this.size=size;
        this.a=new int[size];
    }
    public boolean push(int n){
        if(top==size){
            return false;
        }
        a[top++]=n;
        return true;
    }
    public boolean pop(){
        if(top==0){
            return false;
        }
        top--;
        return true;
    }
    public boolean search(int n){
        for(int i=0;i<top;i++){
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return top;
    }
    public int peek(){
        if(top==0)return -1;
        return a[top];
    }
}