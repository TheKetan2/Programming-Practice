function ohmsLaw(v, r, i) {
    let val;
    let valArr = [v, r, i].filter(val => val === "")
    if (valArr.length === 0 || valArr.length > 1) {
        return "Invalid";
    }
    if (v === "") {
        console.log(r, '*', i)
        val = r * i;
    } else if (r === "") {
        console.log(v, '/', i)
        val = v / i;
    } else {
        console.log(v, '/', r)
        val = v / r;
    }
    return Number(val.toFixed(2));
}

//V = R * I