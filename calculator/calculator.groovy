// calculator.groovy - a simple calculator script

class given_equ {
    int first_value
    String function
    int second_value
}

given_equ equation1 = new given_equ(
    first_value:15,
    function: "/",
    second_value:5
)

if (equation1.function == "+") {
    println equation1.first_value + equation1.second_value
} else if (equation1.function == "-") {
    println equation1.first_value - equation1.second_value
} else if (equation1.function == "x" || equation1.function == "*") {
    println equation1.first_value * equation1.second_value
} else {
    println equation1.first_value / equation1.second_value
}
