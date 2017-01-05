Parser p = new Parser();

String templateDoc = kb.nextLine();
String inputDoc = kb.nextLine();
int MAXWORDS = kb.nextInt();

List<String> templatePieces = p.parseDocument(templateDoc);
List<String> inputPieces = p.parseDocument(inputDoc);

boolean isPlagairized = checkPlagiarism(templatePieces, inputPieces, MAXWORDS);

function checkPlagiarism(T, D, M) {
    HashSet<String> hs = new HashSet<String>();

    // segmented the template doc into sections of m words and inserted into hashset
    // O(n)
    for (i=0; i<T.length; i++) {
        str = '';
        j = i;

        while (j < (j+M-1) && j<T.length) {
           str += T[j++];
        }

        hs.put(hash(str));
    }

    // check 3 words at a time for doc D, and check if it exists in our custom hashset
    for (i=0; i<D.length; i++) {
        str = '';
        j = i;

        while (j < (j+M-1) && j<D.length) {
           str += D[j++];
        }

        if (hs.contains(str)) {
            return true;
        }
    }

    return false;
}