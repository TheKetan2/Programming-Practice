function interview(arr, tot) {
  if (tot > 120 || arr.length !== 8) return "disqualified";
  for (let i in arr) {
    if (i >= 0 && i <= 1) {
      if (arr[i] > 5) {
        return "disqualified";
      }
    } else if (i >= 2 && i <= 3) {
      if (arr[i] > 10) {
        return "disqualified";
      }
    } else if (i >= 4 && i <= 5) {
      if (arr[i] > 15) {
        return "disqualified";
      }
    } else {
      if (arr[i] > 20) {
        return "disqualified";
      }
    }
  }
  return "qualified";
}

/*
The candidate should have complete all the questions.
The maximum time given to complete the interview is 120 minutes.
The maximum time given for very easy questions is 5 minutes each.
The maximum time given for easy questions is 10 minutes each.
The maximum time given for medium questions is 15 minutes each.
The maximum time given for hard questions is 20 minutes each.
*/
