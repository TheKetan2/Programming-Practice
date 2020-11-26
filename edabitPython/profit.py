def profit(info):
	total_cost = info["cost_price"]*info["inventory"]
	total_sale = info["sell_price"]*info["inventory"]
	return round(total_sale-total_cost)
	