def test_fairness(agatha, bertha):
	a = 1
	b = 1
	for choco in agatha:
		a += (choco[0] * choco[1])
	for choco in bertha:
		b += (choco[0] * choco[1])
	return a == b