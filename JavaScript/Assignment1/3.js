//program3
const num=parseInt(prompt('enter a number: '));
function evenOrOdd(){
    if(num%2==0){
        return "even";
    }else{
        return "odd";
    }
}
document.write(evenOrOdd(num));