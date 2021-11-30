function aveSpd(upTime, upSpd, downSpd) {
  let dist = (upTime / 60) * upSpd * 2;
  let downTime = (dist / 2 / downSpd) * 60;
  return (dist / (upTime + downTime)) * 60;
}
