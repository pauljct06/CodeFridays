[1, 2, 3, [4, [5, 6, 7]], {"a": "xyz"}, 8, "nine", 9, [[[[], [10]]]]]

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

function flatten(arr){

    var result = [];

    for(var i = 0; i < arr.length; i++){
        var currElement = arr[i];
        var flattenedArray;
        if(Array.isArray(currElement)){
            flattenedArray = flatten(currElement);
            console.log(flattenedArray);
            result = result.concat(flattenedArray);
        }
        else if(typeof(currElement) == "number"){
            result.push(currElement);
        }
    }

    return result;
}

//Currying
//Hoisting

function add(x) {
    this.x = x;

    return function(y) {
        return this.x + y;
    }
}


var addFive = add(5);
var addTwenty = add(20);
var addHund = add(100);

addFive(10); // 15
addHundred(20) // 120