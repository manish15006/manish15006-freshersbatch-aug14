function sum(arr) { 
    let sum = 0; // initialize sum 

    // Iterate through all elements 
    // and add them to sum 
    for (let i = 0; i < arr.length; i++) 
        sum += arr[i]; 

    return sum; 
} 
 
// Driver code
let arr = [10,20,30,10];
document.write("Sum of given array is " + sum(arr));
