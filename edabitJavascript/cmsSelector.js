function cmsSelector(arr, str) {
  arr.sort();
  return arr.filter((cms) => cms.toLowerCase().includes(str));
}
