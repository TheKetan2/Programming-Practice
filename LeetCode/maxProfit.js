var maxProfit = function(prices) {
  let profit = 0;
  for (let i = 0; i < prices.length; i++) {
    // profit = Math.max(...prices.slice(i)) - prices[i];
    // console.log(profit);
    if (profit < Math.max(...prices.slice(i)) - prices[i]) {
      profit = Math.max(...prices.slice(i)) - prices[i];
      console.log(profit);
    }
  }
  return profit;
};
