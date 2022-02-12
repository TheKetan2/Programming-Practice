function reorderDigits(arr, direction) {
    let sol = [];
    for (let num of arr) {
        sol.push(Number(num.toString().split("").map(n => Number(n)).sort((a, b) => direction == "asc" ? a - b : b - a).join("")))
    }
    return sol;
}