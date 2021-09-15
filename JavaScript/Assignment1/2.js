//program2
sum=0;
const n=parseInt(prompt('enter a number: '));//get input
for(i=1;i<=n;i++){
    if((i%3===0)||(i%5===0)){
        sum+=i;
    }
}
console.log('sum of the numbers:'+sum);
document.write(sum);//display
