"use strict";
var Order = ['01', 'Avengers', '1000'];
var id = Order[0], title = Order[1], price = Order[2];
function printOrder() {
    return (Order);
}
console.log(printOrder());
function getPrice() {
    return (price);
}
console.log(getPrice());
var copy = Object.assign(Order);
console.log(copy);
//# sourceMappingURL=ass3.js.map