function  operation(a, b, op){

	let sol = 0;	switch (op){

		case "add":

			sol = parseInt(a)+parseInt(b)

			break;

		case "subtract":

			sol = parseInt(a)-parseInt(b)

			break;

		case "divide":

			sol = parseInt(a)/parseInt(b)

			break;

		case "multiply":

			sol = parseInt(a)*parseInt(b)

			break;

		default:

			return sol;

	}

	return sol== Infinity?"undefined": sol;

	

}
