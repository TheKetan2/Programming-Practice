function firstPlace(road) {
  if (road.length == 0) {
    return "No road available";
  }
  road = road.replace(/["="]/g, "");
  return road.length ? road[road.length - 1] : "No car available";
}
