function gradePercentage(userScore, passScore) {
  userScore = parseInt(userScore.substring(0, userScore.length - 1));
  passScore = parseInt(passScore.substring(0, passScore.length - 1));
  let result = userScore < passScore ? "FAILED" : "PASSED";
  return "You " + result + " the Exam";
  //date change
}
