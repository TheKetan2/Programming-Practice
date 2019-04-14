
////////////////////////////////////////

boolean validTime(String time){

class Helper {
    int charToInt(char symbol) {
        return symbol - '0';
    }}

    Helper h = new Helper();

    int hours = h.charToInt(time.charAt(0)) * 10 + h.charToInt(time.charAt(1)),
            minutes = h.charToInt(time.charAt(3)) * 10 + h.charToInt(time.charAt(4));

    if(hours<24&&minutes<60)
    {
        return true;
    }return false;
   }

    ////////////////////////////////////////

    boolean isInformationConsistent(int[][] evidences) {

        for (int j = 0; j < evidences[0].length; j++) {
            boolean innocent = false, guilty = false;
            for (int i = 0; i < evidences.length; i++) {
                switch (evidences[i][j]) {
                case -1:
                    innocent = true;
                    break;
                case 1:
                    guilty = true;
                    break;
                }
            }

            if (innocent && guilty) {
                return false;
            }
        }

        return true;
    }

    /////////////////////////////////////////////

    int rightmostRoundNumber(int[] inputArray) {
        int index = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {

            if (inputArray[i] % 10 == 0)
                return i;

        }
        return -1;
    }

    ////////////////////////////////////////////////

    int countBlackCells(int n, int m) {
        int div = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0)
                div = i;
        }
        return n + m + div - 2;

    }

    ////////////////////////////////////////
    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;
        }
        return inputArray;
    }

    ////////////////////////////////////////
    String insertDashes(String inputString) {
        String sol = "";
        if (inputString.length() < 2)
            return inputString;
        for (char c : inputString.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sol += c + "-";
            } else
                sol += c;
        }
        String[] str = sol.split(" ");
        sol = "";
        if (str.length > 1) {
            for (int i = 0; i < str.length - 1; i++) {
                sol += str[i].substring(0, str[i].length() - 1) + " ";
            }
            sol += str[str.length - 1].substring(0, str[str.length - 1].length() - 1);
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean isSumOfConsecutive(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += j;
                if (sum == n)
                    return true;
            }
        }
        return false;
    }

    ////////////////////////////////////////

    int telephoneGame(String[] messages) {
        int index = -1;
        if (messages.length > 0) {
            for (String str : messages) {
                if (!str.equals(messages[0])) {
                    return index + 1;
                }
                index++;

            }
        }
        return -1;
    }

    ////////////////////////////////////////
    int lastDigit(int a, int b) {

        int sol = 1;
        while (b > 0) {
            sol *= a;
            sol %= 10;
            b--;
        }

        return sol;
    }

    ////////////////////////////////////////
    int divNumber(int k, int l, int r) {
        int sol = 0;

        for (int i = l; i <= r; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == k)
                sol++;
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean insideCircle(int[] point, int[] center, int radius) {
        System.out.println(
                (int) Math.sqrt((int) Math.pow(point[0] - center[0], 2) + (int) Math.pow(point[1] - center[1], 2)));
        return (float) Math
                .sqrt((int) Math.pow(point[0] - center[0], 2) + (int) Math.pow(point[1] - center[1], 2)) <= radius;
    }

    ////////////////////////////////////////
    String replaceFirstDigitRegExp(String input) {
        int index = 0;
        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9')
                break;
            index++;
        }
        return input.substring(0, index) + "#" + input.substring(index + 1);
    }

    ///////////////////////////////////////
    char lastDigitRegExp(String inputString) {
        inputString = new StringBuilder(inputString).reverse().toString();
        int index = 0;
        for (char c : inputString.toCharArray()) {
            if (c >= '0' && c <= '9')
                return c;
            index++;
        }

        return '0';
    }

    ///////////////////////////////////////
    int kthDivisor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                list.add(i);
        }
        if (list.size() < k)
            return -1;
        return list.get(k - 1);

    }

    ////////////////////////////////////////
    int gcdNaive(int a, int b) {

        int gcd = 1;
        for (int divisor = 2; divisor <= Math.min(a, b); divisor++) {
            if (a % divisor == 0 && b % divisor == 0) {
                gcd = divisor;
            }
        }

        return gcd;
    }

    ////////////////////////////////////////
    int countInversionsNaive(int[] inputArray) {
        int sol = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j])
                    sol++;
            }
        }
        return sol;

    }

    ////////////////////////////////////////
    int[] fractionMultiplication(int[] a, int[] b) {
        int[] fraction = { a[0] * b[0], a[1] * b[1] };
        int div = Math.min(fraction[0], fraction[1]);
        while (div != 1) {
            if (fraction[0] % div == 0 && fraction[1] % div == 0) {
                fraction[0] /= div;
                fraction[1] /= div;
                div = Math.min(fraction[0], fraction[1]);
            } else
                div--;
        }
        return fraction;
    }

    ////////////////////////////////////////
    boolean charactersRearrangement(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;
        char[] s1 = string1.toCharArray();
        char[] s2 = string2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i])
                return false;
        }

        return true;

    }

    ////////////////////////////////////////

    int[] firstReverseTry(int[] arr) {
        if (arr.length < 2)
            return arr;
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    ////////////////////////////////////////
    int[] concatenateArrays(int[] a, int[] b) {
        int[] sol = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            sol[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            sol[i] = b[j];
            i++;
        }
        return sol;
    }

    ////////////////////////////////////////
    int[] removeArrayPart(int[] inputArray, int l, int r) {
        int[] sol = new int[inputArray.length - (r - l + 1)];
        for (int i = 0, j = 0; i < inputArray.length; i++) {
            if (i < l || i > r) {
                sol[j] = inputArray[i];
                j++;
            }
        }
        return sol;

    }

    ////////////////////////////////////////
    boolean isSmooth(int[] arr) {
        // if(arr.length <2) return true;

        if (arr.length % 2 == 0)
            return arr[0] == arr[arr.length - 1]
                    && arr[arr.length - 1] == (arr[arr.length / 2] + arr[arr.length / 2 - 1]);
        else
            return arr[0] == arr[arr.length - 1] && arr[arr.length - 1] == arr[arr.length / 2];

    }

    ////////////////////////////////////////
    int[] replaceMiddle(int[] arr) {
        if (arr.length % 2 == 0) {
            int[] sol = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; j++) {
                if (i == arr.length / 2 - 1) {
                    sol[j] = arr[arr.length / 2] + arr[arr.length / 2 - 1];
                    i += 2;
                } else {
                    sol[j] = arr[i];
                    i++;
                }
            }
            return sol;

        }
        return arr;

    }

    ////////////////////////////////////////
    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int num : statues) {
            hs.add(num);
        }
        int sol = 0;
        for (int i = statues[0] + 1; i < statues[statues.length - 1]; i++) {
            if (hs.add(i))
                sol++;
        }
        return sol;
    }

    ////////////////////////////////////////

    int[] makeArrayConsecutive(int[] sequence) {

        ArrayList<Integer> answer = new ArrayList<>();
        int current_position = 0;

        Arrays.sort(sequence);
        for (int i = sequence[0]; i < sequence[sequence.length - 1]; i++) {
            if (sequence[current_position] != i) {
                answer.add(i);
            } else {
                current_position++;
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    ////////////////////////////////////////
    String buildPalindrome(String st) {
        String str = new StringBuilder(st).reverse().toString();
        if (str.equals(st))
            return st;
        for (int i = 0; i < st.length(); i++) {
            System.out.println("New String: " + st.substring(0, i) + str);
            if ((st.substring(0, i) + str).equals(new StringBuilder((st.substring(0, i) + str)).reverse().toString()))
                return st.substring(0, i) + str;
        }
        return "";
    }

    ////////////////////////////////////////

    int largestDistance(int[] a) {

        int[] mx = new int[] { a[0], a[1] };
        int[] mn = new int[] { a[a.length - 2], a[a.length - 1] };
        for (int i = 0; i < a.length; i++) {
            int k = i % 2;
            if (a[i] > mx[k]) {
                mx[k] = a[i];
            } else if (a[i] < mn[k]) {
                mn[k] = a[i];
            }
        }
        return Math.max(mx[0] - mn[0], mx[1] - mn[1]);
    }

    ////////////////////////////////////////
    int[] makeArrayConsecutive(int[] sequence) {
        Arrays.sort(sequence);
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : sequence) {
            list.add(num);
        }

        int start = sequence[0];
        int end = sequence[sequence.length - 1];

        int[] sol = new int[end - start + 1 - sequence.length];
        int j = 0;

        for (int i = start; i <= end; i++) {

            if (!list.contains(i)) {
                sol[j] = i;
                j++;
            }

        }

        return sol;

    }

    ///////////////////////////////////////

    boolean isInRange(int a, int b, int c) {
        return b >= a && b <= c;
    }

    ////////////////////////////////////////
    String caesarBoxCipherEncoding(String inputString) {
        int n = (int) Math.sqrt(inputString.length());
        String sol = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < inputString.length(); j += n) {
                sol += inputString.charAt(j) + "";
            }
        }
        return sol;
    }

    ////////////////////////////////////////
    int sumOfMultiples(int n, int k) {
        int sum = 0;
        for (int i = 1;; i++) {
            if (i * k <= n)
                sum += (i * k);
            else
                break;
        }
        return sum;
    }

    ////////////////////////////////////////

    int differentSubstrings(String inputString) {

        ArrayList<String> substrings = new ArrayList<>();
        int result = 1;

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j <= inputString.length(); j++) {
                substrings.add(inputString.substring(i, j));
            }
        }
        Collections.sort(substrings);
        for (int i = 1; i < substrings.size(); i++) {
            if (!substrings.get(i).equals(substrings.get(i - 1))) {
                result++;
            }
        }

        return result;
    }

    /////////////////////////////////////////
    int differentSubstringsTrie(String inputString) {

        class Helper {
            void addNode(ArrayList<int[]> lastVersion) {
                int[] line = new int[26];
                lastVersion.add(line);
            }
        }
        Helper h = new Helper();

        int nodesCount = 1;
        ArrayList<int[]> trie = new ArrayList<>();
        h.addNode(trie);

        for (int i = 0; i < inputString.length(); i++) {
            int currentNode = 0;
            for (int j = i; j < inputString.length(); j++) {
                int symbol = inputString.charAt(j) - 'a';
                if (trie.get(currentNode)[symbol] == 0) {
                    h.addNode(trie);
                    trie.get(currentNode)[symbol] = nodesCount;
                    nodesCount++;
                }
                currentNode = trie.get(currentNode)[symbol];
            }
        }

        return nodesCount - 1;
    }

    ////////////////////////////////////////
    boolean isPower(int n) {
        int power = 2;
        while (power < (n)) {
            System.out.println((Math.pow(n, 1.0 / power)));
            if (n == (int) Math.pow((int) Math.ceil(Math.pow(n, 1.0 / power)), power))
                return true;
            power++;
        }
        return n < 2;
    }

    ////////////////////////////////////////
    int isSumOfConsecutive2(int n) {
        int sol = 0;
        for (int i = 1; i < n; i++) {
            int sum = i;
            for (int j = i + 1; j < n; j++) {
                sum += j;
                if (sum == n)
                    sol++;
            }
        }
        return sol;
    }

    // 1 2 3 4 5 6 7 8

    ////////////////////////////////////////
    int squareDigitsSequence(int a0) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int sol = 0;
        list.add(a0);
        while (true) {
            int sum = 0;
            while (a0 != 0) {
                // System.out.println(a0%10 * a0%10);
                sum += (a0 % 10) * (a0 % 10);
                a0 /= 10;
            }
            System.out.println(sum);
            if (list.contains(sum))
                break;
            else
                list.add(sum);
            a0 = sum;
            sol++;
        }

        return sol + 2;
    }

    ////////////////////////////////////////

    boolean isLowerTriangularMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
                if (matrix[i][j] != 0)
                    return false;
            }
        }

        return true;

    }

    /////////////////////////////////////////

    int pagesNumberingWithInk(int current, int numberOfDigits) {
        String numbers = "";
        int count = 0;
        for (int i = current;; i++) {
            numbers += i + "";
            if (numbers.length() > numberOfDigits)
                break;
            count = i;
        }
        return count;
    }

    ////////////////////////////////////////
    int[] easyAssignmentProblem(int[][] skills) {

        if (skills[0][0] + skills[1][1] > skills[0][1] + skills[1][0]) {
            int[] sol = { 1, 2 };
            return sol;
        }
        int[] sol = { 2, 1 };
        return sol;
    }

    ////////////////////////////////////////
    int telephoneGame(String[] messages) {
        int index = -1;
        if (messages.length > 0) {
            for (String str : messages) {
                if (!str.equals(messages[0])) {
                    return index + 1;
                }
                index++;

            }
        }
        return -1;
    }

    ////////////////////////////////////////
    int commonCharacterCount(String s1, String s2) {
        int sol = 0;
        for (char c : s1.toCharArray()) {
            if (s2.replaceFirst(c + "", "").length() != s2.length()) {
                s2 = s2.replaceFirst(c + "", "");
                sol++;
            }
            s1 = s1.replaceFirst(c + "", "");
        }
        return sol;
    }

    ////////////////////////////////////////
    String integerToStringOfFixedWidth(int number, int width) {
        String num = number + "";
        if (num.length() > width)
            return num.substring(num.length() - width);
        if (num.length() < width) {
            while (num.length() != width)
                num = "0" + num;
            return num;
        }
        return num;
    }

    ////////////////////////////////////////
    int fibonacciIndex(int n) {

        int a = 0;
        int b = 1;
        int i = 1;
        while (String.valueOf(a).length() < n) {
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        return i - 1;
    }

    ////////////////////////////////////////
    int minimalNumberOfCoins(int[] coins, int price) {
        int sol = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            sol += price / coins[i];
            price %= coins[i];
        }
        return sol;
    }

    ////////////////////////////////////////

    int candies(int n, int m) {
        return n * (m / n);
    }

    ////////////////////////////////////////
    int specialPolynomial(int x, int n) {
        int k = 0;
        int sum = 0;
        while (true) {
            sum += (int) Math.pow(x, k);
            if (sum > n)
                return k - 1;
            k++;
        }
    }

    ////////////////////////////////////////
    int largestFullBinaryTree(int[] parent) {

        class Graph {
            ArrayList<Integer>[] edges;
            int maxBinTree;

            Graph(int[] parent) {
                maxBinTree = 1;
                edges = new ArrayList[parent.length];
                for (int i = 0; i < edges.length; i++) {
                    edges[i] = new ArrayList();
                }
                for (int i = 1; i < parent.length; i++) {
                    edges[parent[i]].add(i);
                }
            }

            int dfs(int v) {
                int firstMax = -1;
                int secondMax = -1;
                for (int u : edges[v]) {
                    int curMax = dfs(u);
                    if (curMax > firstMax) {
                        secondMax = firstMax;
                        firstMax = curMax;
                    } else if (curMax > secondMax) {
                        secondMax = curMax;
                    }
                }
                if (secondMax == -1) {
                    return 1;
                }
                int result = 1 + firstMax + secondMax;
                if (result > maxBinTree) {
                    maxBinTree = result;
                }
                return result;
            }
        }

        Graph g = new Graph(parent);
        g.dfs(0);
        return g.maxBinTree;
    }

    ////////////////////////////////////////
    boolean sulkyBoy(boolean statement) {
        boolean boys_statement = !statement;
        return statement;
    }

    ////////////////////////////////////////
    int[] arrayComplexElementsProduct(int[] real, int[] imag) {

        int[] answer = { real[0], imag[0] };
        for (int i = 1; i < real.length; i++) {
            int tmp = answer[0] * real[i] - answer[1] * imag[i];
            answer[1] = answer[1] * real[i] + answer[0] * imag[i];
            answer[0] = tmp;
        }
        return answer;
    }

    ////////////////////////////////////////

    int extraNumber(int a, int b, int c) {
        if (a == b)
            return c;
        if (a == c)
            return b;
        return a;
    }

    ////////////////////////////////////////
    boolean isTandemRepeat(String inputString) {
        return inputString.replaceAll(inputString.substring(inputString.length() / 2), "").length() == 0;

    }

    ////////////////////////////////////////

    String myConcat(String[] strings, String separator) {
        String sol = "";
        for (String s : strings) {
            sol += s + separator;
        }
        return sol;
    }

    ////////////////////////////////////////
    int axisAlignedBoundingBox(int[] x, int[] y) {

        int minX = x[0], maxX = x[0], minY = y[0], maxY = y[0];

        for (int i = 1; i < x.length; i++) {
            minX = Math.min(x[i], minX);
            maxX = Math.max(x[i], maxX);
            minY = Math.min(y[i], minY);
            maxY = Math.max(y[i], maxY);
        }

        return (maxX - minX) * (maxY - minY);
    }

    ////////////////////////////////////////
    boolean isLuckyNumber(int n) {
        while (n > 0) {
            int tmpDigit = n % 10;
            if (tmpDigit != 4 && tmpDigit != 7) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    ////////////////////////////////////////
    int numberOfEvenDigits(int n) {
        int sol = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0)
                sol++;
            n /= 10;
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean checkFactorial(int n) {

        for (int divisor = 2; n != 1; divisor++) {
            if (n % divisor == 0) {
                n /= divisor;
            } else {
                return false;
            }
        }
        return true;
    }

    ////////////////////////////////////////

    int[] primeFactors2(int n) {
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; prime[i] < n; i++) {
            if (n % prime[i] == 0) {
                list.add(prime[i]);
            }
        }
        int[] sol = new int[list.size()];
        int k = 0;
        for (int num : list) {
            sol[k] = num;
            k++;
        }
        return sol;

    }

    ////////////////////////////////////////

    int[] primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (n >= 2) {
            if (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }

        int[] ans = new int[factors.size()];
        for (int i = 0; i < ans.length; ++i) {
            ans[i] = factors.get(i);
        }
        return ans;
    }

    ////////////////////////////////////////
    int numberOfEvenDigits(int n) {
        int sol = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0)
                sol++;
            n /= 10;
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean passwordCheckRegExp(String inputString) {

        if (inputString.length() >= 5)
            if (inputString.replaceAll("[a-z]", "").length() != inputString.length())
                if (inputString.replaceAll("[A-Z]", "").length() != inputString.length())
                    if (inputString.replaceAll("[0-9]", "").length() != inputString.length())
                        return true;

        return false;
    }

    ////////////////////////////////////////

    int halvingSum(int n) {
        int sum = n;
        while (n > 0) {
            sum += n / 2;
            n /= 2;
        }
        return sum;
    }

    ////////////////////////////////////////
    boolean arithmeticExpression(int a, int b, int c) {
        return (a + b == c) || (a - b == c) || (a * b == c) || ((float) a / b == c);
    }

    ////////////////////////////////////////
    boolean isDiagonalMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j != i) {
                    if (matrix[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    ////////////////////////////////////////
    int[] onlyEvenNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }

        int[] array = new int[result.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = result.get(i);
        }
        return array;
    }

    ////////////////////////////////////////
    boolean higherVersion(String ver1, String ver2) {
        String[] v1 = ver1.split("\\.");
        String[] v2 = ver2.split("\\.");
        for (int i = 0; i < v1.length; i++) {
            if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]))
                return true;
            if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i]))
                return false;
        }
        return false;
    }

    ////////////////////////////////////////
    int swapNeighbouringDigits(int n) {
        String sol = "";
        char[] arr = (n + "").toCharArray();

        for (int i = 1; i < arr.length; i += 2) {
            sol += (arr[i] + "" + arr[i - 1]) + "";
        }
        return Integer.parseInt(sol.trim());
    }

    ////////////////////////////////////////
    int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nRows - row) * (nCols - col + 1);
    }

    ////////////////////////////////////////
    int lrSegmentNumber(int l, int r) {
        String sol = "";
        for (int i = l; i <= r; i++) {
            sol += i + "";
        }
        return Integer.parseInt(sol);
    }

    ////////////////////////////////////////
    int visitsOnCircularRoad(int n, int[] visitsOrder) {

        int current = 1, res = 0;
        for (int i = 0; i < visitsOrder.length; i++) {
            res += Math.min(Math.abs(visitsOrder[i] - current), n - Math.abs(visitsOrder[i] - current));
            visitsOrder[i] = current;
        }
        return res;
    }

    ////////////////////////////////////////
    int summaryProficiency(int[] a, int n, int m) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (n == 0)
                break;
            if (a[i] >= m) {
                sum += a[i];
                n--;
            }
        }
        return sum;
    }

    ////////////////////////////////////////

    int sameElementsNaive(int[] a, int[] b) {
        HashSet<Integer> hsA = new HashSet<>();
        HashSet<Integer> hsB = new HashSet<>();
        for (int num : a) {
            hsA.add(num);
        }
        int sol = 0;
        for (int num : b) {
            hsB.add(num);
        }
        for (int num : hsA) {
            if (!hsB.add(num)) {
                sol++;
            }
        }
        return sol;
    }

    ///////////////////////////////////////////
    int rectangleRotation(int a, int b) {
        a = (int) (a / Math.sqrt(2));
        b = (int) (b / Math.sqrt(2));
        int c = (a + 1) * (b + 1) + a * b;
        return c % 2 == 0 ? c - 1 : c;
    }

    ////////////////////////////////////////
    int crosswordFormation(String[] words) {
        int t = 0;
        if (words[0] == null || words[1] == null || words[2] == null || words[3] == null)
            return 0;
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                for (int k = 0; k < words.length; k++)
                    for (int l = 0; l < words.length; l++)
                        if (i != j && i != k && i != l && j != k && j != l && k != l)
                            t += get(words[i], words[j], words[k], words[l]);
        return t;
    }

    private int get(String s1, String s2, String s3, String s4) {
        // TODO Auto-generated method stub
        int kq = 0;

        int ls1 = s1.length();
        int ls2 = s2.length();
        int ls3 = s3.length();
        int ls4 = s4.length();
        for (int i = 0; i < ls1; i++) {
            for (int j = 0; j < ls2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    // System.out.println(s1.charAt(i));
                    for (int j2 = j + 2; j2 < ls2; j2++) {
                        for (int k = 0; k < ls3; k++) {
                            if (s2.charAt(j2) == s3.charAt(k)) {
                                for (int k2 = k + 2; k2 < ls3; k2++) {
                                    for (int l2 = ls4 - 1; l2 > -1; l2--) {
                                        if (s3.charAt(k2) == s4.charAt(l2)) {
                                            int p4 = l2 - j2 + j;
                                            int p1 = i + k2 - k;
                                            if (p4 > -1 && p4 < ls4 && p1 < ls1 && p1 > -1)
                                                if (s4.charAt(p4) == s1.charAt(p1)) {
                                                    // System.out.println(i+" "+j2 +" "+k2+" "+p4);
                                                    kq++;
                                                }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return kq;
    }

    ////////////////////////////////////////
    String reduceString(String inputString) {
        while (true) {
            if (inputString.length() <= 1)
                return "";
            if (inputString.charAt(0) == inputString.charAt(inputString.length() - 1) && inputString.length() > 2)
                inputString = inputString.substring(1, inputString.length() - 1);
            else
                return inputString;
        }

    }

    ////////////////////////////////////////
    int parabole(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    ///////////////////////////////////////////
    int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
        int newRowsLength = matrix.length - rowsToDelete.length;
        int newColumnsLength = matrix[0].length - columnsToDelete.length;
        int[][] res = new int[newRowsLength][newColumnsLength];
        boolean[] useRow = new boolean[matrix.length];
        boolean[] useColumn = new boolean[matrix[0].length];
        Arrays.fill(useRow, true);
        Arrays.fill(useColumn, true);

        for (int i = 0; i < rowsToDelete.length; i++) {
            useRow[rowsToDelete[i]] = false;
        }
        for (int i = 0; i < columnsToDelete.length; i++) {
            useColumn[columnsToDelete[i]] = false;
        }

        for (int i = 0, i2 = 0; i < matrix.length; i++) {
            if (useRow[i]) {
                for (int j = 0, j2 = 0; j < matrix[0].length; j++) {
                    if (useColumn[j]) {
                        res[i2][j2++] = matrix[i][j];
                    }
                }
                i2++;
            }
        }

        return res;
    }

    ////////////////////////////////////////
    int[] alternatingSums(int[] a) {
        int odd = 0;
        int eve = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0)
                eve += a[i];
            else
                odd += a[i];
        }
        int[] sol = { eve, odd };
        return sol;
    }

    ////////////////////////////////////////
    int digitsProduct(int product) {
        if (isPrime(product))
            return -1;
        for (int i = product;; i++) {
            int ml = 1;
            int num = i;
            while (num != 0) {
                ml *= num % 10;
                num /= 10;
            }
            System.out.println(ml + " " + i);
            if (ml == product)
                return i;
        }
    }

    boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n == 0 || n == 1)
            return false;
        for (int i = 2; i <= n / 2 + 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    ////////////////////////////////////////

    int hailstoneSequence(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            steps++;
        }
        return steps;
    }

    ////////////////////////////////////////
    int createAnagram(String s, String t) {

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt1[s.charAt(i) - 'A']++;
            cnt2[t.charAt(i) - 'A']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cnt1[i] - cnt2[i]);
        }

        return ans / 2;
    }

    ////////////////////////////////////////
    String[] sortByLength(String[] inputArray) {
        Arrays.sort(inputArray, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        return inputArray;
    }

    ////////////////////////////////////////
    ArrayList<Integer> arrayCenter(ArrayList<Integer> a) {

        int n = a.size();
        int suma = a.get(0), mina = suma;
        for (int i = 1; i < n; i++) {
            suma += a.get(i);
            mina = Math.min(mina, a.get(i));
        }

        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (Math.abs(n * a.get(i) - suma) < n * mina) {
                b.add(a.get(i));
            }
        }

        return b;
    }

    ////////////////////////////////////////
    int[] arrayCenter(int[] a) {
        int n = a.length;
        int suma = a[0], mina = suma;
        for (int i = 1; i < n; i++) {
            suma += a[i];
            mina = Math.min(mina, a[i]);
        }

        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (Math.abs(n * a[i] - suma) < n * mina) {
                b.add(a[i]);
            }
        }
        int sol[] = new int[b.size()];
        int i = 0;
        for (int num : b) {
            sol[i] = num;
            i++;
        }
        return sol;
    }

    ////////////////////////////////////////
    int depositProfit(int deposit, int rate, int threshold) {
        double grow = 1 + rate / 100.0;
        int year = (int) (Math.log((double) threshold / deposit) / Math.log(grow));
        if (deposit * Math.pow(grow, year) < threshold) {
            year++;
        }
        return year;
    }

    ////////////////////////////////////////
    int countSumOfTwoRepresentations3(int n, int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = l; i <= r; i++) {
            list.add(i);
        }
        int sol = 0;
        for (int num : list) {
            if (Math.abs(num - n) >= num) {
                if (list.contains(Math.abs(num - n)))
                    sol++;
            }
        }
        return sol;
    }

    ////////////////////////////////////////
   int countSumOfTwoRepresentations3(int n, int l, int r) {
    int res {};
    for (int i = 0; i <= 1000000; ++i) {
     if (l <= n - i && n - i <= r && n - i <= i && l <= i && i <= r) {
      res++;
     }
    }
    return res;
   }

    ////////////////////////////////////////
    int chessKnight(String cell) {
        int row = cell.charAt(1) - '1' + 1, column = cell.charAt(0) - 'a' + 1;
        int[][] steps = { { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 } };
        int answer = 0;

        for (int i = 0; i < steps.length; i++) {
            int tmpRow = row + steps[i][0];
            int tmpColumn = column + steps[i][1];
            if (tmpRow >= 1 && tmpRow <= 8 && tmpColumn >= 1 && tmpColumn <= 8) {
                answer++;
            }
        }

        return answer;
    }

    ////////////////////////////////////////
    int[][] create2DArray(int[] lengths) {

        int[][] result = new int[lengths.length][];

        for (int i = 0; i < lengths.length; i++) {
            result[i] = new int[lengths[i]];
            for (int j = 0; j < lengths[i]; j++) {
                result[i][j] = j;
            }
        }

        return result;
    }

    ////////////////////////////////////////
    int[] improperFractionToMixed(int[] a) {

        int[] b = { a[0] / a[1], 0, 0 };
        b[1] = a[0] - a[1] * b[0];
        b[2] = a[1];

        return b;
    }

    ////////////////////////////////////////

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int diff = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (diff < Math.abs(inputArray[i - 1] - inputArray[i]))
                diff = Math.abs(inputArray[i - 1] - inputArray[i]);
        }
        return diff;
    }

    ////////////////////////////////////////
    int largestNumber(int n) {
        String sol = "";
        for (int i = 0; i < n; i++) {
            sol += "9";
        }
        return Integer.parseInt(sol);
    }

    ////////////////////////////////////////
    String longestWord(String text) {
        String[] str = text.split(" ");
        String sol = "";
        int len = 0;
        for (String s : str) {
            s = s.replaceAll("[^a-zA-Z]", "");
            if (s.length() > len) {
                len = s.length();
                sol = s;
            }
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean isCorrectSentence(String inputString) {
        if (inputString.charAt(0) >= 'A' && inputString.charAt(0) <= 'Z')
            if (inputString.substring(inputString.length() - 1).equals("."))
                return true;
        return false;
    }

    ///////////////////////////////////////
    int arrayMaximalDifference(int[] inputArray) {

        int answer = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i] - inputArray[j] > answer) {
                    answer = inputArray[i] - inputArray[j];
                }
            }
        }
        return answer;
    }
    ///////////////////////////////////////////

    ////////////////////////////////////////
    int zigzag(int[] a) {

        int best = 1;
        int left = 0;
        while (left < a.length) {
            int right = left + 1;
            while (right < a.length) {
                if (right == left + 1) {
                    if (a[left] == a[right]) {
                        break;
                    }
                } else {
                    if ((a[right - 1] - a[right - 2]) * (a[right - 1] - a[right]) <= 0) {
                        break;
                    }
                }
                right++;
            }
            best = Math.max(best, right - left);
            left = right;
            if (left < a.length && a[left - 1] != a[left]) {
                left--;
            }
        }

        return best;
    }

    ////////////////////////////////////////
    int countLineColorings(int points, int colors) {
        int result = colors;
        for (int i = 1; i < points; i++) {
            result *= colors - 1;
        }
        return result;
    }

    ////////////////////////////////////////
    int countInversionsNaive(int[] inputArray) {

        int result = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    result++;
                }
            }
        }
        return result;
    }

    ////////////////////////////////////////
    int leastCommonPrimeDivisor(int a, int b) {

        for (int divisor = 2; a > 1 && b > 1; divisor++) {
            if (a % divisor == 0 && b % divisor == 0) {
                return divisor;
            }
            while (a % divisor == 0) {
                a /= divisor;
            }
            while (b % divisor == 0) {
                b /= divisor;
            }
        }

        return -1;
    }

    ////////////////////////////////////////
    int greatestCommonPrimeDivisor(int a, int b) {
        int sol = 0;
        for (int divisor = 2; a > 1 && b > 1; divisor++) {
            if (a % divisor == 0 && b % divisor == 0) {
                sol = divisor;
            }
            while (a % divisor == 0) {
                a /= divisor;
            }
            while (b % divisor == 0) {
                b /= divisor;
            }
        }

        return sol != 0 ? sol : -1;
    }

    ////////////////////////////////////////

    String removeAdjacent(String s) {

        if (s.equals("")) {
            return "";
        }

        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    ////////////////////////////////////////
    void merge(int[] sequence, int left, int middle, int right) {
        int[] result = new int[right - left];
        int i, j;
        int k = 0;

        for (i = left, j = middle; i < middle && j < right;) {
            if (sequence[i] < sequence[j]) {
                result[k++] = sequence[i];
                i++;
            } else {
                result[k++] = sequence[j];
                j++;
            }
        }

        while (i < middle) {
            result[k++] = sequence[i];
            i++;
        }

        while (j < right) {
            result[k++] = sequence[j];
            j++;
        }

        for (i = left; i < right; i++) {
            sequence[i] = result[i - left];
        }
    }

    void split(int[] sequence, int left, int right) {
        if (left + 1 == right) {
            return;
        }
        int middle = (left + right) / 2;
        split(sequence, left, middle);
        split(sequence, middle, right);
        merge(sequence, left, middle, right);
    }

    int[] mergeSort(int[] sequence) {
        split(sequence, 0, sequence.length);

        return sequence;
    }

    ////////////////////////////////////////
    int largestFullBinaryTree(int[] parent) {

        class Graph {
            ArrayList<Integer>[] edges;
            int maxBinTree;

            Graph(int[] parent) {
                maxBinTree = 1;
                edges = new ArrayList[parent.length];
                for (int i = 0; i < edges.length; i++) {
                    edges[i] = new ArrayList();
                }
                for (int i = 1; i < parent.length; i++) {
                    edges[parent[i]].add(i);
                }
            }

            int dfs(int v) {
                int firstMax = -1;
                int secondMax = -1;
                for (int u : edges[v]) {
                    int curMax = dfs(u);
                    if (curMax > firstMax) {
                        secondMax = firstMax;
                        firstMax = curMax;
                    } else if (curMax > secondMax) {
                        secondMax = curMax;
                    }
                }
                if (secondMax == -1) {
                    return 1;
                }
                int result = 1 + firstMax + secondMax;
                if (result > maxBinTree) {
                    maxBinTree = result;
                }
                return result;
            }
        }

        Graph g = new Graph(parent);
        g.dfs(0);
        return g.maxBinTree;
    }

    ////////////////////////////////////////

    String whoseMove(String lastPlayer, boolean win) {
        if (win)
            return lastPlayer;
        else
            return lastPlayer.equals("black") ? "white" : "black";
    }

    ////////////////////////////////////////
    String oneTwoMany(int n) {
        if (n == 1)
            return "one";
        if (n == 2)
            return "two";
        return "many";
    }

    ////////////////////////////////////////

    String longestDigitsPrefix(String inputString) {

        String sol = "";

        if (Character.isDigit(inputString.charAt(0))) {

            for (char c : inputString.toCharArray()) {
                if (Character.isDigit(c))
                    sol += (c + "");
                else
                    break;
            }

        }
        return sol;
    }

    ////////////////////////////////////////

    int divisorsPairs(int[] sequence) {
        // HashSet<Integer> hs = HashSet<Integer>();
        Arrays.sort(sequence);
        int sol = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[j] % sequence[i] == 0)
                    sol++;
            }
        }
        return sol;

    }

    ////////////////////////////////////////

    String formatString(String input) {
        String sol = "";
        String[] arr = input.split(" ");
        for (String s : arr) {
            if (s.length() != 0)
                sol += s + " ";
        }
        return sol.trim();
    }

    ///////////////////////////////////////

    int arrayElementsProduct(int[] inputArray) {
        int mult = 1;
        for (int n : inputArray) {
            mult *= n;
        }
        return mult;
    }

    ////////////////////////////////////////
    int countTriangles(int[] x, int[] y) {

        int result = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                for (int k = j + 1; k < x.length; k++) {
                    int doubleArea = (x[i] - x[j]) * (y[i] - y[k]) - (x[i] - x[k]) * (y[i] - y[j]);
                    if (doubleArea != 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    ////////////////////////////////////////

    boolean isPangram(String sentence) {
        boolean[] found = new boolean[26];
        boolean result = true;
        for (int i = 0; i < sentence.length(); i++) {
            int code = (int) sentence.charAt(i);
            if ((int) 'A' <= code && code <= (int) 'Z') {
                code += (int) 'a' - (int) 'A';
            }
            if ((int) 'a' <= code && code <= (int) 'z') {
                found[code - (int) 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!found[i]) {
                result = false;
            }
        }

        return result;
    }

    ////////////////////////////////////////
    int numberReverse(int input) {

        int reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
        }
        return reversed;
    }

    ////////////////////////////////////////
    int sumOfPowers(int n, int divisor) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            int u = 1;
            int c = 0;
            while (true) {
                u *= divisor;
                if (i % u != 0)
                    break;
                c++;
            }
            s += c;
        }
        return s;
    }

    //////////////////////////////////

    int fibonacciNumber(int n) {
        int[] fib = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 };
        return fib[n];
    }

    //////////////////////////////////
    int returnTwelve(int number) {
        while (number < 12) {
            number = 12;
        }
        return number;
    }

    ///////////////////////////////////
    int bfsDistancesUnweightedGraph2(boolean[][] matrix, int vertex1, int vertex2) {

        boolean[] visited = new boolean[matrix.length];
        LinkedList<Integer> queue = new LinkedList<>();
        int[] distance = new int[matrix.length];

        visited[vertex1] = true;
        queue.add(vertex1);
        while (queue.size() > 0) {
            int currentVertex = queue.pop();
            visited[currentVertex] = true;
            for (int nextVertex = 0; nextVertex < matrix.length; nextVertex++) {
                if (matrix[currentVertex][nextVertex] && !visited[nextVertex]) {
                    visited[nextVertex] = true;
                    distance[nextVertex] = distance[currentVertex] + 1;
                    queue.add(nextVertex);
                }
            }
        }

        return distance[vertex2];
    }

    ////////////////////////////////////
    int exerciseElaboration(int p, int n) {
        String num = "";
        if (n == 0) {
            p = p * 10 + p;
            int ans = 0;
            double power = Math.pow(p, 2);
            while (power > 0) {
                ans += power % 10;
                power /= 10;
            }
            return ans;
        } else {
            while (n > 0) {
                num += "0";
                n--;
            }
        }
        num = p + num + p;
        double power = Math.pow(Integer.parseInt(num), 2);
        int sol = 0;
        while (power > 0) {
            sol += power % 10;
            power /= 10;
        }
        return sol;
    }

    ////////////////////////////////////////
    ArrayList<Integer> sortedIndices(ArrayList<Integer> a) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            indices.add(i);
        }
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - i - 1; j++) {
                if (a.get(indices.get(j)) > a.get(indices.get(j + 1))) {
                    int tmp = indices.get(j + 1);
                    indices.set(j + 1, indices.get(j));
                    indices.set(j, tmp);
                }
            }
        }
        return indices;
    }

    /////////////////////////////////////
    ArrayList<Integer> myFilter(ArrayList<Integer> inputArray, int extraElement) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i) == extraElement) {
                continue;
            }
            result.add(inputArray.get(i));
        }

        return result;
    }

    ///////////////////////////////////////
    int arrayMinimumAboveBound(int[] inputArray, int bound) {
        Arrays.sort(inputArray);
        for (int num : inputArray) {
            if (num > bound)
                return num;
        }
        return 0;
    }

    //////////////////////////////////////
    int maxMultiple(int divisor, int bound) {
        while (true) {
            if (bound % divisor == 0)
                return bound;
            bound--;
        }
    }

    ///////////////////////////////////////

    String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf("@") + 1);
    }

    //////////////////////////////////////
    int[] dresses(String[] colors) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        for (String s : colors) {
            char[] arr = s.toCharArray();
            int red = Integer.parseInt(arr[0] + "" + arr[1], 16);
            int green = Integer.parseInt(arr[2] + "" + arr[3], 16);
            int blue = Integer.parseInt(arr[4] + "" + arr[5], 16);

            System.out.println(red + " " + green + " " + blue + " " + i);
            if (green > red && green > blue) {
                System.out.println("Selected: " + i);
                list.add(i);
            }
            ++i;

        }

        int[] sol = new int[list.size()];
        int j = 0;
        for (int n : list) {
            sol[j] = n;
            j++;
        }

        return sol;

    }

    ///////////////////////////////////////////
    String htmlEndTagByStartTag(String startTag) {
        String[] split = startTag.split("[< >]");
        return "</" + split[1] + ">";
    }

    //////////////////////////////////////////

    boolean checkEqualFrequency(int[] inputArray) {

        int numberOfEqual = 1;

        Arrays.sort(inputArray);

        while (numberOfEqual < inputArray.length && inputArray[numberOfEqual - 1] == inputArray[numberOfEqual]) {
            numberOfEqual++;
        }

        if (inputArray.length % numberOfEqual != 0) {
            return false;
        }

        for (int i = 0; i < inputArray.length; i += numberOfEqual) {
            if (i != 0 && inputArray[i] == inputArray[i - 1]) {
                return false;
            }
            for (int j = i + 1; j < i + numberOfEqual; j++) {
                if (inputArray[j] != inputArray[j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    ///////////////////////////////////////////
    boolean isIncreasingDigitsSequence(int n) {
        char[] arr = (n + "").toCharArray();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i])
                return false;
        }
        return true;
    }

    ////////////////////////////////////////////
    boolean robotWalk(int[] a) {
        int minX = 0;
        int minY = -1;
        int maxX = Integer.MAX_VALUE;
        int maxY = Integer.MAX_VALUE;

        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            switch (i % 4) {

            case 0:
                y += a[i];
                if (y >= maxY) {
                    return true;
                }
                maxY = y;
                break;

            case 1:
                x += a[i];
                if (x >= maxX) {
                    return true;
                }
                maxX = x;
                break;

            case 2:
                y -= a[i];
                if (y <= minY) {
                    return true;
                }
                minY = y;
                break;

            case 3:
                x -= a[i];
                if (x <= minX) {
                    return true;
                }
                minX = x;
                break;
            }
        }

        return false;
    }

    ///////////////////////////////////
    int arrayElementsProduct(int[] inputArray) {

        int result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result *= inputArray[i];
        }
        return result;
    }

    //////////////////////////////////

    int differentSquares(int[][] matrix) {
        HashSet<String> hs = new HashSet<String>();
        if (matrix.length == 1 || matrix[0].length == 1)
            return 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                hs.add(matrix[i - 1][j - 1] + "k" + matrix[i - 1][j] + "k" + matrix[i][j - 1] + "k" + matrix[i][j]);
            }
        }
        System.out.println(hs.toString());

        return hs.size();
    }

    ///////////////////////////////////

    String caseUnification(String inputString) {
        Matcher matcherForUppercase = Pattern.compile("[a-z]").matcher(inputString);
        Matcher matcherForLowercase = Pattern.compile("[A-Z]").matcher(inputString);

        int changesToMakeUppercase = 0;
        while (matcherForUppercase.find()) {
            changesToMakeUppercase++;
        }
        int changesToMakeLowercase = 0;
        while (matcherForLowercase.find()) {
            changesToMakeLowercase++;
        }
        if (changesToMakeUppercase == 0
                || changesToMakeLowercase != 0 && changesToMakeUppercase < changesToMakeLowercase) {
            return inputString.toUpperCase();
        } else {
            return inputString.toLowerCase();
        }
    }

    //////////////////////////////////////

    String caseUnification(String inputString) {
        int upper = inputString.length() - inputString.replaceAll("[A-Z]", "").length();
        int lower = inputString.length() - inputString.replaceAll("[a-z]", "").length();
        if (upper < lower)
            return inputString.toLowerCase();
        return inputString.toUpperCase();
    }

    //////////////////////////////////////

    int findSquareSide(int[] x, int[] y) {
        int a, b, c;

        a = (x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]);
        b = (x[0] - x[2]) * (x[0] - x[2]) + (y[0] - y[2]) * (y[0] - y[2]);
        c = (x[0] - x[3]) * (x[0] - x[3]) + (y[0] - y[3]) * (y[0] - y[3]);

        if (a == b)
            return a;
        if (a == c)
            return a;

        return b;
    }

    ///////////////////////////////////

    String reflectString(String inputString) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            int order = (int) inputString.charAt(i) - (int) 'a', reflectedCharCode = 'z' - order;
            result.append((char) reflectedCharCode);
        }

        return result.toString();
    }

    //////////////////////////////////////
    int calculationsWithCoins(int a, int b, int c) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        hs.add(a + b);
        hs.add(a + c);
        hs.add(b + c);
        hs.add(a + b + c);
        return hs.size();
    }

    /////////////////////////////////////
    boolean coolString(String inputString) {

        class Helper {
            boolean isLowercase(char symbol) {
                if ('a' <= symbol && symbol <= 'z') {
                    return true;
                }
                return false;
            }

            boolean isUppercase(char symbol) {
                if ('A' <= symbol && symbol <= 'Z') {
                    return true;
                }
                return false;
            }
        }
        Helper h = new Helper();

        boolean firstIsLowercase = h.isLowercase(inputString.charAt(0));
        boolean firstIsUppercase = h.isUppercase(inputString.charAt(0));

        if (inputString.length() < 2 && inputString.replaceAll("[a-zA-Z]", "").length() != 0)
            return false;

        for (int i = 1; i < inputString.length(); i++) {
            if (i % 2 == 1) {
                if (h.isLowercase(inputString.charAt(i)) == firstIsLowercase
                        || h.isUppercase(inputString.charAt(i)) == firstIsUppercase) {
                    return false;
                }
            } else {
                if (h.isLowercase(inputString.charAt(i)) != firstIsLowercase
                        || h.isUppercase(inputString.charAt(i)) != firstIsUppercase) {
                    return false;
                }
            }
        }

        return true;
    }

    /////////////////////////////////////
    boolean coolString(String inputString) {

        char[] arr = inputString.toCharArray();
        if (inputString.replaceAll("[a-zA-Z]", "").length() != 0)
            return false;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') && (arr[i - 1] >= 'a' && arr[i - 1] <= 'z'))
                return false;
            if ((arr[i] >= 'A' && arr[i] <= 'Z') && (arr[i - 1] >= 'A' && arr[i - 1] <= 'Z'))
                return false;
        }

        return true;
    }
    ////////////////////////////////////

    String lineEncoding(String s) {
        String sol = "";
        while (s.length() > 0) {
            int len = 0;
            int i;
            char startC = s.charAt(0);
            for (i = 0; i < s.length(); i++) {
                if (startC == s.charAt(i))
                    len++;
                else {

                    break;
                }
            }
            if (len > 1)
                sol += len + "" + s.charAt(0);
            else
                sol += s.charAt(0);
            s = s.substring(i);
            System.out.println(sol);
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean sameDigitNumber(int n) {
        return (n + "").replaceAll((n + "").charAt(0) + "", "").length() == 0;
    }

    ////////////////////////////////////////
    String decipher(String cipher) {
        String sol = "";
        for (int i = 0; i < cipher.length();) {
            if (cipher.charAt(i) == '1') {
                sol += (char) Integer.parseInt(cipher.substring(i, i + 3));
                i += 3;
            } else {
                sol += (char) Integer.parseInt(cipher.substring(i, i + 2));
                i += 2;
            }
        }
        return sol;
    }

    /////////////////////////////////////
    ArrayList<Integer> sortedIndices(ArrayList<Integer> a) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            indices.add(i);
        }
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - i - 1; j++) {
                if (a.get(indices.get(j)) > a.get(indices.get(j + 1))) {
                    int tmp = indices.get(j + 1);
                    indices.set(j + 1, indices.get(j));
                    indices.set(j, tmp);
                }
            }
        }
        return indices;
    }

    //////////////////////////////////////
    boolean isIPv4Address(String inputString) {

        int currentNumber = 0;
        boolean emptyField = true;
        int countNumbers = 0;

        inputString += '.';

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '.') {
                if (emptyField) {
                    return false;
                }
                countNumbers++;
                currentNumber = 0;
                emptyField = true;
            } else {
                int digit = inputString.charAt(i) - '0';
                if (digit < 0 || digit > 9) {
                    return false;
                }
                emptyField = false;
                currentNumber = currentNumber * 10 + digit;
                if (currentNumber > 255) {
                    return false;
                }
            }
        }
        return countNumbers == 4;
    }

    //////////////////////////////////////////

    boolean triangleExistence(int[] sides) {
        Arrays.sort(sides);
        return sides[0] + sides[1] > sides[2];
    }
    ///////////////////////////////////////////

    boolean isCaseInsensitivePalindrome(String inputString) {
        inputString = inputString.toLowerCase();
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

    ///////////////////////////////////////////
    boolean pepEight(int line) {
        return line <= 79;
    }

    ///////////////////////////////////////////
    int divisorsPairs(int[] sequence) {
        int sol = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[j] % sequence[i] == 0 || sequence[i] % sequence[j] == 0)
                    sol++;
            }
        }
        return sol;
    }

    ///////////////////////////////////////////
    int centuryFromYear(int year) {
        if (year % 100 != 0)
            return year / 100 + 1;
        return year / 100;
    }

    ////////////////////////////////////////////
    int[] robotPath(String instructions, int bound) {

        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        int x = 0, y = 0;

        String directions = "LURD";

        for (int i = 0; i < instructions.length(); i++) {
            int dirIndex = 0;
            for (int j = 1; j < 4; j++) {
                if (instructions.charAt(i) == directions.charAt(j)) {
                    dirIndex = j;
                }
            }
            if (Math.abs(x + dx[dirIndex]) <= bound && Math.abs(y + dy[dirIndex]) <= bound) {
                x += dx[dirIndex];
                y += dy[dirIndex];
            }
        }

        int[] res = new int[2];
        res[0] = x;
        res[1] = y;
        return res;
    }

    //////////////////////////////////////////////
    boolean higherVersion(String ver1, String ver2) {

        String[] a = ver1.split("\\.");
        String[] b = ver2.split("\\.");
        for (int i = 0; i < a.length; i++) {
            int cmp = Integer.parseInt(a[i]) - Integer.parseInt(b[i]);
            if (cmp > 0) {
                return true;
            } else if (cmp < 0) {
                return false;
            }
        }

        return false;
    }

    //////////////////////////////////////////////

    String runLengthEncoding(String inputString) {

        int repeatLength = 1;
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) != inputString.charAt(i - 1)) {
                answer.append(repeatLength);
                answer.append(inputString.charAt(i - 1));
                repeatLength = 1;
            } else {
                repeatLength++;
            }
        }
        answer.append(repeatLength);
        answer.append(inputString.charAt(inputString.length() - 1));
        return answer.toString();
    }

    //////////////////////////////////////////////

    int differentValues(int[] a, int d) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i] - a[j]) <= d)
                    list.add(Math.abs(a[i] - a[j]));
            }
        }
        if (list.size() == 0)
            return -1;
        Collections.sort(list);
        System.out.println(list.toString());
        return list.get(list.size() - 1);
    }
    ////////////////////////////////////////////

    int matrixElementsSum(int[][] matrix) {

        int result = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 0) {
                    break;
                }
                result += matrix[j][i];
            }
        }

        return result;
    }

    ////////////////////////////////////////////

    int sumUpDigits(String inputString) {

        int answer = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if ('1' <= inputString.charAt(i) && inputString.charAt(i) <= '9') {
                answer += Character.getNumericValue(inputString.charAt(i));
            }
        }

        return answer;
    }

    ///////////////////////////////////////////
    String longestString(String[] inputArray) {

        String answer = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i].length() > answer.length()) {
                answer = inputArray[i];
            }
        }
        return answer;
    }

    //////////////////////////////////////////
    int[] mixedFractionToImproper(int[] a) {
        return new int[] { a[0] * a[2] + a[1], a[2] };
    }
    /////////////////////////////////////////

    boolean validTime(String time) {

        class Helper {
            int charToInt(char symbol) {
                return symbol - '0';
            }
        }
        Helper h = new Helper();

        int hours = h.charToInt(time.charAt(0)) * 10 + h.charToInt(time.charAt(1)),
                minutes = h.charToInt(time.charAt(3)) * 10 + h.charToInt(time.charAt(4));

        if (hours < 24 && minutes < 60) {
            return true;
        }
        return false;
    }

    //////////////////////////////////////
    int halvingSum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 2) {
            sum += i;
        }
        return sum;
    }

    ////////////////////////////////////
    int firstNotDivisible(int[] divisors, int start) {
        Arrays.sort(divisors);
        for (int i = start;; i++) {
            int complete = 0;
            for (int num : divisors) {
                if (i % num != 0)
                    complete++;
                if (complete == divisors.length)
                    return i;
            }
        }
    }

    ////////////////////////////////////
    int[][] reverseOnDiagonals(int[][] matrix) {

        for (int i = 0, j = matrix.length - 1; i < j; i++, j--) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[j][j];
            matrix[j][j] = temp;
        }

        for (int i = 0, j = matrix.length - 1; i < j; i++, j--) {
            System.out.println(i + " " + j);
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
        return matrix;

    }

    //////////////////////////////////////
    int uniqueDigitProducts(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : a) {
            int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            hs.add(product);
        }
        return hs.size();
    }

    //////////////////////////////////////
    int findSquareSide(int[] x, int[] y) {

        class Helper {
            int sqr(int x) {
                return x * x;
            }

            int squareDistance(int[] a, int[] b) {
                return sqr(a[0] - b[0]) + sqr(a[1] - b[1]);
            };

            int[] point(int x, int y) {
                return new int[] { x, y };
            }
        }
        Helper h = new Helper();

        int answer = h.squareDistance(h.point(x[0], y[0]), h.point(x[1], y[1]));
        for (int i = 2; i < 4; i++) {
            answer = Math.min(answer, h.squareDistance(h.point(x[i - 1], y[i - 1]), h.point(x[i], y[i])));
        }
        return answer;
    }

    //////////////////////////////////////////
    boolean regularBracketSequence2(String sequence) {

        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < sequence.length(); i++) {
            if (stack.size() > 0 && stack.getLast() == '(' && sequence.charAt(i) == ')') {
                stack.pollLast();
                continue;
            }
            if (stack.size() > 0 && stack.getLast() == '[' && sequence.charAt(i) == ']') {
                stack.pollLast();
                continue;
            }
            stack.addLast(sequence.charAt(i));
        }

        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
    ///////////////////////////////////////////

    int[] primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (n >= 2) {
            if (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }

        int[] ans = new int[factors.size()];
        for (int i = 0; i < ans.length; ++i) {
            ans[i] = factors.get(i);
        }
        return ans;
    }

    ////////////////////////////////////////////

    int differentSymbolsNaive(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (char c : s.toCharArray()) {
            hs.add(c);
        }
        return hs.size();
    }

    ///////////////////////////////////////////
    int kthDigit(int n, int k) {
        return Character.getNumericValue((n + "").charAt(k - 1));
    }

    /////////////////////////////////////////
    boolean isPerfectScore(boolean ans1, boolean ans2, boolean ans3) {
        return (ans1 && ans2) && ans3;
    }

    ////////////////////////////////////////

    int digitDistanceNumber(int n) {
        int result = 0;
        int lastDigit = n % 10;
        int tenPower = 1;
        n /= 10;
        while (n != 0) {
            result += tenPower * Math.abs(n % 10 - lastDigit);
            tenPower *= 10;
            lastDigit = n % 10;
            n /= 10;
        }

        return result;
    }

    //////////////////////////////////////
    boolean isLucky(int n) {
        int fh = 0;
        int sh = 0;
        int len = (n + "").length();
        for (int i = 0; i < len / 2; i++) {
            fh += n % 10;
            n /= 10;
        }

        while (n > 0) {
            sh += n % 10;
            n /= 10;
        }
        return fh == sh;
    }

    /////////////////////////////////////////
    String[] isDivisibleBy3(String inputString) {
        List<String> list = new ArrayList<>();
        int sum = 0;
        for (char c : inputString.replace("*", "").toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        for (int i = 0; i <= 9; i++) {
            if ((sum + i) % 3 == 0)
                list.add((inputString.replace("*", i + "")));

        }

        return list.toArray(new String[list.size()]);
    }

    ///////////////////////////////////////////

    int differentSymbolsNaive(String s) {

        int result = 0;

        for (int i = 0; i < 26; i++) {
            boolean found = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' + i) {
                    found = true;
                    break;
                }
            }
            if (found) {
                result++;
            }
        }
        return result;
    }

    /////////////////////////////////////////

    int[][] spiralNumbers(int n) {
        int[][] m = new int[n][n];
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int currentDirectionIndex = 0;
        int currentRow = 0;
        int currentColumn = 0;
        int currentNum = 1;
        int tmpRow;
        int tmpColumn;
        for (int i = n * n; i > 0; i--) {
            m[currentRow][currentColumn] = currentNum++;
            if (i > 1) {
                // Determine the next cell
                while (true) {
                    tmpRow = currentRow + directions[currentDirectionIndex][0];
                    tmpColumn = currentColumn + directions[currentDirectionIndex][1];
                    if (tmpRow < 0 || tmpRow >= n || tmpColumn < 0 || tmpColumn >= n || m[tmpRow][tmpColumn] != 0) {
                        currentDirectionIndex = (currentDirectionIndex + 1) % 4;
                    } else {
                        currentRow = tmpRow;
                        currentColumn = tmpColumn;
                        break;
                    }
                }
            }
        }
        return m;
    }

    /////////////////////////////////////////

    int lastDigit(int a, int b) {
        if (b == 0)
            return 1;
        a = a;
        int c = a % 10;
        for (int i = 2; i <= b; i++) {
            c *= a;
            c %= 10;
        }
        return c % 10;
    }

    ////////////////////////////////////////

    String properNounCorrection(String noun) {

        class Helper {
            boolean isLowerCase(char symbol) {
                if (symbol >= 'a' && symbol <= 'z') {
                    return true;
                }
                return false;
            }
        }
        ;
        Helper h = new Helper();

        StringBuilder result = new StringBuilder();

        if (h.isLowerCase(noun.charAt(0))) {
            result.append((char) (noun.charAt(0) - 'a' + 'A'));
        } else {
            result.append(noun.charAt(0));
        }

        for (int i = 1; i < noun.length(); i++) {
            if (!h.isLowerCase(noun.charAt(i))) {
                result.append((char) (noun.charAt(i) - 'A' + 'a'));
            } else {
                result.append(noun.charAt(i));
            }
        }

        return result.toString();
    }

    //////////////////////////////////////////

    int concatenateNumbers(int a, int b) {
        int tmp = b;

        while (tmp > 0) {
            tmp /= 10;
            a *= 10;
        }

        return a + b;
    }

    //////////////////////////////////////
    int toAndFro(int a, int b, int t) {

        int len = Math.abs(b - a);
        t %= (2 * len);
        if (t <= len) {
            return a + (b - a) / Math.abs(b - a) * t;
        } else {
            t -= len;
            return b + (a - b) / Math.abs(b - a) * t;
        }
    }

    ////////////////////////////////////////
    ////////////////////////////////////////////////
    void merge(int[] sequence, int left, int middle, int right) {
        int[] result = new int[right - left];
        int i, j;
        int k = 0;

        for (i = left, j = middle; i < middle && j < right;) {
            if (sequence[i] < sequence[j]) {
                result[k++] = sequence[i];
                i++;
            } else {
                result[k++] = sequence[j];
                j++;
            }
        }

        while (i < middle) {
            result[k++] = sequence[i];
            i++;
        }

        while (j < right) {
            result[k++] = sequence[j];
            j++;
        }

        for (i = left; i < right; i++) {
            sequence[i] = result[i - left];
        }
    }

    void split(int[] sequence, int left, int right) {
        if (left + 1 == right) {
            return;
        }
        int middle = (left + right) / 2;
        split(sequence, left, middle);
        split(sequence, middle, right);
        merge(sequence, left, middle, right);
    }

    int[] mergeSort(int[] sequence) {
        split(sequence, 0, sequence.length);

        return sequence;
    }

    /////////////////////////////////////////

    int cubeVolume(int n) {
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result += n;
        }
        return result;
    }

    ////////////////////////////////////////
    String swapCase(String text) {
        String sol = "";
        int diff = 'a' - 'A';
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                sol += (char) (c - diff) + "";
            else if (c >= 'A' && c <= 'Z')
                sol += (char) (c + diff) + "";
            else
                sol += c + "";
        }
        return sol;
    }

    ////////////////////////////////////////
    boolean willYou(boolean young, boolean beautiful, boolean loved) {
        return (young && beautiful && !loved) || (loved && (!young || !beautiful));
    }

    ////////////////////////////////////////
    String properOrImproper(int[] a) {
        if (Math.abs(a[0] / a[1]) < 1)
            return "Proper";
        return "Improper";
    }

    ////////////////////////////////////////
    int houseNumbersSum(int[] inputArray) {
        int sol = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0)
                break;
            else
                sol += inputArray[i];
        }
        return sol;
    }

    ////////////////////////////////////////
    Integer arrayConversion(ArrayList<Integer> inputArray) {

        int operation = 1;
        while (inputArray.size() > 1) {
            ArrayList<Integer> newArray = new ArrayList<>();
            for (int i = 0; i < inputArray.size(); i += 2) {
                if (operation % 2 == 1) {
                    newArray.add(inputArray.get(i) + inputArray.get(i + 1));
                } else {
                    newArray.add(inputArray.get(i) * inputArray.get(i + 1));
                }
            }
            inputArray = newArray;
            operation++;
        }

        return inputArray.get(0);
    }

    ////////////////////////////////////////
    int pagesNumbering(int n) {

        int tenPower = 1, digitsPerPage = 1, result = 0;

        while (tenPower <= n) {
            result += tenPower * 9 * digitsPerPage;
            tenPower *= 10;
            digitsPerPage++;
        }
        result += (n - tenPower + 1) * (digitsPerPage - 1);

        return result;
    }

    ////////////////////////////////////////
    boolean isIdentityMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 1 && i == j || matrix[i][j] != 0 && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    ////////////////////////////////////////
    int[] fractionReducing(int[] fraction) {
        int div = Math.min(fraction[0], fraction[1]);
        while (div != 1) {
            if (fraction[0] % div == 0 && fraction[1] % div == 0) {
                fraction[0] /= div;
                fraction[1] /= div;
                div = Math.min(fraction[0], fraction[1]);
            } else
                div--;
        }
        return fraction;
    }

    ////////////////////////////////////////

    boolean robotWalk(int[] a) {
        int minX = 0;
        int minY = -1;
        int maxX = Integer.MAX_VALUE;
        int maxY = Integer.MAX_VALUE;

        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            switch (i % 4) {

            case 0:
                y += a[i];
                if (y >= maxY) {
                    return true;
                }
                maxY = y;
                break;

            case 1:
                x += a[i];
                if (x >= maxX) {
                    return true;
                }
                maxX = x;
                break;

            case 2:
                y -= a[i];
                if (y <= minY) {
                    return true;
                }
                minY = y;
                break;

            case 3:
                x -= a[i];
                if (x <= minX) {
                    return true;
                }
                minX = x;
                break;
            }
        }

        return false;
    }

    ///////////////////////////////////////

    int[] fractionSum(int[] a, int[] b) {
        int[] fraction = { a[0] * b[1] + a[1] * b[0], a[1] * b[1] };

        int div = Math.min(fraction[0], fraction[1]);
        while (div != 1) {
            if (fraction[0] % div == 0 && fraction[1] % div == 0) {
                fraction[0] /= div;
                fraction[1] /= div;
                div = Math.min(fraction[0], fraction[1]);
            } else
                div--;
        }
        return fraction;

    }

    ///////////////////////////////////////////
    int[] fractionSubtraction(int[] a, int[] b) {
        int[] fraction = { a[0] * b[1] - a[1] * b[0], a[1] * b[1] };

        int div = Math.min(fraction[0], fraction[1]);
        while (div != 1) {
            if (fraction[0] % div == 0 && fraction[1] % div == 0) {
                fraction[0] /= div;
                fraction[1] /= div;
                div = Math.min(fraction[0], fraction[1]);
            } else
                div--;
        }
        return fraction;
    }

    ////////////////////////////////////////////
    int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }

    ///////////////////////////////////////////
    String replaceAllDigitsRegExp(String input) {
        String sol = "";
        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9')
                sol += "#";
            else
                sol += c + "";

        }
        return sol;
    }
    //////////////////////////////////////////

    String properNounCorrection(String noun) {
        return noun.substring(0, 1).toUpperCase() + noun.substring(1).toLowerCase();
    }

    ////////////////////////////////////////
    int champernowneDigit(int n) {
        String nums = "";
        for (int i = 1; i < 1000; i++) {
            nums += i + "";
        }
        return Character.getNumericValue(nums.charAt(n - 1));
    }

    ////////////////////////////////////////

    String angleType(double measure) {

        if (measure < 90) {
            return "acute";
        }

        if (measure == 90) {
            return "right";
        }

        if (measure < 180) {
            return "obtuse";
        }

        return "straight";
    }

    ////////////////////////////////////////
    int binaryPower(int n,int k){final int MOD=(int)1e7+7;
    
    if(k==0){return 1;}if(k%2==0){return binaryPower((int)((n*1 L*n)%MOD),k/2);}return(int)((binaryPower(n,k-1)*1 L*n)%MOD);}

    ////////////////////////////////////////
    int binaryPower(int n,int k){final int MOD=(int)1e7+7;
    
    if(k==0){return 1;}if(k%2==0){return binaryPower((int)((n*1 L*n)%MOD),k/2);}return(int)((binaryPower(n,k-1)*1 L*n)%MOD);}

    ////////////////////////////////////////

    String truncateString(String s) {

        while (true) {
            if (s.length() == 0)
                return "";
            if (s.length() >= 2
                    && (Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(s.length() - 1))) % 3 == 0) {
                s = s.substring(1, s.length() - 1);
                System.out.println(s);
            } else if (Integer.parseInt(s.substring(0, 1)) % 3 == 0) {
                s = s.substring(1);
                System.out.println(s);
            } else if (Integer.parseInt(s.substring(s.length() - 1)) % 3 == 0) {
                s = s.substring(0, s.length() - 1);
                System.out.println(s);
            } else
                return s;
        }
    }

    ////////////////////////////////////////
    int lrSegmentNumber(int l, int r) {
        String num = "";
        for (int i = l; i <= r; i++) {
            num += i + "";
        }
        return Integer.parseInt(num);
    }

    ////////////////////////////////////////

    String buildPalindrome(String st) {
        String str = new StringBuilder(st).reverse().toString();
        if (str.equals(st))
            return st;
        for (int i = 0; i < st.length(); i++) {
            System.out.println("New String: " + st.substring(0, i) + str);
            if ((st.substring(0, i) + str).equals(new StringBuilder((st.substring(0, i) + str)).reverse().toString()))
                return st.substring(0, i) + str;
        }
        return "lol";
    }

    ////////////////////////////////////////
    boolean chessBoardCellColor(String cell1, String cell2) {
        String alpha = "ABCDEFGH";
        int c1A = alpha.indexOf(cell1.charAt(0)) + 1;
        int c1N = Integer.parseInt(cell1.substring(1));

        int c2A = alpha.indexOf(cell2.charAt(0)) + 1;
        int c2N = Integer.parseInt(cell2.substring(1));

        if ((c1A + c1N + c2A + c2N) % 2 == 0)
            return true;
        return false;

    }

    ////////////////////////////////////////
    int quasifactorial(int n) {
        int answer = 1;
        for (int i = 2; i <= n; ++i) {
            answer *= i;
            --answer;
        }
        return answer;
    }

    ////////////////////////////////////////
    int firstMultiple2(int[] divisors, int start) {
        int sol = start;
        while (true) {
            for (int n : divisors) {
                if (sol % n == 0)
                    return sol;
            }
            sol++;
        }

    }

    ////////////////////////////////////////

    int firstMultiple(int[] divisors, int start) {
        int sol = start;
        while (true) {
            int count = 0;
            for (int n : divisors) {

                if (sol % n == 0)
                    count++;
            }
            if (count == divisors.length)
                return sol;
            sol++;
        }

    }

    //////////////////////////////////////////
    int crossingSum(int[][] matrix, int row, int column) {

        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][column];
        }
        for (int i = 0; i < matrix[0].length; i++) {
            result += matrix[row][i];
        }
        result -= matrix[row][column];

        return result;
    }

    ////////////////////////////////////////
    int leastFactorial(int n) {
        int fact = 1;
        for (int i = 1;; i++) {
            fact *= i;
            if (fact >= n)
                return fact;

        }
        // return 0;
    }

    ////////////////////////////////////////
    int appleBoxes(int k) {
        int odd = 0;
        int eve = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0)
                eve += (i * i);
            else
                odd += (i * i);
        }
        return eve - odd;
    }

    ////////////////////////////////////////
    int avoidObstacles(int[] inputArray) {

        Arrays.sort(inputArray);

        int sol, i;

        for (i = 1;; i++) {
            sol = 0;
            for (int n : inputArray) {
                if (n % i == 0) {
                    break;
                } else
                    sol++;
            }
            if (sol == inputArray.length)
                return i;
        }

    }

    ////////////////////////////////////////

    int matrixTrace(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    ////////////////////////////////////////
    int evenNumbersBeforeFixed(int[] sequence, int fixedElement) {
        int sol = 0;
        for (int i = 0; i < sequence.length; i++) {

            if (sequence[i] != fixedElement) {
                if (sequence[i] % 2 == 0)
                    sol++;
            } else
                return sol;

        }

        return -1;
    }

    ////////////////////////////////////////

    boolean isMonotonous(int[] sequence) {
        if (sequence.length == 1) {
            return true;
        }
        int direction = sequence[1] - sequence[0];
        for (int i = 0; i < sequence.length - 1; i++) {
            if (direction * (sequence[i + 1] - sequence[i]) <= 0) {
                return false;
            }
        }
        return true;
    }

    ////////////////////////////////////////
    boolean isMonotonous(int[] sequence) {
        int flag = 0;
        if (sequence.length < 2)
            return true;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i - 1] < sequence[i]) {
                flag++;

            } else if ((sequence[i - 1] > sequence[i]))
                flag--;
            else
                return false;

        }
        return Math.abs(flag) == sequence.length - 1;
    }

    ////////////////////////////////////////
    int differentValuesInMultiplicationTable2(int n, int m) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                hs.add(i * j);
            }
        }
        return hs.size();
    }

    ////////////////////////////////////////
    int additionWithoutCarrying(int param1, int param2) {
        String sol = "";
        if (param1 == 0 && param2 == 0)
            return 0;
        while (param1 > 0 || param2 > 0) {

            // System.out.println((param1%10 + param2%10)%10);
            int last = (param1 % 10 + param2 % 10) % 10;

            sol = last + sol;
            if (param1 > 0)
                param1 /= 10;
            if (param2 > 0)
                param2 /= 10;
        }
        System.out.println(sol);

        return Integer.parseInt(sol);

    }

    ////////////////////////////////////////

    boolean increaseNumberRoundness(int n) {
        while (n % 10 == 0 && n > 0)
            n /= 10;
        while (n % 10 > 0 && n > 0)
            n /= 10;
        return n != 0;
    }

    ////////////////////////////////////////
    int rounders(int n) {
        String[] arr = (n + "").split("");
        int len = arr.length;
        for (int i = len - 1; i >= 1; i--) {
            if (Integer.parseInt(arr[i]) < 5)
                arr[i] = "0";
            else {
                arr[i] = "0";
                arr[i - 1] = (Integer.parseInt(arr[i - 1]) + 1) + "";
            }
        }
        String sol = "";
        for (String c : arr) {
            sol += c + "";
        }
        return Integer.parseInt(sol);
    }

    ////////////////////////////////////////
    int candles(int candlesNumber, int makeNew) {
        return candlesNumber + (candlesNumber - 1) / (makeNew - 1);
    }

    ////////////////////////////////////////
    int arrayMode(int[] sequence) {
        int[] arr = new int[10000];
        int max = 0;
        int sol = 0;
        for (int num : sequence) {
            arr[num]++;
            if (max < arr[num]) {
                max = arr[num];
                sol = num;
            }

        }
        return sol;
    }

    ////////////////////////////////////////
    int arrayMode(int[] sequence) {
        ArrayList<Integer> count = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < 1000; i++) {
            count.add(0);
        }
        for (int i = 0; i < sequence.length; i++) {
            count.set(sequence[i] - 1, count.get(sequence[i] - 1) + 1);
            if (count.get(sequence[i] - 1) > count.get(answer)) {
                answer = sequence[i] - 1;
            }
        }
        return answer + 1;
    }
    ///////////////////////////////////////

    int[][] matrixTransposition(int[][] matrix) {
        int[][] sol = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sol[j][i] = matrix[i][j];
            }
        }
        return sol;
    }

    /////////////////////////////////////////////
    boolean isSum(int value) {
        int sum = 0;
        for (int i = 1;; i++) {
            sum += i;
            if (sum == value)
                return true;
            if (sum > value)
                return false;
        }
    }

    ////////////////////////////////////////

    int axisAlignedBoundingBox(int[] x, int[] y) {

        int minX = x[0], maxX = x[0], minY = y[0], maxY = y[0];

        for (int i = 1; i < x.length; i++) {
            minX = Math.min(x[i], minX);
            maxX = Math.max(x[i], maxX);
            minY = Math.min(y[i], minY);
            maxY = Math.max(y[i], maxY);
        }

        return (maxX - minX) * (maxY - minY);
    }

    //////////////////////////////////////////////
    int divideAsLongAsPossible(int n, int d) {

        while (n % d == 0) {
            n /= d;
        }
        return n;
    }

    ///////////////////////////////////////////

    int largestNumber(int n) {
        if (n <= 1)
            return 9;
        int sol = 9;
        while (n > 1) {
            sol *= 10;
            sol += 9;
            n--;
        }
        return sol;
    }

    /////////////////////////////////////////

    boolean parallelLines(int[] line1, int[] line2) {
        return line1[0] * line2[1] == line1[1] * line2[0];
    }

    ////////////////////////////////////////
    int arraySumAdjacentDifference(int[] inputArray) {
        int sum = 0;
        for (int i = 1; i < inputArray.length; i++) {
            sum += (Math.abs(inputArray[i] - inputArray[i - 1]));
        }
        return sum;
    }

    ////////////////////////////////////////////
    boolean isEarlier(int[] time1, int[] time2) {
        if (time1[0] > time2[0])
            return false;
        else if (time1[0] < time2[0])
            return true;
        return time1[1] < time2[1];
    }

    //////////////////////////////////////////

    int deleteDigit(int n) {
        int answer = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        while (n != 0) {
            digits.add(n % 10);
            n /= 10;
        }
        int number = 0;
        for (int deletedIndex = 0; deletedIndex < digits.size(); deletedIndex++) {
            number = 0;
            for (int i = digits.size() - 1; i >= 0; i--) {
                if (i != deletedIndex) {
                    number = number * 10 + digits.get(i);
                }
            }
            answer = Math.max(number, answer);
        }
        return answer;
    }

    /////////////////////////////////////////

    ArrayList<Integer> rangeArray(int l, int r, int step) {

        ArrayList<Integer> result = new ArrayList();
        while (l < r) {
            result.add(l);
            l += step;
        }
        return result;
    }

    //////////////////////////////////////
    boolean isPermutation(int n, int[] inputArray) {

        int[] countOccurences = new int[n];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] - 1 < 0 || inputArray[i] - 1 >= n) {
                return false;
            }
            countOccurences[inputArray[i] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (countOccurences[i] != 1) {
                return false;
            }
        }
        return true;
    }

    ///////////////////////////////////////////////
    int arrayMinimumIndex(int[] inputArray) {

        int indexOfMinimum = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[indexOfMinimum]) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }

    /////////////////////////////////////////
    int numberOfTriangles2(int[] sticks) {
        Arrays.sort(sticks);
        int count = 0;
        for (int i = 0; i < sticks.length - 2; i++) {
            for (int j = i + 1; j < sticks.length - 1; j++) {
                for (int k = j + 1; k < sticks.length; k++) {
                    if (sticks[i] + sticks[j] > sticks[k])
                        count++;
                }
            }

        }
        return count;
    }

    ////////////////////////////////////////
    String removeDuplicateCharacters(String str) {
        int[] alpha = new int[255];

        for (char c : str.toCharArray()) {
            alpha[c]++;
        }
        String sol = "";
        for (char c : str.toCharArray()) {
            if (alpha[c] == 1)
                sol += (char) c;
        }
        return sol;
    }

    ////////////////////////////////////////

    int smallestMultiple(int left, int right) {
        int sol = right;
        for (int i = left; i <= right; i++) {

            if (sol % i != 0) {
                i = left;
                sol++;
            }

        }
        return sol;
    }
    //////////////////////////////////////////

    int differentValues(int[] a, int d) {

        int best = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int diff = Math.abs(a[j] - a[i]);
                if (diff <= d && diff >= best) {
                    best = diff;
                }
            }
        }

        return best;
    }

    ///////////////////////////////////////
    int rangeBitCount(int a, int b) {

        int ans = 0;
        for (int i = a; i <= b; i++) {
            int t = i;
            while (t > 0) {
                ans += t & 1;
                t >>= 1;
            }
        }

        return ans;
    }

    ////////////////////////////////////
    int numberOfOperations(int a, int b) {
        int[] arr = { a, b };
        Arrays.sort(arr);
        int sol = 0;
        while (arr[1] % arr[0] == 0) {
            arr[1] /= arr[0];

            Arrays.sort(arr);
            sol++;

        }
        return sol;
    }

    ////////////////////////////////////
    int stringsCrossover(String[] inputArray, String result) {

        int answer = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                boolean correct = true;
                for (int k = 0; k < result.length(); k++) {
                    if (result.charAt(k) != inputArray[i].charAt(k) && result.charAt(k) != inputArray[j].charAt(k)) {
                        correct = false;
                        break;
                    }
                }
                if (correct) {
                    answer++;
                }
            }
        }
        return answer;
    }

    ///////////////////////////////////
    String[] addBorder(String[] picture) {
        String startEnd = "";
        for (int i = 0; i < picture[0].length() + 2; i++) {
            startEnd += "*";
        }

        ArrayList<String> list = new ArrayList<>();
        list.add(startEnd);
        for (int i = 0; i < picture.length; i++) {
            list.add("*" + picture[i] + "*");
        }
        list.add(startEnd);
        return list.toArray(new String[list.size()]);
    }

    ///////////////////////////////////////

    int sequencePeakElement(int[] sequence) {
        int left = 1;
        int right = sequence.length - 2;
        while (left < right) {
            int middle = (left + right) / 2;
            if (sequence[middle] > Math.max(sequence[middle - 1], sequence[middle + 1])) {
                left = right = middle;
                break;
            }
            if (sequence[middle - 1] < sequence[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return sequence[left];
    }

    /////////////////////////////////////
    boolean leapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    ///////////////////////////////////////

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return ((yourLeft == friendsLeft && yourRight == friendsRight)
                || (yourLeft == friendsRight && yourRight == friendsLeft));
    }

    ///////////////////////////////////////

    int sumBelowBound(int bound) {

        int left = 0, right = bound + 1;
        while (right - left > 1) {
            int middle = (left + right) / 2;
            if (middle * (middle + 1) / 2 <= bound) {
                left = middle;
            } else {
                right = middle;
            }
        }

        return left;
    }

    /////////////////////////////////////
    int oddNumbersBeforeZero(int[] sequence) {
        int sol = 0;
        for (int i : sequence) {
            if (i == 0)
                break;
            if (i % 2 != 0)
                sol++;
        }
        return sol;
    }

    //////////////////////////////////////
    boolean isSuspiciousRespondent(boolean ans1, boolean ans2, boolean ans3) {
        return ans1 == ans2 && ans1 == ans3;
    }

    /////////////////////////////////////

    int axisAlignedCirclesBoundingBox(int[] x, int[] y, int[] r) {

        int minX = x[0] - r[0], maxX = x[0] + r[0], minY = y[0] - r[0], maxY = y[0] + r[0];

        for (int i = 1; i < x.length; i++) {
            minX = Math.min(x[i] - r[i], minX);
            maxX = Math.max(x[i] + r[i], maxX);
            minY = Math.min(y[i] - r[i], minY);
            maxY = Math.max(y[i] + r[i], maxY);
        }

        return (maxX - minX) * (maxY - minY);
    }

    //////////////////////////////////////

    int sumUpDigits(String inputString) {

        int answer = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if ('1' <= inputString.charAt(i) && inputString.charAt(i) <= '9') {
                answer += inputString.charAt(i) - '0';
            }
        }

        return answer;
    }

    /////////////////////////////////////////

    int[] extractMatrixColumn(int[][] matrix, int column) {
        int[] sol = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sol[i] = matrix[i][column];
        }
        return sol;
    }

    ////////////////////////////////////////

    int lateRide(int n) {
        int sol = 0;
        int hr = n / 60;
        int mm = n % 60;
        while (hr > 0) {
            sol += hr % 10;
            hr /= 10;
        }
        while (mm > 0) {
            sol += mm % 10;
            mm /= 10;
        }
        return sol;
    }

    //////////////////////////////////////
    int sequencePeakElement(int[] sequence) {
        int left = 1;
        int right = sequence.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (sequence[middle] > Math.max(sequence[middle - 1], sequence[middle + 1])) {
                left = right = middle;
                break;
            }
            if (sequence[middle - 1] < sequence[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return sequence[left];
    }

    ///////////////////////////////////

    boolean symbolsPermutation(String word1, String word2) {
        int[] aplpha1 = new int[255];
        int[] aplpha2 = new int[255];

        for (char c : word1.toCharArray()) {
            aplpha1[c]++;
        }
        for (char c : word2.toCharArray()) {
            aplpha2[c]++;
        }
        for (int i = 0; i < 255; i++) {
            if (aplpha1[i] != aplpha2[i])
                return false;
        }
        return true;

    }

    //////////////////////////////////////

    boolean validTime(String time) {

        class Helper {
            int charToInt(char symbol) {
                return symbol - '0';
            }
        }
        Helper h = new Helper();

        int hours = h.charToInt(time.charAt(0)) * 10 + h.charToInt(time.charAt(1)),
                minutes = h.charToInt(time.charAt(3)) * 10 + h.charToInt(time.charAt(4));

        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            return true;
        }
        return false;
    }

    ///////////////////////////////////////

    ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {

        for (int i = permutation.size() - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                int index = i + 1, t = permutation.get(i);
                for (int j = i + 1; j < permutation.size(); j++) {
                    if (permutation.get(j) > t && permutation.get(j) < permutation.get(index)) {
                        index = j;
                    }
                }
                permutation.set(i, permutation.get(index));
                permutation.set(index, t);
                ArrayList<Integer> suffix = new ArrayList<>(permutation.subList(i + 1, permutation.size()));
                Collections.reverse(suffix);
                permutation.subList(i + 1, permutation.size()).clear();
                permutation.addAll(suffix);
                return permutation;
            }
        }

        Collections.sort(permutation);
        return permutation;
    }

    //////////////////////////////////////////////
    boolean latinLettersSearchRegExp(String input) {
        return input.replaceAll("[a-zA-Z]", "").length() != input.length();
    }

    //////////////////////////////////////////
    int powerRecursive(int x, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return (int) Math.pow(x, exponent);
        }
    }

    /////////////////////////////////////////

    int numberOfOperations(int a, int b) {

        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a % b != 0) {
            return 0;
        }
        return 1 + numberOfOperations(a / b, b);
    }

    /////////////////////////////////////////
    String[] allLongestStrings(String[] inputArray) {

        ArrayList<String> answer = new ArrayList<>(Arrays.asList(inputArray[0]));
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i].length() == answer.get(0).length()) {
                answer.add(inputArray[i]);
            }
            if (inputArray[i].length() > answer.get(0).length()) {
                answer = new ArrayList<>(Arrays.asList(inputArray[i]));
            }
        }
        return answer.toArray(new String[0]);
    }

    //////////////////////////////////////////
    boolean variableName(String name) {
        if (name.charAt(0) >= '0' && name.charAt(0) <= '9') {
            System.out.println("1");
            return false;
        }

        return name.replaceAll("[A-Za-z0-9_]", "").length() == 0;
    }

    ///////////////////////////////////////////
    int[] bfsDistancesUnweightedGraph(boolean[][] matrix, int startVertex) {

        boolean[] visited = new boolean[matrix.length];
        LinkedList<Integer> queue = new LinkedList<>();
        int[] distance = new int[matrix.length];

        visited[startVertex] = true;
        queue.add(startVertex);
        while (queue.size() != 1) {
            int currentVertex = queue.pop();
            visited[currentVertex] = true;
            for (int nextVertex = 0; nextVertex < matrix.length; nextVertex++) {
                if (matrix[currentVertex][nextVertex] && !visited[nextVertex]) {
                    visited[nextVertex] = true;
                    distance[nextVertex] = distance[currentVertex] + 1;
                    queue.add(nextVertex);
                }
            }
        }

        return distance;
    }

    /////////////////////////////////////////////////////

    int arrayMinimumAboveBound(int[] inputArray, int bound) {

        int best = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > bound && (best == -1 || inputArray[i] < best)) {
                best = inputArray[i];
            }
        }

        return best;
    }

    ////////////////////////////////////////////////
    int minimalNumberOfCoins(int[] coins, int price) {

        int result = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            result += price / coins[i];
            price %= coins[i];
        }

        if (price != 0) {
            return -1;
        }
        return result;
    }

    ///////////////////////////////////////////////

    String longestWord(String text) {

        char[] chars = text.toCharArray();
        String answer = "";
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z' || 'A' <= chars[i] && chars[i] <= 'Z') {
                current.append(chars[i]);
                if (current.length() > answer.length()) {
                    answer = current.toString();
                }
            } else {
                current = new StringBuilder();
            }
        }

        return answer;
    }

    //////////////////////////////////////////
    String capitalizeVowelsRegExp(String input) {
        String sol = "";
        for (char c : input.toCharArray()) {
            if ("aeiouy".indexOf(c) >= 0)
                sol += (char) (c - ('a' - 'A'));
            else
                sol += c;
        }
        return sol;
    }

    //////////////////////////////////////////
    boolean alphabetSubsequence(String s) {
        for (int i = 1; i < s.length(); i++) {
            System.out.println(s.charAt(i - 1) - s.charAt(i));
            if (s.charAt(i) - s.charAt(i - 1) <= 0)
                return false;
        }
        return true;
    }

    //////////////////////////////////////////

    String[] isDivisibleBy6(String inputString) {

        int digitSum = 0;
        char leftBound = '0', rightBound = '9';
        ArrayList<String> answer = new ArrayList<>();
        char[] mask = inputString.toCharArray();
        int asteriskPos = -1;

        for (int i = 0; i < mask.length; i++) {
            if (leftBound <= mask[i] && mask[i] <= rightBound) {
                digitSum += mask[i] - leftBound;
            } else {
                asteriskPos = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            if ((digitSum + i) % 3 == 0) {
                mask[asteriskPos] = (char) (leftBound + i);
                if ((mask[mask.length - 1] - leftBound) % 2 == 0) {
                    answer.add(String.valueOf(mask));
                }
            }
        }

        return answer.toArray(new String[0]);
    }

    //////////////////////////////////////////////
    int digitSumsDifference(int n) {

        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                result -= digit % 10;
            } else {
                result += digit;
            }
            n /= 10;
        }

        return result;
    }

    //////////////////////////////////////////////
    boolean rightTriangle(int[] sides) {
        Arrays.sort(sides);
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }

    //////////////////////////////////////////////

    boolean orthogonalLines(int[] line1, int[] line2) {
        return line1[0] * line2[0] + line1[1] * line2[1] == 0;
    }

    //////////////////////////////////////////////

    ArrayList<Integer> extractEachKth(ArrayList<Integer> inputArray, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            if ((i + 1) % k != 0) {
                result.add(inputArray.get(i));
            }
        }
        return result;
    }
    /////////////////////////////////////////////

    int nearestRoundNumber(int value) {
        return (int) Math.ceil(value / 10.0) * 10;
    }

    ////////////////////////////////////////////

    int binarySearch(int[] inputArray, int searchElement) {

        int minIndex = -1;
        int maxIndex = inputArray.length;
        int currentIndex;
        int currentElement;

        while (minIndex < maxIndex - 1) {
            currentIndex = (minIndex + maxIndex) / 2;
            currentElement = inputArray[currentIndex];

            if (currentElement < searchElement) {
                minIndex = currentIndex;
            } else {
                maxIndex = currentIndex;
            }
        }

        if (maxIndex == inputArray.length || inputArray[maxIndex] != searchElement) {
            return -1;
        }
        return maxIndex;
    }

    //////////////////////////////////////////
    String reflectString(String inputString) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            int order = (int) inputString.charAt(i) - (int) 'a', reflectedCharCode = (int) 'a' + 25 - order;
            result.append((char) reflectedCharCode);
        }

        return result.toString();
    }

    //////////////////////////////////////////
    int arrayMaxConsecutiveSum(int[] inputArray, int k) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= inputArray.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += inputArray[j];
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }

    ///////////////////////////////////////////
    int differentDigitsNumberSearch(int[] inputArray) {
        HashSet<Integer> hs = new HashSet<>();

        int sol = -1;
        for (int num : inputArray) {
            sol = num;
            while (num > 0) {
                if (!hs.add(num % 10)) {
                    System.out.print("Stop");
                    break;
                }

                num /= 10;
            }
            System.out.print(hs.toString() + " " + num);
            if (num == 0)
                return sol;
            hs = new HashSet<>();
        }
        return -1;

    }

    ///////////////////////////////////////////
    int leastCommonPrimeDivisor(int a, int b) {

        for (int divisor = 2; a > 1 && b > 1; divisor++) {
            if (a % divisor == 0 && b % divisor == 0) {
                return divisor;
            }
            while (a % divisor == 0) {
                a /= divisor;
            }
            while (b % divisor == 0) {
                b /= divisor;
            }
        }

        return -1;
    }

    /////////////////////////////////////////
    int arithmeticProgression(int element1, int element2, int n) {
        int diff = element2 - element1;
        return element2 + (diff * (n - 2));
    }

    ///////////////////////////////////////
    int arrayMinimum(int[] inputArray) {

        int indexOfMinimum = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[indexOfMinimum]) {
                indexOfMinimum = i;
            }
        }
        return inputArray[indexOfMinimum];
    }

    //////////////////////////////////////////
    String integerToStringOfFixedWidth(int number, int width) {

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < width; i++) {
            result.append('0');
        }

        int position = width - 1;
        while (number != 0 && position >= 0) {
            result.replace(position, position + 1, Integer.toString(number % 10));
            number /= 10;
            position--;
        }

        return result.toString();
    }

    ////////////////////////////////////////

    int[] myReverse(int[] input) {

        for (int i = 0; i * 2 < input.length; i++) {
            int tmp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = tmp;
        }
        return input;
    }

    //////////////////////////////////////
    int gcdEuclid(int a, int b) {

        if (a == 0) {
            return b;
        }
        return gcdEuclid(b % a, a);
    }

    ////////////////////////////////////////

    int summaryProficiency(int[] a, int n, int m) {

        int result = 0;
        for (int i = 0; n > 0; i++) {
            if (a[i] >= m) {
                result += a[i];
                n--;
            }
        }

        return result;
    }

    ///////////////////////////////////////

    boolean isArithmeticProgression(int[] sequence) {
        if (sequence.length <= 2)
            return true;
        int diff = sequence[0] - sequence[1];
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i - 1] - sequence[i] != diff)
                return false;
        }
        return true;
    }

    ////////////////////////////////////////
    int smallestNumber(int n) {
        if (n == 1)
            return 0;
        int sol = 1;
        while (n > 0) {
            sol *= 10;
            n--;
        }
        return sol / 10;
    }

    ///////////////////////////////////////
    int numberReverse(int input) {

        int reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
        }
        return reversed;
    }

    /////////////////////////////////////
    int bfsComponentSize(boolean[][] matrix) {

        ArrayList<Boolean> visited = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        int componentSize = 0;

        for (int i = 0; i < matrix.length; i++) {
            visited.add(false);
        }

        visited.set(1, true);
        queue.add(1);

        while (queue.size() > 0) {
            int currentVertex = queue.pop();
            visited.set(currentVertex, true);
            componentSize++;
            for (int nextVertex = 0; nextVertex < matrix.length; nextVertex++) {
                if (matrix[currentVertex][nextVertex] && !visited.get(nextVertex)) {
                    visited.set(nextVertex, true);
                    queue.add(nextVertex);
                }
            }
        }

        return componentSize;
    }

    ////////////////////////////////////////
    int sumOfTheAngles(int n) {
        return (n - 2) * 180;
    }

    ////////////////////////////////////////
    boolean areSimilarNumbers(int a, int b, int divisor) {
        if (a % divisor == 0 && b % divisor == 0)
            return true;
        if (a % divisor != 0 && b % divisor != 0)
            return true;
        return false;
    }

    String myCoffee(int number) {
        switch (number) {
        case 1:
            return "French Roast";
        case 2:
            return "Colombian";
        case 3:
            return "Kona";
        }
        return "Invalid";
    }

    /////////////////////////////////////////
    String myCoffee(int number) {
        switch (number) {
        case 1:
            return "French Roast";
        case 2:
            return "Colombian";
        case 3:
            return "Kona";
        }
        return "Invalid";
    }

    ////////////////////////////////////////////

    int[] nextSecond(int[] currentTime) {
        int total_sec = currentTime[0] * 3600 + currentTime[1] * 60 + currentTime[2] + 1;
        currentTime[0] = (total_sec / 3600) % 24;
        total_sec %= 3600;
        currentTime[1] = (total_sec / 60) % 60;
        total_sec %= 60;
        currentTime[2] = total_sec;
        return currentTime;
    }

    ////////////////////////////////////////////
    boolean isSuspiciousRespondent(boolean ans1, boolean ans2, boolean ans3) {
        return ans1 == ans2 && ans2 == ans3;
    }

    ////////////////////////////////////////////
    int sequenceElement(int[] a, int n) {

        final int MOD = (int) 1e5;
        List<Integer> seq = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            seq.add(a[i]);
        }

        int lastFive = a[0] * (int) 1e4 + a[1] * (int) 1e3 + a[2] * (int) 1e2 + a[3] * 10 + a[4];
        Map<Integer, Integer> was = new HashMap<>();
        was.put(lastFive, 4);

        for (int i = 5;; i++) {
            seq.add((seq.get(i - 1) + seq.get(i - 2) + seq.get(i - 3) + seq.get(i - 4) + seq.get(i - 5)) % 10);
            lastFive = (lastFive * 10 + seq.get(i)) % MOD;
            if (was.containsKey(lastFive)) {
                int last = was.get(lastFive);
                return seq.get(n % (i - last));
            } else {
                was.put(lastFive, i);
            }
        }
    }

    //////////////////////////////////////////////

    String longestDigitsPrefix(String inputString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if ('0' <= inputString.charAt(i) && inputString.charAt(i) <= '9') {
                result.append(inputString.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

    ///////////////////////////////////////////

    String caseUnification(String inputString) {
        Matcher matcherForUppercase = Pattern.compile("[a-z]").matcher(inputString);
        Matcher matcherForLowercase = Pattern.compile("[A-Z]").matcher(inputString);

        int changesToMakeUppercase = 0;
        while (matcherForUppercase.find()) {
            changesToMakeUppercase++;
        }
        int changesToMakeLowercase = 0;
        while (matcherForLowercase.find()) {
            changesToMakeLowercase++;
        }
        if (changesToMakeUppercase == 0
                || changesToMakeLowercase != 0 && changesToMakeUppercase < changesToMakeLowercase) {
            return inputString.toUpperCase();
        } else {
            return inputString.toLowerCase();
        }
    }

    //////////////////////////////////////

    int sequencePeakElement(int[] sequence) {
        int left = 1;
        int right = sequence.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (sequence[middle] > Math.max(sequence[middle - 1], sequence[middle + 1])) {
                left = right = middle;
                break;
            }
            if (sequence[middle - 1] < sequence[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return sequence[left];
    }

    //////////////////////////////////////

    int mySqrt(int n) {

        int left = 1, right = n + 1;
        while (left + 1 < right) {
            int middle = (left + right) / 2;
            if (middle * middle <= n) {
                left = middle;
            } else {
                right = middle;
            }
        }

        return left;
    }

    //////////////////////////////////////////

    int toAndFro(int a, int b, int t) {

        int len = Math.abs(b - a);
        t %= (2 * len);
        if (t <= len) {
            return a + (b - a) / Math.abs(a - b) * t;
        } else {
            t -= len;
            return b + (a - b) / Math.abs(a - b) * t;
        }
    }

    ///////////////////////////////////////////

    boolean leapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    ////////////////////////////////////////////

    int maxGCD(int[] sequence) {
        class Helper {
            int gcd(int a, int b) {
                if (b == 0) {
                    return a;
                }
                return gcd(b, a % b);
            }
        }
        ;

        Helper h = new Helper();
        int bestRes = 0;

        for (int i = 0; i < sequence.length; i++) {
            int result = sequence[0];
            if (i == 0) {
                result = sequence[1];
            }
            for (int j = 0; j < sequence.length; j++) {
                if (i == j) {
                    continue;
                }
                result = h.gcd(result, sequence[j]);
            }
            if (result > bestRes) {
                bestRes = result;
            }
        }

        return bestRes;
    }

    /////////////////////////////////////////////
    boolean checkEqualFrequency(int[] inputArray) {

        int numberOfEqual = 1;

        Arrays.sort(inputArray);

        while (numberOfEqual < inputArray.length && inputArray[numberOfEqual - 1] == inputArray[numberOfEqual]) {
            numberOfEqual++;
        }

        if (inputArray.length % numberOfEqual != 0) {
            return false;
        }

        for (int i = 0; i < inputArray.length; i += numberOfEqual) {
            if (i != 0 && inputArray[i] == inputArray[i - 1]) {
                return false;
            }
            for (int j = i + 1; j < i + numberOfEqual; j++) {
                if (inputArray[j] != inputArray[j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    ///////////////////////////////////////////////////
    boolean checkIncreasingSequence(int[] seq) {
        if (seq.length <= 1)
            return true;
        for (int i = 1; i < seq.length; i++) {
            if (seq[i - 1] >= seq[i])
                return false;
        }
        return true;

    }

    //////////////////////////////////////////////
    boolean chessBoardCellColor(String cell1, String cell2) {

        class Helper {
            int getX(String pos) {
                return pos.charAt(0) - 'A';
            }

            int getY(String pos) {
                return pos.charAt(0) - '0';
            }
        }
        Helper h = new Helper();

        int sum1 = h.getX("" + cell1.charAt(0)) + h.getY("" + cell1.charAt(1));
        int sum2 = h.getX("" + cell2.charAt(0)) + h.getY("" + cell2.charAt(1));
        if (sum1 % 2 == sum2 % 2) {
            return true;
        }
        return false;

    }

    //////////////////////////////////////////////////

    int[] nextSecond(int[] currentTime) {

        if (currentTime[2] == 59) {
            currentTime[2] = 0;
            if (currentTime[1] == 59) {
                currentTime[1] = 0;
                currentTime[0]++;
                currentTime[0] %= 24;

            } else {
                currentTime[1]++;
            }
        } else {
            currentTime[2]++;
        }

        return currentTime;
    }

    //////////////////////////////////////////
    int[] fractionSum(int[] a, int[] b) {

        class Helper {
            int gcdEuclid(int a, int b) {
                if (a == 0) {
                    return b;
                }
                return gcdEuclid(b % a, a);
            }
        }
        Helper h = new Helper();

        int[] c = { a[0] * b[1] + a[1] * b[0], a[1] * b[1] };
        int gcd = h.gcdEuclid(c[0], c[1]);

        c[0] /= gcd;
        c[1] /= gcd;

        return c;
    }

    /////////////////////////////////////////
    boolean isTournament(int n, int[] fromV, int[] toV) {

        ArrayList<ArrayList<Boolean>> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Boolean> line = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                line.add(false);
            }
            edges.add(line);
        }

        for (int i = 0; i < fromV.length; i++) {
            edges.get(fromV[i] - 1).set(toV[i] - 1, true);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (edges.get(i).get(j) == edges.get(j).get(i)) {
                    return false;
                }
            }
        }

        if (fromV.length != n * (n - 1) / 2) {
            return false;
        }
        return true;
    }

    //////////////////////////////////////////
    int graphEdges(boolean[][] matrix) {
        var c = 0;

        for (var i = 0; i < matrix.length; ++i)
            for (var j = 0; j < matrix[i].length; ++j)
                if (matrix[i][j])
                    ++c;

        return c / 2;
    }

    ////////////////////////////////////////////
    boolean bishopAndPawn(String bishop, String pawn) {
        class Parser {
            int getX(char pos) {
                return pos - 'a';
            }

            int getY(char pos) {
                return pos - '1';
            }
        }
        Parser p = new Parser();

        int x1 = p.getX(bishop.charAt(0)), y1 = p.getY(bishop.charAt(1)), x2 = p.getX(pawn.charAt(0)),
                y2 = p.getY(pawn.charAt(1));

        if (x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2) {
            return true;
        }

        return false;
    }

    /////////////////////////////////////////

    int magicalWell(int a, int b, int n) {
        int sol = 0;
        while (n > 0) {
            sol += (a * b);
            a++;
            b++;
            n--;
        }

        return sol;
    }

    /////////////////////////////////////////////

    int kthDigit(int n, int k) {

        int numDigits = 0, number = n;
        while (number != 0) {
            numDigits++;
            number /= 10;
        }

        int indexFromLast = numDigits - k + 1;

        while (n != 0) {
            if (--indexFromLast == 0) {
                return n % 10;
            }
            n /= 10;
        }

        return -1;
    }

    //////////////////////////////////////////
    int rangeBitCount(int a, int b) {

        int ans = 0;
        for (int i = a; i <= b; i++) {
            int t = i;
            while (t != 0) {
                ans += (t % 2);
                t /= 2;
            }
        }

        return ans;
    }

    /////////////////////////////////////////////
    // “Ten properties of a subject, according to Leonardo: light and dark, color a
    ///////////////////////////////////////////// d substance, form and position, d
    ///////////////////////////////////////////// stance and nearness, movement a
    ///////////////////////////////////////////// d stillness.”

    int countInversionsNaive(int[] inputArray) {
        int sol = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j])
                    sol++;
            }
        }
        return sol;
    }

    ////////////////////////////////////////////
    int digitDegree(int n) {

        int deg = 0;
        while (true) {
            if (n < 10)
                break;
            int temp = 0;
            while (n > 0) {
                temp += n % 10;
                n /= 10;
            }
            n = temp;
            deg++;
        }
        return deg;
    }

    ///////////////////////////////////////////

    char fractionComparison(int[] a, int[] b) {
        if (a[0] * b[1] == a[1] * b[0])
            return '=';
        if (a[0] * b[1] < a[1] * b[0])
            return '<';
        return '>';
    }

    ///////////////////////////////////////////
    int fixedPointsPermutation(int[] permutation) {
        int[] copy = permutation.clone();
        Arrays.sort(permutation);
        int sol = 0;

        for (int i = 0; i < permutation.length; i++) {
            if (copy[i] == permutation[i])
                sol++;
        }
        return sol;
    }

    /////////////////////////////////////////////
    char firstDigit(String inputString) {
        for (char c : inputString.toCharArray()) {
            if (c >= '0' && c <= '9')
                return c;
        }
        return '0';
    }

    /////////////////////////////////////////////
    int maxZeros(int n) {
        int answer = 0, maxZeros = 0;
        for (int k = 2; k <= n; k++) {
            int numZeros = 0, value = n;
            while (value != 0) {
                if (value % k == 0) {
                    numZeros++;
                }
                value /= k;
            }
            if (numZeros > maxZeros) {
                maxZeros = numZeros;
                answer = k;
            }
        }
        return answer;
    }

    //////////////////////////////////////////////
    int countNeighbouringPairs(String inputString) {
        int sol = 0;
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputString.charAt(i - 1))
                sol++;
        }
        return sol;
    }

    //////////////////////////////////////////////
    boolean shefferStroke(boolean a, boolean b) {
        if (a == false || b == false)
            return true;
        return false;
    }

    //////////////////////////////////////////////
    String digitCharactersSum(char ch1, char ch2) {
        int x1 = (int) ch1 - (int) '0';
        int x2 = (int) ch2 - (int) '0';
        if (x1 + x2 < 10) {
            char digit = (char) ((int) '0' + x1 + x2);
            return Character.toString(digit);
        } else {
            char digit = (char) ((int) '0' + (x1 + x2) % 10);
            return "1" + digit;
        }
    }

    ///////////////////////////////////////////////
    int sumOfCubes(int n) {
        int sol = 0;
        while (n > 0) {
            sol += (n * n * n);
            n--;
        }
        return sol;
    }

    ///////////////////////////////////////////////
    int firstMultiple2(int[] divisors, int start) {

        for (int answer = start;; answer++) {
            for (int i = 0; i < divisors.length; i++) {
                if (answer % divisors[i] == 0) {
                    return answer;
                }
            }
        }
    }

    ////////////////////////////////////////////////
int[] threeAndFour(int n) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int num = 0;
    while(num <=n){
        if(num%3==0 && num%4==0){
            list.add(num);
        }
        num++;
    }

    ///////////////////////////////////////
    boolean chessBoardCellColor(String cell1, String cell2) {

        class Helper {
            int getX(String pos) {
                return pos.charAt(0) - 'A';
            }

            int getY(String pos) {
                return pos.charAt(0) - '1';
            }
        }
        Helper h = new Helper();

        int sum1 = h.getX("" + cell1.charAt(0)) + h.getY("" + cell1.charAt(1));
        int sum2 = h.getX("" + cell2.charAt(0)) + h.getY("" + cell2.charAt(1));
        if (sum1 % 2 == sum2 % 2) {
            return true;
        }
        return false;
    }
    /////////////////////////////////////////////

    int rounders(int n) {
        int p = 10;
        while (n > p) {
          if ((n % p) / (p / 10) < 5)
            n = (n / p) * p;
          else
            n = (n / p + 1) * p;
          p *= 10;
        }
        return n;
      }

///////////////////////////////////////////