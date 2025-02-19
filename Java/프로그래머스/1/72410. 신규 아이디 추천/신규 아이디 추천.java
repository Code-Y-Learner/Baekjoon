class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        String second = new_id.replaceAll("[^a-z0-9-_.]", "");
        String third = second.replaceAll("\\.{2,}", ".");
        String six = third.replaceAll("^\\.|\\.$", "");
        if (six.equals(""))
            six = "a";
        if (six.length() > 15)
            six = six.substring(0,15);
        six = six.replaceAll("\\.$", "");
        if (six.length() <= 2) {
            while (six.length() <= 2){
                six += six.charAt(six.length()-1);
            }
        }
        return six;
    }
}