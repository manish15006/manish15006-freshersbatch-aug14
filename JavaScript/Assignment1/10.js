/*let n=100;
function fib(n){
    if(n<=1){
        return n;
    }
    return fib(n-1)+fib(n-2);

}*/
//document.write(fib(n));
//console.log(fib(n));
var n,a=0,b=0,c=1;
function fib(){
    for(let i=1;i<=100;i++){
        a=b;
        b=c;
        c=a+b;
        document.write(a+" ");
    }
}
document.write(fib());