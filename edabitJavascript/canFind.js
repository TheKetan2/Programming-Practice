function canFind(bigrams, words) {
    let sentense = words.join(" ")
    return bigrams.length === bigrams.filter(bia => {
        return sentense.includes(bia)
    }).length
}