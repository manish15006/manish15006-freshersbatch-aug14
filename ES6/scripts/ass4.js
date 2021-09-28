"use strict";
var arrow = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    var output = [];
    for (var i in names) {
        output.push({
            name: names[i],
            length: names[i].length
        });
    }
    console.log.apply(console, output);
};
var names = ['Tom', 'Ivan', 'Jerry'];
arrow.apply(void 0, names);
//# sourceMappingURL=ass4.js.map