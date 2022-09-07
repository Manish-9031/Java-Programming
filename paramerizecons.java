 class param {
    int x,y;
    param(int a,int b){
        x=a;
        y=b;

    }
    void show(){
        System.out.print(x+" "+y);
    }
    public static void main(String[] args) {
        param p=new param(3,6);
        p.show();
    }
    
}
