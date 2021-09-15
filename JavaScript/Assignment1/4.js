function count_ht(s, N)
{
     
    // Check if initially all the
    // coins are facing towards head
    var p = [0,0];
    if(s == 'H')
    {
        p[0] = Math.floor(N / 2.0);
        p[1] = Math.ceil(N / 2.0);
    }
     
    // Check if initially all the coins
    // are facing towards tail
    else if(s == 'T')
    {
        p[0] = Math.ceil(N / 2.0);
        p[1] = Math.floor(N / 2.0);
    }
     
    return p;
}
 
// Driver code
var C = 'H';
var N = 10;
 
var p = count_ht(C, N);
 
document.write( "Head = " + (p[0]) + "<br>");
document.write( "Tail = " + (p[1]) + "<br>");