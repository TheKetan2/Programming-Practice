function actualMemorySize(ms) {
  let space = parseInt(ms.replace(/[^0-9]/g, ""));
  if (ms.includes("MB")) {
    return (space - space * (7 / 100)).toFixed(0) + "MB";
  } else {
    return space - space * (7 / 100) < 1
      ? Math.round((space - space * (7 / 100)) * 1000) + "MB"
      : (space - space * (7 / 100)).toFixed(2) + "GB";
  }
}
