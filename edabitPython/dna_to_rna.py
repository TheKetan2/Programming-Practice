def dna_to_rna(dna):
#A, T, G and C in DNA converts to U, A, C and G respectively
  data = {"A":"U", "T":"A","G":"C","C":"G"}
  sol =""
  for i in dna:
    sol +=data[i]
  return sol
