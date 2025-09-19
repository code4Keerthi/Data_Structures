public class MyArrayList {
    int[] a;
    int index;
    int capacity;

    public MyArrayList(int capacity){
        this.index=0;
        this.capacity=capacity;
        this.a=new int[capacity];
    }

    public void add(int num){
        if(index==capacity){                     // fixed
            a=Expansion(capacity);
        }
        a[index++]=num;
    }

    public void remove(int num) {
        for (int i=0;i<index;i++) {
            if (a[i]==num) {
                for (int j=i;j<index-1;j++) {
                    a[j]=a[j+1];
                }
                index--;
                i--;
            }
        }
    }

    public boolean contains(int num){
        for(int i=0;i<index;i++){
            if(a[i]==num){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int num){
        for(int i=0;i<index;i++){
            if(a[i]==num) return i;
        }
        return -1;
    }

    public int get(int position){
        for(int i=0;i<index;i++){
            if(i==position)
                return a[i];
        }
        return -1;
    }

    public int[] Expansion(int capacity){
        int newCapacity = capacity+(capacity/2);
        int[] b=new int[newCapacity];
        for(int i=0;i<capacity;i++){
            b[i]=a[i];
        }
        this.capacity=newCapacity;
        return b;
    }

    public int size() {
        return index;
    }
}
