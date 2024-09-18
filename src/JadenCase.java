public class JadenCase {
    /**
    Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
    Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter,
    he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word,
    check out how contractions are expected to be in the example below.
    Your task is to convert strings to how they would be written by Jaden Smith.
    The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

    Example:
    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
    **/
    public String toJadenCase(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        if (phrase != null && (!phrase.isEmpty())){
            for (int i=0; i< phrase.length(); i++){
                if (i==0){
                    stringBuilder.append(Character.toUpperCase(phrase.charAt(i)));
                }else if (phrase.charAt(i-1) == ' '){
                    stringBuilder.append(Character.toUpperCase(phrase.charAt(i)));
                } else {
                    stringBuilder.append((phrase.charAt(i)));
                }
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        String result = jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real");
        System.out.println(result);
    }
}