class OrderedStream {
    int p=0;
    String[] arr;
    public OrderedStream(int n) {
        arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> li=new ArrayList<>();
        arr[idKey-1]=value;
        while(p<arr.length&&arr[p]!=null){
            li.add(arr[p]);
            p++;
        }
        return li;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */