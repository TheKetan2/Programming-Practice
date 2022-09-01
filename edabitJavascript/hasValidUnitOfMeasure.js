function hasValidUnitOfMeasure(product = {}) {
  const { unitOfMeasure, comment } = product;
  return (
    comment !== undefined || unitOfMeasure === "L" || unitOfMeasure === "PCE"
  );
}
