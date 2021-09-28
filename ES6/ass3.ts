let Order=['01','Avengers','1000'];
let [id,title,price]=Order;
function printOrder(){
    return (Order);
}
console.log(printOrder());

function getPrice(){
    return (price);
}
console.log(getPrice());
let copy= Object.assign(Order);
console.log(copy);