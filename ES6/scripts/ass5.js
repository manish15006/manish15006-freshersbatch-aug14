"use strict";
//5a
var x = function (a, b) {
    if (a === void 0) { a = 2; }
    if (b === void 0) { b = 3; }
    return a + b;
};
console.log(x());
//5b
var userFriends = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    username = username,
        friends = friends;
};
console.log('manish', ['vamshi', 'mohan', 'riyaz']);
//5c
var Names = ['ben', 'gwen', 'max', 'keven', 'juile'];
var printCapitalNames = function () {
    var Names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        Names[_i] = arguments[_i];
    }
    for (var i in Names)
        console.log(Names[i].toUpperCase() + " ");
};
printCapitalNames.apply(void 0, Names);
//# sourceMappingURL=ass5.js.map