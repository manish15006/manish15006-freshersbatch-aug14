var arr=[];
while(arr.length < 20){
    var r = Math.floor(Math.random() * 20) + 1;
    if(arr.indexOf(r) === -1) arr.push(r);
}

function bubbleSort(arr) {
    var swapped;
    do {
        swapped = false;
        for (var i=0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                var temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }
    } while (swapped);
}

bubbleSort(arr);
console.log(arr);