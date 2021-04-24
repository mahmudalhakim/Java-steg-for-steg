var a = " Erik Andersson 860314-2714  ";
a = a.trim()
var i = a.lastIndexOf(' ') + 1;
var j = a.indexOf('-');
var b = a.substring(i+4, j) + '/' + a.substring(i+2, j-2);